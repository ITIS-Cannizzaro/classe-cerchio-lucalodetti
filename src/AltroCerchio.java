

public class AltroCerchio {
	
	private double r1;
	private double r2;
	
	public AltroCerchio(double r1) {
		this.r1 = r1;
	}
	
	public AltroCerchio(AltroCerchio r2) {
		this.r2 = r2.GetRaggio();
	}
	
	public double GetRaggio() {
		return r2;
	}
	
	public double diametroRaggio1() {
		return 2 * r1;
	}
	
	public double circonferenzaRaggio1() {
		return 2 * 3.14 * r1;
	}
	
	public double areaRaggio1() {
		return 3.14 * Math.pow(r1, 2);
	}
	
	public double diametroRaggio2() {
		return 2 * r2;
	}
	
	public double circonferenzaRaggio2() {
		return 2 * 3.14 * r2;
	}
	
	public double areaRaggio2() {
		return 3.14 * Math.pow(r2, 2);
	}

	@Override
	public String toString() {
		return "AltroCerchio [ "
				+ "diametroRaggio1() = " + diametroRaggio1() 
				+ ", circonferenzaRaggio1() = " + circonferenzaRaggio1() 
				+ ", areaRaggio1() = " + areaRaggio1() 
				+ ", diametroRaggio2() = " + diametroRaggio2() 
				+ ", circonferenzaRaggio2() = " + circonferenzaRaggio2() 
				+ ", areaRaggio2() = " + areaRaggio2()
				+ " ]";
	}
	
	

}
