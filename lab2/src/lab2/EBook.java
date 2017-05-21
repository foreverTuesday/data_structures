package lab2;

public class EBook extends Book{ //an ebook can start as a published physical book and has many of them same features
	
	private String platform; //what platform the book is read on
	
	EBook(){
		super();
		title = "Book of EBooks";
		author = "Eliana Electronics";
		pubYear = 2013;
		publisher = "Useless Publications Inc.";
		genre = "reference";
		platform = "Kindle";
	}
	
	EBook(String t, String a, int p, String s, String o, String b){
		super();
		title = t;
		author = a;
		pubYear = p;
		publisher = s;
		genre = o;
		platform = o;
	}
	

	public String getPlatform(){
		return platform;
		}

	public void setPlatform(String n){
		n= platform;
		}
	
	public String toString(){
		return(title+", "+author+", "+publisher+", "+pubYear+", "+genre+", "+platform);
	}
	
	
	
	
	
}
