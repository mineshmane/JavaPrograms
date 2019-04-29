package demo.com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings("unused")
public class Runner {


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Runner r = new Runner();
	LinkedList list = new LinkedList();
		list.insertatLast(23);
		list.insertatLast("rahul");
		list.insertatLast(55);
		list.insertatLast(44);
		list.insertAtPosition(5, 100);
		list.insertatLast(36.5);
		list.insertatLast(364);
		list.insertAtMid(5);
		list.delete(5555);
		list.show();
		
	
		System.out.println("operatoions: ");
		list.searchbyvalue("rahul");
		list.searchbyvalue(36.5);
		System.out.println("abcd");
		list.show();

	}
}
