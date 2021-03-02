package ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.CampaniaEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CampaniaRepository implements PanacheRepository<CampaniaEntity> {
	
	public CampaniaEntity findById(int id){
		return find("id", id).firstResult();
	}

}
