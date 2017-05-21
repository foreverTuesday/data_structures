package lab2;

public class BlogPost extends ReadingMaterial{
	
	private String blogTitle; 
	private String topic;
	
	BlogPost(){
		super();
		title = "Life Today";
		author = "Oversharing Olivia";
		pubYear = 1999;
		blogTitle = "Excrutiatingly Detailed Diary of MY Exciting Life";
		topic = "dailyJournal";	
	}
	
	BlogPost(String t, String a, int p, String s, String o){
		super();
		title = t;
		author = a;
		pubYear = p;
		blogTitle = s;
		topic = o;
	}
	
	public String getSource(){
		return blogTitle;
		}

	public void setSource(String n){
		n= blogTitle;
		}
	
	public String getTopic(){
		return topic;
		}

	public void setTopic(String n){
		n= topic;
		}
	
	public String toString(){
		return(title+", "+author+", "+blogTitle+", "+pubYear+", "+topic);
	}
	
}
