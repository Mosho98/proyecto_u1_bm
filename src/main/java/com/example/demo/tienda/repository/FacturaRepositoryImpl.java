package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Factura;

@Repository
public class FacturaRepositoryImpl implements IFacturaRepository{

	private static List<Factura> baseDatos = new ArrayList();
	
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		baseDatos.add(factura);
	}

}
