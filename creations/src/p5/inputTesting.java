package p5;

import java.util.Scanner;

public class inputTesting {

	public static void main(String[] args) {

		CreateProfile();

	}

	public static void CreateProfile() {

		System.out.println("Please enter your name: ");
		Scanner name = new Scanner(System.in);
		String stringName = name.nextLine();

		System.out.println("Please enter your age: ");
		Scanner age = new Scanner(System.in);
		String stringAge = age.nextLine();

		System.out.println("Please enter your gender: ");
		Scanner gender = new Scanner(System.in);
		String stringGender = gender.nextLine();

		System.out.println();
		System.out.println();
		
		System.out.println("Here is your profile:");

		System.out.println();

		System.out.println("----------");
		System.out.println("Name: " + stringName);
		System.out.println();
		System.out.println("Age: " + stringAge);
		System.out.println();
		System.out.println("Age: " + stringGender);
		System.out.println("----------");

		name.close();
		age.close();
		gender.close();
		
	}

}