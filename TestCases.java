package eg.edu.alexu.csd.datastructure.queue.cs20_cs32_cs66;
 
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;
 
class TestCases {
 
	@Test
	void test() {
		ArrayQueue test1 = new ArrayQueue(5);
		LinkedListQueue test2 = new LinkedListQueue();
		test1.enqueue(0);	test2.enqueue(0);
		test1.enqueue(1);	test2.enqueue(1);
		test1.enqueue(2);	test2.enqueue(2);
		test1.enqueue(3);	test2.enqueue(3);
 
		Object out1,out2;
 
		out1 = test1.dequeue();
		out2 = test2.dequeue();
		assertEquals(0,out1);
		assertEquals(0,out2);
		out1 = test1.size();
		out2 = test2.size();
		assertEquals(3,out1);
		assertEquals(3,out2);
		test2.head=null;
		out1 = test1.isEmpty();
		out2 = test2.isEmpty();
		assertEquals(false,out1);
		assertEquals(true,out2);
 
	}
 
}
