package DSUtility;


public class LinkedList<T> {

	@SuppressWarnings("rawtypes")

	public Node head; // Declaring head node
	int counter=0;

	@SuppressWarnings("hiding")
	public class Node<T> {
		T data;
		public Node<T> next;
	}
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void list() {
		LinkedList list= new LinkedList();
	}

	/**
	 * @param T : It takes generic data type as command line argument
	 * @purpose : This method is used to add String data to a linked list
	 * @return : void
	 **/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void add(T data) {

		Node node = new Node(); // creating nodes
		node.data = data;// adding data
		counter++;
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
	 * @purpose : This method is used to display the data which is in linked list
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
	 * @purpose : This method is used to display the data which is in linked list
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

		while (newNode!= null)// next reference value
		{
			if (newNode.data.equals(word)) // comparing data with user search value
			{
				return true;
			}

			newNode = newNode.next;
		}

		return false;

	}

	/**
	 * @param T : It takes generic data type as command line argument
	 * @purpose : This method is used to delete a specific element at any position
	 *          in a linked list
	 * @return : void
	 **/

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void delete(T ele)

	{
		Node newNode = head;
		Node n1 = head;
		counter--;
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
	 * @purpose : This method is used to add element at first position of linked
	 *          list
	 * @return : void
	 **/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insertAtFirst(T data) {
		Node node = new Node(); // creating object
		node.data = data; // adding data to first node
		node.next = head;
		head = node;
		counter++;

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

	@SuppressWarnings({ "unchecked", "rawtypes", "hiding" })
	public <T> T deletefirst(	T item) {
	
		Node n = head;
		head = n.next;
		item = (T) n.data;
		System.out.println(" dleleted");
		counter--;
		return item;
	}

	/**
	 * @purpose : This method is used to delete element at last in a list to T
	 * @return : T
	 **/

	@SuppressWarnings({ "hiding", "rawtypes", "unchecked" })
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
			counter--;
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
		node.next = null;
		counter++;
		if (head == null) {
			head = node;

		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}

			n.next = node;
		}
	}

	/**
	 * @purpose : This method is used to add element at given position in a list
	 * @return : T
	 **/

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insertAtPosition(int position, T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		counter++;
		if (head == null) {
			// if head is null and position is zero then exit.
			if (position != 0) {
				return;
			}

		}
		if (head != null && position == 0) {
			node.next = head;
			head = node;
			return;
		}

		else {
			Node current = head;
			Node prev = head;
			int i = 0;
			while (i < position) {
				prev = current;
				current = current.next;
				if (current == null) {
					break;
				}
				i++;
			}
			node.next = current;
			prev.next = node;

		}
	}

	/**
	 * @purpose : This method is used to insert element at middle in a list
	 * @return : T
	 **/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insertAtMiddle( T data) {
		Node newNode=new Node();
		newNode.data=data;
		counter++;
		 // if list is empty 
        if (head == null) 
        head = newNode;
  
        else { 
            // get a new node 
            //Node newNode = New Node(); 
  
            // assign values to the slow  
            // and fast pointers 
            Node slow = head; 
            Node fast = head.next; 
  
            while (fast != null && fast.next!= null)  
            { 
                // move slow pointer to next node 
                slow = slow.next; 
  
                // move fast pointer two nodes  
                // at a time 
                fast = fast.next.next; 
            } 
  
            // insert the 'newNode' and adjust  
            // the required links 
            newNode.next = slow.next; 
            slow.next = newNode; 
        } 
		
	
	}

	/**
	 * @purpose : This method is used to get last element at last in a list
	 * @return : T
	 **/

	@SuppressWarnings({ "unchecked", "hiding" })
	public  T getlast() {
		@SuppressWarnings("rawtypes")
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println(temp.data + " last element of linkedlist");
		return (T) temp.data;
	}

	/**
	 * @purpose : This method is used to list is empty or Not
	 * @return : boolean
	 **/

	public boolean isEmpty() {
		if (head == null) {
			return true;

		}
		return false;
	}
	
	
	/**
	 * @purpose : This method is used to list size 
	 * @return : integer
	 **/

	public int getSize() {
	System.out.println("size of list "+counter);
		return counter;
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T last(T data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		if (head == null) {
			head = new_node;
			// System.out.printf("%4d",new_node.data);
			// System.out.println(""+head.data);
			return null;
		} else {

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
