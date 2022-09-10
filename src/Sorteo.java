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
		
		lista.add(new Jugador("Yui", 7147, 448));
		lista.add(new Jugador("V0lker", 1679, 140));
		lista.add(new Jugador("Paolaxo", 2719, 27));
		lista.add(new Jugador("Rake", 2138, 102));
		lista.add(new Jugador("Plantita", 1142, 63));
		lista.add(new Jugador("El peluca", 751, 74));
		lista.add(new Jugador("Shawn", 1852, 262));
		lista.add(new Jugador("Cuy Magico de ciber", 4082, 425));
		lista.add(new Jugador("Ghosty", 1453, 225));
		lista.add(new Jugador("Sora", 4819, 248));
		lista.add(new Jugador("Jack el destripador", 1585, 213));
		lista.add(new Jugador("Zebra", 2881, 154));
		lista.add(new Jugador("GDA A.B", 1600, 214));
		lista.add(new Jugador("Señor morado", 1630, 100));
		lista.add(new Jugador("Megumi", 2132, 606));
		lista.add(new Jugador("Destragno", 1558, 131));
		lista.add(new Jugador("Linu", 2777, 152));
		lista.add(new Jugador("La bala de nisman", 4235, 227));
		lista.add(new Jugador("Saquenme de Argentina", 1760, 35));
		lista.add(new Jugador("Cafesito", 675, 37));
		lista.add(new Jugador("Yandro", 2559, 125));
		lista.add(new Jugador("Dan3lpon3", 3268, 85));
		lista.add(new Jugador("Iraq Lobster", 6051, 164));
		lista.add(new Jugador("Big Mad taco", 681, 46));
		lista.add(new Jugador("Skull hn", 2896, 386));
		lista.add(new Jugador("Texos", 3699, 391));
		lista.add(new Jugador("Darkito", 1739, 80));
		lista.add(new Jugador("Javers", 3083, 239));
		lista.add(new Jugador("Capitanazo", 2556, 156));
		lista.add(new Jugador("Papa Frita", 1821, 4));
		lista.add(new Jugador("MauroAlfaro96", 964, 7));
		
		
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
			System.out.println("Jugadores restantes en bombo:");
			bombos[0].mostrarBomboSimple();
		}
			
		// Para bombo 2
		System.out.println("SORTEO BOMBO 2!!");

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
			Jugador jugadorSelecc = bombos[1].removeParticipante();
			System.out.println("EL JUGADOR ES " + jugadorSelecc.getNombre() + "!!!!!\n");
			grupos[j].addParticipante(jugadorSelecc);
			grupos[j].mostrarGrupo();
			System.out.println("Jugadores restantes en bombo:");
			bombos[1].mostrarBomboSimple();
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
			System.out.println("Jugadores restantes en bombo:");
			bombos[2].mostrarBomboSimple();
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
			System.out.println("Jugadores restantes en bombo:");
			bombos[3].mostrarBomboSimple();
		}
		
		parada.next();
		System.out.println("===== GRUPOS DEFINIDOS =====");
		for (int i=0; i<grupos.length; i++) {
			grupos[i].mostrarGrupo();
		}
		parada.close();
	}
	

}
