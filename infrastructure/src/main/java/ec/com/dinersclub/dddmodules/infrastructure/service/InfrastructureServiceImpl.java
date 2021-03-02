package ec.com.dinersclub.dddmodules.infrastructure.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import ec.com.dinersclub.dddmodules.domain.model.Campania;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.CampaniaEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.TarjetaEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository.TarjetaRepository;

@ApplicationScoped
public class InfrastructureServiceImpl implements IRepository {
	
	@Inject
	TarjetaRepository tarjetaRepository;
	
	@Override
	public List<Tarjeta> getTarjetas() {
		List<Tarjeta> tarjetaList = new ArrayList<>();
		List<TarjetaEntity> tarjetaEntityList = tarjetaRepository.listAll();
		if (!tarjetaEntityList.isEmpty()) {
			return TarjetaEntity
					.map(tarjetaEntityList);
		} else {
			 
            return tarjetaList;
        }
	}
    
	@Override
	public Tarjeta getTarjeta(UUID id) {
		TarjetaEntity tarjetaEntity = tarjetaRepository.findById(id);
        if (tarjetaEntity != null) {
            return tarjetaEntity.toTarjeta();
        } else {
            return null;
        }
	}

	@Override
	@Transactional
	public void createTarjeta(Tarjeta tarjeta) {
		TarjetaEntity.persist(new TarjetaEntity(tarjeta));
	}

	@Override
	@Transactional
	public void deleteTarjeta(UUID id) {
		TarjetaEntity.delete("id", id);
	}

	@Override
	@Transactional
	public void createCampania(Campania campania) {
		CampaniaEntity.persist(new CampaniaEntity(campania));
	}

}
