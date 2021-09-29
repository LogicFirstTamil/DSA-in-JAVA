
public class QueueUsingLL {
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	
	Node front,rear; 
	
	QueueUsingLL(){
		front = null;
		rear = null;
	}
	public void enqueue(int val) { //O(1)
		Node newNode = new Node(val);
		if(front==null)
			front = newNode;
		else
			rear.next = newNode	;
		rear = newNode;
		
	}
	
	public int dequeue() {
		if(front==null) //no node in Q
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp = front.data;
		front = front.next;
		if(front==null) //deleted last node and now Q is empty
			rear=null;
		return temp;
		
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public int elementAtFront() {
		if(front==null) //no node in Q
			throw new IndexOutOfBoundsException("Queue is Empty");
		return front.data;
	}
	
	
}
