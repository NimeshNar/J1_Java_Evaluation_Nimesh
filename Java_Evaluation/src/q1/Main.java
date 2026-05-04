package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		{
			list.add("Apple");
			list.add("Banana");
			list.add("Cherry");

			// a) For-each loop
			for (String item : list) {
				System.out.println(item);
			}

			// b) Iterator
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

			// c) Enumeration (using Vector)
			Vector<String> vec = new Vector<>(list);
			Enumeration<String> en = vec.elements();
			while (en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}

			// d) ListIterator
			ListIterator<String> li = list.listIterator();
			while (li.hasNext()) {
				System.out.println(li.next());
			}
		}
	}
}
