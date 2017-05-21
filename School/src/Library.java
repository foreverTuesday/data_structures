import java.util.*;
public class Library <T extends Comparable<T>>{

	private ArrayList<T>collection=new ArrayList<T>();
	
	public void addPublication(T t){
		collection.add(t);
	}
	
	
}
