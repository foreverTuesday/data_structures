
public class TreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     
	  BST<Integer> b=new BST<Integer>(7);
       
      b.insert(13);
      b.insert(26);
      b.insert(21);
      b.insert(17);
      b.insert(14);
      b.insert(25);
      b.insert(2);
      b.insert(5);
      b.insert(3);         

      b.printInOrder();      

      
      AVLTree<Integer>avl = new AVLTree<Integer>(13);
   //   avl.insert(26);
     // avl.insert(21);
     // avl.insert(17);
      avl.insert(14);
      avl.insert(25);
 //     avl.insert(2);
   //   avl.insert(5);
     // avl.insert(3);
//      System.out.println(avl.height(avl.root));

   }
}
