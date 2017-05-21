import java.lang.Math;

public class AVLTree<E extends Comparable<E>> extends BST<E>{
	
   public AVLTree(E e) {
      super(e);
   }

   public void insert(E e){
      BSTNode<E>node = new BSTNode<E>(e);
      if(root == null){
         root = node;
      }
      else{
         insert(node,root);
      }
   	//check the balance of the tree, starting from the new node
      checkBalance(node);
   }
	
   public void checkBalance(BSTNode<E> node){
      if(node !=null){
         System.out.println("balance of " + node+ " is " + getBalance(node) );
         if(getBalance(node)<=-2){  //heavy to the right
            if(getBalance(node.getRight())==1){
               balanceRight(node.getRight());
            }
            balanceLeft(node);
         }
         if(getBalance(node)>=2){   //heavy to the left
            if(getBalance(node.getLeft())==-1){
               balanceLeft(node.getLeft());
            }
            balanceRight(node);
         }
      
         
         checkBalance(node.getParent());
      }
   }
	
   public void balanceLeft(BSTNode<E> b){
   	/*if the tree looks like this:
   	 *        b
   	 *         \
   	 *          x
   	 *           \
   	 *            y
   	 */
       //x's new parent is b's current parent
       //b's current parent adopts x
       
      rotateLeft(b);
   }
   
   public void balanceRight(BSTNode<E> b){
      rotateRight(b);
   }

   
   
   
   public void rotateLeft(BSTNode<E> b){
      BSTNode<E> bParent = b.getParent();
      BSTNode<E> x = b.getRight();
      if(bParent != null){
         if(b == bParent.getLeft()){
            bParent.setLeft(b.getRight());
         }
         else if (b == bParent.getRight()){
            bParent.setRight(b.getRight());
         }
      }
      else{
         this.setRoot(x);
      }
      b.getRight().setParent(bParent);
   	//b's parent becomes x
      b.setParent(x);
      //deal with children
      BSTNode<E> a = x.getLeft();
      b.setRight(a);
      if(a!=null){a.setParent(b);}
      x.setLeft(b);
   }
   
   public void rotateRight(BSTNode<E> b){
      BSTNode<E> bParent = b.getParent();
      BSTNode<E> x = b.getLeft();
      if(bParent != null){
         if(b == bParent.getLeft()){
           // bParent.setLeft(b.getRight()); 
            bParent.setLeft(b.getLeft()); 
         }
         else if (b == bParent.getRight()){
          //  bParent.setRight(b.getRight());
            bParent.setRight(b.getLeft());
         }
      }
      else{
         this.setRoot(x);
      }
      b.getLeft().setParent(bParent);
   	//b's parent becomes x
      b.setParent(x);
      //deal with children
      BSTNode<E> a = x.getRight();
      b.setLeft(a);
      if(a!=null){a.setParent(b);}
      x.setRight(b);
   }
	
   public int getBalance(BSTNode<E> node){
   	//height of left subtree - height of right subtree
      return (height(node.getLeft())-height(node.getRight()));
   }
	
   public int height(BSTNode<E> node){
      if(node == null){
         return 0;}
      return(1+Math.max(height(node.getLeft()),height(node.getRight())));
   }
	

}
