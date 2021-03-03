package ec.com.dinersclub.dddmodules.domain.repository;

import java.util.List;
import java.util.UUID;

import ec.com.dinersclub.dddmodules.domain.model.Campania;
import ec.com.dinersclub.dddmodules.domain.model.SuscribirCampania;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;

public interface IRepository {
	
	List<Tarjeta> getTarjetas();
	
    Tarjeta getTarjeta(UUID id);

    void createTarjeta(Tarjeta tarjeta);
    
    void deleteTarjeta(UUID id);
    
    void createCampania(Campania campania);

    void createSuscribirCampania(SuscribirCampania suscribirCampania);
}