package com.example.demo.spring.boot;
import org.springframework.stereotype.Component;

@Component 
//Se le dice a spring esto lo controlas creas el new
public class PacienteCancerSB extends PacienteSB{
	public Integer calcularDescuento() {
		System.out.println("Paciente Cancer con el 30% de descuento");
		return 30;
	
	}
	
}
