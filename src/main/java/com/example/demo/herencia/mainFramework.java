package com.example.demo.herencia;

import java.time.LocalDateTime;

public class mainFramework {

	public static void main(String[] args) {
		
//		PacienteTerceraEdadH pacienteTE = new PacienteTerceraEdadH();
//		pacienteTE.setCedula("1234576");
//		pacienteTE.setCodigoIESS("123450");
//		pacienteTE.setNombre("Daniel");
//		pacienteTE.setTipo("TE");
		
		/*PacienteNinioH pacienteTE = new PacienteNinioH();
		pacienteTE.setCedula("1234576");
		pacienteTE.setPesoNacimiento(8);
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");*/
		
		PacienteCancerH pacienteTE = new PacienteCancerH();
		pacienteTE.setCedula("1234576");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("C");
		
		
		MedicoH medico = new MedicoH();
		medico.setCedula("16486465");
		medico.setNombre("Diana");

		CitaMedicaH cita = new CitaMedicaH();
		
		cita.agendar("12345", LocalDateTime.of(2022, 12, 2, 8, 30), pacienteTE, medico);
	}

}

