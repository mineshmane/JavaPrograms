package DSUtility;

public class LinkedList<T> {

	@SuppressWarnings("rawtypes")

	Node head; // Declaring head node

	@SuppressWarnings("hiding")
	public class Node<T> {
		T data;
		public Node<T> next;
	}

	/**
	 * @param T : It takes generic datatype as command line arguments
	 * @purpose : This method is used to add String data to a linkedlist
	 * @return : void
	 **/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void add(T data) {

		Node node = new Node(); // creating nodes
		node.data = data;// adding data

		if (head == null) {
			head = node; // make head as a first node
		} else {
			Node newNode = head;

			while (newNode.next != null) // take reference values
			{
				newNode = newNode.next; // changing reference values
			}
			newNode.next = node;
		}

	}

	/**
	 * @purpose : This method is used to display the data which is in linkedlist
	 *          object
	 * @return : void
	 **/
	@SuppressWarnings("rawtypes")
	public void displayList() {
		if (isEmpty()) {
			System.out.println("None");
		} else {
			Node temp;
			temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	/**
	 * @purpose : This method is used to display the data which is in linkedlist
	 *          object
	 * @return : void
	 **/

	@SuppressWarnings("rawtypes")
	public void display() {
		Node n = head; // making n as head node

		while (n.next != null) {
			System.out.print(n.data + " "); // Retrieving the data
			n = n.next; // changing reference
		}
		System.out.println(n.data); // Retrieving last element

	}

	/**
	 * @param T : It takes generic data type as command line argument
	 * @purpose : This method is used to search a specific element in a linked list
	 * @return : boolean
	 **/

	@SuppressWarnings("rawtypes")
	public boolean search(T word)

	{
		
		Node newNode = head; // making n as head node

		while (newNode.next != null)// next reference value
		{
			if (newNode.data.equals(word)) // comparing data with user search value
			{
				return true;
			}

			if (newNode.next == null) // checking last element of object
			{
				newNode.data.equals(word); // comparing data with user search value
				return true;
			}
			newNode = newNode.next;
		}

		return false;

	}

	/**
	 * @param T : It takes generic data type as command line argument
	 * @purpose : This method is used to delete a specific element at any position
	 *          in a linkedlist
	 * @return : void
	 **/

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void delete(T ele)

	{
		Node newNode = head;
		Node n1 = head;

		if (newNode.data.equals(ele)) // checking head element with user search element to delete
		{
			head = head.next; // changing reference value
		}
		while (newNode != null) {
			if (newNode.data.equals(ele)) // checking for the element in list
			{
				n1.next = newNode.next; // changing reference value
			}
			n1 = newNode;
			newNode = newNode.next;
		}
	}

	/**
	 * @param T : It takes generic data type as command line argument
	 * @purpose : This method is used to add element at first position of linkedlist
	 * @return : void
	 **/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addFirst(T data) {
		Node node = new Node(); // creating object
		node.data = data; // adding data to first node
		node.next = head;
		head = node;

	}

	/**
	 * @purpose : This method is used to covert words in a list to string
	 * @return : string
	 **/

	@SuppressWarnings("rawtypes")
	public String getString() {
		String output = " ";
		Node n = head; // making n as head node

		while (n.next != null) {
			output += n.data + " "; // adding all values to output variable
			n = n.next;
		}
		output += n.data; // adding last element
		return output;
	}

	/**
	 * @purpose : This method is used delete element in first in a list to
	 * @return : string
	 **/

	@SuppressWarnings({ "rawtypes", "unchecked", "hiding" })
	public <T> T deletefirst() {
		T item;
		Node n = head;
		head = n.next;
		item = (T) n.data;
		return item;
	}

	/**
	 * @purpose : This method is used to delete element at last in a list to T
	 * @return : T
	 **/

	@SuppressWarnings({ "rawtypes", "unchecked", "hiding"})
	public <T> T deleteAtlast() {
		if (head == null)
			return null;
		else {
			Node n = head;
			Node prev = head;
			while (n.next != null) {
				prev = n;

				n = n.next;

			}

			T data = (T) n.data;
			prev.next = null;
			return data;
		}
	}

	/**
	 * @purpose : This method is used to add element at last in a list
	 * @return : T
	 **/

	@SuppressWarnings({ "unchecked", "rawtypes", "hiding" })
	public <T> void insertAtLast(T data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
			node.next = null;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			node.next = null;
			n.next = node;
		}
	}

	/**
	 * @purpose : This method is used to get last element at last in a list
	 * @return : T
	 **/

	@SuppressWarnings({ "unchecked", "hiding" })
	public <T> T getlast() {
		@SuppressWarnings("rawtypes")
		Node temp = head;
		while (temp.next == null) {
			temp = temp.next;
		}
		System.out.println(temp.data + "Returning");
		return (T) temp.data;
	}

	/**
	 * @purpose : This method is used to check element in a list
	 * @return : boolean
	 **/

	public boolean isEmpty() {
		if (head == null) {
			return true;

		}
		return false;
	}

	/**
	 * @purpose : This method is used to add element(STACK) in a list
	 * @return : T
	 **/

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T push(T new_data) {
		Node new_node = new Node();

		new_node.next = head;
		head = new_node;
		// System.out.println("push:"+new_node.data);

		return new_data;
	}

	/**
	 * @purpose : This method is used to element element at last in a list
	 * @return : T
	 **/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T last(T data) {
		Node new_node = new Node();
		new_node.data = data;

		if (head == null) {
			head = new_node;
			// System.out.printf("%4d",new_node.data);
			// System.out.println(""+head.data);
			return null;
		} else {
			new_node.next = null;
			Node last = head;
			// System.out.printf("%4 ",new_node.data);
			// System.out.println(""+new_node.data);
			while (last.next != null) {
				last = last.next;
			}
			// System.out.printf("%4d",new_node.data);
			last.next = new_node;
		}
		return data;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void remove(String key) {
		if (isEmpty()) {
			System.out.println("can not delete empty list");
		} else {
			Node p, q;
			p = head;
			q = head;
			int count = 1;
			while (((String) p.data).compareTo(key) != 0) {
				p = p.next;
				count++;
				if (p.next == null) {
					break;
				}
			}

			if (((String) p.data).compareTo(key) == 0) {
				System.out.println("Element found at node " + count);
				if (count == 1) {
					head = p.next;
					p.next = null;
					System.out.println("Element deleted: " + p.data);
					count--;
				} else {
					while (q.next != p) {
						q = q.next;
					}
					q.next = p.next;
					p.next = null;
					System.out.println("\nElement deleted: " + p.data);
					count--;
				}
			}
		}
	}
}
