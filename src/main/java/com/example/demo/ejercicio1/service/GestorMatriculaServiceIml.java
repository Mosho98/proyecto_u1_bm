package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceIml implements IGestorMatriculaService{
	
	
	@Autowired
	    @Qualifier("pesado")
	    private IMatriculaNuevaService iMatriculaService;
	    
	    
	    @Autowired
	    @Qualifier("pesado")
	    private IMatriculaNuevaService iMatriculaServiceLiviano;
	    
	    
	    
	    
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
	     Vehiculo vehi = null;
        if(vehi.getTipo().equals("p")) {
        	this.iMatriculaService.matricular("123234345", "lbb7250");
        }else {
        	this.iMatriculaServiceLiviano.matricular("12147552", "lbb7250");
        }
        //PROGRAMO DESCUENTO
	}

}
