import java.io.Serializable;
import java.util.*;
   
class BinaryTree<E extends Comparable<E> >{
      //instance variable
   BSTNode<E> root;  
      
      //constructor
   BinaryTree(){
      root=null;
   }
      
   BinaryTree(E e){
      setRoot(e);
   }
      
      //getters
   BSTNode<E> getRoot(){
      return root;
   }
      
      //setters
   void setRoot(E e){
      root = new BSTNode<E>(e);
   }
          
   void insert(E e){
      if(root==null){ 
         setRoot(e);
      } 
      else {
         insert(e, root); //call the recursive version of insert
      }
   }
     
   void insert(E e, BSTNode<E> v){
      E ve = v.getElement();
      if (e.compareTo(ve) > 0){//if the new element is bigger than the comparison node
         //check to see if there is a right child
         if (v.hasRight()){
            //if it does, recursively call insert on the right node
            insert (e, v.getRight());
         }
         else{
            //if it doesn't, make the element the new right child of the v node
            BSTNode<E> n = new BSTNode<E>(e);
            n.setParent(v);
            v.setRight(n);
         }
         
      }
      else if(e.compareTo(ve) < 0){//if the new element is less than the comparison node
         //check to see if there is a left child
         if(v.hasLeft()){
            //if it does, recursively call insert on the left side
            insert(e,v.getLeft());
         }
         else{
            //if it doesn't, make the element the new right child of the v node
            BSTNode<E> n = new BSTNode<E>(e);
            n.setParent(v);
            v.setLeft(n);
         }
      }
      else{
         //do nothing; the elements are the same and this tree doesn't allow repeat entries
      }
    
   }
    
   void printInOrder(){
      if(root!=null){
         printInOrder(root);
      }
   }
    
   void printInOrder(BSTNode<E> n){
      if(n!=null){
         printInOrder(n.getLeft());
         System.out.println(n);
         printInOrder(n.getRight());
      }
        
   }
    
   void printTraversal(){
      ArrayList<BSTNode> al = new ArrayList<BSTNode>();
      
   //    Create a Queue (or an ArrayList, but use it like a queue)
      al.add(root);
         //System.out.println(root);
   
         
      while(!al.isEmpty() && root!=null){
         if((al.get(0)).getLeft()!=null){
            al.add((al.get(0)).getLeft());
         }//if
         if((al.get(0)).getRight()!=null){
            al.add((al.get(0)).getRight());
         }//if
      
         System.out.print(al.remove(0));
         
      }//while 
   }
    
     

    
   BSTNode<E> search (E e){
      if(root==null){
         return null;
      }
      return search(e,root);
   }
    
   BSTNode<E> search(E e, BSTNode<E> b){
      
     // System.out.println("YAY!!!!!!!");
      E be = b.getElement();
      if (e.compareTo(be) == 0){
         return b;
      }//if equal
      
      
      if (e.compareTo(be) > 0){  //if the search is bigger than the comparison node
         if (b.hasRight()){
            return(search(e, b.getRight()));
         }//if
      
      }//if bigger   
      
      else if (e.compareTo(be) < 0){  //if the search is smaller than the comparison node
         if (b.hasLeft()){
            return(search(e, b.getLeft()));
         }//else if
      
      }//if bigger   
    //your code goes here!
      return null;
      
      
   }//search
    
   void remove(E e){
      System.out.println("");
      BSTNode<E> in = search(e);
      BSTNode<E> child = null;
      if(in==null){
         return;
      }
      
      if(in.hasRight()==true){
         child = in.getRight();
      }
      if(in.hasLeft()==true){
         child = in.getLeft();
      }
      
      if(in.hasParent()==true){
         BSTNode<E> parent = in.getParent();
         if(parent.getRight() == in){   //if it's the right child
            parent.setRight(child);
         }
         else if(parent.getLeft() == in){   //if it's the left child
            parent.setLeft(child);
         }
         
         if(child!=null){
            child.setParent(parent);
         }
      }
      
      else{ //if it's the root
         if(child!=null){
           root = child;
           child.setParent(null);

         }
         else{ //if it was the only element in the tree
            root = null;
         }
      }
    //your code goes here!
   }
      
   	   
} // BinaryTree