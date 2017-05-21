package lab2;

public class Book extends ReadingMaterial{

	protected String publisher;
	protected String genre;
	
	Book(){
		super();
		title = "EXCITING NOVEL";
		author = "Mr. Excitement";
		pubYear = 1958;
		publisher = "Exciting Publications";
		genre = "action";
	}
	
	Book(String t, String a, int p, String s, String o){
		super();
		title = t;
		author = a;
		pubYear = p;
		publisher = s;
		genre = o;
	}
	
	
	public String getPub(){
		return publisher;
		}

	public void setPub(String n){
		n= publisher;
		}
	
	public String getGenre(){
		return genre;
		}

	public void setGenre(String n){
		n= genre;
		}
	
	public String toString(){
		return(title+", "+author+", "+publisher+", "+pubYear+", "+genre);
	}
}
