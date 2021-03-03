package ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.SuscribirCampaniaEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class SuscribirCampaniaRepository implements PanacheRepository<SuscribirCampaniaEntity> {
	
	public SuscribirCampaniaEntity findById(int id){
		return find("id", id).firstResult();
	}

}
