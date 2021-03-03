package ec.com.dinersclub.dddmodules.application.cqrs.queries.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CampaniaQuery {
    
	private Integer id; 
    private String name;
    private Date fechaInicio;
    private Date fechaFin;
    private double monto;
    private String estado;
    private List<RangoCampaniaQuery> listRangoCampania= new ArrayList<>();
    
	public CampaniaQuery() {
	}
	
	public CampaniaQuery(Integer id, String name, Date fechaInicio, Date fechaFin, double monto, String estado,
			List<RangoCampaniaQuery> listRangoCampania) {
		this.id = id;
		this.name = name;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.monto = monto;
		this.estado = estado;
		this.listRangoCampania = listRangoCampania;
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
	public List<RangoCampaniaQuery> getListRangoCampania() {
		return listRangoCampania;
	}
	public void setListRangoCampania(List<RangoCampaniaQuery> listRangoCampania) {
		this.listRangoCampania = listRangoCampania;
	}
	
}
