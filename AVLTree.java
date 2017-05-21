import java.lang.Math;

public class AVLTree <E extends Comparable<E>> extends BST<E> {

	public AVLTree(E e){
		super(e);
	}
	
	void insert(E e){
		  BSTNode<E> node = new BSTNode<E>(e);
	      if(root == null){
	         root = node;
	      }//if
	      else{
	         insert(node, root);
	      }//else	
	      //check the balance of the tree, starting from the new node
	      checkBalance(node);
	}
	
	public void checkBalance(BSTNode<E> node){
		if(node != null){
			System.out.println("Balance of "+node+" is "+getBalance(node));
			if(getBalance(node)<=-2){
				balanceLeft(node);
			}//if
			if(getBalance(node)>=2){
				balanceRight(node);
			}//if
			checkBalance(node.getParent());
			
		}//if
	}//checkBalance
	
	public void balanceLeft(BSTNode<E> b){
		 rotateRight(b);
	}//balance left
	
	public void balanceRight(BSTNode<E> b){
		 rotateLeft(b);
	}//balance left
	
	public void rotateRight(BSTNode<E> b){
		BSTNode<E> bParent = b.getParent();
		BSTNode<E> x = b.getRightChild();
		
		if(bParent != null){
			if(b == bParent.getLeftChild()){
				bParent.setLeftChild(x);
			}//if
			else if(b == bParent.getRightChild()){
				bParent.setRightChild(x);
			}//else if
		}//if bParent not null
		else{
			this.setRoot(x);
		}// b is root
		x.setParent(bParent);
		
		b.setParent(x);
		BSTNode<E> a = x.getLeftChild();
		b.setRightChild(a);
		if(a != null){
			a.setParent(b);
		}// if a not null
		x.setLeftChild(b);
	}//rotateRight
	
	
	public void rotateLeft(BSTNode<E> b){
		BSTNode<E> bParent = b.getParent();
		BSTNode<E> x = b.getLeftChild();
		
		if(bParent != null){
			if(b == bParent.getLeftChild()){
				bParent.setLeftChild(x);
			}//if
			else if(b == bParent.getRightChild()){
				bParent.setRightChild(x);
			}//else if
		}//if bParent not null
		else{
			this.setRoot(x);
		}// b is root
		x.setParent(bParent);
		
		b.setParent(x);
		BSTNode<E> a = x.getRightChild();
		b.setLeftChild(a);
		if(a != null){
			a.setParent(b);
		}// if a not null
		x.setRightChild(b);
		
	}
	
	public int getBalance(BSTNode<E> node){
		//height of the left subtree - right subtree
		return height(node.getLeftChild())-height(node.getRightChild());
	}//getBalance
	
	public int height(BSTNode<E> node){
		if(node == null){
			return 0;
		}//if
		return(1+Math.max(height(node.getLeftChild()),height(node.getRightChild())));

	}
	
	
}
