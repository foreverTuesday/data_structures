   import java.util.ArrayList; 
   
   class ArrayStack<E> extends ArrayList<E> implements StackADT<E> {
   
  
   	/**
	 * Eclipse complains unless this line is here; for more information Google the error
	 * "The serializable class  does not declare a static final serialVersionUID field of type long"
	 */
	private static final long serialVersionUID = -6345729456702295465L;

	ArrayStack(){
         super();
      }
      
  
      public void push(E element){
            add(element);       
      }
   
      public E pop() {
         if(isEmpty()){ return null; }
         return(remove(size()-1)); 
      }
   
      public E peek() {
         if(isEmpty()){ return null; }
         return(get(size()-1)); 
       
      }
   	
   
   }