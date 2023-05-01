/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 BasedPlusCommissionProgrammer class that extends the Programmer class.
*/

/**
 * The BasePlusCommissionProgrammer class extends the CommissionProgrammer class, with private data member
 * baseSalary, and overrides methods getPaymentAmount and
 * toString in CommissionProgrammer.
 * @author Huiting Huang
 *
 */
	public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

		private double baseSalary; // base salary per week

		/**
		 * The constructor for BasePlusCommissionProgrammer, which has 6 parameters
		 * @param firstName the first name of the base plus commission programmer
		 * @param lastName the last name of the base plus commission programmer
		 * @param socialSecurityNumber the social securtiy number of the base plus commission programmer
		 * @param grossSales the gross sales amount of the base plus commission programmer
		 * @param commissionRate the commission rate for the base plus commission programmer
		 * @param baseSalary the base salary of the base plus commission programmer
		 */
		public BasePlusCommissionProgrammer(String firstName, String lastName, 
				String socialSecurityNumber, 
				double grossSales, double commissionRate, double baseSalary) {
			super(firstName, lastName, socialSecurityNumber, 
					grossSales, commissionRate);

			if (baseSalary < 0.0) { // validate baseSalary                  
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			}

			this.baseSalary = baseSalary;                
		}

		/**
		 * This method sets the base salary value with baseSalary as parameter
		 * @param baseSalary the base salary of the base plus commission programmer
		 */
		public void setBaseSalary(double baseSalary) {
			if (baseSalary < 0.0) { // validate baseSalary                  
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			}

			this.baseSalary = baseSalary;                
		} 

		//return base salary
		/**
		 * This method returns base salary of the base plus commission programmer
		 * @return baseSalary base salary amount of the base plus commission programmer
		 */
		public double getBaseSalary() {
			return baseSalary;
		}

		/**
		 * This method calculates earnings of the base plus commission programmer, it overrides
		 *  abstract method getPaymentAmount in CommissionProgrammer.
		 */
@Override                                                            
	public double getPaymentAmount() {                                             
	return getBaseSalary() + super.getPaymentAmount();                        
	} 


/**
 * This method returns String representation of BasePlusCommissionProgrammer object
 */
	@Override     
	public String toString() {
	return String.format("base-plus commission programmer: %s %s\nsocial security number: %s\ngross sales: $%,.2f;  commission rate: %.2f; base salary: $,%.2f",
			super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getBaseSalary());
	}                                            


}
