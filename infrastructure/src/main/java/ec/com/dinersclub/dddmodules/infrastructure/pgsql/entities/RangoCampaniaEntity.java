package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "rango_campania")
public class RangoCampaniaEntity extends PanacheEntityBase {
	
	@Id
	private Integer id; 
    private String nombre;
    private double valor;
    
    @ManyToOne
    private CampaniaEntity campaniaEntity;
    
  
    public RangoCampaniaEntity() {
    }

	public RangoCampaniaEntity(Integer id, String nombre, double valor, CampaniaEntity campaniaEntity) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.campaniaEntity = campaniaEntity;
	}

	public RangoCampaniaEntity(Integer id, String nombre, double valor) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public CampaniaEntity getCampaniaEntity() {
		return campaniaEntity;
	}

	public void setCampaniaEntity(CampaniaEntity campaniaEntity) {
		this.campaniaEntity = campaniaEntity;
	}

    
}