package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import factura.Articulo;

public class Almacen {
	
	ArrayList<Articulo> articulos = new ArrayList(); 
	
	public void cargarDatos() throws FileNotFoundException {
        File file = new File("datos/datos.txt");
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine()) {
            String linea[]= scan.nextLine().split(":");
            if(linea[0].toLowerCase().equals("refresco")) {
            	
            	Refresco refresco = new Refresco(linea[0], linea[1], linea[2],Integer.parseInt(linea[3]), Double.parseDouble(linea[4]), Integer.parseInt(linea[5]),linea[6],Boolean.parseBoolean(linea[7]), Boolean.parseBoolean(linea[8]), Integer.parseInt(linea[9]));
            	
            	articulos.add(refresco);
            }
            else if(linea[0].toLowerCase().equals("vino")) {
				
            	Vino vino = new Vino(linea[0], linea[1], linea[2],Integer.parseInt(linea[3]), Double.parseDouble(linea[4]), Integer.parseInt(linea[5]), linea[6], linea[7], Integer.parseInt(linea[8]), linea[9], Double.parseDouble(linea[10]));
            	
            	articulos.add(vino);
            	}
            else if(linea[0].toLowerCase().equals("cerveza")) {
            	
            	Cerveza cerveza = new Cerveza(linea[0], linea[1], linea[2],Integer.parseInt(linea[3]), Double.parseDouble(linea[4]), Integer.parseInt(linea[5]), linea[6], linea[7], Double.parseDouble(linea[8]));
            	
            	articulos.add(cerveza);
            }
        }
	}
	
	public Articulo elMasCaro() {
	        
	        double precio = 0;
	        Articulo elMasCaro = null;
	        
	        for(Articulo articulo:articulos) {
	             if(precio < articulo.getPrecio()) {
	                 precio = articulo.getPrecio();
	                 elMasCaro = articulo;
	             }
	         }
	        
	        return elMasCaro;
	    }

	public double precio(String codigoProducto) throws FileNotFoundException {
		
		/*
		 * Que lea el codigoProducto del txt de 
		 * articulos(tengo que crearlo) y que devuelva el precio del producto
		 */
		return 0;
	}
	/*
	 * Faltan mas metodos
	 */
	
}

