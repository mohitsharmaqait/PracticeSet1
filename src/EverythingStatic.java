

	public class EverythingStatic {

		 static int i = 10; // i = 0 [RIWO] j = 0 [RIWO] i = 10 j = 20
		 static
		 {
		  System.out.println(i);
		  m1();
		  System.out.println("First Static Block");
		 }
		 
		 public static void main(String[] args)
		 {
		  m1();
		  System.out.println("Main method");
		 }
		 
		 public static void m1(){
		  System.out.println(j);
		 }
		 
		 static
		 {
		  System.out.println("Second static block");
		 }
		 
		 static int j = 20;
		}

