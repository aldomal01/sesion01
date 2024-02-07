package com.java.pe.sesion01.temporal;

import com.java.pe.sesion01.Alumno;
import com.java.pe.sesion01.Docente;
import com.java.pe.sesion01.EstadoEnum;
import com.java.pe.sesion01.Laptop;

public class Main {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		Alumno alumno = new Alumno();
		System.out.println(EstadoEnum.ACTIVO.getValor());
		//alumno.estado(EstadoEnum.ACTIVO.getValor());
		
		Docente docente = new Docente();
		docente.cambiarNombres(null);
	
	}

}
