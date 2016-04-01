
package edu.towson.cis.cosc603.project4.fibonacci;

/**
 * The Class Fibonacci to simply calculates the nth Fibonacci number given the input n.
 */
public class Fibonacci {
	
	/**
	 * Calculates and returns the nth Fibonacci number.
	 *
	 * @param n the index
	 * @return the nth Fibonacci number
	 */
	public int fibonacci(int n) {
		switch (n) {
			/**
			 * I changed the return values.
			 * 
			 * Before both cases returned 1.  This caused
			 * the first two elements in the series to go
			 * into one location. 
			 */
			case 0: return 0;
			case 1: return 1;
			default: return (fibonacci(n - 1) + fibonacci(n - 2));
		}
	}
}
