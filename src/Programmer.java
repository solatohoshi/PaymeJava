/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 Programmer class. It's a super abstract class that implements Payme.
*/

/**
 * This is an abstract superclass that IMPLEMENTS the Payme interface. It's the parent class
 * for SalariedProgrammer, HourlyProgrammer, CommissionProgrammer, BasePlusCommissionProgrammer
 * classes. It has instance variables, constructor, and methods to be inherited by subclasses.
 * @author Huiting Huang
 *
 */

public abstract class Programmer implements Payme {
	/**
	 * private data member firstName is the first name of the programmer
	 */
	private String firstName;
	/**
	 * private data member lastName is the last name of the programmer
	 */
	private String lastName;
	/**
	 * private data member socialSecurityNumber is the social insurance number
	 * of the programmer
	 */
	private String socialSecurityNumber;

	/**
	 * This is the programmer constructor with 3 parameters
	 * @param first the firstname of the programmer
	 * @param last the lastname of the programmer
	 * @param ssn the social insurance number of the programmer
	 */
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/**
	 * This method returns the first name of the programmer
	 * @return firstName the first name of the programmer
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method returns the last name of the programmer
	 * @return lastName the last name of the programmer
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method returns the social security number of the 
	 * programmer 
	 * @return socialSecurityNumber the social security number of 
	 * the programmer
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * This method returns a String representation of 
	 * the Programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	/**
	 * This is partB. The method takes a boolean as argument and throws an exception
	 * if boolean is false
	 * @param choice the boolean value true or false
	 */
	public void isJavaFun(boolean choice) {
		if (choice==false) {
			throw new IllegalArgumentException("Quit the program.");
		}
//		else {
//			System.out.println("Have fun!");
//		}
	}


	/**
	 * The getPaymentAmount method is declared as abstract here, therefore there's
	 * no implementation here. This method returns a double value.
	 */
	public abstract double getPaymentAmount(); 
}
