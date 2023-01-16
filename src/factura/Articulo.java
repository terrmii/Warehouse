package factura;

import java.util.Scanner;
/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public abstract class Articulo  {

	public Articulo(String categoria, String code, String name, String mark, int capacidadBotella,double precio,int stock) {
		this.categoria = categoria;
		this.code = code;
		this.name = name;
		this.mark = mark;
		this.capacidadBotella = capacidadBotella;
		this.precio = precio;
		this.stock = stock;
	}
	
	private String categoria;
	private String code;
	private String name;
	private String mark;
	private int capacidadBotella;
	private double precio;
	private int stock;
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public int getCapacidadBotella() {
		return capacidadBotella;
	}
	public void setCapacidadBotella(int capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//METODOS
	
	/*
	 * REVISAR INCREMENTAR STOCK
	 */
	public void incrementarStock(int incrementarStock) {
	    
	    this.stock = this.stock + incrementarStock;
	}
	
	public void disminuirStock(int disminuirStock) {
	    
	    this.stock = this.stock + disminuirStock;
	}
	
	public abstract void visualizarArticulo();
	public abstract boolean saludable();
	public abstract void precioTotal();
		
	public String toString() {
		return "Codigo" + code + "\nNombre" + name + mark + "\n CapacidadBotella:"+capacidadBotella + "\nPrecio:"+precio + "\nStock:"+stock;
	}
}
