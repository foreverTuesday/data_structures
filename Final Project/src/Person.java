import java.util.*;


public class Person {
	
	String name;
	ArrayList<Task> tasks = new ArrayList<Task>();

	Person(String s, Task t){ //initialize a person
		name = s;
		tasks.add(t);
	}
	
	public void addTask(Task t){ //add a Task to the person's task list
		tasks.add(t);
		Task.bubbleSort(tasks); //sort the task list
	}
	
	public String toString(){  //toString!!!!!!!! :D
		String s = "Name is "+name+"// tasks are: ";
		for(int i=0;i<tasks.size();i++){
			s= s+tasks.get(i).toString();
		}
		s=s+"\n";
		return(s);
	}
	
}
