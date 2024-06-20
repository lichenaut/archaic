package p8;

import java.util.ArrayList;

public class ArrayListTesting {

	public static void main(String[] args) {
		ArrayList<String> pList = new ArrayList<String>();
		
		String Todd = new String();
		pList.add(Todd);
		String Matthew = new String();
		pList.add(Matthew);
		String Adam = new String();
		pList.add(Adam);
		String Danielle = new String();
		pList.add(Danielle);
		
		System.out.println("There are " + pList.size() + " participants.");
		
		int[] array = {1,2,3,4};
		
		for (int num : array) {
			if (num == 3) {
				System.out.println();
				System.out.println("My theory works!");
			} else {
				System.out.println();
				System.out.println("Somethings not 3 around here...");
			}
		}
	}

}
