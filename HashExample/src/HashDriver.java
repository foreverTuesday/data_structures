import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Royce", 30);
		ht.put("Ava", 13);
		ht.put("Ruth", 99);
		ht.put("Holly", 40);
		
		
		System.out.println(ht);
		
		Enumeration<String> keys = ht.keys();
		while(keys.hasMoreElements()){
			String k = keys.nextElement();  //get the next key
			Integer v = ht.get(k);  //get the value for the key
			System.out.println("Name: "+k+"\nAge: "+v+"\n*****************\n");
		}//while
		
		Hashtable<String,ArrayList<String>> bigHash = new Hashtable<String,ArrayList<String>>();
		ArrayList<String> food1 = new ArrayList<String>();
		food1.add("Burgers");
		food1.add("Shakes");
		food1.add("Fries");
		bigHash.put("Shake Shack", food1);
		
		
	}
	
	
	public static void putList(String key, String value, Hashtable<String,ArrayList<String>> bigHash){
		//check for key
		//if no key, add value into new ArrayList, put key, ArrayList into Hashtable
		//else
			//get current list
			//add new value
			//put updated list into Hashtable
	}//putList

}
