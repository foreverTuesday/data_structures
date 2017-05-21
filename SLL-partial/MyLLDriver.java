   class MyLLDriver{

      public static void main(String[] args){

         SLinkedList<String>sll = new SLinkedList<String>();
         sll.addFirst("Hey");
         sll.addLast("there");
         sll.addFirst("Hey2");
         sll.addLast("there2");
         System.out.println(sll);

         sll.remove(3);


      }
   }
