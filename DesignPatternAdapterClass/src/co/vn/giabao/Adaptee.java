package co.vn.giabao;

public class Adaptee {

	// Old interface, need to adapter for working
	public double precise(double a, double b) {
		
		System.out.println("Old lib::precise");
		return a/b;
	}
}
