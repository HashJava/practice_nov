package ifelse;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an age");

		int age = sc.nextInt();

		if (age < 18)
			System.out.println("You are a minor: not elgibel to work");
		else
			System.out.println("Happy Retirement");

		{

			if (age >= 18 && age <= 60)
				System.out.println("You are still elegible");
			else
				System.out.println("Still retiring");

		}
	}
}
