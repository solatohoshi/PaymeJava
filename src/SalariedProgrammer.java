/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 SalariedProgrammer class. It's a subclass that extends Programmer.
*/


/**
 * SalariedProgrammer concrete class extends abstract class Programmer. It's subclass inheriting 
 * the firstName, lastName, socialSecurityNumber variables and the toString and getPaymentAmount
 * methods, with its own private data member WeeklySalary and setWeeklySalary and getWeeklySalary
 * methods
 * @author Huiting Huang
 *
 */
public class SalariedProgrammer extends Programmer  {
	/**
	 * private data member weeklySalary is the weekly salary
	 * of the programmer
	 */
	private double weeklySalary;

	/**
	 * This is the constructor for SalariedProgrammer, which inherits
	 * some properties from the super class with a weeklySalary field
	 * an exception will be thrown if the weekly salary is less than 0
	 * @param firstName the first name of the salaried programmer
	 * @param lastName the last name of the salaried programmer
	 * @param socialSecurityNumber the social security number of the programmer
	 * @param weeklySalary the weekly salary of the programmer
	 */
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, 
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * This method is used to set the weekly salary with a double parameter
	 * an exception will be thrown if the salary is less than 0
	 * @param weeklySalary the weekly salary of the programmer
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * This method is used to get the weekly salary, it returns 
	 * the weekly salary value
	 * @return weeklySalary the weekly salary of the programmer
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	/**
	 * This method is used to calculate earnings of the programmer.
	 * It overrides the abstract method getPaymentAmount in Programmer,
	 * and returns the weekly salary.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             

	/**
	 * It overrides the toString method in the Programmer class
	 * and returns the String representation of SalariedProgrammer object   
	 */
	@Override        
    public String toString() {
		return String.format("salaried Programmer: %s %s\nsocial security number: %s\nweekly salary: $,%.2f", super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), getWeeklySalary());
	}
	
	/**
	 * This is used to test the partB method in method main
	 */
	@Override
	public void isJavaFun(boolean choice) {
		super.isJavaFun(choice);
	}
	
}

