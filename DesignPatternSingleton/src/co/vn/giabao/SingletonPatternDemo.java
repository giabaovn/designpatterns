package co.vn.giabao;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		// call showMessage from EagerInitializedSingleton
		EagerInitializedSingleton.getInstance().showMessage();
		
		// call showMessage from LazyInitializedSingleton
		LazyInitializedSingleton.getInstance().showMessage();
		
		// call showMessage from ThreadSafeSingleton
		ThreadSafeSingleton.getInstance().showMessage();
		
		// call showMessage from ThreadSafeUpgradedSingleton
		ThreadSafeUpgradedSingleton.getInstance().showMessage();
	}

}
