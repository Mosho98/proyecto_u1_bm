package com.example.demo.tienda.modelo;

import java.math.BigDecimal;

public class Detalle {

	private Producto producto;
	private String numero;
	private Integer cantidad;
	private BigDecimal subTotal;
	
	
	
	@Override
	public String toString() {
		return "Detalle [producto=" + producto + ", numero=" + numero + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + "]";
	}
	
	
	//METODO GET Y SET
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}
}
