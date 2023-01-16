package clases;

import factura.Articulo;

public class Cerveza extends Articulo implements Alcoholico{
	
	public Cerveza(String categoria, String code, String name, String mark, int capacidadBotella, double precio, int stock,
			String origen, String cereales, double gradosAlcohol) {
		super(categoria, code, name, mark, capacidadBotella, precio, stock);
		// TODO Auto-generated constructor stub
		
		this.origen = origen;
		this.cereales = cereales;
		this.gradosAlcohol = gradosAlcohol;
	}
	private String origen;
	private String cereales;
	private double gradosAlcohol;
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCereales() {
		return cereales;
	}
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	
	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double calcularTasa() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void visualizarArticulo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void precioTotal() {
		// TODO Auto-generated method stub
		
	}
	
}
