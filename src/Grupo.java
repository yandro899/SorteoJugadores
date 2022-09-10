import java.util.ArrayList;

public class Grupo {
	private char letra_grupo;
	private ArrayList<Jugador> participantes;
	private int cant_jugadores_max;
	
	public Grupo(char letra_grupo, int cant_jugadores_max) {
		this.letra_grupo = letra_grupo;
		this.participantes = new ArrayList<Jugador>();
		this.cant_jugadores_max = cant_jugadores_max;
	}
	
	public void mostrarGrupo() {
		if (this.participantes.isEmpty()) 
		{
			System.out.println("NO HAY PARTICIPANTES.");
			return;
		}
		
		System.out.println("Grupo " + this.letra_grupo);
		for (int i=0; i<this.participantes.size(); i++) {
			System.out.println("\t\t" + this.participantes.get(i).getNombre());
		}
		
		System.out.println();
	}

	public Jugador getParticipante(int index) {
		try {
			return this.participantes.get(index);
		}
		catch (IndexOutOfBoundsException e) {
			return this.participantes.get(this.participantes.size()-1);
		}
	}
	
	public void addParticipante(Jugador jugador) {
		this.participantes.add(jugador);
	}
	
	public char getLetra_grupo() {
		return letra_grupo;
	}
	
	public int getCant_jugadores_max() {
		return cant_jugadores_max;
	}
}
