
public class BST<E extends Comparable<E>> {
	
	BSTNode<E> root;
	
	BST(E e){
		root = new BSTNode<E>(e);
	}

   void setRoot(BSTNode<E> n){
      root = n;
   }
	
	void insert(E e){
		BSTNode<E>node = new BSTNode<E>(e);
		if(root == null){
			root = node;
		}
		else{
			insert(node,root);
		}
	}
   
   void printInOrder(){
      printInOrder(root);
   }
   
   void printInOrder(BSTNode<E> n){
      if(n!=null){
         printInOrder(n.getLeft());
         System.out.println(n);
         printInOrder(n.getRight());
      }
   }
	
	void insert (BSTNode<E> newNode, BSTNode<E> check){
		if(check.getElement().compareTo(newNode.getElement())>0){
			//go left
			if(check.getLeft()==null){
				check.setLeft(newNode);
				newNode.setParent(check);
			}
			else{
				insert(newNode,check.getLeft());
			}
		}else if(check.getElement().compareTo(newNode.getElement())<0){
			//go right
			if(check.getRight()==null){
				check.setRight(newNode);
				newNode.setParent(check);
			}else{
				insert(newNode,check.getRight());
			}
		}
		else{//they are the same
			//do nothing
		}
	}
	

}
