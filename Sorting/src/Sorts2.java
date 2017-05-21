import java.util.*;

public class Sorts2  <T extends Comparable<T>>{

	public static <T extends Comparable<T>> void mergeSort(ArrayList<T> al){
		if(al.size()<=1){ return; }
		int mid = al.size()/2;
		ArrayList<T> left = new ArrayList<T>();
		left.addAll(al.subList(0, mid));
		ArrayList<T> right = new ArrayList<T>();
		right.addAll(al.subList(mid,al.size()));
		mergeSort(left);
		mergeSort(right);
		al.clear();
		merge(left,right,al);
		System.out.println(al);
      
      //no return statement???
	}
	
	public static <T extends Comparable<T>> void merge(ArrayList<T>left,ArrayList<T> right, ArrayList<T> al){
		while (!left.isEmpty() && !right.isEmpty()){
			if(left.get(0).compareTo(right.get(0))<=0){
				al.add(left.remove(0));
			}
			else{ al.add(right.remove(0));	}
			if(!left.isEmpty()){
				al.addAll(left);
				left.clear();
			}
			if(!right.isEmpty()){
				al.addAll(right);
				right.clear();
			}
		}
	}
	
}
