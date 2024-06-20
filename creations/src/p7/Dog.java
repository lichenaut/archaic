package p7;

public class Dog {

	double size;
	
	void bark() {
		
		while (size < 101) {
		
		if (size > 80) {
			System.out.print("'woof!'");
			break;
		}
		
		if (size > 40) {
			System.out.print("'bork!'");
			break;
		}
		
		if (size > 20) {
			System.out.print("'ruff!'");
			break;
		}
		
		if (size > 0) {
			System.out.print("'yip!'");
			break;
		}
		
		else {
			System.out.print("'i'm dead...'");
		}
		
		}
	}
}