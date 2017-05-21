class BinTreeDriver{

   public static void main(String argv[]){
   
      //setting up a tree
      BinaryTree<String> bt = new BinaryTree<String>();
      String[]characters = {"Jane","Lizzie","Kitty","Darcy","Bingley","Charlotte","Georgiana","Lydia","Wickham"};           
      for(String s: characters){
         bt.insert(s);
      }  
   
     // bt.printInOrder();
    // bt.printTraversal();
    
   //   System.out.println(bt.search("Kitty"));
   //   System.out.println(bt.search("Kitt"));
   
   
      bt.remove(characters[7]);
      bt.printTraversal();
      bt.remove(characters[8]);
      bt.printTraversal();
      bt.remove(characters[1]);
      bt.printTraversal();
      bt.remove(characters[2]);
      bt.printTraversal();
      bt.remove(characters[0]);
      bt.printTraversal();
      bt.remove(characters[6]);
      bt.printTraversal();
      bt.remove(characters[3]);
      bt.printTraversal();
      bt.remove(characters[5]);
      bt.printTraversal();
      bt.remove(characters[4]);
      bt.printTraversal();


   
   
           
    
    
        
   } // main
}