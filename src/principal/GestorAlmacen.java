package principal;

import java.util.Scanner;

/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public class GestorAlmacen {

	public void run() {
		
		final int venta = 1;
		final int compra = 2;
		final int articulos_saludables = 3;
		final int articulo_mas_caro = 4;
		final int articulo_menor_stock = 5;
		final int salir = 0;
		Scanner sc = new Scanner(System.in);
		int opcionmenu;
		
		do {
			System.out.println("Eligue una opcion");
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
				
			}
			

		} while (opcionmenu != salir);
		
	}
}

