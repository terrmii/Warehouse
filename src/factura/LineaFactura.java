package factura;
/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public class LineaFactura {
	private int numero;
	private int cantidad;
	private Articulo articulo;
	
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
	
	public Articulo getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	//METODOS
	public double precioTotal() {
		
		return numero*cantidad;
	}
	
	public void mostrarEnPantalla() {
		System.out.println(
				this.numero+ "\t" + 	
				this.cantidad + "\t" +
				this.articulo + "\t" +
				this.precioTotal()
				);
	}



}
