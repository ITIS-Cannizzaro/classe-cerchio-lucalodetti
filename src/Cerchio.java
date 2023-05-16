

public class Cerchio {
	// area: A = πr²
	// circonferenza: C = 2πr
	
	private double r;
	
	public Cerchio(double r) {
		this.r = r;
	}
	
	public Cerchio(Cerchio altroCerchio) {
		this.r = altroCerchio.getRaggio() * 2;
	}

	private double getRaggio() {
		return r;
	}

	public double diametro() {
		return 2 * r;
	}
	
	public double circonferenza() {
		return 2 * 3.14 * r;
	}
	
	public double area() {
		return 3.14 * Math.pow(r, 2);
	}

	@Override
	public String toString() {
		return "Cerchio [ "
				+ "diametro = " + diametro() 
				+ ", circonferenza = " + circonferenza() 
				+ ", area = " + area()
				+ " ]";
	}
	
	
}
