
public class QueueUsingArrays2 {
	static final int MAX_SIZE = 30;
	int arr[];
	int rear;
	
	QueueUsingArrays2(){
		arr = new int[MAX_SIZE];
		rear = -1;
	}
	
	public void enqueue(int val) { //o(1)
		if(rear == MAX_SIZE -1)
			throw new IndexOutOfBoundsException("Queue is Full");
	
		arr[++rear] = val;
		 
	}
	
	public int dequeue() { //o(n)
		if(rear==-1)
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp = arr[0];
		
		for(int i=1;i<=rear;i++)
		  arr[i-1]=	arr[i];
		
		rear--;
		return temp;
	}
	
}
