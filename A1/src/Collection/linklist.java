package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("value1");
		ll.add("value2");
		//ll.clear();


		Iterator<String> itr= ll.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());

		}
		}

}
