/*
 * List Implementation using Array - generic
 * 
 */
import java.util.*;
class DynamicArray<T> implements Iterable<T>{ //variables - methods
	private static final int initialCapacity = 16;
    private T arr[];
	private int size;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	DynamicArray(){
		size = 0;
		arr = (T[]) new Object[initialCapacity];
		capacity = initialCapacity;
	}
	
	public void add(T val) {
		if(size==capacity) 
			expandArray();
		arr[size++] = val;
			
	}
	
	private void expandArray() {
		capacity *= 2;
		arr = java.util.Arrays.copyOf(arr,capacity);
	}
		
	public void display() {
		System.out.println("Elements in the list: ");
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
	}
	
	public void insertAtPos(int pos,T val) {
	if(size==capacity)
		expandArray();
	for(int i=size-1;i>=pos;i--)
		arr[i+1] = arr[i];	
	arr[pos] = val;
	size++;
	}
	
	public void deleteAtPos(int pos) {
		
		for(int i=pos+1;i<size;i++)
			arr[i-1] = arr[i];
		
		size--;
		
		if(capacity > initialCapacity && capacity > 3*size)
	    	shrinkArray();
	}
	
	private void shrinkArray() {
		capacity /= 2;
		arr =java.util.Arrays.copyOf(arr, capacity);	
	}
	
	public int length() {
		return size;
	}
	
	
	public Iterator<T> iterator(){
		return new Iterator<T>(){
			
			int index = 0;
			
			public T next() {
				return arr[index++];
			}
			
			public boolean hasNext() {
				return index < size;
			}
		};
	}
	
}



public class DynamicArrayDemo 	{

	public static void main(String[] args) {
		int val,pos;
		DynamicArray<Integer> list = new DynamicArray<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n -------- List Menu -----------\n");
	        System.out.println("1.Insert at End\n");
	        System.out.println("2.Display the list\n");
	        System.out.println("3.Insert at specified position \n");
	        System.out.println("4.Delete from specified position\n");
	        System.out.println("5.Exit\n");
	        System.out.println("\n--------------------------------------\n");
	        System.out.println("Enter your choice:\t");
	        int choice = scanner.nextInt();
	        switch(choice) {
	        case 1: System.out.print("Enter the data: ");
	                val = scanner.nextInt();
	                list.add(val);
	                break;
	        case 2: list.display();
	        		
	                break;
	        case 3: System.out.println("Enter the pos(starts at 0): ");
                    pos = scanner.nextInt();
                    if(pos<0){
	                    System.out.println("Invalid position");
	                    break;
	                }
                    System.out.print("Enter the data: ");
	                val = scanner.nextInt();
	                list.insertAtPos(pos,val);
	                break;
	        case 4: System.out.println("Enter the pos(starts at 0): ");
                    pos = scanner.nextInt();
                    if(pos<0){
	                    System.out.println("Invalid position");
	                    break;
	                }
                    list.deleteAtPos(pos);
                    break;
	        case 5: System.exit(0);
	        
	        default: System.out.println("Invalid Choice ");
	                
	        
	        }   
	       
		}
		 
		
	}

}
/* Exercise
 * 
 * delete at end
 * delete from beginning
 * insert at beginning
 * get(index)  get(2)
 * update(index,val)  update(3,5)  arr[index] = val;
 * search(val) -> return index
 * clear
 * contains(val)
 */
		
		
		
