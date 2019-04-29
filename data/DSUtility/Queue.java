package DSUtility;

public class Queue<T> {

	String arr[];
	int front;
	int rear;
	int capacity;
	int count;

	/* calling constructor to initialize array size */
	public Queue(int capacity) {

		this.capacity = capacity;
		arr = new String[capacity];
	}

	/**
	 * @purpose : to find objects are full are not in object
	 * @return : boolean
	 */

	/**
	 * @param string : It takes string as command line arguments
	 * @purpose : To add a string element to object at front
	 * @return : void
	 */

	public void enQueue(String data) {

		arr[rear] = data;
		rear++;

		count++;

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

		String temp = arr[front];
		front++;
		count--;

// changing position to remove element

	}

	/**
	 * @purpose : To display the elements in queue
	 * @return : void
	 */

	public void show() {
		/* for loop to display all elements in queue */
		for(int i = 0; i <count; i++) {
			System.out.print(arr[front + i] + " ");
		}
		System.out.println();
	}

}
