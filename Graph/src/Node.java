import java.util.ArrayList;

public class Node<E> {

	E element;
	ArrayList<E> connections;
	Node(E e){
		element=e;
		connections = new ArrayList<E>();
	}
	
	public E getElement(){
		return element;
	}
	
	public ArrayList<E> getConnections(){
		return connections;
	}
	
	public void addConnection(E c){
		connections.add(c);
	}
	
	public void removeConnection(E c){
		connections.remove(c);
	}
	
	public String toString(){
		return (element + " is connected to "+connections);
	}
}
