package ec.com.dinersclub.dddmodules.application.grpc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.ICampaniaQueryService;
import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.RangoCampaniaQuery;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;


@Singleton                                                                                   
public class CampaniaResource extends MutinyCampaniasGrpc.CampaniasImplBase {      
	
	@Inject
	ICampaniaQueryService readService;

    @Override
    @Blocking
    public Uni<CampaniasResponse> verificarClienteCampania(CampaniasRequest request) { 
    	String id = request.getIdCliente();
    	readService.verificarClienteCampania(id);
    	List<RangoCampaniaQuery> listRangoCampania = new ArrayList<>();
    	listRangoCampania.add(new RangoCampaniaQuery(1, "META 1", 100D));
    	listRangoCampania.add(new RangoCampaniaQuery(2, "META 2", 300D));
    	listRangoCampania.add(new RangoCampaniaQuery(3, "META 3", 500D));
    	List<Item> listaRangos= listRangoCampania.stream().map( m -> 
    	Item.newBuilder().setIdRangoCampania(m.getId()).setNombreRango(m.getNombre()).setValorPremio(String.valueOf(m.getValor())).build()).collect(Collectors.toList());
        return Uni.createFrom().item(CampaniasResponse.newBuilder().setIdCampania("1").setNombreCampania("Noches Diners")
            	.setMonto("50000").setFechaInicio("2021-03-02").setFechaFin("2021-03-02").setEstado("ACTIVO").addAllItems(listaRangos).build());
    }
}