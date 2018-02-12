import java.util.Scanner;

public class Testing123 {
	
	Scanner scan =new Scanner(System.in);

	static int firstNumber;
	static int secondNumber;
	static int thirdNumber;
	
	public  void Calculation(){
		System.out.println("Enter first Number: ");
		firstNumber = scan.nextInt();
		System.out.println("Enter second Number: ");
		secondNumber = scan.nextInt();
		thirdNumber = firstNumber + secondNumber;
		System.out.println("Sum of the two numbers is: "+thirdNumber);
		
	}

	public static void main(String[ ] args) {
		
		Testing123 cal = new Testing123();
		cal.Calculation();
		

}
}