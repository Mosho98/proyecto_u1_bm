package com.example.demo.herencia;

import java.time.LocalDateTime;

public class mainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PacienteTerceraEdadH pacienteTE=new PacienteTerceraEdadH();
//		pacienteTE.setCedula("172719");
//		pacienteTE.setCodigoIESS("123123");
//		pacienteTE.setNombre("Alex");
//		pacienteTE.setTipo("TE");
	
//		PacienteNinioH pacienteTE=new PacienteNinioH();
//		pacienteTE.setCedula("172719");
//		pacienteTE.setPesoNacimiento(8);
//		pacienteTE.setNombre("Alex");
//		pacienteTE.setTipo("TE");
		
		PacienteCancerH pacienteTE=new PacienteCancerH();
		pacienteTE.setCedula("172719");
		pacienteTE.setNombre("Alex");
		pacienteTE.setTipo("C");
		
		MedicoH medico=new MedicoH();
		medico.setCedula("171445");
		medico.setNombre("Darleen");
		
		CitaMedicaH cita=new CitaMedicaH();
		cita.agendar("123123", LocalDateTime.of(2022, 12, 2,  8, 30), pacienteTE, medico);

	}

}
