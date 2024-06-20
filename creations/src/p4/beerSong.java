package p4;

public class beerSong {
	
	public static void main(String[] args) {
		
		int x = 99;
		String word = "bottles";

		while (x > 0) {
			
			for(x = 99; x > 0; x--) {
				
				if (x == 1) {
					word = "bottle";
				}
				
				if (x < 99) {
					System.out.println();
				}
				
				System.out.println(x + " " + word + " of bottles of beer on the wall!");
				System.out.println(x + " " + word + " of beer!");
				System.out.println();
				System.out.print("Take one down, pass it around, ");
				x--;
				
				if (x == 0) {
					break;
				}
				
				System.out.println(x + " " + word + " of beer on the wall!");
				x++;
			}
		}

		System.out.print("No more bottles of beer on the wall!");
	}

}