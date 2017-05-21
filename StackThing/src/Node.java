
public class Node<E> {
	private E element;
	private Node<E> next;
	
	Node(E e, Node<E>n){
		element = e;
		next = n;
	}
	
	Node(E e){
		element = e;
		next = null;
	}
	
	public E getElement(){
		return element;
	}
	public void setElement(E e){
		element = e;
	}
	public Node<E> getNext(){
		return next;
	}
	public void setNext(Node<E> n){
		next = n;
	}
	public String toString(){
		return element.toString();
	}
}
