
public class ArrayQueue<T> {
	
	private final static int DEFAULT_CAPACITY = 5;
	
	private int front;
	private int back;
	private int size;
	private T[] queue;
	
	public ArrayQueue(){
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue(int i){
		front = back = size = 0;
		queue = (T[])(new Object[i]);
	}
	
	public void enqueue(T t){
		if(size == queue.length){
			System.out.println("No more room!");
		}
		else{
			queue[back]=t;
			back = (back+1)%queue.length;
			size++;  //adding an element to the queue needs to increment size
		}
	}
	
	public T dequeue(){
		if(!isEmpty()){       //if isEmpty() returns false
			T t = queue[front]; //needs to be before we increment front or wrong thing is returned
			queue[front]=null; //dequeue should remove element from the queue
			front = (front+1)%queue.length;
			// T t = queue[front];
			size--;
			return(t);
		}
		return(null);
	}
	
	public boolean isEmpty(){
		if(size()==0){
			return true;
		}
		return false;
	}
	
	public int size(){
		return size; //size is the actual size, no need to add 1
	}
	
	public String toString(){
		String s = "Queue: ";
		for(int i=0;i<size;i++){
			s += queue[(i+front)%queue.length].toString()+ " ";
		}
		return s + " front = "+ front + "  back = "+ back + "  size = "+ size;
	}
	

}
