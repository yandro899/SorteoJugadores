
public class Jugador {
	private String nombre;
	private int horas_soldier;
	private int horas_totales;
	
	public Jugador(String nombre, int horas_totales, int horas_soldier) {
		this.nombre = nombre;
		this.horas_soldier = horas_soldier;
		this.horas_totales = horas_totales;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras_soldier() {
		return horas_soldier;
	}
	public void setHoras_soldier(int horas_soldier) {
		this.horas_soldier = horas_soldier;
	}
	public int getHoras_totales() {
		return horas_totales;
	}
	public void setHoras_totales(int horas_totales) {
		this.horas_totales = horas_totales;
	}
	
	
}
