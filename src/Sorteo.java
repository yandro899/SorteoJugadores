import java.util.ArrayList;
import java.util.Scanner;

public class Sorteo {
	public static ArrayList<Jugador> lista = new ArrayList<Jugador>();
	
	public static int busquedaMasPro() {
		int posMasPro = 0;
		int horasSoldMasPro = lista.get(posMasPro).getHoras_soldier();
		
		for (int i=0; i<lista.size(); i++) {
			if (lista.get(i).getHoras_soldier() > horasSoldMasPro) {
				horasSoldMasPro = lista.get(i).getHoras_soldier();
				posMasPro = i;
			}
		}
		return posMasPro;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner parada = new Scanner(System.in);
		// Definir lista total jugadores
		
		lista.add(new Jugador("Yandro", 2559, 125));
		
		
		// Primero armar bombos (4 bombos)
		// Arma por horas de Soldiers y en caso de empate se ve horas totales
		Bombo [] bombos = new Bombo[4];
		bombos[0] = new Bombo(1, 7);
		bombos[1] = new Bombo(2, 8);
		bombos[2] = new Bombo(3, 8);
		bombos[3] = new Bombo(4, 8);
		
		// Primer bombo (los 7 mas pros)
		for (int i=0; i<bombos.length; i++) {
			for (int j=0; j<bombos[i].getCant_participantes(); j++) {
				bombos[i].agregarParticipante(lista.remove(busquedaMasPro()));
			}
			
			bombos[i].mostrarBombo();
		}
		
		parada.next();
		
		// Despues armar grupos (7 grupos de 4 y uno de 2 jugadores)
		Grupo [] grupos = {
				new Grupo('A', 4),
				new Grupo('B', 4),
				new Grupo('C', 4),
				new Grupo('D', 4),
				new Grupo('E', 4),
				new Grupo('F', 4),
				new Grupo('G', 4),
				new Grupo('H', 2),
		};
		
		// Para bombo 1
		System.out.println("SORTEO BOMBO 1!!");

		for (int j=0; j<grupos.length-1; j++) {
			parada.next();
			System.out.println(String.format("El cabecilla del grupo \"%s\" va a ser sorteado en...", grupos[j].getLetra_grupo()));
			for (int k=5; k>0; k--) {
				System.out.print(k + ".....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("\n=======================");
			Jugador jugadorSelecc = bombos[0].removeParticipante();
			System.out.println("EL JUGADOR ES " + jugadorSelecc.getNombre() + "!!!!!\n");
			grupos[j].addParticipante(jugadorSelecc);
			grupos[j].mostrarGrupo();
		}
			
		// Para bombo 2
		System.out.println("SORTEO BOMBO 2!!");

		for (int j=0; j<grupos.length-1; j++) {
			parada.next();
			System.out.println(String.format("El otro jugador en el grupo \"%s\" va a ser sorteado en...", grupos[j].getLetra_grupo()));
			for (int k=5; k>0; k--) {
				System.out.print(k + ".....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("\n=======================");
			Jugador jugadorSelecc = bombos[1].removeParticipante();
			System.out.println("EL JUGADOR ES " + jugadorSelecc.getNombre() + "!!!!!\n");
			grupos[j].addParticipante(jugadorSelecc);
			grupos[j].mostrarGrupo();
		}
		
		// Para bombo 3
		System.out.println("SORTEO BOMBO 3!!");

		for (int j=0; j<grupos.length; j++) {
			parada.next();
			System.out.println(String.format("El otro jugador en el grupo \"%s\" va a ser sorteado en...", grupos[j].getLetra_grupo()));
			for (int k=5; k>0; k--) {
				System.out.print(k + ".....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("\n=======================");
			Jugador jugadorSelecc = bombos[2].removeParticipante();
			System.out.println("EL JUGADOR ES " + jugadorSelecc.getNombre() + "!!!!!\n");
			grupos[j].addParticipante(jugadorSelecc);
			grupos[j].mostrarGrupo();
		}
		
		// Para bombo 2
		System.out.println("SORTEO BOMBO 4!!");

		for (int j=0; j<grupos.length; j++) {
			parada.next();
			System.out.println(String.format("Los ultimos jugadores el grupo \"%s\" va a ser sorteado en...", grupos[j].getLetra_grupo()));
			for (int k=5; k>0; k--) {
				System.out.print(k + ".....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("\n=======================");
			Jugador jugadorSelecc = bombos[3].removeParticipante();
			System.out.println("EL JUGADOR ES " + jugadorSelecc.getNombre() + "!!!!!\n");
			grupos[j].addParticipante(jugadorSelecc);
			grupos[j].mostrarGrupo();
		}
		
		parada.next();
		System.out.println("===== GRUPOS DEFINIDOS =====");
		for (int i=0; i<grupos.length; i++) {
			grupos[i].mostrarGrupo();
		}
		parada.close();
	}
	

}
