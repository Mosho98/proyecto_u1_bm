package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula =new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario pro=this.iPropietarioRepository.buscar(cedula);
		matricula.setPropietario(pro);
		Vehiculo vehiculo=this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		BigDecimal valor=null;
		if(vehiculo.getTipo().equals("p")) {
			valor=vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}else {
			valor=vehiculo.getPrecio().multiply(new BigDecimal(0.10));

		}
		//-1 valor izquierda menor
		//0 iguales
		//1 valor derecha es menor
		if(valor.compareTo(new BigDecimal(2000))>1) {
			BigDecimal descuento=valor.multiply(new BigDecimal(0.07));
			valor=valor.subtract(descuento);
		}
		
		matricula.setValor(valor);
		this.iMatriculaRepository.insertar(matricula);
	}

}
