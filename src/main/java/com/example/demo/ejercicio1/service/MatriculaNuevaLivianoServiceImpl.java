package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService{

	
	
	@Override
	public BigDecimal matricular( BigDecimal precio) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Matriculado liviano");
		System.out.println("Calculo de descuento de 2000");
		
			BigDecimal valor= precio.multiply(new BigDecimal(0.10));
			return valor;
		}
	}


