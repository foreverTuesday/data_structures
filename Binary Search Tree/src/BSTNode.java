
public class BSTNode<E extends Comparable<E>> {

	E element;
	BSTNode<E> parent;
	BSTNode<E> lc;
	BSTNode<E> rc;
	
	
	BSTNode(E e){
		element=e;
		lc = null;
		rc = null;
		parent = null;
	}
	

//gets and sets	
	public void setElement(E e){
		element=e;
	}
	
	public void setParent(BSTNode<E>p){
		parent=p;
	}
	
	public void setLeftChild(BSTNode<E>l){
		lc = l;
	}
	
	public void setRightChild(BSTNode<E>r){
		rc = r;
	}
	
	public E getElement(){
		return element;
	}
	
	public BSTNode<E> getParent(){
		return parent;
	}
	
	public BSTNode<E> getLeftChild(){
		return lc;
	}
	
	public BSTNode<E> getRightChild(){
		return rc;
	}
	
	public String toString(){
		return element.toString();
	}
	
	
}
