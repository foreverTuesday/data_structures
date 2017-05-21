package lab2;
import java.util.ArrayList;
public class Library <T extends Comparable<T>>{
	private ArrayList<T>shelved=new ArrayList<T>();
	
	public void addShelved(T t){
		shelved.add(t);
		
	}
	
	int i = 0;
	String s = "List of things in the library:";
	public String toString(){
		while(i<shelved.size()){
			T t = shelved.get(i);
			String a = t.toString();
			s = s + "\n" + a;
			i++;
		}
		return s;
	}


}
