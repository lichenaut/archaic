package p6;

public class slotMachine {

	public static void main(String[] args) {

		String[] one = { "1", "1", "S1", "2", "2", "S2", "3", "3", "S3"};
		String[] two = { "1", "1", "S1", "2", "2", "S2", "3", "3", "S3"};
		String[] three = { "1", "1", "S1", "2", "2", "S2", "3", "3", "S3"};
	
		int oneL = one.length;
		int twoL = two.length;
		int threeL = three.length;
		
		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);
		
		System.out.print(one[rand1]);
		System.out.print("|" + two[rand2]);
		System.out.print("|" + three[rand3]);
		
		System.out.println();
		System.out.println();
		
		if (one[rand1] == two[rand2] && two[rand2] == three[rand3]) {
			System.out.println("You got a match!");
			
			System.out.println();
			System.out.println();
			
			if (one[rand1] == "S1") {
				System.out.println("A super match too? Those " + one[rand1] + " digits are treating you nicely!");
			}
			
			if (one[rand1] == "S2") {
				System.out.println("A super match too? Those " + one[rand1] + " digits are treating you nicely!");
			}
			
			if (one[rand1] == "S3") {
				System.out.println("A super match too? Those " + one[rand1] + " digits are treating you nicely!");
			}
			
			if (one[rand1] == "S4") {
				System.out.println("A super match too? Those " + one[rand1] + " digits are treating you nicely!");
			}
			
			if (one[rand1] == "S5") {
				System.out.println("A super match too? Those " + one[rand1] + " digits are treating you nicely!");
			}
		}
		
		if (one[rand1] != two[rand2] || two[rand2] != three[rand3]) {
			System.out.println("You lost; you can try again.");
		}
	}

}