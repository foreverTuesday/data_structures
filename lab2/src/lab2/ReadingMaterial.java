package lab2;

public class ReadingMaterial implements Comparable<ReadingMaterial>{

	protected String title; //generally any piece of writing has a title
	protected String author; //and an author
	protected int pubYear; //publication year, sometimes it's hard to find, but everything has one
	
	ReadingMaterial(){
	title = "Generic reading material";
	author = "Author";
	pubYear = 2016;
	}//readingMaterial
	
	ReadingMaterial(String t, String a, int p){
		title = t;
		author = a;
		pubYear = p;
		}//readingMaterial
	
	
	public int compareTo(ReadingMaterial r){
		if(r.getYear()>this.pubYear){
			return 1;
		}//if
		else if(r.getYear()<this.pubYear){
			return -1;
		}//else if
		else{
		return 0;
		}//else
	}
	
	
//get and set methods below, and toString
	public String getTitle(){
		return title;
		}

	public void setTitle(String n){
		n= title;
		}
	
	public String getAuthor(){
		return author;
		}

	public void setAuthor(String n){
		n= author;
		}
	
	public int getYear(){
		return pubYear;
		}

	public void setYear(int n){
		n= pubYear;
		}
	
	public String toString(){
		return(title+", "+author+", "+pubYear);
	}
	
}
