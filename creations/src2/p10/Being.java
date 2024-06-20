package p10;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Being {
	
	public static int attack;
	public static int MAttack;
	public static int health;
	public static int MHealth;
	public static int level;
	public static int MLevel;
	public static int damage;
	public static int MDamage;
	public static int x;
	
	public static String attacking = "attack";
	
	public static MonsterGenerator m1 = new MonsterGenerator();
	public static MonsterGenerator m2 = new MonsterGenerator();
	public static MonsterGenerator m3 = new MonsterGenerator();
	public static Hero hero = new Hero();

	public static void setMAttack(int l) {
		MLevel = l;
		if (MLevel == 1) {
			MAttack = ThreadLocalRandom.current().nextInt(0, 3 + 1);
		}
		if (MLevel == 2) {
			MAttack = ThreadLocalRandom.current().nextInt(0, 8 + 1);
		}
		if (MLevel == 3) {
			MAttack = ThreadLocalRandom.current().nextInt(0, 15 + 1);
		}
	}

	public static void setMHealth(int l) {
		MLevel = l;
		if (MLevel == 1) {
			MHealth = 10;
		}
		if (MLevel == 2) {
			MHealth = 15;
		}
		if (MLevel == 3) {
			MAttack = 20;
		}
		
	}

	public static void setMDamageTaken(int h, int a) {
		MHealth = h;
		attack = a;
		
		MDamage = attack;
		MHealth = MHealth - MDamage;
	}
	
	public static void setAttack(int l) {
		level = l;
		if (level == 1) {
			attack = ThreadLocalRandom.current().nextInt(0, 15 + 1);
		}
		if (level == 2) {
			attack = ThreadLocalRandom.current().nextInt(0, 20 + 1);
		}
		if (level == 3) {
			MAttack = ThreadLocalRandom.current().nextInt(0, 30 + 1);
		}
		
	}

	public static void setHealth(int l) {
		level = l;
		if (level == 1) {
			health = 20;
		}
		if (level == 2) {
			health = 30;
		}
		if (level == 3) {
			health = 40;
		}
		
	}

	public static void setDamageTaken(int h, int a) {
		health = h;
		MAttack = a;
		
		damage = MAttack;
		health = health - MAttack;
	}

	public static int getMAttack() {
		return MAttack;
	}

	public static int getMHealth() {
		return MHealth;
	}
	
	public static int getMDamageTaken() {
		return attack;
	}

	public static int getAttack() {
		return attack;
	}

	public static int getHealth() {
		return health;
	}

	public static int getDamageTaken() {
		return MAttack;
	}

	public static void setMLevel(int l) {
		level = l;
		MLevel = level;
	}

	public static int getLevel() {
		if (level == 1) {
			return 1;
		}
		if (level == 2) {
			return 2;
		}
		if (level == 3) {
			return 3;
		} else {
			return 1;
		}
	}
	
	public static int getMLevel() {
		if (MLevel == 1) {
			return 1;
		}
		if (MLevel == 2) {
			return 2;
		}
		if (MLevel == 3) {
			return 3;
		} else {
			return 1;
		}
	}
}
