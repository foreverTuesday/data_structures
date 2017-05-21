
public class school2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person n = new Person(40);
		Person b = new Person(30);
		
		Bus<Person>bus = new Bus<Person>();
		bus.addRider(n);
		bus.addRider(b);
		
		//System.out.println(p);
		
		if (n.compareTo(b)<0){ //n=this
			System.out.println("n is older");
		}
		else if (n.compareTo(b)>0){
			System.out.println("n is younger");
		}
		else{
			System.out.println("same age");
		}
		
		
		//Person s = new Student();
		//System.out.println(s);
		
		//Person[] students = new Person[4];
		//students[0]=n;
		//students[1]=s;
		
		//System.out.println(students[1].toString());
		
		//if (students[1] instanceof Student){
		//	
		//	((Student)students[1]).getMajor();
		//}
		
	}

}
