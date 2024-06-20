package p2;

import java.util.Scanner;

public class test {

	public static int score = 0;

	public static void main(String[] args) {

		int rand1 = (int) (Math.random() * 20 + 10);
		int rand2 = (int) (Math.random() * 10 + 3);
		int a1 = rand1 - rand2;

		int rand3 = (int) (Math.random() * 30 + 20);
		int rand4 = (int) (Math.random() * 15 + 7);
		int a2 = rand3 + rand4;

		int rand5 = (int) (Math.random() * 35 + 25);
		int rand6 = (int) (Math.random() * 3 + 2);
		int a3 = rand5 / rand6;

		int rand7 = (int) (Math.random() * 25 + 10);
		int rand8 = (int) (Math.random() * 10 + 3);
		int a4 = rand7 * rand8;

		System.out.println("Welcome to the test that measures your basic math skills!");
		System.out.println();
		System.out.println("First question: What is " + rand1 + " minus " + rand2 + "?");
		Scanner q1 = new Scanner(System.in);
		String q1String = q1.nextLine();
		int q1Int = Integer.parseInt(q1String);

		if (q1Int == a1) {
			System.out.println("You got that one right! It was " + a1 + "!");
			System.out.println();
			score = score + 1;
		} else {
			System.out.println("You got that one wrong and that's ok; you have more questions. It was " + a1 + ".");
			System.out.println();
		}

		System.out.println("Second question: What is " + rand3 + " plus " + rand4 + "?");
		Scanner q2 = new Scanner(System.in);
		String q2String = q2.nextLine();
		int q2Int = Integer.parseInt(q2String);

		if (q2Int == a2) {
			System.out.println("You got that one right! It was " + a2 + "!");
			System.out.println();
			score = score + 1;
		} else {
			if (score == 0) {
				System.out.println();
				System.out.println("...");
				System.out.println("You have to more to start trying on.");
				System.out.println();
				System.out.println("You got that one wrong. It was " + a2 + ".");
				System.out.println();
			} else {
				System.out.println("You got that one wrong. It was " + a2 + ".");
				System.out.println();

			}
		}

		System.out.println("Third question: What is " + rand5 + " divided by " + rand6 + "?");
		Scanner q3 = new Scanner(System.in);
		String q3String = q3.nextLine();
		int q3Int = Integer.parseInt(q3String);

		if (q3Int == a3) {
			System.out.println("You got that one right! It was " + a3 + "!");
			System.out.println();
			score = score + 1;
		} else {
			if (score == 0) {
				System.out.println("OH MY GOD CAN YOU GET ONE CORRECT ANSWER?! YOU HAVE ONE MORE TRY!");
				System.out.println();
			}
			if (score == 1) {
				System.out.println("One correct answer? I'd go back to elementary school if I were you.");
				System.out.println();
				System.out.println("You got that one wrong. It was " + a3 + ".");
				System.out.println();
			} else {
				System.out.println("You got that one wrong. It was " + a3 + ".");
				System.out.println();
			}
		}

		System.out.println("Fourth question: What is " + rand7 + " times " + rand8 + "?");
		Scanner q4 = new Scanner(System.in);
		String q4String = q4.nextLine();
		int q4Int = Integer.parseInt(q4String);

		if (q4Int == a4) {
			System.out.println("You got that one right! It was " + a4 + "!");
			System.out.println();
			score = score + 1;
		} else {
			if (score == 0) {
				System.out.println("I HAVE LOST FAITH IN HUMANITY FOR YOU HAVE PROVEN YOURSELF A DISGRACE!!!");
				System.out.println();
			}
			if (score == 1) {
				System.out.println(
						"One correct answer? Have you learned to stand up yet? You can go back to mommy and daddy for reassurance.");
				System.out.println();
				System.out.println("You got that one wrong. It was " + a4 + ".");
				System.out.println();
			}
			if (score == 2) {
				System.out.println("2 correct answers? Are you 9?");
				System.out.println();
				System.out.println("You got that one wrong. It was " + a4 + ".");
				System.out.println();
			} else {
				System.out.println("You got that one wrong. It was " + a4 + ".");
				System.out.println();
			}
		}

		System.out.println("Time to review your score.");
		System.out.println();
		measure();
		
		q1.close();
		q2.close();
		q3.close();
		q4.close();

	}

	public static void measure() {

		if (score == 0) {
			System.out.println("You're so bad at math you ought to be crucified on a plus sign.");
		}

		if (score == 1) {
			System.out.println("Really, 1? I'm surprised you can read.");
		}

		if (score == 2) {
			System.out.println("Sheesh, did you even try? If you were that's REALLY sad.");
		}

		if (score == 3) {
			System.out.println("Three correct answers... I mean it's not the hardest thing in the world...");
		}

		if (score == 4) {
			System.out.print("Nice! You got all four like any human being should!");
		}
	}

}