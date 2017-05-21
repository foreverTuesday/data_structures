import java.util.ArrayList;

public class PQArray {

	ArrayList<Task> al = new ArrayList<Task> ();
	//left child is 2x
	//right child is 2x+1
	//parent is x/2
	//root is at 1
	
	PQArray(Task t){
		al.add(null);
		al.add(t);
	//	System.out.println(t.toString());
	}
	
	public void add(Task task){ //add an element to the array
		al.add(task);  //place at the end of the array
		bubbleUp(task);
	}//add
	
	public void bubbleUp(Task task){
		int index = al.indexOf(task);
		int parent =  index/2;
	
		Task parentTask = al.get(parent);
		
		if(parentTask!=null){ //if the task isn't the root

			if(parentTask.compareTo(task)>=1){  //if the task has higher priority than parent
		
				swap(index, parent); //swap its position with that of its parent
				bubbleUp(task); //check if it's in the right place
				
			}//if compareTo
		}//if parent exists
		
	}//bubbleUp
	
	public void swap(int i, int j){
		Task ii = al.get(i);  //get each task
		Task jj = al.get(j);
		al.set(i, jj);  //put each in the position the other was in
		al.set(j, ii);
		//System.out.println("~~~~swap~~~~");
	}//swap
	
	public Task remove(){
		Task removed = al.get(1);//get the first item in the arraylist
		Task last = getLastAdded();
		al.set(1, last);//set lastAdded element as root
		al.remove(al.size()-1);//remove lastAdded element from previous position
		bubbleDown(last);
		
		return removed;
	}
	
	public void bubbleDown(Task task){
		int index = al.indexOf(task);
		int left =  2*index;
		int right = 2*index +1;	
		Task lc = al.get(left);
		Task rc = al.get(right);
		
		if(lc!=null){ //if the task has at least one child
			 if(rc==null){//if that task is the only child
				 if(lc.compareTo(task)<=-1){ //if task has lower priority than left child
					 swap(index,left);
				 }
			 }//if only one child
		//else if that task has two children
			 else if(lc.compareTo(task)<=-1 || rc.compareTo(task)<=-1){  //if the task has lower priority than either child
				if(lc.compareTo(rc)>=1){ //if right child has higher priority than left child
					swap(index,right);//swap with that child
				}
				else{ //if left child has higher priority
					swap(index, left);//swap with that child
				}
				bubbleDown(task);//check if it's in the right place
				
			}//if lower priority than children 
		}//if child exists
	}//bubbleDown
	
	public Task getLastAdded(){
		return(al.get(al.size()-1)); //get the last thing in the ArrayList
	}
	
	public String toString(){
		String s="";
		for(int i=1;i<al.size();i++){ //for every element in the arrayList
			s=s+al.get(i).toString();//get it and add it(using its toString method) to the string
		}//for    
		
		
		return s;  
	}//toString  
	
}

/*
 * reminder of what has high priority
 	* big numbers
 	* earlier due date
 	* earlier input date
 	* names alphabetically
 	* descriptions alphabetically
 */
