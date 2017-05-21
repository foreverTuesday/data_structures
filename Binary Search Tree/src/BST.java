
public class BST<E extends Comparable<E>> {

   BSTNode<E> root;
	
   void setRoot(BSTNode<E> n){
	   root = n;
   }//setRoot

   BST(E e){
      root = new BSTNode<E>(e);
   }
	
   void insert(E e){
      BSTNode<E> node = new BSTNode<E>(e);
      if(root == null){
         root = node;
      }//if
      else{
         insert(node, root);
      }//else
   }//insert
	
   void insert(BSTNode<E> newNode, BSTNode<E> check){
      if(check.getElement().compareTo(newNode.getElement())>0){
         if(check.getLeftChild()==null){
            check.setLeftChild(newNode);
            newNode.setParent(check);
         }//if child null
         else{
            insert(newNode, check.getLeftChild());
         }//if child not null
      	//go left
      }//if
      else if(check.getElement().compareTo(newNode.getElement())<0){
         if(check.getRightChild()==null){
            check.setRightChild(newNode);
            newNode.setParent(check);
         }//if child null
         else{
            insert(newNode, check.getRightChild());
         }//if child not null
      	//go right
      }//else if
      else{
      	//do nothing
      }//else
   }//insert
	
   void printInOrder(){
      printInOrder(root);
   }
   
   
   void printInOrder(BSTNode<E> n){
      if(n!=null){
         printInOrder(n.getLeftChild());
         System.out.println(n);
         printInOrder(n.getRightChild());
      }//if
   }//print

   
}
