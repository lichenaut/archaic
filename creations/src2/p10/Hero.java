package p10;

import java.util.concurrent.ThreadLocalRandom;

public class Hero extends Being {

	public static int random;
	public static int xp;
	
	public static String word = "rounds";

	public Hero() {
		level = 1;
		hero.setHealth(hero.getLevel());
		xp = 0;
	}
	
	public static void prompt() {
		System.out.println("Welcome to the text-based battle simulator!");
		System.out.println();
		System.out.println("'attack' will have you pull an arrow out of your quiver and shoot it with your bow!");
		System.out.println();
		System.out.println("Every time you level up, your attack and health maximum will increase!");
		System.out.println();
		System.out.println("Your XP will reset every time you level up!");
		System.out.println();
		System.out.println("Your health will regenerate when you level up!");
		System.out.println();
		System.out.println("Try to last as many rounds as possible!");
		sleep4s();
		sleep4s();
		sleep4s();
		System.out.println();
		System.out.println();
		System.out.println();
		hero.setMonster(hero.getLevel());
	}

	public static void setMonster(int l) {
		level = 1;
		if (level == 1) {
			random = ThreadLocalRandom.current().nextInt(1, 2 + 1);
			if (random == 1) {
				m1.battleTime1();
			}
			if (random == 2) {
				m2.battleTime2();
			}
		}
		if (level == 2) {
			random = ThreadLocalRandom.current().nextInt(2, 3 + 1);
			if (random == 2) {
				m2.battleTime2();
			}
			if (random == 3) {
				m3.battleTime3();
			}
		}
		if (level == 3) {
			m3.battleTime3();
		}
	}

	public static void resourceGain(int l) {
		level = l;
		if (level == 1) {
			xp = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			xp = Math.round(xp);

			System.out.println("You now have " + xp + " XP!");
			levelUp(hero.getLevel());
		}
		if (level == 2) {
			xp = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			xp = Math.round(xp);

			System.out.println("You now have " + xp + " XP!");
			levelUp(hero.getLevel());
		}
		if (level == 3) {
			xp = ThreadLocalRandom.current().nextInt(3, 10 + 1);
			xp = Math.round(xp);

			System.out.println("You now have " + xp + " XP! (Though that doesn't matter as you are at the maximum level...");
			levelUp(hero.getLevel());
		}
	}

	public static void levelUp(int l) {
		level = l;
		if (level == 3) {
				System.out.println();
				System.out.println("You didn't level up! Your attack and health maximum will not increase! (You are at the maximum level).");
		}
		if (level == 2) {
			if (xp == 15) {
				System.out.println();
				System.out.println("You leveled up to level 3! Your attack and health maximum will increase!");
				xp = 0;
				level = 3;
				hero.setHealth(hero.getLevel());
			}
		}
		if (level == 1) {
			if (xp == 10) {
				System.out.println();
				System.out.println("You leveled up to level 2! Your attack and health maximum will increase!");
				xp = 0;
				level = 2;
				hero.setHealth(hero.getLevel());
			}
		}
		hero.setMonster(hero.getLevel());
	}

	public static void deathCheck(int h) {
		if (x == 1) {
			word = "round";
		} else {
			word = "rounds";
		}
		
		health = h;
		if (health == 0) {
			System.out.println("You died! You lasted " + x + " " + word + "!");
			System.exit(0);
		}
		if (health < 0) {
			System.out.println("You died! You lasted " + x + " " + word + "!");
			System.exit(0);
		}
	}

	public static void sleep4s() {
		try {
			Thread.sleep(4000);
		} catch (Exception exe) {
			System.out.println("Error");
		}
	}
}