import java.util.*;
public class Person implements Comparable<Person>{

	protected String name;
	private Date birthday;
	private int age;
	
	Person(int a){
		name=null;
		birthday = null;
		age = a;
	
	}
	
	public String toString(){
		return("Name = " + name + "\n birthday = "+birthday);
		
	}

	
	public Integer getAge(){
		return age;
	}
	
	public int compareTo(Person p){
		if(p.getAge()>this.age){
			return 1;
		}//if
		else if(p.getAge()<this.age){
			return -1;
		}//else if
		else{
		return 0;
		}//else
	}//compare
	
}
