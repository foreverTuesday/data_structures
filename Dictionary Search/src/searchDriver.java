import java.util.*;

public class searchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(8);
		al.add(3);
		al.add(88);
		al.add(54);
		al.add(42);
		
		Collections.sort(al);
		System.out.println(al);
		
		int index = dictionarySearch(al, 42);
		if(index!=-1){
			System.out.println(index);
		}//
		else{
			System.out.println("ERROR");
		}//else
		
	}//main

	public static int dictionarySearch(ArrayList<Integer>al, Integer f){
		int begin = 0;
		int end = al.size()-1;
		while(begin<=end){
			int search = (end+begin)/2;
			if(al.get(search).equals(f)){
				return(search);
			}//if
			if(f>al.get(search)){ //compareTo for strings and generics
				begin = search +1;
			}//if
			else{
				end = search -1;
			}
		}//while
		
		return -1;
	}//dictionarySearch
	
}
