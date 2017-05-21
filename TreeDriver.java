
public class TreeDriver {

   public static void main(String[] args) {
     
      /*BST<Integer> b = new BST<Integer>(7);
      b.insert(2);
      b.insert(9);
      b.insert(1);
      b.insert(8);
      b.insert(12);
      b.insert(3);
      b.printInOrder();
      */
   	
      AVLTree<Integer>avl = new AVLTree<Integer>(40);
      System.out.println(avl.height(avl.root));
          
          
        //  avl.insert(50);
          //avl.insert(45);


     
   /*  avl.insert(35);
     avl.insert(20);
     avl.insert(15);
     avl.insert(14);
     avl.insert(12);
     avl.insert(11);
     avl.insert(10);*/
     
    /*  avl.insert(45);
      avl.insert(50);
      avl.insert(55);
      avl.insert(60);
      avl.insert(65);
      avl.insert(70);
      avl.insert(75);*/
   
   	avl.insert(35);
   	avl.insert(23);
  		avl.insert(17);
      avl.insert(27);
      avl.insert(30);
      avl.insert(21);
      avl.insert(22); 
      avl.insert(41);
      avl.insert(38); 
      System.out.println("Print the tree: ");
      avl.printInOrder();
   }

}
