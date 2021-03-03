package ec.com.dinersclub.dddmodules.domain.model;

public class SuscribirCampania {
	
	private Integer id; 
	private Integer idComercio; 
	private Integer idCliente; 
	private Integer idCampania; 

    public SuscribirCampania() {
    }
    
    
    
    public SuscribirCampania(Integer id, Integer idComercio, Integer idCliente, Integer idCampania) {
		super();
		this.id = id;
		this.idComercio = idComercio;
		this.idCliente = idCliente;
		this.idCampania = idCampania;
	}



	public SuscribirCampania(Integer id) {
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