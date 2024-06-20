package p1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class C1 {

	public static int hunger = 20;
	public static int thirst = 20;
	public static int sleepy = 20;
	public static int meals = 2;
	public static int water = 4;
	public static double random = 0;
	public static double damage = 0;
	public static int level = 1;
	public static double xp = 0;
	public static double healthL1 = 15;
	public static double healthL2 = 20;
	public static double healthL3 = 50;
	public static double healthL4 = 60;
	public static double healthL5 = 80;
	public static double MhealthL1 = 15;
	public static double MhealthL2 = 20;
	public static double MhealthL3 = 50;
	public static double MhealthL4 = 60;
	public static double MhealthL5 = 80;
	public static double oneeH = 10;
	public static double twoeH = 25;
	public static double threeeH = 50;
	public static double foureH = 75;
	public static double fiveeH = 100;
	public static int bowD = 10;
	public static int x = 0;
	public static int y = 0;
	public static double hurting;

	public static double storedCash;
	public static int storedArrows;
	public static int storedBows;
	public static int storedBowD;
	public static int storedMeals;
	public static int storedWater;
	public static int storedSleepy;

	public static String skip = "skip";

	public static String Sbuy = "buy";
	public static String leave = "leave";
	public static String continue2 = "continue";

	public static String attack = "attack";
	public static String run = "run";

	public static String journey = "journey";
	public static String eat = "eat";
	public static String drink = "drink";
	public static String sleep = "sleep";
	public static String stats = "stats";

	public static String Sbows = "bows";
	public static String Sarrows = "arrows";

	public static double cash = 17;
	public static int arrows = 9;
	public static int bows = 1;
	public static int arrowCost = 5;
	public static int bowCost = 20;
	public static String word = "arrows";
	public static String word2 = "dollars";
	public static String word3 = "on arrows";
	public static String word4 = "on bows";
	public static String word5 = "bows";

	public static String wordWater = "water bottles";
	public static String wordMeals = "meals";

	public static String yes = "yes";
	public static String no = "no";

	public static void main(String[] args) {

		System.out.println("---DO NOT INPUT WHERE YOU ARE NOT ASKED TO INPUT---");
		System.out.println();

		System.out.println("Do you want to skip the intro? 'skip' to skip or 'no' to not.");
		Scanner introskip = new Scanner(System.in);
		String skipString = introskip.nextLine();

		if (skipString.equals(skip)) {
			wilderness();
		} else {
			intro();
		}
	}

	public static void intro() {
		System.out.println();
		System.out.println(
				"~You appear to be in a black void on a translucent floor that ripples at every movement you make.~");
		System.out.println();
		sleep4s();
		sleep1s();
		System.out.println(
				"~In a direction one might call up in this dimension there is blinding spotlight glaring down upon you.~");
		System.out.println();
		sleep4s();
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep4s();
		System.out.println();

		System.out.println();
		System.out.println("'WAKE UP! WAKE UP!'");
		System.out.println();
		sleepHalfs();
		System.out.println("'YOUR HOUSE IS ON FIRE! HAVE YOU EVEN BEEN INFORMED?!'");
		System.out.println();
		sleep1s();
		System.out.println(
				"~You get out of bed and dash out of the choking blaze without second thought and rush to safety.~");
		System.out.println();
		sleep1s();
		sleep1s();
		System.out.println(
				"~'It's not very safe outside either' you realize as your village is being attacked and burned to dust by a wave of grotesque creatures.~");
		System.out.println();
		sleep4s();
		fake();
	}

	public static void sleep1s() {
		try {
			Thread.sleep(1000);
		} catch (Exception exe) {
			System.out.println("Error");
		}
	}

	public static void sleep4s() {

		try {
			Thread.sleep(4000);
		} catch (Exception exe) {
			System.out.println("Error");
		}
	}

	public static void sleepHalfs() {
		try {
			Thread.sleep(500);
		} catch (Exception exe) {
			System.out.println("Error");
		}
	}

	public static void fake() {
		System.out.println(
				"'Just listen to me.' says the stranger who saved your life. 'Watch what I do and try to replicate it to the best of your ability' he commanded in a very stern and stressed fashion.");
		System.out.println();
		sleep4s();
		sleep1s();
		System.out.println(
				"The man pulls out an arrow from his quiver and readies himself as he seems to wait for permission to use his weapon.");
		System.out.println();
		sleep4s();
		System.out.println("~A voice just loud enough for you to hear emanates off his body and asks a question.~");
		System.out.println();
		sleep4s();
		System.out.println("'What action would you like to attempt?' asks the voice.");
		System.out.println();
		sleepHalfs();
		System.out.print("'a");
		sleepHalfs();
		System.out.print("t");
		sleepHalfs();
		System.out.print("t");
		sleepHalfs();
		System.out.print("a");
		sleepHalfs();
		System.out.print("c");
		sleepHalfs();
		System.out.print("k'");
		sleepHalfs();
		System.out.print(
				" the man quickly states. He draws his arrow and shoots one off the charging monsters from attacking him.");
		System.out.println();
		System.out.println();
		sleep4s();
		System.out.println("The foul creature falls to the ground with a snarl; yet the man is displeased.");
		System.out.println();
		sleep4s();
		System.out.println(
				"'One more shot on this bow? Sorry, but this is all I can offer at the moment.' says the man in guilt.");
		System.out.println();
		sleep4s();
		System.out.println("~The man hands you a bow and arrow and leaves you.~");
		System.out.println();
		sleep4s();
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep4s();
		System.out.println();
		System.out.println();
		System.out.println(
				"'What just happened?' you ask as you stare at the arrow in disbeleif. A startling and unworldy growl comes from behind you.");
		System.out.println();
		sleep4s();
		System.out.println(
				"A mutilated but still insanely scary monster approaches. 'What do you want to do?' says the previously heard voice now clearer.");
		Scanner fakeattack = new Scanner(System.in);
		String fakeattackString = fakeattack.nextLine();

		if (fakeattackString.equals(attack)) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			System.out.println();
			System.out.println(
					"~You find a space beneath ground and the chaotic streets and block it from the inside, guiltily enjoying your safety while you sleep.~");
			sleep4s();
		} else {
			System.out.println("~The monster rakes your arm with it's teeth and bites you on the hand.~");
			sleep1s();
			System.out.println(
					"~You get away from the monster pain shooting up your arm, distracting your focus for a few seconds. ''attack' is a command you can input to shoot the arrow'. the mysterious voice says.'");
			Scanner fakeattack2 = new Scanner(System.in);
			String fakeattackString2 = fakeattack2.nextLine();
			if (fakeattackString2.equals(attack)) {
				System.out.println();
				System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
				resourceGain();
				System.out.println();
				System.out.println(
						"A wave of releif washes over you but a quick realization sets you back to fearing for your life for you are still in the midst of danger.");
				System.out.println();
				sleep4s();
				System.out.println(
						"You find a space beneath ground and the chaotic streets and block it from the inside, guiltily enjoying your safety while you sleep.");
				sleep4s();

			} else {
				System.out.println(
						"The monster grabs you by the head and exposes your neck. It bites down and you die with the feeling of unfulfillment.");
				System.exit(0);
			}
		}

		System.out.println();
		sleep4s();
		System.out.println(
				"~The broken bow you slept with has made you more aware of the system of weilding weapons of this type and the world you are in. This comforts you as you have forgotten your past.~");
		System.out.println();
		sleep4s();
		sleep4s();
		System.out.println(
				"~You somehow are now aware of the commands and the status of yourself. You recite your knowledge just in case: ~");
		sleep4s();
		stats();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		sleep4s();
		System.out.println();
		System.out.println(
				"~Scared and confused about your situation, you grab the materials you scavenged for earlier that morning and head out of the once-existing village in search of a new home.~");
		sleep4s();
		wildernessv2();
	}

	public static void wildernessv2() {
		System.out.println();
		String[] introGen = {
				"You find yourself amongst a dry and barren desert; you can see a few zombies in the distance heading towards you,",
				"You find yourself amongst a humid and dense rainforest full of strange and brightly-covered creatures,",
				"You find yourself amongst a forest of pine trees and various forms of vegetation,",
				"You find yourself to be in a series of vallies full of abandoned wheat crops and old farmhouses,",
				"You find yourself in an unforgivingly cold pine fores. Standing on cold gravel, you see a frozen river at your feet,",
				"You find yourself amongst a hot and humid coastal beach with the wreckage of abandoned boats and miscellaneous objects,",
				"You find yourself near an abandoned village not to different from yours. It's not burned to the ground but age has not shown mercy," };
		int introGenL = introGen.length;
		int Rand1 = (int) (Math.random() * introGenL);

		String[] onepart = { "a day", "a mile", "an hour", "five miles", "three hours", "five hours", "two days",
				"ten miles" };
		String[] twopart = {
				"find yourself amongst a dry and barren desert; you can see a few zombies in the distance heading towards you.",
				"find yourself amongst a humid and dense rainforest full of strange and brightly-covered creatures.",
				"find yourself amongst a forest of pine trees and various forms of vegetation.",
				"find yourself to be in a series of vallies full of abandoned wheat crops and old farmhouses.",
				"find yourself in an unforgivingly cold pine forest. Standing on cold gravel, you see a frozen river at your feet.",
				"find yourself amongst a hot and humid coastal beach with the wreckage of abandoned boats and miscellaneous objects.",
				"find yourself near an abandoned village not to different from yours. It's not burned to the ground but age has not shown mercy." };

		int onepartL = onepart.length;
		int twopartL = twopart.length;
		int secondRand1 = (int) (Math.random() * onepartL);
		int secondRand2 = (int) (Math.random() * twopartL);

		System.out.println();
		sleep1s();
		System.out.println(introGen[Rand1] + " 'What do you do?' says the voice.");
		Scanner wildernessAction = new Scanner(System.in);
		String actionString = wildernessAction.nextLine();

		if (actionString.equals(journey)) {
			hunger = hunger - 3;
			thirst = thirst - 4;
			sleepy = sleepy - 2;
			deathCheck();
			System.out.println();
			System.out.println("You travel for about " + onepart[secondRand1] + " and " + twopart[secondRand2]);
			sleep4s();
			randomEvent();
		}
		if (actionString.equals(eat)) {
			if (hunger < 20) {
				if (meals > 0) {
					meals = meals - 1;
					hunger = hunger + 6;
					thirst = thirst - 2;
					sleepy = sleepy - 2;
					deathCheck();
					System.out.println();
					System.out.println("Eating succesful. Your hunger points are " + hunger + ".");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("You are unable to drink right now for you do not have enough meals.");
					wilderness();
				}
			} else {
				System.out.println();
				System.out.println("You do not need to eat right now.");
				wilderness();
			}
		}
		if (actionString.equals(drink)) {
			if (thirst < 20) {
				if (water > 0) {
					water = water - 1;
					hunger = hunger + 1;
					thirst = thirst + 3;
					deathCheck();
					System.out.println();
					System.out.println("Drinking succesful. Your thirst points are " + thirst
							+ " and your hunger points are " + hunger + ".");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("You are unable to drink right now for you do not have enough water.");
					wilderness();
				}
			} else {
				System.out.println();
				System.out.println("You do not need to drink right now.");
				wilderness();
			}
		}
		if (actionString.equals(sleep)) {
			if (sleepy < 20) {
				hunger = hunger - 1;
				thirst = thirst - 2;
				sleepy = sleepy + 5;
				deathCheck();
				System.out.println("Your sleep has helped gain your vigor.");
				wilderness();
			} else {
				System.out.println();
				System.out.println("You do not need to sleep right now.");
				wilderness();
			}
		}
		if (actionString.equals(stats)) {
			stats();
			wilderness();
		} else {
			System.out.println();
			System.out.println("You can use the 'journey', 'eat', 'drink', 'sleep', and 'stats' commands right now.");
			wilderness();
		}
	}

	public static void wilderness() {
		String[] onepart = { "a day", "a mile", "an hour", "five miles", "three hours", "five hours", "two days",
				"ten miles" };
		String[] twopart = {
				"find yourself amongst a dry and barren desert; you can see a few zombies in the distance heading towards you.",
				"find yourself amongst a humid and dense rainforest full of strange and brightly-covered creatures.",
				"find yourself amongst a forest of pine trees and various forms of vegetation.",
				"find yourself to be in a series of vallies full of abandoned wheat crops and old farmhouses.",
				"find yourself in an unforgivingly cold pine forest. Standing on cold gravel, you see a frozen river at your feet.",
				"find yourself amongst a hot and humid coastal beach with the wreckage of abandoned boats and miscellaneous objects.",
				"find yourself near an abandoned village not to different from yours. It's not burned to the ground but age has not shown mercy." };

		int onepartL = onepart.length;
		int twopartL = twopart.length;
		int secondRand1 = (int) (Math.random() * onepartL);
		int secondRand2 = (int) (Math.random() * twopartL);

		System.out.println();
		sleep1s();
		System.out.println("'What do you do?' says the voice.");
		Scanner wildernessAction = new Scanner(System.in);
		String actionString = wildernessAction.nextLine();

		if (actionString.equals(journey)) {
			hunger = hunger - 3;
			thirst = thirst - 4;
			sleepy = sleepy - 2;
			deathCheck();
			System.out.println();
			System.out.println("You travel for about " + onepart[secondRand1] + " and " + twopart[secondRand2]);
			sleep4s();
			randomEvent();
		}
		if (actionString.equals(eat)) {
			if (hunger < 20) {
				if (meals > 0) {
					meals = meals - 1;
					hunger = hunger + 6;
					thirst = thirst - 2;
					sleepy = sleepy - 2;
					deathCheck();
					System.out.println();
					System.out.println("Eating succesful. Your hunger points are " + hunger + ".");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("You are unable to drink right now for you do not have enough meals.");
					wilderness();
				}
			} else {
				System.out.println();
				System.out.println("You do not need to eat right now.");
				wilderness();
			}
		}
		if (actionString.equals(drink)) {
			if (thirst < 20) {
				if (water > 0) {
					water = water - 1;
					hunger = hunger + 1;
					thirst = thirst + 3;
					deathCheck();
					System.out.println();
					System.out.println("Drinking succesful. Your thirst points are " + thirst
							+ " and your hunger points are " + hunger + ".");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("You are unable to drink right now for you do not have enough water.");
					wilderness();
				}
			} else {
				System.out.println();
				System.out.println("You do not need to drink right now.");
				wilderness();
			}
		}
		if (actionString.equals(sleep)) {
			if (sleepy < 20) {
				hunger = hunger - 1;
				thirst = thirst - 2;
				sleepy = sleepy + 5;
				deathCheck();
				System.out.println();
				System.out.println("Your sleep has helped gain your vigor. Your sleep points are " + sleepy + ".");
				System.out.println();
				wilderness();
			} else {
				System.out.println();
				System.out.println("You do not need to sleep right now.");
				wilderness();
			}
		}
		if (actionString.equals(stats)) {
			stats();
			wilderness();
		} else {
			System.out.println();
			System.out.println("You can use the 'journey', 'eat', 'drink', 'sleep', and 'stats' commands right now.");
			wilderness();
		}
	}

	public static void stats() {
		if (cash == 1) {
			word2 = "dollar";
		}
		if (arrows == 1) {
			word = "arrow";
		}
		if (bows == 1) {
			word5 = "bow";
		}
		if (water == 1) {
			wordWater = "water bottle";
		}
		if (meals == 1) {
			wordMeals = "meal";
		}

		System.out.println();
		System.out.println("- 'stats' can be used to see commands and stats while in the wilderness");
		System.out.println("- 'attack' can be used to attack an enemy you are engaged in.");
		System.out.println(
				"- 'run' can be used to run away from an enemy you are engaged in; the effectiveness of this action is at a chance and if you fail you take an additional hit.");
		System.out.println("- 'buy' can be used to engage in commerce with a merchant you may meet.");
		System.out.println("- 'leave' can be used to leave a travelling merchant's caravan if you are in one.");
		System.out.println("- 'continue' will switch to another section of a merchant's caravan if you are in one.");
		System.out.println(
				"- 'journey' can be used to explore the world which might trigger an event at the expense of points.");
		System.out.println(
				"- 'eat' can be used to restore hunger points at the expense of one meal, some thirst points, and some sleep points.");
		System.out.println(
				"- 'drink' can be used to restore thirst points at the expense of a water bottle. This also minorly increases hunger points.");
		System.out.println(
				"- 'sleep' can be used to restore sleep points at the expense of some hunger and thirst points.");
		System.out.println();
		System.out.println("(You don't want to find out what happens when one of your point types goes to 0).");
		System.out.println();
		healthCheck();
		System.out.println();
		System.out.println("Useful tip: Your health regenerates after every battle.");
		System.out.println();
		System.out.println("Hunger: " + hunger + "/20");
		System.out.println("Thirst: " + thirst + "/20");
		System.out.println("Sleep: " + sleepy + "/20");
		System.out.println();
		System.out.println("Arrows: " + arrows + " " + word);
		System.out.println("Bows: " + bows + " " + word5);
		System.out.println("Cash: " + cash + " " + word2);
		System.out.println("Meals: " + meals + " " + wordMeals);
		System.out.println("Water bottles: " + water + " " + wordWater);
		System.out.println("Current bow durability: " + bowD);
		System.out.println("Level: " + level);
		xpCheck();
		wilderness();
	}

	public static void xpCheck() {
		if (level == 1) {
			System.out.println((10 - xp) + " XP is needed for a level up");
		}
		if (level == 2) {
			System.out.println((25 - xp) + " XP is needed for a level up");
		}
		if (level == 3) {
			System.out.println((50 - xp) + " XP is needed for a level up");
		}
		if (level == 4) {
			System.out.println((100 - xp) + " XP is needed for a level up");
		}
		if (level == 5) {
			System.out.println("You are at the maximum level.");
		}
	}

	public static void healthCheck() {
		if (level == 1) {
			System.out.println("Health: " + healths.getHealth1() + "/" + MhealthL1);
			;
		}
		if (level == 2) {
			System.out.println("Health: " + healths.getHealth2() + "/" + MhealthL2);
		}
		if (level == 3) {
			System.out.println("Health: " + healths.getHealth3() + "/" + MhealthL3);
		}
		if (level == 4) {
			System.out.println("Health: " + healths.getHealth4() + "/" + MhealthL4);
		}
		if (level == 5) {
			System.out.println("Health: " + healths.getHealth5() + "/" + MhealthL5);
		}
	}

	public static void resourceGain() {
		if (cash == 1) {
			word2 = "dollar";
		}

		if (oneeH == 0) {
			xp = ThreadLocalRandom.current().nextInt(1, 8 + 1);
			cash = ThreadLocalRandom.current().nextInt(1, 15 + 1);

			xp = Math.round(xp);
			cash = Math.round(cash);

			System.out.println();
			System.out.println("You now have " + cash + word2 + " and " + xp + " XP!");

			oneeH = 15;
		}
		if (twoeH == 0) {
			xp = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			cash = ThreadLocalRandom.current().nextInt(1, 20 + 1);

			xp = Math.round(xp);
			cash = Math.round(cash);

			System.out.println();
			System.out.println("You now have " + cash + " cash and " + xp + " XP!");

			twoeH = 20;
		}
		if (threeeH == 0) {
			xp = ThreadLocalRandom.current().nextInt(1, 15 + 1);
			cash = ThreadLocalRandom.current().nextInt(1, 30 + 1);

			xp = Math.round(xp);
			cash = Math.round(cash);

			System.out.println();
			System.out.println("You now have " + cash + " cash and " + xp + " XP!");

			threeeH = 30;
		}
		if (foureH == 0) {
			xp = ThreadLocalRandom.current().nextInt(1, 25 + 1);
			cash = ThreadLocalRandom.current().nextInt(1, 40 + 1);

			System.out.println();
			System.out.println("You now have " + cash + " cash and " + xp + " XP!");

			xp = Math.round(xp);
			cash = Math.round(cash);

			foureH = 40;
		}
		if (fiveeH == 0) {
			xp = ThreadLocalRandom.current().nextInt(1, 35 + 1);
			cash = ThreadLocalRandom.current().nextInt(1, 50 + 1);

			System.out.println();
			System.out.println("You now have " + cash + " cash and " + xp + " XP!");

			xp = Math.round(xp);
			cash = Math.round(cash);

			fiveeH = 50;
		}
		levelUp();
	}

	public static void levelUp() {
		if (level == 1) {
			if (xp == 10) {
				level = 2;
				System.out.println();
				System.out.println("You leveled up to level 2! Your attack and health will increase!");
				xp = 0;
			}
		}
		if (level == 2) {
			if (xp == 25) {
				level = 3;
				System.out.println();
				System.out.println("You leveled up to level 3! Your attack and health will increase!");
				xp = 0;
			}
		}
		if (level == 3) {
			if (xp == 50) {
				level = 4;
				System.out.println();
				System.out.println("You leveled up to level 4! Your attack and health will increase!");
				xp = 0;
			}
		}
		if (level == 4) {
			if (xp == 100) {
				level = 5;
				System.out.println();
				System.out.println(
						"You leveled up to level 5! Your attack and health will increase! (You are at the maximum level).");
				xp = 0;
			}
		}

		if (level == 5) {
			closing();
		}
	}

	public static void setAttack() {
		if (arrows > 0 && bows > 0) {
		} else {
			System.out.println(
					"You cannot attack for you have " + arrows + " " + word + " and " + bows + " " + word5 + ".");
		}
	}

	public static void setMonster() {
		if (level == 1) {
			random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
			random = Math.round(random);
			if (random == 1) {
				battle1();
			} else {
				battle2();
			}
		}
		if (level == 2) {
			random = ThreadLocalRandom.current().nextInt(2, 3 + 1);
			random = Math.round(random);
			if (random == 2) {
				battle2();
			} else {
				battle3();
			}
		}
		if (level == 3) {
			random = ThreadLocalRandom.current().nextInt(3, 4 + 1);
			random = Math.round(random);
			if (random == 3) {
				battle3();
			} else {
				battle4();
			}
		}
		if (level == 4) {
			random = ThreadLocalRandom.current().nextInt(4, 5 + 1);
			random = Math.round(random);
			if (random == 4) {
				battle4();
			} else {
				battle5();
			}
		}
		if (level == 5) {
			battle5();
		}
	}

	public static void hurt1() {
		String[] Aone = { "bites you", "cuts you", "punches you", "headbutts you" };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String action = Aone[Arand1];

		System.out.println();
		System.out.print("The zombie " + action + ".");
		System.out.println();

		random = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		random = Math.round(random);
		hurting = (healthL1 - random);
		healths.setHealth1(hurting);
		battle1v2();
	}

	public static void Mhurt1() {
		if (level == 1) {
			random = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			random = Math.round(random);
			hurting = (oneeH - random);
			healths.setHealth1(hurting);
		}
	}

	public static void battle1() {
		System.out.println();
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		String[] one = { "~A grotesque mutation of rotting flesh and ooze ", "~A zombie that looks surprisingly human ",
				"~A scabbed skeletal figure ", "A seemingly adolescent zombie ",
				"~A zombie with an extra arm attached to its waist " };
		String[] two = { "shambles", "runs", "crawls", "stumbles" };
		String[] three = { " up to you hungrily.~", " towards you.~", " in pursuit of you.~" };

		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;

		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);

		String phrase1 = one[rand1] + two[rand2] + three[rand3];

		System.out.println(phrase1);
		System.out.println();
		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println();
			System.out.println(actionP);
			shoot();
			Mhurt1();
			hurt1();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt1();
				sleep1s();
				hurt1();
			} else {
				System.out.println("~The escape was a success.~");
				healthL1 = 15;
				healths.setHealth1(0);
				oneeH = 10;
				wilderness();
			}
		}
		if (b1String.equals(stats)) {
			stats();
			hurt1();
		} else {
			hurt1();
			battle1v2();
		}
		if (oneeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL1 = 15;
			healths.setHealth1(0);
			wilderness();
		}
	}

	public static void battle1v2() {
		String[] Actionone = {
				"Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.",
				"Your arrow punctures its shoulder, sending it stumbling backwards.",
				"Your arrow lands in the center of its torso, causing a sharp hunch and a growl.",
				"Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier." };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println(actionP);
			shoot();
			Mhurt1();
			battle1v2();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt1();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt1();
				sleep1s();
				hurt1();
			} else {
				System.out.println("~The escape was a success.~");
				healthL1 = 15;
				healths.setHealth1(0);
				oneeH = 10;
				wilderness();
			}
		} else {
			hurt1();
			battle1v2();
		}
		if (oneeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL1 = 15;
			healths.setHealth1(0);
			wilderness();
		}
	}

	public static void hurt2() {
		String[] Aone = { "bites you", "cuts you", "punches you", "headbutts you" };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String action = Aone[Arand1];

		System.out.println();
		System.out.print("The zombie " + action + ".");
		System.out.println();

		random = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		random = Math.round(random);
		hurting = (healthL2 - random);
		healths.setHealth2(hurting);
		battle2v2();
	}

	public static void Mhurt2() {
		if (level == 2) {
			random = ThreadLocalRandom.current().nextInt(1, 20 + 1);
			random = Math.round(random);
			hurting = (twoeH - random);
			healths.setHealth2(hurting);
		}
		if (level == 1) {
			random = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			random = Math.round(random);
			hurting = (twoeH - random);
			healths.setHealth2(hurting);
		}
	}

	public static void battle2() {
		System.out.println();
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		String[] one = { "~A grotesque mutation of rotting flesh and ooze ", "~A zombie that looks surprisingly human ",
				"~A scabbed skeletal figure ", "A seemingly adolescent zombie ",
				"~A zombie with an extra arm attached to its waist " };
		String[] two = { "shambles", "runs", "crawls", "stumbles" };
		String[] three = { " up to you hungrily.~", " towards you.~", " in pursuit of you.~" };

		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;

		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);

		String phrase1 = one[rand1] + two[rand2] + three[rand3];

		System.out.println(phrase1);
		System.out.println();
		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println();
			System.out.println(actionP);
			shoot();
			Mhurt2();
			hurt2();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt2();
		}
		if (b1String.equals(run)) {
			random = random + ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt2();
				sleep1s();
				hurt2();
			} else {
				System.out.println("~The escape was a success.~");
				healthL1 = 15;
				healthL2 = 20;
				healths.setHealth1(0);
				healths.setHealth2(0);
				twoeH = 25;
				wilderness();
			}
		} else {
			hurt2();
			battle2v2();
		}
		if (twoeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL1 = 10;
			healthL2 = 25;
			healths.setHealth2(0);
			healths.setHealth2(0);
			wilderness();
		}
	}

	public static void battle2v2() {
		String[] Actionone = {
				"Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.",
				"Your arrow punctures its shoulder, sending it stumbling backwards.",
				"Your arrow lands in the center of its torso, causing a sharp hunch and a growl.",
				"Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier." };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println(actionP);
			shoot();
			Mhurt2();
			hurt2();
		}
		if (b1String.equals(stats)) {
			stats();
			battle2v2();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt2();
				sleep1s();
				hurt2();
			} else {
				System.out.println("~The escape was a success.~");
				healthL1 = 10;
				healthL2 = 25;
				healths.setHealth1(0);
				healths.setHealth2(0);
				twoeH = 25;
				wilderness();
			}
		} else {
			hurt2();
			hurt2();
		}
		if (twoeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL1 = 10;
			healthL2 = 25;
			healths.setHealth1(0);
			healths.setHealth2(0);
			wilderness();
		}
	}

	public static void hurt3() {
		String[] Aone = { "bites you", "cuts you", "punches you", "headbutts you" };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String action = Aone[Arand1];

		System.out.println();
		System.out.print("The zombie " + action + ".");
		System.out.println();

		random = ThreadLocalRandom.current().nextInt(1, 20 + 1);
		random = Math.round(random);
		hurting = (healthL3 - random);
		healths.setHealth3(hurting);
		battle3v2();
	}

	public static void Mhurt3() {
		if (level == 3) {
			random = ThreadLocalRandom.current().nextInt(1, 30 + 1);
			random = Math.round(random);
			hurting = (threeeH - random);
			healths.setHealth3(hurting);
		}
		if (level == 2) {
			random = ThreadLocalRandom.current().nextInt(1, 20 + 1);
			random = Math.round(random);
			hurting = (threeeH - random);
			healths.setHealth3(hurting);
		}
	}

	public static void battle3() {
		System.out.println();
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		String[] one = { "~A grotesque mutation of rotting flesh and ooze ", "~A zombie that looks surprisingly human ",
				"~A scabbed skeletal figure ", "A seemingly adolescent zombie ",
				"~A zombie with an extra arm attached to its waist " };
		String[] two = { "shambles", "runs", "crawls", "stumbles" };
		String[] three = { " up to you hungrily.~", " towards you.~", " in pursuit of you.~" };

		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;

		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);

		String phrase1 = one[rand1] + two[rand2] + three[rand3];

		System.out.println(phrase1);
		System.out.println();
		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println();
			System.out.println(actionP);
			shoot();
			Mhurt3();
			hurt3();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt3();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt3();
				sleep1s();
				hurt3();
			} else {
				System.out.println("~The escape was a success.~");
				healthL2 = 20;
				healthL3 = 50;
				healths.setHealth2(0);
				healths.setHealth3(0);
				threeeH = 50;
				wilderness();
			}
		} else {
			hurt3();
			battle3v2();
		}
		if (threeeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL2 = 20;
			healthL3 = 50;
			healths.setHealth2(0);
			healths.setHealth3(0);
			wilderness();
		}
	}

	public static void battle3v2() {
		String[] Actionone = {
				"Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.",
				"Your arrow punctures its shoulder, sending it stumbling backwards.",
				"Your arrow lands in the center of its torso, causing a sharp hunch and a growl.",
				"Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier." };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println(actionP);
			shoot();
			Mhurt3();
			hurt3();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt3();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt3();
				sleep1s();
				hurt3();
			} else {
				System.out.println("~The escape was a success.~");
				healthL2 = 20;
				healthL3 = 50;
				healths.setHealth2(0);
				healths.setHealth3(0);
				threeeH = 50;
				wilderness();
			}
		} else {
			hurt3();
			battle3v2();
		}
		if (threeeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL2 = 20;
			healthL3 = 50;
			healths.setHealth2(0);
			healths.setHealth3(0);
			wilderness();
		}
	}

	public static void hurt4() {
		String[] Aone = { "bites you", "cuts you", "punches you", "headbutts you" };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String action = Aone[Arand1];

		System.out.println();
		System.out.print("The zombie " + action + ".");
		System.out.println();

		random = ThreadLocalRandom.current().nextInt(1, 30 + 1);
		random = Math.round(random);
		hurting = (healthL4 - random);
		healths.setHealth4(hurting);
		battle4v2();
	}

	public static void Mhurt4() {
		if (level == 4) {
			random = ThreadLocalRandom.current().nextInt(1, 40 + 1);
			random = Math.round(random);
			hurting = (foureH - random);
			healths.setHealth4(hurting);
		}
		if (level == 3) {
			random = ThreadLocalRandom.current().nextInt(1, 30 + 1);
			random = Math.round(random);
			hurting = (foureH - random);
			healths.setHealth3(hurting);
		}
	}

	public static void battle4() {
		System.out.println();
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		String[] one = { "~A grotesque mutation of rotting flesh and ooze ", "~A zombie that looks surprisingly human ",
				"~A scabbed skeletal figure ", "A seemingly adolescent zombie ",
				"~A zombie with an extra arm attached to its waist " };
		String[] two = { "shambles", "runs", "crawls", "stumbles" };
		String[] three = { " up to you hungrily.~", " towards you.~", " in pursuit of you.~" };

		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;

		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);

		String phrase1 = one[rand1] + two[rand2] + three[rand3];

		System.out.println(phrase1);
		System.out.println();
		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println();
			System.out.println(actionP);
			shoot();
			Mhurt4();
			hurt4();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt4();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt4();
				sleep1s();
				hurt4();
			} else {
				System.out.println("~The escape was a success.~");
				healthL3 = 50;
				healthL4 = 60;
				healths.setHealth3(0);
				healths.setHealth4(0);
				foureH = 75;
				wilderness();
			}
		} else {
			hurt4();
			battle4v2();
		}
		if (foureH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL3 = 50;
			healthL4 = 60;
			healths.setHealth3(0);
			healths.setHealth4(0);
			wilderness();
		}
	}

	public static void battle4v2() {
		String[] Actionone = {
				"Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.",
				"Your arrow punctures its shoulder, sending it stumbling backwards.",
				"Your arrow lands in the center of its torso, causing a sharp hunch and a growl.",
				"Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier." };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println(actionP);
			shoot();
			Mhurt4();
			hurt4();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt4();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt4();
				sleep1s();
				hurt4();
			} else {
				System.out.println("~The escape was a success.~");
				healthL3 = 50;
				healthL4 = 60;
				healths.setHealth3(0);
				healths.setHealth4(0);
				foureH = 75;
				wilderness();
			}
		} else {
			hurt4();
			battle4v2();
		}
		if (foureH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL3 = 50;
			healthL4 = 60;
			healths.setHealth3(0);
			healths.setHealth4(0);
			wilderness();
		}
	}

	public static void hurt5() {
		String[] Aone = { "bites you", "cuts you", "punches you", "headbutts you" };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String action = Aone[Arand1];

		System.out.println();
		System.out.print("The zombie " + action + ".");
		System.out.println();

		random = ThreadLocalRandom.current().nextInt(1, 40 + 1);
		random = Math.round(random);
		hurting = (healthL4 - random);
		healths.setHealth4(hurting);
		battle5v2();
	}

	public static void Mhurt5() {
		if (level == 5) {
			random = ThreadLocalRandom.current().nextInt(1, 50 + 1);
			random = Math.round(random);
			hurting = (fiveeH - random);
			healths.setHealth4(hurting);
		}
		if (level == 4) {
			random = ThreadLocalRandom.current().nextInt(1, 40 + 1);
			random = Math.round(random);
			hurting = (fiveeH - random);
			healths.setHealth4(hurting);
		}
	}

	public static void battle5() {
		System.out.println();
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		String[] one = { "~A grotesque mutation of rotting flesh and ooze ", "~A zombie that looks surprisingly human ",
				"~A scabbed skeletal figure ", "A seemingly adolescent zombie ",
				"~A zombie with an extra arm attached to its waist " };
		String[] two = { "shambles", "runs", "crawls", "stumbles" };
		String[] three = { " up to you hungrily.~", " towards you.~", " in pursuit of you.~" };

		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;

		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);

		String phrase1 = one[rand1] + two[rand2] + three[rand3];

		System.out.println(phrase1);
		System.out.println();
		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println();
			System.out.println(actionP);
			shoot();
			Mhurt5();
			hurt5();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt5();
		}
		if (b1String.equals(run)) {
			random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				hurt5();
				sleep1s();
				hurt5();
			} else {
				System.out.println("~The escape was a success.~");
				healthL4 = 60;
				healthL5 = 80;
				healths.setHealth4(0);
				healths.setHealth5(0);
				fiveeH = 100;
				wilderness();
			}
		} else {
			hurt5();
			battle5v2();
		}
		if (fiveeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL4 = 60;
			healthL5 = 80;
			healths.setHealth4(0);
			healths.setHealth5(0);
			wilderness();
		}
	}

	public static void battle5v2() {
		String[] Actionone = {
				"Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.",
				"Your arrow punctures its shoulder, sending it stumbling backwards.",
				"Your arrow lands in the center of its torso, causing a sharp hunch and a growl.",
				"Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier." };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String actionP = Actionone[Actionrand1];

		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			setAttack();
			System.out.println(actionP);
			shoot();
			Mhurt5();
			hurt5();
		}
		if (b1String.equals(stats)) {
			stats();
			hurt5();
		}
		if (b1String.equals(run)) {
			random = random + ThreadLocalRandom.current().nextInt(1, 3 + 1);
			random = Math.round(random);
			if (random == 3) {
				random = 0;
				hurt5();
				sleep1s();
				hurt5();
			} else {
				System.out.println("~The escape was a success.~");
				healthL4 = 60;
				healthL5 = 80;
				healths.setHealth4(0);
				healths.setHealth5(0);
				fiveeH = 100;
				wilderness();
			}
		} else {
			hurt5();
		}
		if (fiveeH == 0) {
			System.out.println();
			System.out.println("~The creature falls back from the momentum of your arrow and ceases animation.~");
			resourceGain();
			healthL4 = 60;
			healthL5 = 80;
			healths.setHealth4(0);
			healths.setHealth5(0);
			wilderness();
		}
	}

	public static void shoot() {
		bowD = bowD - 1;
		arrows = arrows - 1;

		if (bowD == 0) {
			bows = bows - 1;
			bowD = 10;
		}
	}

	public static void welcome() {
		y = y + 1;

		if (cash == 1) {
			word2 = "dollar";
		}
		if (arrows == 1) {
			word = "arrow";
		}
		if (bows == 1) {
			word5 = "bow";
		}
		if (water == 1) {
			wordWater = "water bottle";
		}
		if (meals == 1) {
			wordMeals = "meal";
		}

		System.out.println();
		System.out.println(
				"You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and " + cash + " " + word2 + ".");
		System.out.println();
		System.out.println(
				"Welcome to my caravan! Here we sell bows and arrows! We're very sorry to not sell food or water but times are too tough to offer such luxuries. But please, come in.");
		System.out.println();
		sleep4s();
		System.out.println("~The man closes the door and the caravan starts rolling.~");
		System.out.println();
		sleep4s();
		System.out.println("~One arrow costs " + arrowCost + " " + word2 + "~");
		System.out.println("~One bow costs " + bowCost + " " + word2 + "~");
		System.out.println();
		sleep4s();
		System.out.println(
				"Always got place to be, so I always got to be moving. As I said, it's a tough world out there... What can I do for you?");
		System.out.println();
		sleep4s();
		System.out.println("~The 'leave' command will have you leave the shop.~");
		System.out.println(
				"~The 'continue' command will ask the man to have you view the other section of the caravan.~");
		System.out.println();
		sleep4s();

		System.out.println("Which section of my caravan would you like to go to first? 'arrows' or 'bows'?");
		Scanner section = new Scanner(System.in);
		String sectionString = section.nextLine();

		if (sectionString.equals(Sarrows)) {
			arrows();
		}
		if (sectionString.equals(Sbows)) {
			bows();
		}
		if (sectionString.equals(leave)) {
			System.out.println("Thank you for the business!");
			storedCash = cash;
			storedArrows = arrows;
			storedBows = bows;
			storedBowD = bowD;
			storedSleepy = sleepy;
			wildernessv2();
		} else {
			System.out.println();
			welcome();
		}
	}

	public static void arrows() {
		System.out.println();
		System.out.println(
				"Type in if you would like to buy arrows with 'buy', switch to the other section, or leave if you wish.");
		Scanner buy = new Scanner(System.in);
		String stringBuy = buy.nextLine();

		if (stringBuy.equals(continue2)) {
			bows();
		}
		if (stringBuy.equals(leave)) {
			System.out.println("Thank you for the business!");
			storedCash = cash;
			storedArrows = arrows;
			storedBows = bows;
			storedBowD = bowD;
			storedMeals = meals;
			storedWater = water;
			storedSleepy = sleepy;
			wildernessv2();
		}

		if (stringBuy.equals(Sbuy)) {
			System.out.println("Please enter the amount of arrows you would like to buy.");
			Scanner buy2 = new Scanner(System.in);
			int buyNum = buy2.nextInt();
			try {
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
					System.out.println("You cannot spend " + (buyNum * arrowCost) + " " + word2 + " " + word3
							+ " for you have " + cash + " " + word2 + ".");
					System.out.println();

					if (cash < 5) {
						System.out.println("I notice you cannot complete any future purchases.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
						System.out.println();
						System.out.println("Thank you for the business!");
						storedCash = cash;
						storedArrows = arrows;
						storedBows = bows;
						storedBowD = bowD;
						storedMeals = meals;
						storedWater = water;
						storedSleepy = sleepy;
						wildernessv2();
					}
					if (cash > 5) {
						System.out.println("You can complete more bow and arrow purchases or exit the shop.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
					}
					arrows();
				} else {
					cash = cash - (5 * buyNum);
					arrows = arrows + buyNum;

					if (cash < 5) {
						System.out.println("I notice you cannot complete any future purchases.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
						System.out.println();
						System.out.println("Thank you for the business!");
						storedCash = cash;
						storedArrows = arrows;
						storedBows = bows;
						storedBowD = bowD;
						storedMeals = meals;
						storedWater = water;
						storedSleepy = sleepy;
						wildernessv2();
					}
					if (cash > 5) {
						System.out.println("You can complete more bow and arrow purchases or exit the shop.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
					}
					word = "arrows";
					word2 = "dollars";
					word3 = "on arrows";
					arrows();
				}
			} catch (InputMismatchException exception) {
				System.out.println();
				arrows();
			}
		}
	}

	public static void bows() {
		System.out.println();
		System.out.println(
				"Type in if you would like to buy bows with 'buy', switch to the other section, or leave if you wish.");
		Scanner buy = new Scanner(System.in);
		String stringBuy = buy.nextLine();

		if (stringBuy.equals(continue2)) {
			arrows();
		}
		if (stringBuy.equals(leave)) {
			System.out.println("Thank you for the business!");
			storedCash = cash;
			storedArrows = arrows;
			storedBows = bows;
			storedBowD = bowD;
			storedMeals = meals;
			storedWater = water;
			storedSleepy = sleepy;
			wildernessv2();
		}

		if (stringBuy.equals(Sbuy)) {
			System.out.println("Please enter the amount of arrows you would like to buy.");
			Scanner buy2 = new Scanner(System.in);
			int buyNum = buy2.nextInt();
			try {
				if (buyNum == 1) {
					word3 = "on an arrow";
				}

				if (cash == 1) {
					word2 = "dollar";
				}

				if (arrows == 1) {
					word = "arrow";
				}

				if (cash < (buyNum * bowCost)) {
					System.out.println();
					System.out.println("You cannot spend " + (buyNum * bowCost) + " " + word2 + " " + word3
							+ " for you have " + cash + " " + word2 + ".");
					System.out.println();

					if (cash < 20) {
						System.out.println("I notice you cannot complete any future purchases.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
						System.out.println();
						System.out.println("Thank you for the business!");
						storedCash = cash;
						storedArrows = arrows;
						storedBows = bows;
						storedBowD = bowD;
						storedMeals = meals;
						storedWater = water;
						storedSleepy = sleepy;
						wildernessv2();
					}
					if (cash > 5) {
						System.out.println("You can complete more bow and arrow purchases or exit the shop.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
					}
					bows();
				} else {
					cash = cash - (20 * buyNum);
					bows = bows + buyNum;

					if (cash < 5) {
						System.out.println("I notice you cannot complete any future bow purchases.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
						System.out.println();
						System.out.println("Thank you for the business!");
						storedCash = cash;
						storedArrows = arrows;
						storedBows = bows;
						storedBowD = bowD;
						storedMeals = meals;
						storedWater = water;
						storedSleepy = sleepy;
						wildernessv2();
					}
					if (cash > 5) {
						System.out.println("You can complete more bow and arrow purchases or exit the shop.");
						System.out.println();
						System.out.println("You have " + arrows + " " + word + ", " + bows + " " + word5 + ", and "
								+ cash + " " + word2 + ".");
					}
					word5 = "bows";
					word2 = "dollars";
					word4 = "on bows";
					bows();
				}
			} catch (InputMismatchException exception) {
				System.out.println();
				bows();
			}
		}
	}

	public static void deathCheck() {
		if (thirst == 0 || hunger == 0 || sleepy == 0) {
			healthL1 = 0;
			healthL2 = 0;
			healthL3 = 0;
			healthL4 = 0;
			healthL5 = 0;
		}
		if (healthL1 == 0 || healthL2 == 0 || healthL3 == 0 || healthL4 == 0 || healthL5 == 0) {
			System.out.println();
			System.out.println(
					"You have been overcome by the monstrousities in this world. You die with the feeling of unfulfillment.");
			System.out.println();
			System.out.println(
					"(Loading last moment you left a caravan if you have met a caravan). Your level and XP will be reset and your gear will be loaded from a previous time.");
			if (y > 0) {
				healthL1 = 15;
				healthL2 = 20;
				healthL3 = 50;
				healthL4 = 60;
				healthL5 = 80;
				xp = 0;
				level = 1;
				cash = storedCash;
				arrows = storedArrows;
				bows = storedBows;
				bowD = storedBowD;
				meals = storedMeals;
				water = storedWater;
				sleepy = storedSleepy;
				sleep4s();
				sleep1s();
				System.out.print(".");
				sleep1s();
				System.out.print(".");
				sleep1s();
				System.out.print(".");
				sleep4s();
				wilderness();
			} else {
				System.out.println("You have not met a caravan. Game over");
				System.exit(0);
			}
		}
	}

	public static void randomEvent() {
		random = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		random = Math.round(random);

		if (random == 1) {
			setMonster();
		}
		if (random == 2) {
			System.out.println();
			System.out.println(
					"In the distance you see a hopefully friendly caravan. This could be your lucky day for a chance at commerce.");
			sleep1s();
			welcome();
		}
		if (random == 3) {
			System.out.println();
			System.out.println("Nothing new seems to happen.");
			sleep1s();
			wilderness();
		}
		if (random == 4) {
			System.out.println();
			System.out.println("You found a store of meals. Obviously, you take them.");
			meals = meals + ThreadLocalRandom.current().nextInt(2, 6 + 1);
		}
		if (random == 5) {
			System.out.println();
			System.out.println("You found a store of water bottles. Obviously, you take them.");
			meals = meals + ThreadLocalRandom.current().nextInt(5, 9 + 1);
		}
	}

	public static void closing() {
		System.out.println();
		System.out.println(
				"~While wading through a dark and humid swamplands environment, through a clearing in the decaying trees there is an elevation of dry dirt heading into the mouth of a cave. You decide to go in as that seems to be the best option.~");
		sleep4s();
		sleep4s();
		System.out.println();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep4s();
		System.out.println();
		System.out.println(
				"~As you delve deeper, you see one of the foreign flourescent lights enemy countries aupposedly have. It is followed by another one, and another one.~");
		sleep4s();
		sleep1s();
		System.out.println();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(" AAAAAAAAAHHH!!!!!");
		System.out.println();
		sleepHalfs();
		System.out.println(
				"~You fall down into earth as crumbling can be heard above. You taste the dirt and wonder if your life reallys leads up to this.~");
		sleep4s();
		sleep4s();
		System.out.println();
		System.out.println("~You are back.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("~Back to the black void.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("~Back to the translucent floor that ripples at every movement.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println(
				"~The spotlight once bright becomes brighter than the sun and you can't close your eyes anymore to block its intense focus on you.~");
		sleep4s();
		sleep4s();
		System.out.println();
		System.out.println(
				"~The spotlight once ignorable is the only thing you can think of. You try to run away but it follows you, forcing you to suffer in its beacon of light.~");
		sleep4s();
		sleep4s();
		System.out.println();
		System.out.println("~'Can this mean something?' you think. 'Why does this glare down on me?'~");
		System.out.println();
		sleep4s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep4s();
		System.out.println();
		System.out.println(
				"~You wake up to about a dozen rats pillaging your food and water. You scare them away but probably not much is left.");
		sleep4s();
		System.out.println(
				"~A hole in the wall leads to a room with numerous weapons. You take some arrows and a bow as that is what you are proficient in.~");
		System.out.println();
		System.out.println(
				"As you head down the underground canyon you hear strange bubbling sounds and as you turn the corner a laboratory littered with experiment tanks, vials, papers, and millions of buttons and levers.");
		sleep4s();
		sleep1s();
		System.out.println();
		System.out.println("~As you head in an alarm sounds and an old man heads in.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("~He looks at you.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("~Angry.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("~Furious.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("~He equips what looks like a metal arm over his right arm and approaches you menacingly.~");
		sleep4s();
		System.out.println();
		System.out.println(
				"~You don't understand why he thinks he can take you but you do have a bit of fear about that arm.~");
		bossBattle1();

		if (meals > 2) {
			meals = 2;
		} else {
			meals = 0;
		}
		if (water > 6) {
			water = 6;
		} else {
			water = 0;
		}
	}

	public static void bossBattle1() {
		System.out.println("'What do you do?' says the voice.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attack)) {
			System.out.println(
					"~You pull your bow with embarrassment for using a seemingly primitive strategy in this environment. He blocks your shot with his arm and laughs.~");
			System.out.println();
			System.out.println("He continues his approach.");
			x = x + 1;

			if (x == 2) {
				System.out.println("He finishes his approach and rips your throat out with his metallic arm.");
				healthL5 = 0;
				deathCheck();
				x = 0;
			}
			bossBattle1();
		}
		if (b1String.equals(run)) {
			System.out.println("~You cannot escape. You are cornered.~");
		} else {
			bossBattle1();
			x = x + 1;

			if (x == 2) {
				System.out.println("He finishes his approach and rips your throat out with his metallic arm.");
				healthL5 = 0;
				deathCheck();
				x = 0;
			}
		}
		bossBattle2();
	}

	public static void bossBattle2() {
		System.out.println();
		System.out.println("~The man pushes a button on his metal arm. You are not sure what it does.~");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("'What do y----.' the voice falters. You are unable to attack for a reason still unknown.");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println(
				"'You see... I have gained control of any inanimate object that can be classified as a weapon... That includes all your bows, all your arrows. They are mine.' the man rasps as he comes closer.");
		sleep4s();
		System.out.println();
		System.out.println("'He doesn't control me.' you realize as you drop your bows and arrows.");
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println(
				"'I am also the sole reason for your despicable and endless despair. I am the one who creates the endless swarm of zombies that you can only fend off for your own benefit.' he says in an all-too casual tone.");
		sleep4s();
		System.out.println();
		System.out.println(
				"'Just thought I'd leave you with some amount of truth before I rip your throat out.' he says and stops walking.");
		sleep4s();
		System.out.println();
		System.out.println(
				"~You can hear the putrid stench emanating off his labored breathing. His right arm slowly raises and reaches for you but it is interuppted by a glaring light enters the room and blinds the evil scientist.");
		sleep4s();
		System.out.println();
		System.out.println(
				"~The odd thing is that you can see through this glaring light just fine. This mysterious light guides you to a big red button in an obscure location and ceases to exist.~");
		sleep4s();
		sleep1s();
		prompt();
	}

	public static void prompt() {
		System.out.println();
		System.out.println("Do you press this button? 'yes' or 'no'.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(yes)) {
			System.out.println();
			System.out.println(
					"You press the button. You feel time warp and twist backwards. Comprehension is impossible because you feel yourself lose information and consciousness. Why is this famil----?");
			System.out.println();
			sleep4s();
			System.out.print(".");
			sleep1s();
			System.out.print(".");
			sleep1s();
			System.out.print(".");
			sleep4s();
			intro();
		}
		if (b1String.equals(no)) {
			System.out.println();
			System.out.println("You do not press the button.");
			System.out.println();
			System.out.println("The no longer blinded man heads towards you and rips your throat out in anger.");
			healthL5 = 0;
			deathCheck();
		} else {
			x = x + 1;

			if (x == 2) {
				System.out.println("The no longer blinded man heads towards you and rips your throat out in anger.");
				healthL5 = 0;
				deathCheck();
			}
		}
		prompt();
	}
}