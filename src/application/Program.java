package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		double conv = converter.priceConverter(price, quantity);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", conv));
		
		sc.close();
	}
	
		
}
