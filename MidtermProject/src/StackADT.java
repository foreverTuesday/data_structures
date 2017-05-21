
public interface StackADT<T> {
	
	/**
	 * Adds the element to the top of the stack
	 * @param element element to be pushed onto the stack
	 */
	public void push(T element);
	
	/**
	 * Removes and returns the top element in the stack
	 * @return the element at the top of the stack after removing it from the stack
	 */
	public T pop ();
	
	/**
	 * Returns without removing the top element of the stack
	 * @return the top element of the stack without removing it
	 */
	public T peek();
	
	/**
	 * Returns true if this stack contains no elements
	 * @return true if the stack is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of elements in the stack
	 * @return the number of elements in the stack
	 */
	public int size();
	
	/**
	 * Returns a string representation of the elements in the stack
	 * @return a string representation of the stack
	 */
	public String toString();
}
