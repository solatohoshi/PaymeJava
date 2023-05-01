/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 HourlyProgrammer class that extends the Programmer class.
*/

/**
 * The HourlyProgrammer class extends the Programmer class, with private data member
 * wage and hours, and overrides methods in Programmer.
 * @author Huiting Huang
 *
 */
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

/**
 * This is the HourlyProgrammer constructor with parameters including firstName, lastName, 
 * socialSecurityNumber,wage, hours
 * @param firstName first name of the hourly programmer
 * @param lastName last name of the hourly programmer
 * @param socialSecurityNumber social security number of the hourly programmer
 * @param wage the hourly wage of the programmer
 * @param hours the hours worked for week of the programmer
 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	}

/**
 * This method is used to set wage value, throws an exception when less than 0
 * @param wage the hourly wage of the programmer
 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}

/**
 * This method is uese to get the wage value, returns wage
 * @return wage
 */
	public double getWage() {
		return wage;
	}

/**
 * This method is used to set hours, with parameter hours
 * @param hours the hours worked per week of programmer
 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

/**
 * This method is used to get the hours value, return hours
 * @return hours hours worked per week
 */
	public double getHours() {
		return hours;
	}

/**
 * This method is used to calculate earnings; override abstract method getPaymentAmount in Programmer
 */
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

/**
 * This method overrides the toString method in Programmer,
 * and returns String representation of HourlyProgrammer object              
 */
	@Override
	public String toString() {
		return String.format("hourly Programmer: %s %s\nsocial security number: %s\nhourly wage: $%,.2f; hours worked: %.2f", super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), getWage(), getHours());
	}


}
