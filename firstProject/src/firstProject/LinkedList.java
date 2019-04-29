package firstProject;



public class LinkedList {

	Node head;
	int size;
	public class Node {

		int data;
		Node nextNode;
		
		
	}

	public void add(int data) {

		Node node = new Node();
		node.data = data;
		node.nextNode = null;

		if (head == null) {
			node.nextNode=head;
			head = node;

		} else {
			Node temp = head;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = node;
			
			
		}
		size++;
	}
	
	public void display() {
		if(head==null) {
			return ;
		}
		Node temp=head;
		while(temp.nextNode!=null) {
			System.out.println(temp.data);
			temp=temp.nextNode;
		}
		System.out.println(temp.data);
	}
	public void size() {
		System.out.println(" size of list "+size);
	}
	public void delete(int ele) {
		try
		{
		Node currentNode=this.head;
		while(currentNode!=null)
		{
			if(currentNode==this.head && this.head.data==ele)
			{
				this.head=currentNode.nextNode;
				break;
			}
			else if(currentNode.nextNode.data==ele)
			{
				currentNode.nextNode=currentNode.nextNode.nextNode;
				return;
			}
			else
				{
				currentNode=currentNode.nextNode;
				return;
				}
		}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void remove(int el) {
		// Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == el) 
        { 
            head = temp.nextNode; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.data != el) 
        { 
            prev = temp; 
            temp = temp.nextNode; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.nextNode = temp.nextNode; 
	}
	
	
	public void deleteByKey(int key) {
		Node temp = head;
		Node tempStore = head;

		if (head == null) {
			return;
		}
		if (temp != null && temp.data == key) {
			System.out.println("element is at first position");
			head = temp.nextNode; // Changed head
			return;
		}
		while (temp.nextNode != null) {

			if (temp.data == key) {
				System.out.println("key is found and deleted ");
				tempStore.nextNode = temp.nextNode.nextNode;

				temp.nextNode = tempStore;
			}
			tempStore = temp;
			temp = temp.nextNode;
		}
		if (temp.nextNode == null) {
			if (temp.data == key)

			{
				System.out.println("element is at last posiotn ");
				tempStore.nextNode = null;
			}
		}
	}
	public void deleteA(int ele)

	{
		Node newNode = head;
		Node node = head;
		size--;
		if (newNode.data == ele) // checking head element with user search element to delete
		{
			head = head.nextNode; // changing reference value
		}
		while (newNode != null) {
			if (newNode.data == ele) // checking for the element in list
			{
				node.nextNode = newNode.nextNode; // changing reference value
			}else {
				
			}
			node = newNode;
			newNode = newNode.nextNode;
		}System.out.println("not found");
	}
	
}
