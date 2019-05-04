package DSUtility;

public class Queue<T> {

	String arr[];
	int front;
	int rear;
	int capacity;
	int currentSize;

	/* calling constructor to initialize array size */
	public Queue(int capacity) {

		this.capacity = capacity;
		arr = new String[capacity];
	}

	

	/**
	 * @purpose : To add a string element to object at front
	 * @return : void
	 */

	public void enQueue(String data) {

		arr[rear] = data;
		rear++;// Rear is incremented by one 

		currentSize++;

	}

	/**
	 * @purpose : to find no of elements in object
	 * @return : integer total number of element in queue
	 */
	public int size() {
		return currentSize; // returns the size of array
	}

	/**
	 * @purpose : To remove element
	 * @return : void
	 */
	@SuppressWarnings("unused")
	public void deQueue() {

		String temp = arr[front];
		front++;  // front is ++  changing position to removed element
		System.out.println("removed from queue  "+front);
		currentSize--;

	}

	/**
	 * @purpose : To display the elements in queue
	 * @return : void
	 */

	public void show() {
		/* for loop to display all elements in queue */
		for(int i = 0; i <currentSize; i++) {
			System.out.print(arr[front + i] + " ");
		}
		System.out.println();
	}

}
