package co.vn.giabao;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Messages from EagerInitializedSingleton");
	}
}
