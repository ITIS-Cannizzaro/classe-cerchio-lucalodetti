

public class CerchioRunner {
/*
Esercizio 1 (esercizio 5.4 del libro di testo).
Progettare una classe cerchio. La classe dispone del seguente costruttore 
e dei seguenti metodi di istanza:

public Cerchio(double r): costruttore per creare un oggetto Cerchio che
rappresenta un cerchio di raggio r (si ricordi che il tipo double indica numeri reali).

public double diametro(): metodo che restituisce il diametro del cerchio
rappresentato dall’oggetto ricevente.

public double perimetro(): metodo che restituisce il perimetro del cerchio
rappresentato dall’oggetto ricevente.

public double area(): metodo che restituisce l’area del cerchio rappresentato
dall’oggetto ricevente.

public Cerchio sommaRaggio(Cerchio c): metodo che restituisce un nuovo
oggetto Cerchio il cui raggio è la somma dei raggi dei cerchi rappresentati dall’oggetto
ricevente e dall’oggetto c.
*/
	public static void main(String[] args) {

		Cerchio cerchio = new Cerchio(5.0);
		Cerchio cerchio1 = new Cerchio(cerchio);
		
		System.out.println(cerchio);
		System.out.println(cerchio1);
	}

}
