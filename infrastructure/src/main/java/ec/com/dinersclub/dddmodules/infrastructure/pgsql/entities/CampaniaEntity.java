package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ec.com.dinersclub.dddmodules.domain.model.Campania;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "campania")
public class CampaniaEntity extends PanacheEntityBase {
	
	@Id
	private Integer id; 
    private String name;
    private Date fechaInicio;
    private Date fechaFin;
    private double monto;
    private String estado;

    @OneToMany(mappedBy = "campaniaEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<RangoCampaniaEntity> listRangoCampaniaEntity= new ArrayList<>();
    
    public CampaniaEntity() {
    }
    
    public CampaniaEntity(Integer id) {
		this.id = id;
	}

    public CampaniaEntity(Campania campania) {
		this.id = campania.getId();
		this.name = campania.getName();
		this.fechaInicio = campania.getFechaFin();
		this.fechaFin = campania.getFechaFin();
		this.monto = campania.getMonto();
		this.estado = campania.getEstado();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<RangoCampaniaEntity> getListRangoCampaniaEntity() {
		return listRangoCampaniaEntity;
	}

	public void setListRangoCampaniaEntity(List<RangoCampaniaEntity> listRangoCampaniaEntity) {
		this.listRangoCampaniaEntity = listRangoCampaniaEntity;
	}

}