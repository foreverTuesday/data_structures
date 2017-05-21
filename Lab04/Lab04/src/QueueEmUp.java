
public class QueueEmUp {
	
	public static void main(String[]args){
		ArrayQueue<String> aq = new ArrayQueue<String>(5);
		System.out.println(aq.toString());
		aq.enqueue("First");
		System.out.println(aq.toString());
		aq.enqueue("Second");
		System.out.println(aq.toString());
		aq.enqueue("Third");
		System.out.println(aq.toString());
		aq.enqueue("Fourth");
		System.out.println(aq.toString());
		aq.enqueue("Fifth");
		System.out.println(aq.toString());
		aq.enqueue("Sixth");
		System.out.println(aq.toString());
		aq.dequeue();
		System.out.println(aq.toString());
		aq.enqueue("Seventh");
		aq.dequeue();
		System.out.println(aq.toString());
		aq.dequeue();
		System.out.println(aq.toString());
		aq.dequeue();
		aq.enqueue("Eighth");
		System.out.println(aq.toString());
		aq.dequeue();
		System.out.println(aq.toString());
		aq.dequeue();
		System.out.println(aq.toString());
		aq.dequeue();
		System.out.println(aq.toString());
		
	}

}
