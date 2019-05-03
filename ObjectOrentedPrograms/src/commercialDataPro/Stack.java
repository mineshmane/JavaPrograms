package commercialDataPro;

public class Stack<T> {

	@SuppressWarnings("rawtypes")
	StackList ls = new StackList();
	@SuppressWarnings("rawtypes")
	Node head;
	static int top;
	static Object[] arr;
	public static int size;

	public Stack(int n) {
		top = -1;
		size = n;
		arr = new String[n];

	}

	boolean isEmpty() {
		return (top < 0);
	}

	@SuppressWarnings("hiding")
	public class Node<T> {
		T data;
		T next;

		Node(T new_data) {
			data = new_data;
			next = null;
		}
	}
//		public void print()
//		{
//			Node<T> temp=head;
//			
//			System.out.println("linkedlist:");
//			while(temp!=null)
//			{
//				
//				System.out.println(temp.data);
//				temp=temp.next;	
//				
//			}
//			
//			
//		}

	@SuppressWarnings("unchecked")
	public boolean push(T new_data) {
		// Node new_node=new Node(new_data);
		if (top > size) {
			System.out.println("stack overflow");
			return false;
		}

		else {

			arr[++top] = ls.push(new_data);
			// new_node.next=arr[top];

			// System.out.println("push to stack:"+arr[top]);
			return true;
		}

		// head=new_node;

	}

	@SuppressWarnings({ "rawtypes", "unused", "hiding" })
	public <T> Object pop() {
		Node temp = head;
		Object s;
		if (top < 0) {
			System.out.println("stack underflow");
			return null;
		} else {
			s = arr[top--];
			System.out.print(" " + s);
			return s;
		}
		// return null;

		// return null;

	}

}
