import java.util.ArrayList;
import java.util.Hashtable;

public class Graph<E> {

	Hashtable<E,Node<E>> nodes;
	
	Graph(){
		nodes = new Hashtable<E, Node<E>>();
	}
	
	public void addNode(E e){
		Node<E> n = new Node<E>(e);
		nodes.put(e, n);
	}
	
	public void addDirEdge(E from, E to){
		if(nodes.containsKey(from)&&nodes.containsKey(to)){
			nodes.get(from).addConnection(to);
		}
	}
	
	public void addUnEdge(E from, E to){
		if(nodes.containsKey(from)&&nodes.containsKey(to)){
			nodes.get(from).addConnection(to);
			nodes.get(to).addConnection(from);
		}
	}
	
	public ArrayList<E> breadthFirst(E start){
		ArrayList<E> visited =  new ArrayList<E>();
		ArrayList<E> queue = new ArrayList<E>();
		if(nodes.containsKey(start)){
			queue.add(start);
			visited.add(start);
			while(!queue.isEmpty()){
				Node<E> current = nodes.get(queue.get(0));
				for(E c: current.getConnections()){
					if(!visited.contains(c)){
						visited.add(c);
						queue.add(c);
					}//if
				}//for
				queue.remove(0);
			}//while
		}//if
		
		return visited;
	}//bredth first
	
	public ArrayList<E> depthFirst(E start){
		ArrayList<E> visited =  new ArrayList<E>();
		ArrayList<E> stack =  new ArrayList<E>();
		if(nodes.containsKey(start)){
			stack.add(start);
			visited.add(start);
			while(!stack.isEmpty()){
				Node<E> current = nodes.get(stack.remove(stack.size()-1));
				for(E c: current.getConnections()){
					if(!visited.contains(c)){
						visited.add(c);
						stack.add(c);
					}//if
				}//for
				//stack.remove(stack.get(stack.size()-1));
			}//while
		}//if
		
		return visited;
	}//depth first
	
	public String nodeToString(E n){
		return(nodes.get(n)).toString();
	}
}
