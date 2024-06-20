package p10;

import java.util.Scanner;

public class MonsterGenerator extends Being {
	
	
	public static void battleTime1() {
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

		String phrase = one[rand1] + two[rand2] + three[rand3];

		m1.setMLevel(1);
		m1.setMHealth(1);
		System.out.println();
		System.out.println(phrase);
		HAttacking1();
	}

	public static void HAttacking1() {
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String action = Actionone[Actionrand1];

		System.out.println();
		System.out.println("It's your turn so enter you-know-what.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attacking)) {
			hero.setAttack(hero.getLevel());
			m1.setMDamageTaken(m1.getMHealth(), hero.getAttack());
			System.out.println();
			System.out.println(action);
			m1.setMAttack(m1.getMLevel());
			hero.setDamageTaken(hero.getHealth(), m1.getMAttack());
			m1.mDeathCheck(getMHealth());
			
			if (MHealth > 0) {
				hurt1();
			}
		} else {
			HAttacking1();
		}
	}

	public static void hurt1() {
		String[] Aone = { "The zombie bites you.", "The zombie cuts you with its snotty fingernail.",
				"The zombie punches you.", "The zombie grabs your head and headbutts you.",
				"The zombie roundhouse kicks you." };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String hurt = Aone[Arand1];
		
		System.out.println();
		System.out.println(hurt);
		System.out.println();
		System.out.println("Health: " + health);
		System.out.println("Monster health: " + MHealth);
		hero.deathCheck(hero.getHealth());
		HAttacking1();
	}
	
	public static void battleTime2() {
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

		String phrase = one[rand1] + two[rand2] + three[rand3];

		m2.setMLevel(2);
		m2.setMHealth(2);
		System.out.println();
		System.out.println(phrase);
		HAttacking2();
	}

	public static void HAttacking2() {
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String action = Actionone[Actionrand1];

		String[] Aone = { "The zombie bites you.", "The zombie cuts you with its snotty fingernail.",
				"The zombie punches you.", "The zombie grabs your head and headbutts you.",
				"The zombie roundhouse kicks you." };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String hurt = Aone[Arand1];

		System.out.println();
		System.out.println("It's your turn so enter you-know-what.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attacking)) {
			hero.setAttack(hero.getLevel());
			m2.setMDamageTaken(m2.getMHealth(), hero.getAttack());
			System.out.println();
			System.out.println(action);
			m2.setMAttack(m2.getMLevel());
			hero.setDamageTaken(hero.getHealth(), m2.getMAttack());
			m2.mDeathCheck(getMHealth());
			hurt2();
		} else {
			HAttacking2();
		}
	}

	public static void hurt2() {
		String[] Aone = { "The zombie bites you.", "The zombie cuts you with its snotty fingernail.",
				"The zombie punches you.", "The zombie grabs your head and headbutts you.",
				"The zombie roundhouse kicks you." };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String hurt = Aone[Arand1];
		
		System.out.println();
		System.out.println(hurt);
		System.out.println();
		System.out.println("Health: " + health);
		System.out.println("Monster health: " + MHealth);
		hero.deathCheck(hero.getHealth());
		HAttacking2();
	}
	
	public static void battleTime3() {
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

		String phrase = one[rand1] + two[rand2] + three[rand3];

		String[] Aone = { "The zombie bites you.", "The zombie cuts you with its snotty fingernail.",
				"The zombie punches you.", "The zombie grabs your head and headbutts you.",
				"The zombie roundhouse kicks you." };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String hurt = Aone[Arand1];

		m3.setMLevel(3);
		m3.setMHealth(3);
		System.out.println();
		System.out.println(phrase);
		HAttacking3();
	}

	public static void HAttacking3() {
		String[] Actionone = {
				"~Your arrow enters the thing's eye and goes through its head. It continues to look up at the sky as it walks.~",
				"~Your arrow punctures its shoulder, sending it stumbling backwards.~",
				"~Your arrow lands in the center of its torso, causing a sharp hunch and a growl.~",
				"~Your arrow hits the knee of the zombie, causing it to trip. It gets back up angrier.~" };

		int ActiononeL = Actionone.length;
		int Actionrand1 = (int) (Math.random() * ActiononeL);
		String action = Actionone[Actionrand1];

		String[] Aone = { "The zombie bites you.", "The zombie cuts you with its snotty fingernail.",
				"The zombie punches you.", "The zombie grabs your head and headbutts you.",
				"The zombie roundhouse kicks you." };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String hurt = Aone[Arand1];

		System.out.println();
		System.out.println("It's your turn so enter you-know-what.");
		Scanner battle1 = new Scanner(System.in);
		String b1String = battle1.nextLine();

		if (b1String.equals(attacking)) {
			hero.setAttack(hero.getLevel());
			m3.setMDamageTaken(m3.getMHealth(), hero.getAttack());
			m3.mDeathCheck(getMHealth());
			System.out.println();
			System.out.println(action);
			m3.setMAttack(m3.getMLevel());
			hero.setDamageTaken(hero.getHealth(), m3.getMAttack());
			hurt3();
		} else {
			HAttacking3();
		}
		if (MHealth == 0) {
			System.out.println();
			System.out.println("Round Cleared! Next round coming up!");
			System.out.println();
			x++;
			hero.resourceGain(hero.getLevel());
			hero.setMonster(hero.getLevel());
		}
	}

	public static void hurt3() {
		String[] Aone = { "The zombie bites you.", "The zombie cuts you with its snotty fingernail.",
				"The zombie punches you.", "The zombie grabs your head and headbutts you.",
				"The zombie roundhouse kicks you." };
		int AoneL = Aone.length;
		int Arand1 = (int) (Math.random() * AoneL);
		String hurt = Aone[Arand1];
		
		System.out.println();
		System.out.println(hurt);
		System.out.println();
		System.out.println("Health: " + health);
		System.out.println("Monster health: " + MHealth);
		hero.deathCheck(hero.getHealth());
		HAttacking3();
	}
	
	public static void mDeathCheck(int h) {
		MHealth = h;
		if (MHealth == 0) {
			System.out.println();
			System.out.println("Round Cleared! Next round coming up!");
			System.out.println();
			x++;
			hero.resourceGain(hero.getLevel());
		}
		if (MHealth < 0) {
			System.out.println();
			System.out.println("Round Cleared! Next round coming up!");
			System.out.println();
			x++;
			hero.resourceGain(hero.getLevel());
		}
	}
}
