package ec.com.dinersclub.dddmodules.application.cqrs.queries;

import java.util.List;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.CampaniaQuery;

public interface ICampaniaQueryService {
	
	List<CampaniaQuery> verificarClienteCampania(String idCliente);

}
