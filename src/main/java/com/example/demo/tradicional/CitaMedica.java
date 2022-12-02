package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	
	public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico,
			String cedulaMedico, String nombrePaciente, String cedulaPaciente, String tipo) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		
		Medico medicoObjeto=new Medico();
		medicoObjeto.setCedula(cedulaMedico);
		medicoObjeto.setNombre(nombreMedico);
		this.medico=medicoObjeto;
		

		//Tercera edad es TE, Ninio es N
		if(tipo.equals("TE")) {
			PacienteTerceraEdad pacienteTE = new PacienteTerceraEdad();
			
			pacienteTE.setCodigoIESS("123213");
			pacienteTE.setTipo("TE");
			
			this.paciente = pacienteTE;
			System.out.println("Paciente con descuento");
			
		}if (tipo.equals("N")) {
			PacienteNinio pacienteNinio = new PacienteNinio();
			
			pacienteNinio.setPesoNacimiento(5);		
			pacienteNinio.setTipo("N");
			
			this.paciente = pacienteNinio;
			System.out.println("Paciente niño sin descuento");
		}else {
			PacienteCancer pc= new PacienteCancer();
			this.paciente=pc;
			System.out.println("Paciente Cancer con el 30% descuento");
		}
		
		
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setCedula(cedulaPaciente);
		
		this.guardarCita(this);
		
	}
	
	private void guardarCita(CitaMedica cita) {
		//Insert en la base de datos, gurdar la cita
	System.out.println("Cita Medica");
	System.out.println(cita);
	}
	
	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	//SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	

}
