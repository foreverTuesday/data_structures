/**

CS 232: Data Structures
Homework 03: Troubleshooting code

**/

class SLinkedList<E>{
 //attributes
 // head: the first Node<E> in the list (all others dangle off of the head)
 // tail: the last Node<E> in the list (if the list has 0 or 1 elements, head and tail are the same
 // the size, number of linked nodes,  of the list (for convenience)
   SLLNode<E> head; 
   SLLNode<E> tail; 
   int size; 

/**********  Methods ******************/

   /** 
   Constructor for an empty list
   **/ 
   SLinkedList(){
      head = null;
      tail = null; 
      size =0;
   }
   
   /**
   Constructor for a list that contains a node
   **/
   SLinkedList(E e){
      SLLNode<E> n = new SLLNode<E>(e); 
      head = n; 
      tail =n; 
      size = 1; 
   }

   	
   public void addFirst(E e){ // works even if list is empty
      SLLNode<E> n = new SLLNode<E>(e);
      n.setNext(head); 
      head = n; 
      if(tail==null){
         tail=n;
      }
      size++; 
   }

   /**
   Appends Node n to the end of the list
   **/
   public void addLast(E e){    
      SLLNode<E> n = new SLLNode<E>(e);
      if(tail != null){
      // list is not empty
      // old tail is linked to new Node<E>
      // tail is now the new (last) Node<E>
      // list is longer
         tail.setNext(n);
         tail = n; 
         size ++;
      }
      else{
      // list is empty so new node becomes the head and tail
         head = n; 
         tail = n; 
         size ++;
      }
   }
	
   /**
    Finds the nth element of the linked list (first is 0)
    returns the Node<E> 
    does not remove the Node<E> from the list
   **/
   public E get(int n){
      if(n>= size || n<0){
         System.out.println("That is not a valid location");
         return null;
      } 
      SLLNode<E> current = head;   
   	// precondition: the list has at least n linked Node<E>s
   	// current is set (pointing) to the head	     
   	// walk along the list n steps to get to the nth link
      for (int i=0;i<n ;i++)
         current = current.getNext();      		 
   	//postcondition: cur is at the nth node/ link
      return(current.getElement()); 
   }
	
   
   /**
   Removes Node<E> from the beginning the list (shrinks the list from the beginning)
   **/
   public E removeFirst( ){
      SLLNode<E> save = head; 
      if(head != null){
      // list is not empty
      // head has been saved, which will be returned
      // set head to the next link as the new head 
         head = head.getNext();  
         size --;
         if(size==0){
            head=null;
            tail=null;
         }
         return(save.getElement());
         
      }
      else{
         return null;
      }
   }
	
   /**
   removes Node<E> from the end of the list (shrinks the list from the end
   **/
   public E removeLast( ){  
      SLLNode<E> cur = head; 
      if(cur==null){
         return null;
      }
      else if (size==1){
         head=null;
         tail=null;
         size--;
         return cur.getElement();
      }
      else{
      	// cur (current) is set (pointing) to the head	     
      	// walk along the list n steps to get to the end - 1 link
         for (int i=0;cur.getNext().getNext()!=null;i++)
            cur = cur.getNext();
      	//postcondition: cur is at the penultimate node/ link, save the tail (to be removed)
         SLLNode<E> save = tail;
         //reset the tail to the penultimate node and decr the size
         tail = cur; 
         tail.setNext(null);  
         size --; 
      	 // empty list, returns null head
         return(save.getElement());
      }
   }
   
   /**
   *remove nth element
   *
   */
   public E remove(int i){
      if(i>=size || i<0){
         System.out.println("That is not a valid location");
         return null;
      }
      if(i==0){
         return(removeFirst());
      }
      if(i==size-1){
         return(removeLast());
      }
      SLLNode<E> search = head.getNext();
      SLLNode<E>prev = head;
      int start = 1;
      while(start<i){
         prev = search;
         search = search.getNext();
         start++;
      }//while
      prev.setNext(search.getNext());
      return search.getElement();
   }
	
   
   /**
   Generates a string of the elements in all the nodes
   **/
   public String toString(){
      String temp=""; 
      SLLNode s = head;
      while (s!=null){
         temp+=s.toString()+"\n";
         s=s.getNext();
      }
      return temp; 
   } 

	
}
