package lab2;
public class ReadingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		ReadingMaterial homework = new ReadingMaterial();
		System.out.println(homework.toString());
		
		Book assignment = new Book();
		System.out.println(assignment.toString());
		
		EBook funtimes = new EBook();
		System.out.println(funtimes.toString());
		
		Article news = new Article();
		System.out.println(news.toString());
		
		BlogPost drama = new BlogPost();
		System.out.println(drama.toString());
		
		
		Library<ReadingMaterial>lib = new Library<ReadingMaterial>();
		lib.addShelved(homework);
		lib.addShelved(assignment);
		lib.addShelved(funtimes);
		lib.addShelved(news);
		lib.addShelved(drama);
		
		System.out.println(lib.toString());
		
		
		ReadingMaterial a = assignment;
		ReadingMaterial b = drama;
		
		if (a.compareTo(b)<0){
			System.out.println(a.getTitle()+" is newer than "+b.getTitle());
		}
		else if (a.compareTo(b)>0){
			System.out.println(a.getTitle()+" is older than "+b.getTitle());
		}
		else{
			System.out.println(a.getTitle()+" and "+b.getTitle()+" are the same age");
		}
		
	}

}
