package co.vn.giabao;

public class ThreadSafeUpgradedSingleton {

	private static ThreadSafeUpgradedSingleton instance;
	
	private ThreadSafeUpgradedSingleton() {}
	
	public static ThreadSafeUpgradedSingleton getInstance() {
		if (instance == null) {
			synchronized(ThreadSafeUpgradedSingleton.class) {
				instance = new ThreadSafeUpgradedSingleton();
			}
		}
		
		return instance;
	}

	public void showMessage() {
		System.out.println("Messages from ThreadSafeUpgradedSingleton");
	}
}
