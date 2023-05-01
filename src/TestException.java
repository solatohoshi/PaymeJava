/**
 * This class is used to test the exception
 * @author Huiting Huang
 *
 */
public class TestException {

	/**
	 * test exception, no argument
	 * @param args no argument here
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedProgrammer sp = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320);
		try {
			sp.isJavaFun(false);
		}
		catch(Exception e) {
			System.out.println("Quit the program.");
		}
	}

}
