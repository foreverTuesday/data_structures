import java.util.*;

public class Sorts <T extends Comparable<T>>{


	
	public static <T extends Comparable<T>> int bogoSort(ArrayList<T>al){
		int count=0;
		while(!isSorted(al)){
			Collections.shuffle(al);
			count++;
		}//while
		return count;
	}//bogoSort
	
	
	public static <T extends Comparable<T>> int bubbleSort(ArrayList<T>al){
		int count = 0;
			int n = al.size();
			while(n>0){
				for(int i=0;i<al.size()-1;i++){
					if(al.get(i).compareTo(al.get(i+1))>=1){
						swap(al,i, i+1);
					}//if
					count++;
				}//for
				n--;	
			}//while
		return count;
	}//bubblesort
	
	
	public static <T extends Comparable<T>> int mergeSort(ArrayList<T>al){
		int count = 0;	
		
		if(al.size()<=1){
			return count;
		}
		
		int mid = al.size()/2;	
		ArrayList<T> left = new ArrayList<T>();
				left.addAll(al.subList(0, mid));
		ArrayList<T> right = new ArrayList<T>();
				right.addAll(al.subList(mid, al.size()));
		
		
		count+=mergeSort(left);
		count+=mergeSort(right);
		al.clear();
		//merge
		count+=merge(left, right, al);
		
		return count;
	}//mergesort
	
	public static <T extends Comparable<T>> int merge(ArrayList<T>left,ArrayList<T>right,ArrayList<T>al){
		int count=0;
		while(!left.isEmpty() && !right.isEmpty()){
			 count++;
			if(left.get(0).compareTo(right.get(0))<=0){
				al.add(left.remove(0));
			}//if
			else{
				al.add(right.remove(0));
			}//else
		}//while
		if(!left.isEmpty()){
			al.addAll(left);
			left.clear();
		}//if
		if(!right.isEmpty()){
			al.addAll(right);
			right.clear();
		}//if
		
		return count;
	}//merge
	
	
	
	public static <T extends Comparable<T>> int quickSort(ArrayList<T>al){
		int count=0;
		int start=0;
		int end = al.size()-1;
		count=quick(al, start, end);

		
		return count;
	}
	
	public static <T extends Comparable<T>> int quick(ArrayList<T>al, int start, int end){
		
		if(start>=end){
			return 0;
		}
		
		T pivot = al.get(start);
		int check = start+1;
		int bound = start;
		int alert=0;
		
		
		
		//System.out.println("The pivot is "+pivot);
		int count=0;
		while(check <= end){
			count++;
			//System.out.println("we are at "+ al.get(check)+" and the bound is "+bound);
			if(al.get(check).compareTo(pivot)<=0){
				//System.out.println(al.get(check)+" is smaller than "+pivot);
				bound++;
				if(alert==1){
					swap(al,bound,check);
					//System.out.println(al);
				}//if alert
			}//if
		
			
			
			else{
				alert=1;
			}//else

		
			check++;
		}//while
		
		swap(al,bound,start);
		//System.out.println("This is the array "+al);
		count+=quick(al, start, bound-1);
		count+=quick(al, bound+1, end);
		
		return count;
	}//quick
	
	
	public static <T extends Comparable<T>> void swap(ArrayList<T>al, int i, int j){
			T ii = al.get(i);
			T jj = al.get(j);
			al.set(i, jj);
			al.set(j, ii);
				
	}//swap
	
	
	public static <T extends Comparable<T>> boolean isSorted(ArrayList<T>al){
			for(int i =0;i<al.size()-1;i++){
				if(al.get(i).compareTo(al.get(i+1))>-1){
					return false;
				}//if
			}//for
		return true;
	}
	
	
}