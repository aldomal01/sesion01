package com.java.pe.sesion01;

public enum EstadoEnum {
	
	INACTIVO(0),
	ACTIVO(1),
	BLOQUEADO(2),
	ANULADO(3);
	
	private int valor;
	
	EstadoEnum(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	

}
