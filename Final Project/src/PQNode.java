
public class PQNode {
	Task element;
	PQNode parent;
	PQNode left;
	PQNode right;
	
	
	PQNode(Task e){
		element=e;
		left = null;
		right = null;
		parent = null;
	}
	

//gets and sets	
	public void setElement(Task e){
		element=e;
	}
	
	public void setParent(PQNode p){
		parent=p;
	}
	
	public void setLeft(PQNode l){
		left = l;
	}
	
	public void setRight(PQNode r){
		right = r;
	}
	
	public Task getElement(){
		return element;
	}
	
	public PQNode getParent(){
		return parent;
	}
	
	public PQNode getLeft(){
		return left;
	}
	
	public PQNode getRight(){
		return right;
	}
	
	public String toString(){
		return element.toString();
	}
	
}
