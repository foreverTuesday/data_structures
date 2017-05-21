import java.util.*;
class CatchEmAll{
   public static void main(String argv[] ) {
   String type="null";
   int check=1;
   String x = "null";
	   int a = 6;
      Scanner scam = new Scanner (System.in);
      Pokemon1[]party = new Pokemon1[a];
   
      for(int i=0; i<a; i++){
         System.out.println("what is the name?");
         String name = scam.next();
         
         while(check==1){
         
         System.out.println("Does your pokemon have 2 types?");
         x = scam.next();
         
         if(x.equals("yes") || x.equals("no")){
        	 check=0;
         }
         else{
        	 System.out.println("That is not a valid answer.  Please respond with yes or no.");
         }
         }
         
         if(x.equals("yes")){
        	 System.out.println("what is the first type?");
             type = scam.next();
             System.out.println("what is the second type?");
             String type2 = scam.next(); 
         }
         else if(x.equals("no")){
         System.out.println("what is the type?");
         type = scam.next();
         }
         System.out.println("what is the hp?");
         int hp = scam.nextInt();
      
         party[i] = new Pokemon1(type,name,hp);
         check=1;
      
      }
      
      for(int i=0; i<a; i++){
    	  
    	  
         System.out.println(party[i].toString());
         
      
      }
   
   }
}