package co.vn.giabao;

import java.util.Scanner;

import co.vn.giabao.bank.Bank;
import co.vn.giabao.factorypattern.BankFactory;
import co.vn.giabao.util.BankType;

/**
 * Bank application.
 *
 * @author vn.co.giabao
 * @version 1.0
 */
public class BankApplication {

	/** {@link Scanner}. */
	private static Scanner sc;

	/**
	 * The main method.
	 *
	 * @param args The arguments
	 */
	public static void main(String[] args) {
		
		System.out.print("Please input short name of bank: ");
		
		sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		// convert to integer
		BankType bankType = BankType.UNKNOWN;
		
		if (inputStr.toLowerCase().equals("tcb")) {
			bankType = BankType.TECHCOMBANK;
			
		} else if (inputStr.toLowerCase().equals("vcb")) {
			bankType = BankType.VIETCOMBANK;
			
		} else if (inputStr.toLowerCase().equals("agb")) {
			bankType = BankType.AGRIBANK;
			
		} else if (inputStr.toLowerCase().equals("bidv")) {
			bankType = BankType.BIDV;
		}
		
		// create bank
		Bank bank = BankFactory.getBank(bankType);
		System.out.println(bank.getBankName());
	}
}
