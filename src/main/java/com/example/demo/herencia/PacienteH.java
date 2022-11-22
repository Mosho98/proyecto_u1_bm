package com.example.demo.herencia;

public class PacienteH {
	private String nombre;
	private String cedula;
	private String tipo;
	
	protected Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
