package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
	
	public static void main(String... sortedSet) {
		SortedSet<Integer> st = new TreeSet<>();
		
		st.add(50);
		st.add(20);
		st.add(65);
		st.add(75);
		st.add(85);
		st.add(70);
		st.add(25);
		st.add(35);
		st.add(30);
		st.add(45);
		st.add(60);
		System.out.println(st);
		
		System.out.println(st.headSet(50));
		System.out.println(st.tailSet(70));
		System.out.println(st.subSet(30,75));
		System.out.println(st.first());
		System.out.println(st.last());
		System.out.println(st.comparator());
		System.out.println(st.removeFirst());
		System.out.println(st.removeLast());
		System.out.println(st);
		System.out.println(st.reversed());
	}
}
