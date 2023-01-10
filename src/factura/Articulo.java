package factura;

import java.util.Scanner;
/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public abstract class Articulo  {

	private String code;
	private String name;
	private String mark;
	private int capacidadBotella;
	private double precio;
	private int stock;
	
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
		Scanner sc = new Scanner(System.in);
	    incrementarStock = sc.nextInt();
	    sc.close();
	    
	    incrementarStock = this.stock + incrementarStock;
	}
	
	public void disminuirStock(int disminuirStock) {
		Scanner sc = new Scanner(System.in);
	    disminuirStock = sc.nextInt();
	    sc.close();
	    
	    disminuirStock = this.stock + disminuirStock;
	}
	
	public abstract void visualizarArticulo();
	public abstract boolean saludable();
	public abstract void precioTotal();
		
	
}
