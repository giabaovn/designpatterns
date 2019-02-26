package co.vn.giabao;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}

	public void showMessage() {
		System.out.println("Messages from ThreadSafeSingleton.");
	}
}
