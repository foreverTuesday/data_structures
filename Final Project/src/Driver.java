import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


	public class Driver {

		public static void main(String[] args) throws FileNotFoundException {
			ArrayList<ArrayList<String>>allTasks = readTaskFile("tasks.csv");
			
			//test to make sure it prints
			for(ArrayList<String>al:allTasks){ //for each ArrayList<String> "al" in allTasks
				for(String s: al){ //for each String "s" in "al"
//					System.out.println(s); //print s
				}
//				System.out.println("\n\n***********************************\n\n"); //print a divider between tasks
			}
		}
		
		
	public static ArrayList<ArrayList<String>> readTaskFile(String filename) throws FileNotFoundException{
		//tasks will hold an ArrayLists of each task
		ArrayList<ArrayList<String>> tasks = new ArrayList<ArrayList<String>> ();
		
		ArrayList<Task> taskObjects = new ArrayList<Task> (); //ArrayList of tasks
		
		Scanner sc = new Scanner(new File(filename));
		//we can discard the first line, since it just describes the contents of each cell
		sc.nextLine();
		while (sc.hasNextLine()){
			//taskBits will hold the pieces of each individual task
			ArrayList<String>taskBits = new ArrayList<String>();
	         //each line is a task
			//split each line on commas
			String[] allSplitTask = sc.nextLine().split(",");
			//add all the pieces of the task to a single ArrayList
			for (String a:allSplitTask){
				taskBits.add(a);
			}
			//add taskBits to tasks
			tasks.add(taskBits);
	      }
		sc.close();
		
		for(int i = 0; i < tasks.size(); i++){
			Task t = new Task(tasks, i);
			taskObjects.add(t); //add each new Task object to the array
		}
		
//		Task.bubbleSort(taskObjects);  //sort the array
		//System.out.println(taskObjects.toString());
		
		Hashtable<String,Person> ht = new Hashtable<String, Person>(); //make a hashtable

		PQArray pq = new PQArray(taskObjects.get(0)); //make a priority queue

//create a person from the first task in the list and add them to the hashtable		
		Person p = new Person(taskObjects.get(0).getPerson(), taskObjects.get(0));
		ht.put(taskObjects.get(0).getPerson(), p);
		
		for(int i=1;i<taskObjects.size();i++){  //for everything in taskObjects
//priority queue stuff			
			pq.add(taskObjects.get(i)); //add to the priority queue
			
			
//Hashtable stuff	
			String tempName = taskObjects.get(i).getPerson(); //get the name
			Task tempTask = taskObjects.get(i); //get their task list
			
			//System.out.println(tempName);
			
			if(ht.containsKey(tempName)==true){ //if the person already exists (name is in the hashtable)
				(ht.get(tempName)).addTask(tempTask);
				//add the task to that Person
				
			//	System.out.println("Contained");
			}//if
			else{ //if the person hasn't been made yet
				p = new Person(tempName, tempTask);
				//make the person
				ht.put(tempName, p);
				//add them to the hashtable
				
			//	System.out.println("Not Contained");
			}//else
			
		}//for everything in taskObjects
		
		
//		System.out.println(ht.toString());

		
		
		System.out.println(pq.toString());
		
		
		//pq.remove();
		System.out.println(pq.toString());
		
		return tasks;
	}

}
	
	



	

