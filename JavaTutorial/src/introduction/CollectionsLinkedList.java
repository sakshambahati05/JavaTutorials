package introduction;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Fourth");
		System.out.println(ll.size());
		System.out.println(ll);
		
		//addFirst
		ll.addFirst("Saksham");
		System.out.println(ll);

		
		//addLast
		ll.addLast("Bahati");
		System.out.println(ll);
		
		//removeFirst
		ll.removeFirst();
		System.out.println(ll);

		//removeLast
		ll.removeLast();
		System.out.println(ll);

		LinkedList<String> lll = new LinkedList<String>();
		lll.add("Fifth");
		lll.add("Sixth");
		
		//ll.allAll()
		ll.addAll(lll);
		System.out.println(ll);
		
		//ll.removeAll
		ll.removeAll(lll);
		System.out.println(ll);
		
		//ll.add(index,value) -> Adding a value at a particular index number and shifting the rest of the element. This
		//does not overwrite the value at index '1' but gets inserted in already existing list
		ll.add(1, "2nd");
		System.out.println(ll);
		
		//removing a particular index element. Rest of the elements shift to left
		ll.remove(1);
		System.out.println(ll);

		//get a particular element 
		System.out.println(ll.get(3)); //brings in the value at 04rth position or 03rd index which is "Fourth" in this case 
		
		//set a value 
		System.out.println("Before set-->"+ll);
		ll.set(0, "1st");
		System.out.println("After set-->"+ll);
		
		
		System.out.println("\n******");
		// Print all values of linked lists 
		
		//1. For loop
		for (int n=0;n<ll.size();n++) {
		System.out.print(ll.get(n));
		}
		
		System.out.println("\n******");
		
		//02. Advaced for loop
		for (String str:ll) {
			System.out.print(str);
		}
		
		System.out.println("\n******");
		
		//03 . Using Iterator 
		Iterator<String> it=ll.iterator();
		while (it.hasNext()){
				System.out.print(it.next());
			}
		
		System.out.println("\n******");

		//04. Using while loop 
		int num=0;
		while (ll.size()>num) {
			System.out.print(ll.get(num));
			num++;
		}
		System.out.println("\n******");

		
		

	}

}
