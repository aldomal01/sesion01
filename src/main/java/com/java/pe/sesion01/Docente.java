package com.java.pe.sesion01;

public class Docente extends Persona{
	
	private String especialidad;
	
	private int estado;	
	
	public Docente() {
		
	}
	
	public Docente(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
	
		return especialidad;
	}
	
	public String getEspecialidad(int estado) {
		if(estado == EstadoEnum.ACTIVO.getValor()) {
			return especialidad + "A";
		
		}
		return especialidad;
		
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	

	

}
