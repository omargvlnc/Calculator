/* Name: Omar Valencia
 * Class ID: 573
 * Assignment 2: Second version of Calculator class, which has methods to perform 
 * basic operations, such as: addition, subtraction, multiplication, and division.
 */

package cse360assign2;

public class Calculator {
	 
	private int total;
	private String history;
	 
	/**
	 * Calculator constructor
	 */
	public Calculator () {
		total = 0;  
		history = "0 ";
	}
	 
	/**
	 * Gets the current total 
	 * 
	 * @return the current total
	 */
	public int getTotal () {
		return this.total;
	}
	
	/**
	 * Adds the given value to the total value and updates history string
	 * 
	 * @param value	the value to be added to the total
	 */
	public void add (int value) {
		this.total += value;
		String addStr = Integer.toString(value);
		this.history += addStr;
	}
	
	/**
	 * Subtracts the given value from the total value and updates history string
	 * 
	 * @param value the value to be subtracted from the total
	 */
	public void subtract (int value) {
		this.total -=  value;
		String subStr = Integer.toString(value);
		this.history += subStr;
	}
	
	/**
	 * Multiplies the total by the given value and updates history string
	 * 
	 * @param value the value to divide the total by
	 */
	public void multiply (int value) {
		this.total *= value;
		String mulStr = Integer.toString(value);
		this.history += mulStr;
	}
	
	/**
	 * Divides the total by the given value and updates the history string
	 * 
	 * @param value the value to multiply the total by
	 */
	public void divide (int value) {
		if (value == 0)
			this.total = 0;
		else
			this.total /= value; 
		String divStr = Integer.toString(value);
		this.history += divStr;
	}
	
	/**
	 * Returns a symbolic string of operations that have been performed
	 * 
	 * @return a string representing history of operations performed
	 */
	public String getHistory () {
		return this.history;
	}
}