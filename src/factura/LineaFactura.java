package factura;

public class LineaFactura {
	private int numero;
	private int cantidad;
	//private Articulo articulo;
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	//METODOS
	public double precioTotal() {
		
		return numero*cantidad;
	}

}
