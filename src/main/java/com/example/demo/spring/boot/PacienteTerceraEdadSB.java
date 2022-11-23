package com.example.demo.spring.boot;
import org.springframework.stereotype.Component;

@Component 
//Se le dice a spring esto lo controlas creas el new
public class PacienteTerceraEdadSB extends PacienteSB{

	private String codigoIESS;

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}
	
	public Integer calcularDescuento() {
		System.out.println("Paciente con el 20% de descuento");
		return 20;
	
	}
}
