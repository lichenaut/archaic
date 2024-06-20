package p3;

import java.util.Scanner;

public class moneyManager {

	public static int cash = 100;
	public static int arrows = 0;
	public static int bows = 0;
	public static int arrowCost = 5;
	public static int bowCost = 20;
	public static String word = "arrows";
	public static String word2 = "dollars";
	public static String word3 = "on arrows";
	public static String word4 = "on bows";
	public static String word5 = "bows";
	public static String leave = "leave";
	public static String skip = "continue";

	public static void main(String[] args) {

		System.out.println("~~~ Archery Works ~~~");
		System.out.println();
		System.out.println("Balance: " + cash + " " + word2 + ".");
		System.out.println();
		System.out.println("Welcome to Archery Works! Here we sell bows and arrows!");
		System.out.println();
		System.out.println("- One arrow costs " + arrowCost + " " + word2 + ".");
		System.out.println("- One bow costs " + bowCost + " " + word2 + ".");
		System.out.println();
		System.out.println("- The 'leave' command will have you leave the shop.");
		System.out.println("- The 'continue' command will go to the other item type for purchasing.");
		arrows();

	}

	public static void arrows() {
		
		System.out.println();
		System.out.println("Type in how many arrows you would like to buy or use the previously stated commands.");
		Scanner buy = new Scanner(System.in);
		String stringBuy = buy.nextLine();

		if (stringBuy.equals(leave)) {
			if (arrows > 0) {
				System.out.println("Thank you for shopping at the Archery Works! Come again!");
				System.exit(0);
			}
			if (bows > 0) {
				System.out.println("Thank you for shopping at the Archery Works! Come again!");
				System.exit(0);
			} else {
				System.out.println("No purchases? Ok... Bye.");
				System.exit(0);
			}

		}

		if (stringBuy.equals(skip)) {
			bows();
		}

		int buyNum = Integer.parseInt(stringBuy);

		if (buyNum == 1) {
			word3 = "on an arrow";
		}

		if (cash == 1) {
			word2 = "dollar";
		}

		if (arrows == 1) {
			word = "arrow";
		}

		if (cash < (buyNum * arrowCost)) {

			System.out.println();
			System.out.println("You cannot spend " + (buyNum * arrowCost) + " " + word2 + " " + word3 + " for you have "
					+ cash + " " + word2 + ".");
			System.out.println();

			if (cash < 5) {
				System.out.println("I notice you cannot complete any future purchases.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
				System.out.println();
				System.out.println("You can leave with 'leave'.");
			}

			if (cash > 5) {
				System.out.println("You can complete more bow and arrow purchases or exit the shop.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
			}

			arrows();

		}

		else {

			cash = cash - (5 * buyNum);
			arrows = arrows + buyNum;

			if (cash < 5) {
				System.out.println("I notice you cannot complete any future purchases.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
				System.out.println();
				System.out.println("You can leave with 'leave'.");
			}

			if (cash > 5) {
				System.out.println("You can complete more bow and arrow purchases or exit the shop.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
			}

			word = "arrows";
			arrows();

		}
		buy.close();
	}

	public static void bows() {
		
		System.out.println();
		System.out.println("Type in how many bows you would like to buy or use the previously stated commands.");
		Scanner buy2 = new Scanner(System.in);
		String stringBuy2 = buy2.nextLine();

		if (stringBuy2.equals(leave)) {
			if (bows > 0) {
				System.out.println("Thank you for shopping at the Archery Works! Come again!");
				System.exit(0);
			}
			if (arrows > 0) {
				System.out.println("Thank you for shopping at Archery Works! Come again!");
				System.exit(0);
			} else {
				System.out.println("No purchases? Ok... Bye.");
				System.exit(0);
			}

		}

		if (stringBuy2.equals(skip)) {
			arrows();
		}

		int buyNum2 = Integer.parseInt(stringBuy2);

		if (buyNum2 == 1) {
			word4 = "on a bow";
		}

		if (cash == 1) {
			word2 = "dollar";
		}

		if (bows == 1) {
			word5 = "bow";
		}

		if (cash < (buyNum2 * bowCost)) {

			System.out.println();
			System.out.println("You cannot spend " + (buyNum2 * bowCost) + " " + word2 + " " + word4 + " for you have "
					+ cash + " " + word2 + ".");
			System.out.println();

			if (cash < 5) {
				System.out.println("I notice you cannot complete any future purchases.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
				System.out.println();
				System.out.println("You can leave with 'leave'.");
			}

			if (cash > 5) {
				System.out.println("You can complete more bow and arrow purchases or exit the shop.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
			}

			System.out.println();
			bows();

		}

		else {

			cash = cash - (20 * buyNum2);
			bows = bows + buyNum2;

			if (cash < 5) {
				System.out.println("I notice you cannot complete any future purchases.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
				System.out.println();
				System.out.println("You can leave with 'leave'.");
			}

			if (cash > 5) {
				System.out.println("You can complete more bow and arrow purchases or exit the shop.");
				System.out.println();
				System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
			}

			System.out.println();
			arrows();

		}
		buy2.close();

	}

}