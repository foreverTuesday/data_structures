/**
A node for a singly linked list
**/

   class SLLNode<E>{
   	
   /** attributes
    1) E element: the value stored in this Node
    2)Node<E> next: the (address) of the next Node in the list
      when constructed, there is no next Node; it will have to be set
   **/
      private E element;   
      private SLLNode<E> next; 
    
   /***********Methods *********************/
     
     /**
     Constructs the node: contents are x, next set to null
     **/
      SLLNode(E x){   
         next = null; 
         element = x;
      } 
         
      /**
      Returns the value stored in the Node
      **/
      E getElement(){ 
         return(element);
      }
   		
      /**
      Returns the next Node
      **/
      SLLNode<E> getNext(){
         return(next);}
   		
      /**
      Sets (connects to) the next node
      **/
      void setNext(SLLNode<E> n){
         next = n;
      }
      
      /**
      Sets the content stored in the Node
      **/
      void setElement(E x){
         element = x;
      } 
   	 
      /**
      Returns a string containing the contents of the Node
      **/
      public String toString(){
         return element.toString(); 
      }
   } 


