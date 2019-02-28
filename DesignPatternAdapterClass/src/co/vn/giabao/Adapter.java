package co.vn.giabao;

public class Adapter extends Adaptee implements Target {

	@Override
	public String estimate(int i) {
		return String.valueOf(Math.round(precise(i, 3)));
	}
}
