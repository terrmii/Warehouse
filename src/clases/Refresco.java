package clases;

import factura.Articulo;

public class Refresco extends Articulo {

	private String sabor;
	private Boolean zumo;
	private Boolean gaseoso;
	private int cantidadAzucar;
	
	public Refresco(String categoria, String code, String name, String mark, int capacidadBotella,
            double precio, int stock, String sabor, boolean zumo, boolean gaseoso, int cantidadAzucar) {
        super(categoria, code, name, mark, capacidadBotella, precio, stock);
        this.sabor = sabor;
        this.zumo = zumo;
        this.gaseoso = gaseoso;
        this.cantidadAzucar = cantidadAzucar;
    }
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public Boolean getZumo() {
		return zumo;
	}
	public void setZumo(Boolean zumo) {
		this.zumo = zumo;
	}
	public Boolean getGaseoso() {
		return gaseoso;
	}
	public void setGaseoso(Boolean gaseoso) {
		this.gaseoso = gaseoso;
	}
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}
	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	
	//METODOS
	
	public void visualizarPropiedades(){
		
		System.out.println(super.toString()+"Sabor: "+this.sabor+"\n Zumo: "+this.zumo+"\n Gaseoso: "+this.gaseoso+"\n cantidadAzucar: "+this.cantidadAzucar);
	}	
	
	public Boolean esSaludable() {
		
		Boolean saludable = false;
		
		if(this.cantidadAzucar < 20) {
			saludable = true;
		}
		else {
			saludable = false;
		}
		
		return saludable;
		
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
