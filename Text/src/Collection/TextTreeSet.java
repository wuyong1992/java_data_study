package Collection;

import java.util.TreeSet;

public class TextTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(10);
		tSet.add(11);
		tSet.add(12);
		tSet.add(13);
		
		System.out.println(tSet);
		
		System.out.println(tSet.contains(12));
		
		
	}

}
