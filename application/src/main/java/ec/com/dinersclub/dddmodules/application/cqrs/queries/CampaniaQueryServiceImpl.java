package ec.com.dinersclub.dddmodules.application.cqrs.queries;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.CampaniaQuery;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;

@ApplicationScoped
public class CampaniaQueryServiceImpl implements ICampaniaQueryService{
	
	@Inject
	IRepository repository;

	@Override
	public List<CampaniaQuery> verificarClienteCampania(String idCliente) {
		List<CampaniaQuery> listCampaniaQuery = new ArrayList<>();
		CampaniaQuery campaniaQuery = new CampaniaQuery();
		listCampaniaQuery.add(campaniaQuery);
		return listCampaniaQuery;
	}
	
}
