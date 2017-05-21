import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al = new ArrayList<Integer>();
		fillArray(al, 100);
		//staticFill(al);
		System.out.println(al);
		

		//int count=Sorts.mergeSort(al);
		
		int count=Sorts.quickSort(al);
		
		//int count = Sorts.bubbleSort(al);
		
		//int count = Sorts.bogoSort(al);
		
		
		System.out.println("compared "+count+" times \n"+al);
		
	}

	public static void fillArray(ArrayList<Integer>al, int size){
		Random r = new Random();
		for(int i=0;i<size;i++){
			al.add(r.nextInt(100+1));
		}//for
	}//fill
	
	public static void staticFill(ArrayList<Integer>al){
		for(int i=0;i<11;i++){
			al.add(i);
		}
		Collections.shuffle(al);
	}//fill
	
}
