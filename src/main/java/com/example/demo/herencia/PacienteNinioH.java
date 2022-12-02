package com.example.demo.herencia;

public class PacienteNinioH extends PacienteH{

	private int pesoNacimiento;
	
	public Integer calcularDescuento() {
		System.out.println("Paciente ninio con el 10% de descuento");
		return 10;
	}

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	
	
}
