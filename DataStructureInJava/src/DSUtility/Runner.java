package DSUtility;

public class Runner {
	
	
	
	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> list=new QueueUsingLinkedList<Integer>();
		list.insert(45);
		list.insert(78);
		list.insert(89);
		list.insert(33);
		list.insert(56);
		list.display();
		
		list.remove();
		list.display();
		
	}

}
