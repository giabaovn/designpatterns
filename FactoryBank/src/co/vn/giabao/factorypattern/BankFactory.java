package co.vn.giabao.factorypattern;

import co.vn.giabao.bank.Bank;
import co.vn.giabao.bank.impl.AgriBank;
import co.vn.giabao.bank.impl.BIDV;
import co.vn.giabao.bank.impl.TechcomBank;
import co.vn.giabao.bank.impl.VietcomBank;
import co.vn.giabao.util.BankType;

/**
 * A factory for creating Bank objects.
 */
public class BankFactory {

	/**
	 * Instantiates a new bank factory.
	 */
	private BankFactory() {
	}
	
	/**
	 * Get the bank.
	 *
	 * @param bankType The Bank type
	 * @return The bank
	 */
	public static final Bank getBank(BankType bankType) {
		
		switch (bankType) {
				
			case VIETCOMBANK:
				return new VietcomBank();
				
			case TECHCOMBANK:
				return new TechcomBank();
				
			case AGRIBANK:
				return new AgriBank();
				
			case BIDV:
				return new BIDV();
	
			default:
				throw new IllegalArgumentException("This bank type is unsupported");
		}
	}
}
