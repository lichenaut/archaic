package p7;

public class c1 {

	public static void main(String[] args) {

		String word1 = "pounds.";
		String word2 = "pounds.";
		String word3 = "pounds.";
		
		String[] one = { "smelly", "clean", "swift", "slow", "fluffy" };
		String[] two = { "black", "white", "red", "green", "blue", "yellow" };
		String[] three = { "dog", "pupper", "puppy", "woofer", "ruffer", "yipper", "floofer", "fluffboi" };

		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;

		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);
		int rand4 = (int) (Math.random() * oneL);
		int rand5 = (int) (Math.random() * twoL);
		int rand6 = (int) (Math.random() * threeL);
		int rand7 = (int) (Math.random() * oneL);
		int rand8 = (int) (Math.random() * twoL);
		int rand9 = (int) (Math.random() * threeL);

		String phrase1 = one[rand1] + " " + two[rand2] + " " + three[rand3];
		String phrase2 = one[rand4] + " " + two[rand5] + " " + three[rand6];
		String phrase3 = one[rand7] + " " + two[rand8] + " " + three[rand9];
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.size = (Math.random() * 101);
		dog2.size = (Math.random() * 101);
		dog3.size = (Math.random() * 101);
			
			if (dog1.size == 1) {
				word1 = "pound.";
			}
			
			if (dog2.size == 1) {
				word2 = "pound.";
			}
			
			if (dog3.size == 1) {
				word3 = "pound.";
			}	
		
		System.out.print("A " + phrase1 + " says ");
		dog1.bark();
		System.out.print(" and weighs " + dog1.size + " " + word1);
		
		System.out.println();
		System.out.println();
		
		System.out.print("A " + phrase2 + " says ");
		dog2.bark();
		System.out.print(" and weighs " + dog2.size + " " + word2);
		
		System.out.println();
		System.out.println();
		
		System.out.print("A " + phrase3 + " says ");
		dog3.bark();
		System.out.print(" and weighs " + dog3.size + " " + word3);
	}
}