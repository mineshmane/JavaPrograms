package firstProject;

public class Runner {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(34);
		list.add(345);
		list.add(56);
		list.add(563);
		list.add(566);
		list.size();
		list.display();
		list.delete(56);
		list.remove(345);
		list.deleteA(5653);
		System.out.println("after operation ");
		list.display();
		list.size();
		
	}
}
