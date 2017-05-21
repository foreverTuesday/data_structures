
public class BSTNode<E extends Comparable<E>> {

	E element;
	BSTNode<E> parent;
	BSTNode<E> left;
	BSTNode<E> right;

	BSTNode(E e){ 
		element = e;
		left = null;
		right = null;
		parent = null;}
	
	public void setElement(E e){ element = e;}
	public void setParent(BSTNode<E> p){ parent = p; }
	public void setLeft(BSTNode<E> l){left = l;}
	public void setRight(BSTNode<E> r){right = r;}
	
	public E getElement(){return element;}
	public BSTNode<E> getParent(){return parent;}
	public BSTNode<E> getLeft(){return left;}
	public BSTNode<E> getRight(){return right;}
	
	public String toString(){
      String s = "Element: "+element.toString();
      if(parent!=null){ s += "\nParent: "+parent.getElement();}
      if(left!=null) { s+="\nLeft: "+left.getElement();}
      if(right!=null){s+="\nRight: "+right.getElement();}
		return s;
	}
	
}

