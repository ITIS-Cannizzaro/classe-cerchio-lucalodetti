

import java.util.Scanner;

public class UsoCerchio {

/*
Scrivere una classe di nome UsoCerchio, avente soltanto il metodo speciale main. Tale metodo
deve svolgere queste azioni:
1. Fare inserire all’utente tramite tastiera i raggi r1 e r2 di due cerchi nel piano.
2. Creare due oggetti Cerchio, c1 e c2, di raggio rispettivamente r1 e r2.
3. Stampare sullo standard output il diametro, il perimetro e l’area dei cerchi rappresentati
da c1 e c2.
4. Creare un terzo oggetto Cerchio c3, che rappresenti un cerchio di raggio pari alla somma
dei raggi dei cerchi rappresentati da c1 e c2.
5. Stampare sullo standard output il diametro, il perimetro e l’area del cerchio rappresentato
da c3.
Al termine della scrittura della classe, compilarla ed eseguirla più volte, provando a variare i
dati di input richiesti dal programma.
*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("inserire r1: ");
		double r1 = scan.nextInt();
		System.out.print("inserire r2: ");
		double r2 = scan.nextInt();
		
		AltroCerchio c1 = new AltroCerchio(r1);
		AltroCerchio c2 = new AltroCerchio(r2);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
