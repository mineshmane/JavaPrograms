package DSUtility;

public class QueueUsingLinkedList<T> {

	/* Inner class to declear a node variables */
	public class Node {
		T data;
		Node next;
	}

	int size;

	Node front;
	Node rear;

	/**
	 * @param integer : It takes integer value as command line arguments
	 * @purpose : To insert elements to object
	 * @return : void
	 */
	public void insert(T data) {

		Node node = new Node();// Creating object to node inner class
		node.data = data; // Storing data to data variable
		size++;
		if (rear == null) {
			front = node;// Making node as front
			rear = node; // Making node as rear
		}
		rear.next = node;// Changing reference value
		rear = node;// Changing rear
	}

	/**
	 * @purpose : To display elements to object
	 * @return : void
	 */
	public void display() {
		Node temp = front;
		while (temp.next != null) // Condition to print elements
		{
			System.out.print(temp.data + "  ");
			temp = temp.next; // Changing reference value
		}
		System.out.println(temp.data + "  "); // Printing last data element
	}

	/**
	 * @purpose : To remove elements from front of object
	 * @return : void
	 */
	public T remove() {
		if (front == null) // Checking front is null or nor
		{
			return null;
		} else {
			T data = front.data;
			front = front.next;// Changing reference value
			return data;
		}
	}

	/**
	 * @purpose : To return no of elements in object
	 * @return : int
	 */
	public int size() {
		return size;// Returning size
	}

}
