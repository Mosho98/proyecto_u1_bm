package com.example.demo.banco.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{
	
	private static List <CuentaBancaria> baseCuentas=new ArrayList<>();
	
	@Override
	public CuentaBancaria bucarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO= numeroCuenta
		/*CuentaBancaria cuenta=new CuentaBancaria();
		cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		cuenta.setTitular("Bryan Mullo");*/
		
		CuentaBancaria cuenta= null;
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(numeroCuenta)) {
				cuenta = cb;
			}
		}
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		System.out.println("SE BUSCA LA CUENTA" + id );
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta= null;
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(cuentaBancaria.getNumero())) {
				cuenta  = cb;
				//baseCuentas.add(cuentaBancaria);
				
			}
			
		}
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		
		System.out.println("Se actualizo la cuenta" + cuentaBancaria);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		System.out.println("Se inserta la cuenta bancaria: " + cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
		
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("Se borra la cuenta bancaria" + id);
		
	}

}
