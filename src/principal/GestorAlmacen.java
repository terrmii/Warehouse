package principal;

import java.io.FileNotFoundException;
import java.util.Scanner;

import clases.Almacen;

/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public class GestorAlmacen {

	public void run() throws FileNotFoundException {
		
		Almacen almacen = new Almacen();
		almacen.cargarDatos();
		
		final int venta = 1;
		final int compra = 2;
		final int articulos_saludables = 3;
		final int articulo_mas_caro = 4;
		final int articulo_menor_stock = 5;
		final int salir = 0;
		Scanner sc = new Scanner(System.in);
		int opcionmenu;
		
		do {
			System.out.println("-----------MENU---------\n"+venta+". Realizar venta\n"+compra+
					". Realizar compra\n"+articulos_saludables+". Ver articulos saludables\n"+articulo_mas_caro+". Ver articulo mas caro\n"
					+articulo_menor_stock+". Ver los articulos con menos stock que x\n"+salir+". Salir");
			opcionmenu = sc.nextInt();

			switch(opcionmenu) {
			case venta:
				break;
			case compra:
				break;
				
			case articulos_saludables:
				break;
				
			case articulo_mas_caro:
				break;
			
			case articulo_menor_stock:
				break;
				
			default:
				System.out.println("Opcion incorrecta");
				
			}
			

		} while (opcionmenu != salir);

	}
}

