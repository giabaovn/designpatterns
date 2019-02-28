package co.vn.giabao;

public class Clients {

	public static void main(String[] args) {

		System.out.println("--- Adapter Design Pattern ---");
		
		Target target = new Adapter();
		System.out.println(target.estimate(5));
	}
}
