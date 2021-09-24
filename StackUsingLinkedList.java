
public class StackUsingLinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T val){
			data = val;
			next = null;
		}
	}
	
	Node top;
	StackUsingLinkedList(){
		top = null;
	}
	
	public void push(T val) {
		Node newNode = new Node(val);
		newNode.next = top;
		top = newNode;
	}
	
	public T pop() {
		if(top==null)
			throw new IndexOutOfBoundsException("Stack is Empty");
		
		T tmp = top.data;
		top = top.next;
		return tmp;
		
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public T peek() {
		return top.data;
	}
	
}
