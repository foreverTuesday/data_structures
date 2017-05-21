import java.util.ArrayList;

public class PQ {
	
	PQNode root;
	PQNode lastAdded;
	ArrayList<PQNode> ar;

	PQ(Task t){
		add(t);
	}
	
	public void add(Task t){
		
		
	}

	
	public void add(PQNode node, PQNode check){
		
		//go to parent
		//if parent not null
			//check right child
				//put there if empty
				//else, recur
		//if parent null
			//recur with left child
		
	}
	
	public void remove(){
		
	}
	
	public String toString(){
		
		return("generic string");
	}
	
	
	
/*	public void add(Task t){
		PQNode node = new PQNode(t);
		if(root == null){ //if there is no root, make the thing the root
	         root = node;
	         lastAdded = root;
	      }//if
		else if(lastAdded==root){ //if the root is the only node
			lastAdded.setLeft(node);
		}
		else{ //go put it where it's supposed to be
			add(node, lastAdded);
		}//else
	}//add    */ //version with nodes, going to try to implement as a tree
	
}
