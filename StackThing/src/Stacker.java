
public class Stacker {

   public static void main(String[] args) {
   	// TODO Auto-generated method stub
   	
  /*     ArrayStack<Integer> as = new ArrayStack<Integer>(3);
      as.push(5);
      as.push(8);
      as.push(10);
      as.push(42);
   
      NodeStack<String> ns = new NodeStack<String>();
      ns.push("Hi");
      ns.push("hello");
     // ns.push("yo");
     // ns.push("hola");
      //ns.push("ahoy");
    //  ns.push("greetings");
   	
   //  String i = ns.peek();
   //   System.out.println(i);
    
     String b = ns.pop();
      System.out.println(b);
      b = ns.pop();
      System.out.println(b);
      b = ns.pop();
      System.out.println(b);   */
   
   Queue list = new Queue();
   list.enqueue("first");
   list.enqueue("second");
   list.enqueue("third");
   list.enqueue("fourth");
   list.enqueue("fifth");
   
   System.out.println(list.dequeue());
   System.out.println(list.dequeue());
    System.out.println(list.dequeue());
     System.out.println(list.dequeue());
      System.out.println(list.dequeue());
       System.out.println(list.dequeue());

   }

}
