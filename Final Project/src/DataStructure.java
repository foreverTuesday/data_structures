import java.util.*;

public class DataStructure {
	
	Hashtable<String, ArrayList<Task>> ht = new Hashtable<String, ArrayList<Task>>();
	ArrayList<Task> tasks = new ArrayList<Task>();
	
	DataStructure(String s, ArrayList<Task> al){
		
		ht.put(s, al);
		
	}
	
	

}
