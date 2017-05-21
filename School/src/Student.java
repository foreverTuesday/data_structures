
public class Student extends Person{

	private String major;
	
	Student(int a){
		super(a);
		major = null;
		name = "Steve";
	}
	
	public String toString(){ 
		return(super.toString()+"\n major = " + major);
		
	}
	
	public String getMajor(){
		return major;
	}
	
}
