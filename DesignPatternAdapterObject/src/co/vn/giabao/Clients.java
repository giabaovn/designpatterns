package co.vn.giabao;

public class Clients {

	public static void main(String[] ars) {
		
		System.out.println("--- Adapter Design Pattern ---");

		Target target = new Adapter(new Adaptee());
		System.out.println(target.estimate(8));
	}
}
