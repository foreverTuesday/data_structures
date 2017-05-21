package lab2;

public class Article extends ReadingMaterial{
	
	private String source; //where the article was published
	private String topic;
	
	Article(){
		super();
		title = "Important Article";
		author = "Clark the News Reporter";
		pubYear = 1900;
		source = "Generic Newpaper";
		topic = "The World Today";
	}
	
	Article(String t, String a, int p, String s, String o){
		super();
		title = t;
		author = a;
		pubYear = p;
		source = s;
		topic = o;
	}
	
	
	public String getSource(){
		return source;
		}

	public void setSource(String n){
		n= source;
		}
	
	public String getTopic(){
		return topic;
		}

	public void setTopic(String n){
		n= topic;
		}
	
	public String toString(){
		return(title+", "+author+", "+source+", "+pubYear+", "+topic);
	}
}
