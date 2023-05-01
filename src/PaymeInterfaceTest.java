/*
* Student Name: Huiting Huang
* Lab Professor: Professor Leanne Seaward
* Due Date: March 30, 2023
* Modified: March 30, 2023
* Description: This is the lab6 PaymeInterfaceTest class that tests the Payme interface objects.
*/

/**
 * This is the PaymeInterfaceTest class that is used to test the paymeObjects in an 
 * array using polymorphism. It will display the string messages in each class that
 * uses the interface method.
 * @author Huiting Huang
 *
 */

	public class PaymeInterfaceTest  {
		/**
		 * The method main will create a paymeObjects array and populate the array
		 * with data, then it will print payment for invoices and programmers 
		 * polymorphicall.
		 * @param args the main method does not take any parameter
		 */
		public static void main(String[] args) {
			
			//six paymeObjects are declared within an array
			Payme[] paymeObjects = new Payme[6];
			paymeObjects[0]= new Invoice("22776", "brakes", 3, 300);
			paymeObjects[1]= new Invoice("33442", "gear", 5, 90.99);
			paymeObjects[2]= new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320);
			paymeObjects[3]= new HourlyProgrammer("Amara", "Chukwu", "345-67-0001", 18.95, 40);
			paymeObjects[4]= new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500, 0.44);
			paymeObjects[5]= new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 1200, 0.04, 720);

			System.out.println(
					"Payment for Invoices and Programmers are processed polymorphically:\n"); 

				// generically process each element in array paymeObjects
 
			for (Payme currentPayme : paymeObjects) {
				// output currentPayme and its appropriate payment amount
				System.out.printf("%s \n", currentPayme.toString()); 
       
				if (currentPayme instanceof BasePlusCommissionProgrammer) {
					// downcast Payme reference to 
					// BasePlusCommissioProgrammer reference
					BasePlusCommissionProgrammer programmer = 
							(BasePlusCommissionProgrammer) currentPayme;

					double oldBaseSalary = programmer.getBaseSalary();
					programmer.setBaseSalary(1.10 * oldBaseSalary);
					System.out.printf(
							"new base salary with 10%% increase is: $%,.2f\n",
							programmer.getBaseSalary());
				} 

				System.out.printf("%s: $%,.2f\n\n", "payment due", currentPayme.getPaymentAmount());

			}
		}
	}


