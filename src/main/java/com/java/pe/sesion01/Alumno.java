package com.java.pe.sesion01;

import java.time.LocalDate;

public class Alumno implements IAlumno{
	
	int idAlumno;
	
	String nombre;
	
	String apellido;
	
	LocalDate fechaNacimiento;
	
	int estado;
	
	
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getIdAlumno() {		
		return this.idAlumno;
	}

	@Override
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
		
	}
	

}
