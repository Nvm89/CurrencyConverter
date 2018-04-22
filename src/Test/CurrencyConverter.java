package Test;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

	private static final Double USD = 1.79549;
	private static final Double BGN = 1.00000;
	private static final Double EUR = 1.95583;
	private static final Double GBP = 2.53405;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input.useLocale(Locale.US);
		double inputValue = input.nextDouble();
		
		//Double inputValue = Double.parseDouble(doublevalue);
		input.nextLine();
		String inputCurrency = input.nextLine();
		String outputCurrency = input.nextLine();
		
		double outputCur = 0.0;

		switch (outputCurrency) {
		case "BGN":
			if (inputCurrency.equals("USD")) {
				outputCur = inputValue * USD;
			}
			if (inputCurrency.equals("EUR")) {
				outputCur = inputValue * EUR;
			}

			if (inputCurrency.equals("GBP")) {
				outputCur = inputValue * GBP;
			}
			break;
			
		case "USD":
			if (inputCurrency.equals("BGN")) {
				outputCur = inputValue / USD;
			}
			if (inputCurrency.equals("EUR")) {
				outputCur = inputValue * (EUR/USD);
			}

			if (inputCurrency.equals("GBP")) {
				outputCur = inputValue * (GBP/USD);
			}
			break;
			
		case "EUR":
			if (inputCurrency.equals("BGN")) {
				outputCur = inputValue / EUR;
			}
			if (inputCurrency.equals("USD")) {
				outputCur = inputValue * (USD/EUR);
			}

			if (inputCurrency.equals("GBP")) {
				outputCur = inputValue * (GBP/EUR);
			}
			break;
			
		case "GBP":
			if (inputCurrency.equals("BGN")) {
				outputCur = inputValue * GBP;
			}
			if (inputCurrency.equals("USD")) {
				outputCur = inputValue * (USD/GBP);
			}

			if (inputCurrency.equals("EUR")) {
				outputCur = inputValue * (EUR/GBP);
			}
			break;


		default:
			break;
		}
		System.out.printf("%.2f", outputCur);
		System.out.print(" " + outputCurrency);

	}

}
