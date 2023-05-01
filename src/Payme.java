/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 Payme interface class with the getPaymentAmount abstract method.
*/

/**
 * This class declares the Payme interface, which contain a method of type double
 * called getPaymentAmount() for calculating payment. Both the programmer and invoice
 * classes implement this interface.
 * @author Huiting Huang
 *
 */
public interface Payme {
	/**
	 * This is the getPaymentAmount abstract method to be extended in the classes that uses payme interface
	 * @return nothing, because it's an abstract method
	 */
	public double getPaymentAmount();
}
