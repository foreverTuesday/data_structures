class Queue<O>{
   Node<O>front;
   Node<O>back;
   int size;
   
   Queue(){
      front = null;
      back = null;
      size = 0;
   }
   
   public void enqueue(O element){
      Node<O> n = new Node<O>(element);
      if(size == 0){
         front = n;
         back = n;
      }
      else{
         back.setNext(n);
         back = n;
      }
      size++;
   }
   
   public O dequeue(){
      if(size==0){
         return null;
      }
      if(size==1){
         back=null;
      }
      O frontElement = front.getElement();
      front = front.getNext();
      size--;
      return frontElement;
      
      /*  Node<O> n =	front;
      O e =	n.getElement();
      front	= n.getNext();
      size--;
      return e;  */
   }


}