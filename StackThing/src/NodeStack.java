
public class NodeStack<T> implements StackADT<T>{

   Node<T> top;
   int size;
	
   NodeStack(){
      top = null;
      size = 0;
   }
	
   public void push(T element){
      if(size==0){
         top = new Node<T>(element);
      }
      else{
      	//Node <T> next = top;
         Node <T> newNode = new Node<T>(element);
         newNode.setNext(top);
         top = newNode;
      }
      size++;
   }

   @Override
   public T pop() {
      if(size>0){
         T old = top.getElement();
         top = top.getNext();
         size--;
         return old;
      }
      else{
         return null;
      }
   }

   @Override
   public T peek() {
      return top.getElement();
   }

   @Override
   public boolean isEmpty() {
      if(size==0){
         return true;
      }
      else{
         return false;
      }
   }

   @Override
   public int size() {
      return size;
   }
	
}
