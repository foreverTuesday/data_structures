import java.util.*;
public class Bus <T extends Comparable<T>>{
	private ArrayList<T>riders=new ArrayList<T>();
	
	public void addRider(T t){
		riders.add(t);
		
	}
	
}
