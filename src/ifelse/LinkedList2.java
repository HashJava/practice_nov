package ifelse;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();

		names.add("Hash");
		names.add("TOM");
		names.add("JOHN");
		names.add("RASH");
		names.add("KASH");
		names.add("aASH");

		names.remove(4);

		Collections.sort(names);

		LinkedList<String> names1 = new LinkedList<String>();
		
		for (String n : names) {
			System.out.println(n);
		}

		names.addAll(names1);
		names.add("dam");
		names.add("rasm");
		names.add("kiss");
		names.add("miss");
		names.add("tiss");
		names.add("riss");

		System.out.println("================================================");
		System.out.println(names);

	}

}
