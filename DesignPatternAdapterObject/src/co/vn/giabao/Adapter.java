package co.vn.giabao;

public class Adapter implements Target {

	// Old model
	Adaptee adaptee;
	
	// Pass adaptee object to Adapter
	public Adapter(Adaptee component) {
		this.adaptee = component;
	}
	
	@Override
	public String estimate(int i) {

		return String.valueOf(Math.round(adaptee.precise(i, 3)));
	}
}
