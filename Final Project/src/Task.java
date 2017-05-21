//import java.sql.Date;
import java.util.ArrayList;

public class Task implements Comparable<Task>{
	
	String input;
	String due;
	Integer priority;
	String person;
	String description;
	
	Task(String i, String d, Integer p, String r, String s){ //constructor for raw data
		input = i;
		due = d;
		priority = p;
		person = r;
		description = s;
	}
	
	Task(ArrayList<ArrayList<String>> s, int in){ //constructor using an ArrayList<ArrayList> read in from a file
		
		//System.out.println(s.get(in).get(0));
		
		input = s.get(in).get(0);
		due = s.get(in).get(1);
		priority = Integer.parseInt(s.get(in).get(2));  //change priority from String to a more useful Integer
		person = s.get(in).get(3);
		description = s.get(in).get(4);
		
		//ArrayList<ArrayList> n = s.get(0);
	//	System.out.println(this.toString());
	//	System.out.println(n.get(0));
	}
	
	
	public int compareTo(Task t){  
		if(t.getPriority()>this.priority){  //higher numbers are given higher priority 
			return 1;
		}//if
		else if(t.getPriority()<this.priority){ //lower numbers lower priority
			return -1;
		}//else if
		else{ //
			//compareDue(t);
			//return 0;
			return compare2(t);
		}//else
	}//compare
	
	public int compare2(Task t){
		String date = this.getDue();
		String date2 = t.getDue();
	//	System.out.println(date.compareTo(date2));
		int compare =date.compareTo(date2);
		if(compare==0){ //if due dates are the same
			date = this.getInput();
			date2 = t.getInput();
			compare =date.compareTo(date2);//compare input dates
		}
		if(compare==0){//if input dates are also the same
			date = this.getPerson();
			date2 = t.getPerson();
			compare =date.compareTo(date2);//compare names
		}
		if(compare==0){//if names are also the same
			date = this.getDescription();
			date2 = t.getDescription();
			compare =date.compareTo(date2);//compare descriptions
		}
		
		return compare;
	}//compare t
	
	public String getInput(){
		return input;
	}
	
	public String getDue(){
		return due;
	}
	
	public Integer getPriority(){
		return priority;
	}
	
	public String getPerson(){
		return person;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void SetInput(String i){
		input = i;
	}
	
	public void setDue(String d){
		due = d;
	}
	
	public void setPriority(Integer p){
		priority = p;
	}
	
	public void setPerson(String r){
		person = r;
	}
	
	public void SetDescription(String s){
		description = s;
	}
	
	
	
	public String toString(){
		String s = null;
		s = input +", "+ due+", " + priority+", " + person+", " + description+"\n";
		
		return s;
	}
	
	
	public static <T extends Comparable<T>> int bubbleSort(ArrayList<T>al){  //bubblesort from when we wrote sorts
		//I used bubblesort (and the associated swap method) because the code for it was the shortest number of lines
		//and there aren't that many things to sort, so runtime here isn't too important
		int count = 0;
			int n = al.size();
			while(n>0){
				for(int i=0;i<al.size()-1;i++){
					if(al.get(i).compareTo(al.get(i+1))>=1){  //if i has higher priority
						swap(al,i, i+1);
					}//if
					count++;
				}//for
				n--;	
			}//while
		return count;
	}//bubblesort
	
	
	public static <T extends Comparable<T>> void swap(ArrayList<T>al, int i, int j){
		T ii = al.get(i);
		T jj = al.get(j);
		al.set(i, jj);
		al.set(j, ii);
			
}//swap

	
}
