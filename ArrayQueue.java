package eg.edu.alexu.csd.datastructure.queue.cs20_cs32_cs66;
 
public class ArrayQueue implements IArrayBased  {
 
	int n=0;
	Object A[];
 
	public ArrayQueue (int m) {
		this.n=m;
	    A=new Object[n];
	}
 
	int front=-1;
	int rear=-1;
 
	public void enqueue(Object item) {
		if (rear==n-1)
			throw new ArithmeticException("the queue is full");
		else if (isEmpty()) {
			front=0;
			rear=0;
		}
		else {
			rear=rear+1;
		}
		A[rear]=item;
	}
 
	public Object dequeue() {
		if(isEmpty())
			throw new ArithmeticException("the queue is empty");
		Object item;
		//only one element
		 if(front==rear) {
			item=A[rear];
			front=-1;
			rear=-1;
		}
		else {
			item=A[front];
			front=front+1;	
		}
 
		return item;
	}
 
	public boolean isEmpty() {
		if ((front==-1)&&(rear==-1))
			return true;
		else
		return false;
	}
 
	public int size() {
		int s;
		if(isEmpty())
			s=0;
		else
			s=rear-front+1;
		return s;
	}
 
}