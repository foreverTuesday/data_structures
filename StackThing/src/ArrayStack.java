import java.util.*;
public class ArrayStack<T> implements StackADT<T> {

   private final static int DEFAULT_CAPACITY = 100;
	
   private int top;
   private T[] stack;
	
   public ArrayStack(){
      this(DEFAULT_CAPACITY);
   }
	
//	@SuppressWarnings("unchecked")
   public ArrayStack(int i){
      stack = (T[])(new Object[i]);
   }

   public void push(T element){
      if(stack.length == top){
         stack=Arrays.copyOf(stack, stack.length*2);
      }
      stack[top]=element;
      top++;
   	
   }
   
   public int size(){
      return 0;
   }
   
   public boolean isEmpty(){
      return false;
   }
   
   public T peek(){
      return null;
   }
   
   public T pop(){
      return null;
   }
   
	
}
