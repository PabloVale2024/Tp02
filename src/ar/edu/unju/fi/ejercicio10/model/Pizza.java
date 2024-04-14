package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private double diametro;
	private double precio;
	private double area;
	private boolean ingredentesEspeciales;
	
	public final int ESEPCIAL20 = 500;
	public final int ESEPCIAL30 = 750;
	public final int ESEPCIAL40 = 1000;
	
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredentesEspeciales() {
		return ingredentesEspeciales;
	}
	public void setIngredentesEspeciales(boolean ingredentesEspeciales) {
		this.ingredentesEspeciales = ingredentesEspeciales;
	}
	public double calcularPrecio() {
		double precio = 0;
		
		if (diametro == 20 && !ingredentesEspeciales) {
			precio = 4500 + ESEPCIAL20;
			
		}
		
		
	}
}