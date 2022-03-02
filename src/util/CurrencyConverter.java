package util;

public class CurrencyConverter {
	
	public final double IOF = 0.06;
	
	public double priceConverter(double price, double quantity) {
		return price * quantity + price * quantity * IOF;
	}
	
}
