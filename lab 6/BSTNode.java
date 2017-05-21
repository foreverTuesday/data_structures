/*  
 * Created by Nanette Veilleux
 *  modified by Amber Stubbs
 */

import java.util.*;

class BSTNode<E extends Comparable<E> >{
     E element;
     BSTNode<E> left;
     BSTNode<E> right;
     BSTNode<E> parent; 
     
     BSTNode(E e){
          element = e; 
          left = null;
          right = null; 
          parent = null;
     }
     
   
     BSTNode(E e, BSTNode<E> p){
          element = e; 
          left =null;
          right = null; 
          parent = p; 
     }
   
     
     BSTNode<E> getLeft(){return left;}
     BSTNode<E> getRight(){return right;}
     BSTNode<E> getParent(){return parent;} 
          
     boolean hasLeft(){if (left == null) return false; else return true;} 
     boolean hasRight(){if (right == null) return false; else return true;} 
     boolean hasParent(){if (parent==null) return false; else return true;}

     void setLeft(BSTNode<E> l){left =l;}
     void setRight(BSTNode<E> r){right = r;}
     void setParent(BSTNode<E> p){parent = p;}

     void setElement(E e){element = e;}
   
     E getElement(){return element;} 

     public String toString(){return element.toString();}
   
   public String printBSTNode(){
      String s = "\nThis node contains: "+element.toString()+"\n";
      if (this.hasParent()){
         s+= "Parent contains " + this.parent.toString()+"\n";
      }else{ s+= "This node has no parent\n"; }
      if (this.hasLeft()){
         s+= "Left child contains " + this.left.toString()+"\n";
      }else { s+= "This node has no left child\n"; }
      if (this.hasRight()){
         s+= "Right child contains " + this.right.toString()+"\n";
      }else{ s+= "This node has no right child\n";}
      return s;
   }


} 
