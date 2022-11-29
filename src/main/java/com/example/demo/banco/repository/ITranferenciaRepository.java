package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITranferenciaRepository {
	//CRUD
	public Transferencia buscar(Integer id);//clave primaria
	//
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);//recibe el id del objeto a borrar
}
