package juego;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import modelo.*;
import ventanas.*;

public class BlackJack implements Serializable {
	boolean juegoActivo = false;
	int multiplicador = 0;
	int racha = 0;
	public int randomCarta = 0;
	public File f = new File("baraja.dat");
	public ArrayList<Carta> totalBaraja = new ArrayList<>();
	public Baraja baraja = new Baraja(f, totalBaraja);
	public int cantidadC = 0;

	// -Jugador y cartas-
	//ramdomizar la selecion de cartas para el jugador. 
	//El numero que aparece es el numero de la carta (posicion) y se le quita de la baraja para que no se repita
	//El segundo numero es toda la baraja (52 cartas -1) 

	//Luego se le reparten 2 cartas al crupier que al igual que a las anteriores cartas se le es quita del fichero/arraylist

	// -Posicion de las cartas y a la hora de repartir-
	//La primera carta que se reparte esta boca arriba, mientras que la segunda esta boca abajo

	// -Casauticas AS-
	//El As siempre valdra 11 a menos a que el jugador supere los 21 con As. Y es por eso que se le cambiara el valor a 1.

	// -Casauticas Dividir-
	//Si las primeras dos cartas son identicas, tienes la opcion de poder dividirlas. Doblas la apuesta, y jugaras doble mano de forma independiente. 
	//Donde puedes ganar, empatar y perdaer por ambas partes
	//Si se repite que se puede volver repetir (diremos que las mesas estan ocupadas

	// -Casauticas Doblar-
	//Si en tus primeras cartas obtienes un 9/10/11 puedes doblar, solamente se te dara una carta mas y terminas y doblaras la apuesta
	//Se le avisara al usuario con antelacion que sera su ultima carta

	// -Casauticas Renirese-
	//Si te rindes pierdes automaticamente

	// -Extras, racha-
	//Aumenta 0,10 el multiplicador de dinero por cada victoria hasta un maximo de 0,1
	//Si ha sido blackjack aumentara un 0,25 en vez de 0,10
	//Despues de 5 ganadas no se sumaran nada mas
	//Si has perdido puedes mantener la racha pagando 1/12 de tu dinero

	
	//Esto decide despues de hacer el calculo si ganas, pierdes o empatas//
	public String comprobarResultado(int sumaJugador, int sumaCrupier) {
	    if (sumaJugador > 21) {
	        return "PERDER";
	    } else if (sumaCrupier > 21 || sumaJugador > sumaCrupier) {
	        return "GANAR";
	    } else if (sumaJugador == sumaCrupier) {
	        return "EMPATE";
	    } else {
	        return "PERDER";
	    }
	}
	
	public boolean iniciarJuego(File f, ArrayList<Carta> totalBaraja) {
		boolean juegoActivo = true;
		Baraja baraja = new Baraja(f, totalBaraja);
		baraja.crearYGuardarBaraja();
		baraja.cargarBaraja(totalBaraja);
		return juegoActivo;
	}

	public void apostar(File f, Carta carta, ArrayList<Carta> totalBaraja) {
		//Genera un numero random entre 1 al 51
		//Reparte la carta al jugador
		//randomCarta es la posicion de la carta

		randomCarta = (int) (Math.random() * (totalBaraja.size()-1));
		carta = totalBaraja.get(randomCarta);
		totalBaraja.remove(randomCarta);
	} 

	public int traductorDeCartas(ArrayList<Carta> totalBaraja, BlackJack bkj, int sumaT) {

		if (totalBaraja.get(bkj.randomCarta).getNumero().equals("UNO")) {
			if (sumaT > 10) {
				sumaT += 1;
			} else {
				sumaT += 11;
			}

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("DOS")) {
			sumaT += 2;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("TRES")) {
			sumaT += 3;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("CUATRO")) {
			sumaT += 4;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("CINCO")) {
			sumaT += 5;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("SEIS")) {
			sumaT += 6;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("SIETE")) {
			sumaT += 7;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("OCHO")) {
			sumaT += 8;

		} else if (totalBaraja.get(bkj.randomCarta).getNumero().equals("NUEVE")) {
			sumaT += 9;

		} else {
			// DIEZ, J, Q, K
			sumaT += 10;
			
		}

		return sumaT;
	}
	
}
