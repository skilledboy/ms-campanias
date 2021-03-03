package ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.RangoCampaniaEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class RangoCampaniaRepository implements PanacheRepository<RangoCampaniaEntity> {
	
	public RangoCampaniaEntity findById(int id){
		return find("id", id).firstResult();
	}

}
