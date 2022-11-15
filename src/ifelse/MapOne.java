package ifelse;

import java.util.HashMap;
import java.util.Map;

public class MapOne {

	public static void main(String[] args) {

		// Java MAP interface (Key/Values entry)

		Map<String, String> countries = new HashMap<String, String>();

		countries.put("USA", "UNITED STATES OF AMERICA");
		countries.put("Afghanistan", "Afghanistan");
		countries.put("JPA", "JAPAN");

		// In order to print perfom loop you will need to use HashSet to traverse to
		// loop thru..
		for (Map.Entry m : countries.entrySet())
			;

		System.out.println(countries + "=========Second attemp============");

		{
			{
//				String [] list = {"Jon","Sam","Rakesh","Ram","Dill","Kamal","Tom"};
//				
//				for (int m = 0; m <= list.length; m++) {
//					System.out.println(m+"String list is here");
//				}

				int[] numbers = { 100, 200, 300, 3001 };

				System.out.println("Odd numbers");
				for (int i = 0; i < numbers.length; i++) {
					if (numbers[i] % 2 != 0)
						System.out.println(numbers[i]);
				}

			}

			HashMap<String, Integer> aptnum = new HashMap<String, Integer>();

			aptnum.put("Reverside", 2022);
			aptnum.put("Station", 2022);
			aptnum.put("Glen ARBOR", 2022);
			aptnum.put("Potomac", 2022);

			System.out.println(aptnum);

		}

		System.out.println(countries);

	}

}
