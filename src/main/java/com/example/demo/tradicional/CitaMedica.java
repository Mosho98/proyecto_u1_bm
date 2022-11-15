package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	
	public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico,
			String cedulaMedico, String nombrePaciente, String cedulaPaciente) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		
		Medico medicoObjeto=new Medico();
		medicoObjeto.setCedula(cedulaMedico);
		medicoObjeto.setNombre(nombreMedico);
		this.medico=medicoObjeto;
		
		Paciente pacienteObjeto= new Paciente();
		pacienteObjeto.setCedula(cedulaPaciente);
		paciente.setNombre(nombrePaciente);
		this.paciente=pacienteObjeto;
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
