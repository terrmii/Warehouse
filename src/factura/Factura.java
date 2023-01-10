package factura;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public class Factura {

	private static int IVA = 21;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	private ArrayList<LineaFactura> lineas = new ArrayList<LineaFactura>();
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	public static int getIVA() {
		return IVA;
	}

	public static void setIVA(int iVA) {
		IVA = iVA;
	}

	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	
	//METODOS
	
	public void addLinea(LineaFactura linea) {
		lineas.add(linea);
	}
	
	public void eliminarLinea(LineaFactura linea) {
		lineas.clear();
	}
	
	public double precioTotal() {
		double total = 0;
		for (int i = 0; i < lineas.size(); i++) {
			total = total + lineas.get(i).precioTotal();
		}
		
		return total;
	}
	
	public void mostrarEnPantalla() {
		System.out.println("Numero factura: "+this.numero);
		System.out.println("Nombre Empresa: "+this.nombreEmpresa);
		System.out.println("Fecha: "+this.fecha);
		System.out.println("Concepto: "+this.concepto);
		
		for (LineaFactura lineaFactura : this.lineas) {
			lineaFactura.mostrarEnPantalla();
		}
	}
	
	public void guardarEnFichero() {
		//SIN TERMINAR
		viva bolivia
	}
}
