package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		CitaMedica cita = new CitaMedica();
		cita.agendar("1234", LocalDateTime.of(2022, 12, 2,  8, 30),  "Doctor Teran", "123456689", "Paciente Edison", "1231244", "N");

	}

}
