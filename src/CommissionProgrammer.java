/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 CommissionProgrammer class that extends the Programmer class.
*/

/**
 * The CommissionProgrammer class extends the Programmer class, with private data member
 * grossSales and commissionRate, and overrides methods getPaymentAmount and
 * toString in Programmer.
 * @author Huiting Huang
 *
 */
public class CommissionProgrammer extends Programmer {

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

/**
 * The CommissionProgrammer constructor takes five constructors, 3 of which inherits from the
 * Programmer class, exceptions will be thrown if commisionRate and grossSales are less than 0
 * @param firstName the first name of the Commission programmer
 * @param lastName the last name of the commission programmer
 * @param socialSecurityNumber the social security number of the commission programmer
 * @param grossSales the gross sales of the programmer
 * @param commissionRate the commission rate of the programmer
 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * This method sets gross sales amount on the creation of apps
	 * @param grossSales the gross sales of the programmer
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

/**
 * This method returns gross sales amount 
 * @return grossSales the amount of gross sales
 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * This method sets commission rate, an exception will be thrown if less than 0 and more than 1
	 * @param commissionRate the commission rate value of the commission programmer
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

/**
 * This method returns commission rate value
 * @return commisionRate the value of commission rate 
 */
	public double getCommissionRate() {
		return commissionRate;
	}

/**
 * This method calculates earnings of the commission programmer, it overrides
 *  abstract method getPaymentAmount in Programmer.
 */
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}


/**
 * This method returns String representation of CommissionProgrammer object
 */
	@Override
	public String toString() {
		return String.format("commission Programmer: %s %s\nsocial security number: %s\ngross sales: $%,.2f;  commission rate: %.2f",
				super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), getGrossSales(), getCommissionRate());
	}

}
