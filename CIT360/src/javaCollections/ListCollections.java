package javaCollections;
import java.util.*;

public class ListCollections {

	public static void main(String[] args) {
		List myarray = new ArrayList();
		myarray.add("XboxOne");
		myarray.add("Playstation4");
		myarray.add("WiiU");
		myarray.add("PC");
		System.out.println("1st Element list");
		System.out.print("\t" + myarray);
		System.out.println();
		System.out.println("Second element : "+  myarray.get(1));
		System.out.println("Removing second..");
		myarray.remove(1);
		System.out.println("Second element now: "+  myarray.get(1));
		List myLinkedList = new LinkedList();
		myLinkedList.add("XboxOne");
		myLinkedList.add("Playstation4");
		myLinkedList.add("WiiU");
		myLinkedList.add("PC");
		
		
		System.out.println();
		System.out.println("2nd element list");
		System.out.print("\t" + myLinkedList);
		System.out.println();
		System.out.println("Third element: "+  myLinkedList.get(2));
		System.out.println("Removing second item..");
		myLinkedList.remove(2);
		System.out.println("Third elements now : "+  myLinkedList.get(2));      
		
		
	}
}
