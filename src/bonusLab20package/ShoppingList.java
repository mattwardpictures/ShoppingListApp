package bonusLab20package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("         Welcome to        ");
		System.out.println("===========================");
		System.out.println("BURTONSVILLE FARMERS MARKET");
		System.out.println("===========================");

		String[] itemNames = { "apple", "banana", "carrots", "bacon", "chicken", "rice", "milk", "toilet paper" };
		Double[] itemPrices = { 0.99, 1.99, 0.50, 6.00, 7.00, 4.50, 3.99, 15.00 };

		ArrayList<String> productList = new ArrayList<String>(Arrays.asList(itemNames));
		ArrayList<Double> priceList = new ArrayList<Double>(Arrays.asList(itemPrices));

		System.out.println(" ");
		System.out.printf("%-15s %-15s %n", "Item", "Price");
		System.out.printf("%-30s %n", "==============================");

		for (int i = 0; i < productList.size(); i++) {
			for (int j = 0; j < priceList.size(); j++) {
			}
			System.out.printf("%-15s %-15s %n", (itemNames[i]), "$" + Double.toString(itemPrices[i]));
		}

		String userInput;
		String continueShopping;

		ArrayList<String> shopTheseItems = new ArrayList<>();
		ArrayList<Double> payThesePrices = new ArrayList<>();
		// userInput = Validator.getString(scan, "\nPlease enter an item: ", itemNames);
		for (int i = 0; i < itemNames.length; i++) {
			do {
				System.out.println("\nPlease enter an item: ");
				userInput = scan.next();
				if (userInput.equalsIgnoreCase(itemNames[i])) {
					shopTheseItems.add(userInput);
					payThesePrices.add(itemPrices[i]);
					System.out.println("Adding " + itemNames[i] + " to cart at $" + itemPrices[i]);
				} else {
					System.out.println("Sorry, " + userInput + " is not part of our inventory.");
				}
				System.out.println("\nWould you like to order something else? (y/n)");
				continueShopping = scan.next();
			} while (continueShopping.charAt(0) == 'y');
			System.out.println("\nThanks for shopping with us! \nHere's what you got: ");
			for (int j = 0; j < shopTheseItems.size(); j++) {
				for (int j2 = 0; j2 < payThesePrices.size(); j2++) {

				}
				System.out.printf("%-15s %-15s %n", shopTheseItems, "$" + payThesePrices);
			}

		}

	}

	// Method that gets price average. WORKS.
	public static double getAverage(Double[] prices) {
		double sum = 0.0;
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		return sum / prices.length;
	}

	// Method that gets grand total. Just for S&G's.
	public static double getTotal(Double[] prices) {
		double total = 0.0;
		for (int i = 0; i < prices.length; i++) {
			total += prices[i];
		}
		return total;
	}

	public static double getHighPriceIndex(Double[] prices) {
		Arrays.sort(prices);

		return prices[7];
	}

	public static double getLowestPriceIndex(Double[] prices) {
		Arrays.sort(prices);

		return prices[0];
	}

}
