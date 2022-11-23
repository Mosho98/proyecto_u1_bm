package com.example.demo.spring.boot;
import org.springframework.stereotype.Component;

@Component //Se le dice a spring esto lo controlas creas el new
public class PacienteNinioSB extends PacienteSB{

	private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	
	public Integer calcularDescuento() {
		System.out.println("Paciente ninio con el 10% de descuento");
		return 10;
	
	}
}
