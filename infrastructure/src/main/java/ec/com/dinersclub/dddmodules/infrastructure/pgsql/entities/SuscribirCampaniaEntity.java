package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ec.com.dinersclub.dddmodules.domain.model.SuscribirCampania;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "suscribir_campania")
public class SuscribirCampaniaEntity extends PanacheEntityBase {
	
	@Id
	private Integer id; 
	private Integer idComercio; 
	private Integer idCliente; 
	private Integer idCampania; 

    public SuscribirCampaniaEntity() {
    }
    
    public SuscribirCampaniaEntity(SuscribirCampania suscribirCampania) {
		this.id = suscribirCampania.getId();
		this.idComercio = suscribirCampania.getIdComercio();
		this.idCliente = suscribirCampania.getIdCliente();
		this.idCampania = suscribirCampania.getIdCampania();
	}

	public SuscribirCampaniaEntity(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdComercio() {
		return idComercio;
	}

	public void setIdComercio(Integer idComercio) {
		this.idComercio = idComercio;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdCampania() {
		return idCampania;
	}

	public void setIdCampania(Integer idCampania) {
		this.idCampania = idCampania;
	}

}