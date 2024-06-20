import java.util.concurrent.ThreadLocalRandom;

public class ReveiwGen {

	public static void main(String[] args) {

		int num = ThreadLocalRandom.current().nextInt(1, 5 + 1);

		if (num == 1) {
			notGood();
		} else {
			isGood();
		}
	}

	public static void isGood() {

		String[] GS1 = {};
		String[] GS2 = {};
		String[] GS3 = {};
		String[] GS4 = {};
		String[] GS5 = {};
		int oneL = GS1.length;
		int twoL = GS2.length;
		int threeL = GS3.length;
		int fourL = GS4.length;
		int fiveL = GS5.length;
		int rand1 = (int) (Math.random() * oneL);
		int rand2 = (int) (Math.random() * twoL);
		int rand3 = (int) (Math.random() * threeL);
		int rand4 = (int) (Math.random() * fourL);
		int rand5 = (int) (Math.random() * fiveL);
		
		System.out.println(GS1[rand1] + GS2[rand2] + GS3[rand3] + GS4[rand4] + GS5[rand5]);

	}

	public static void notGood() {

		String[] BS1 = {};
		String[] BS2 = {};
		String[] BS3 = {};
		String[] BS4 = {};
		String[] BS5 = {};
		int onex2L = BS1.length;
		int twox2L = BS2.length;
		int threex2L = BS3.length;
		int fourx2L = BS4.length;
		int fivex2L = BS5.length;
		int rand6 = (int) (Math.random() * onex2L);
		int rand7 = (int) (Math.random() * twox2L);
		int rand8 = (int) (Math.random() * threex2L);
		int rand9 = (int) (Math.random() * fourx2L);
		int rand10 = (int) (Math.random() * fivex2L);

		System.out.println(BS1[rand6] + BS2[rand7] + BS3[rand8] + BS4[rand9] + BS5[rand10]);
		
	}
}