package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;


@SpringBootApplication
public class ProyectoU1BmApplication implements CommandLineRunner {
	
	@Autowired
    private IVehiculoService iVehiculoService;

    @Autowired
    private IPropietarioService iPropietarioService;

    @Autowired
    @Qualifier("pesado")
    private IMatriculaNuevaService iMatriculaService;


public static void main(String[] args) {
		SpringApplication.run(ProyectoU1BmApplication.class, args);
         
	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo vehi=new Vehiculo();
        vehi.setMarca("toyota");
        vehi.setPlaca("pds");
        vehi.setPrecio(new BigDecimal(20000));
        vehi.setTipo("p");

        this.iVehiculoService.crear(vehi);

        vehi.setPrecio(new BigDecimal(10000));
        vehi.setMarca("Toyota");

        this.iVehiculoService.modificar(vehi);

        Propietario propietario=new Propietario();
        propietario.setApellido("cayambe");
        propietario.setCedula("12147552");
        propietario.setFechaNacimiento(LocalDateTime.of(1989,7,7,12,35 ));
        propietario.setNombre("Edison");

        this.iPropietarioService.guardar(propietario);

        this.iMatriculaService.matricular("12147552", "pds");
		
	}

}
