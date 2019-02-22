package co.vn.giabao.util;

import java.util.Random;

/**
 * Common Utilities.
 *
 * @author vn.co.giabao
 * @version 1.0
 */
public class CommonUtils {

	/** character list. */
	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	/** random string length. */
	private static final int RANDOM_STRING_LENGTH = 10;

	/**
	 * Generate random string.
	 *
	 * @return The string
	 */
	public String generateRandomString() {

		StringBuffer randStr = new StringBuffer();

		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {

			int number = getRandomNumber();
			char ch = CHAR_LIST.charAt(number);
			randStr.append(ch);
		}

		return randStr.toString();
	}

	/**
	 * Get the random number.
	 *
	 * @return The random number
	 */
	private int getRandomNumber() {
		
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		
		if (randomInt == 0) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}
}
