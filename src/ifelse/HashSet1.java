package ifelse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> newlist = new HashSet<String>();
		///Here there is no insertion order//permits null elements//or wont print duplicate elements..
		
		newlist.add("Rakesh");
		newlist.add("Ramish");
		newlist.add("Akram");
		newlist.add("Sameer");
		newlist.add("John");

		for (String n : newlist) {
			System.out.println(n);
		}
		{
			System.out.println("================================================");

			System.out.println(newlist);

		}

		LinkedHashSet<String> newlist1 = new LinkedHashSet<String>();

		//Insertion order ===there is an order when you print data...
		newlist1.add("Rakesh");
		newlist1.add("Ramish");
		newlist1.add("Akram");
		newlist1.add("Sameer");
		newlist1.add("John");
		newlist1.add(" "); 

		System.out.println(newlist1);
		
		TreeSet<String> list = new TreeSet<>();
		
		list.add("College");
		list.add("Stratford");
		list.add("Politics");
		list.add("Indian");
		//Wont accept null elements and duplicate
		list.add("Indian");
		
		for (String l : list) {
			System.out.println(l+ ""+ "============I am here================" + ""  );
		}
		
		//Added another list here..with the name newlist2 merged...them
		
		System.out.println("======================================");
		System.out.println(list);
		list.addAll(newlist1);
		
		
		
		
	}

	
	
	
	
}
