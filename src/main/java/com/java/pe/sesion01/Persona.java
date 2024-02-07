package com.java.pe.sesion01;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.time.LocalDate;

/**
 * 
 * @author Aldo Malaver
 *
 */
public class Persona {

	int idPersona;

	String nombres;

	String apellidos;

	String sexo;

	static LocalDate fechaNacimiento;
	
	public String obtenerNombres() {

		return this.nombres;
	}

	public void cambiarNombres(String nombres) {
		this.nombres = nombres;
	}

	public class EntradaImports {
		public void read(Files files) {
			Paths.get("name");
		}
	}

	public static void main(String[] args) throws Exception{
		System.out.println("Bienvenido al curso java basico");
		System.out.println("ABC");

		Persona persona = new Persona();
		persona.cambiarNombres("Jessica");
		
		int x = 10;
		
		/*try {
			int y = x / 0;
			
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("No se puede dividir entre 0");
		
		}finally {
			System.out.println("correcto");
		}*/

		Laptop laptop = new Laptop();
		try {
			laptop.getId();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("No se puede dividir entre 0");
		
		}finally {
			System.out.println("correcto");
		}

	}

}
