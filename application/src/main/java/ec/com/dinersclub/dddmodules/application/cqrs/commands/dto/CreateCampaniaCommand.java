package ec.com.dinersclub.dddmodules.application.cqrs.commands.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ec.com.dinersclub.dddmodules.domain.model.RangoCampania;

public class CreateCampaniaCommand {
	private Integer id; 
    private String name;
    private Date fechaInicio;
    private Date fechaFin;
    private double monto;
    private String estado;
    private List<RangoCampania> listRangoCampania= new ArrayList<>();
    
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
	public List<RangoCampania> getListRangoCampania() {
		return listRangoCampania;
	}
	public void setListRangoCampania(List<RangoCampania> listRangoCampania) {
		this.listRangoCampania = listRangoCampania;
	}
}
