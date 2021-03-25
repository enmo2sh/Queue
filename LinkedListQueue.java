package eg.edu.alexu.csd.datastructure.queue.cs20_cs32_cs66;
 
public class LinkedListQueue implements ILinkedBased{
 
	public Node head;
 
	public class Node {
		public Object value;
		public Node next;
	}
 
	public void enqueue(Object item) {
		Node current=head;
		Node n = new Node();
		n.value=item;
		n.next=null;
		if(head==null) {
			head=n;
			return;
		}
		while(current.next!=null)
			current=current.next;
		current.next=n;
		return;
 
	}
 
	public Object dequeue() {
		if (size()==0)
			throw new ArithmeticException("the queue is empty");
		Object item=head.value;
		head=head.next;
		return item;
 
	}
 
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
 
	public int size() {
		Node c = head;
		int count = 0;
		while (c != null) {
			count++;
			c = c.next;
		}
		return count;
	}
 
}
