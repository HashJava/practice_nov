package ifelse;

public class switch2 {

	public static void main(String[] args) {

		int day = 4;

		if (day == 6) {
			System.out.println("Saterday");
		} else if (day == 4) {
			System.out.println("Tuesday");
		}

		int days = 1;

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Friday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Mondy");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saterday");
			break;
		default:
			System.out.println("Not a valid day");

			String dog = "great dane";

			switch (dog) {
			case "germenshepered":
				System.out.println("Good dogs");
				break;
			case "great dane":
				System.out.println("pibull");
				break;
			default:
				System.out.println("try different dog");
			}

		}

	}
}
