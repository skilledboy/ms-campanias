package ec.com.dinersclub.dddmodules.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.CampaniaQuery;
import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.RangoCampaniaQuery;
import ec.com.dinersclub.dddmodules.application.grpc.CampaniasRequest;
import ec.com.dinersclub.dddmodules.application.grpc.CampaniasResponse;
import ec.com.dinersclub.dddmodules.application.grpc.MutinyCampaniasGrpc;
import io.quarkus.grpc.runtime.annotations.GrpcService;

@ApplicationScoped  
public class CampaniaService {

	@Inject
    @GrpcService("campania")                     
	MutinyCampaniasGrpc.MutinyCampaniasStub grpc;
	
	public List<CampaniaQuery> verificarClienteCampania(String idCliente) {
		List<CampaniaQuery> listaCampaniaQuery = new ArrayList<>();
		CampaniasResponse clienteCampania = grpc.verificarClienteCampania(CampaniasRequest.newBuilder().setIdCliente(idCliente).build()).await().indefinitely();
		List<RangoCampaniaQuery> listRangoCampania =  clienteCampania.getItemsList().stream().map(m -> new RangoCampaniaQuery(Integer.valueOf(m.getIdRangoCampania()),m.getNombreRango(),Double.valueOf(m.getValorPremio()))).collect(Collectors.toList());
		CampaniaQuery campaniaQuery = new CampaniaQuery(Integer.valueOf(clienteCampania.getIdCampania()), clienteCampania.getNombreCampania(), 
				null, null, Double.valueOf(clienteCampania.getMonto()), clienteCampania.getEstado(),listRangoCampania);
		listaCampaniaQuery.add(campaniaQuery);
		return listaCampaniaQuery;
	}
}
