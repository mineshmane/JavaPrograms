package DSUtility;

public class Queue<T> {

	LinkedList<T> ls = new LinkedList<>();
	private Object arr[];
	private int front=-1;
	public int rear=-1;
	public static int capacity;
	private int count;

	/* calling constructor to intialize array size */
	public Queue(int size) {
		arr=new Object[size];
		capacity = size;
		front = 0;
	    rear = -1;
		count = 0;
	}

	public static class Node<T> {
		T data;
		T next;

		Node(T d) {
			data = d;
			next = null;
		}
	}

	/**
	 * @purpose : to find objects are full are not in object
	 * @return : boolean
	 */

	public Boolean isFull() {
		return (size() == capacity);
	}

	public Boolean isEmpty() {
		if(front==-1&&rear==-1) {
			System.out.println("Emty que");
			return true;
		}else {
			return false;
		}
		
	}

	/**
	 * @param string : It takes string as command line arguments
	 * @purpose : To add a string element to object at front
	 * @return : void
	 */
	public void enQueue(T data) {
		Node<T> new_node = new Node(data);

		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		} else {

			// System.out.print(" "+ new_node.data);

			rear = (rear + 1) % capacity;
			arr[rear] = ls.last(data);
			count++;
		}

	}

	/**
	 * @purpose : to find no of elements in object
	 * @return : int
	 */
	public int size() {
		return count; // returns the size of array
	}

	/**
	 * @purpose : To remove element
	 * @return : void
	 */
	public void deQueue() {
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		} else {
			System.out.println("Removing " + arr[front]);

			front = (front + 1) % capacity;
			count--;
		}
// changing position to remove element

	}

	/**
	 * @purpose : To display the elements in queue
	 * @return : void
	 */

	public void show() {
		/* for loop to display all elements in queue */
		for (int i = 0; i < count; i++) {
			System.out.print(arr[front + i] + " ");
		}
		System.out.println();
	}

}
