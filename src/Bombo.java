import java.util.ArrayList;
import java.util.Random;

public class Bombo {
	private ArrayList<Jugador> participantes;
	private int numero;
	private int cant_participantes;
	
	public Bombo(int numero, int cant_participantes) {
		this.numero = numero;
		this.cant_participantes = cant_participantes;
		this.participantes = new ArrayList<Jugador>();
	}
	
	public void mostrarBombo() {
		if (this.participantes.isEmpty()) 
		{
			System.out.println("NO HAY PARTICIPANTES.");
			return;
		}
		
		System.out.println("Bombo nÂ° " + this.numero);
		for (int i=0; i<this.participantes.size(); i++) {
			System.out.println("\t\t" + this.participantes.get(i).getNombre() + "\t\tHoras Soldier:"
					+ " " + this.participantes.get(i).getHoras_soldier() + "\t\tHoras Totales:"
							+ " " + this.participantes.get(i).getHoras_totales());
		}
		System.out.println();
	}
	
	public void mostrarBomboSimple() {
		if (this.participantes.isEmpty()) 
		{
			System.out.println("NO HAY PARTICIPANTES.");
			return;
		}
		
		System.out.println("Bombo n° " + this.numero);
		for (int i=0; i<this.participantes.size(); i++) {
			System.out.println("\t\t" + this.participantes.get(i).getNombre());
		}
		System.out.println();
	}
	
	public void agregarParticipante(Jugador jugador) {
		this.participantes.add(jugador);
	}

	public int getNumero() {
		return numero;
	}
	
	public Jugador getParticipante(int index) {
		try {
			return this.participantes.get(index);
		}
		catch (IndexOutOfBoundsException e) {
			return this.participantes.get(this.participantes.size()-1);
		}
	}
	
	public Jugador removeParticipante(int index) {
		try {
			return this.participantes.remove(index);
		}
		catch (IndexOutOfBoundsException e) {
			return this.participantes.remove(this.participantes.size()-1);
		}
	}
	
	public Jugador removeParticipante() {
		return this.participantes.remove(new Random(System.currentTimeMillis()).nextInt(this.participantes.size()));
	}

	public int getCant_participantes() {
		return cant_participantes;
	}
}
