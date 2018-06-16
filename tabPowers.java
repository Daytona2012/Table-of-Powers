import java.util.Scanner;


public class tabPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();
		
		//Declarations and Initializations
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int number, square, cube;
		
		
		while(choice.equalsIgnoreCase("y")) {
		//Get the number
		System.out.print("Enter an Integer: ");
		number = sc.nextInt();
		System.out.println();
		
		
		System.out.println("Number" + " " + "Squared" + " " + "Cubed");
		System.out.println("======" + " " + "======" + " " + "======");
		
		//fills table
		for (int i = 1; i <= number; i++) {
			
			square = (int) Math.pow(i,  2);
			cube = (int) Math.pow(i,  3);
			
			String message = "\n" + i + "       " + square + "      " + cube;
			System.out.print(message);
			System.out.println();
		 }
	
	    //Check is user wants to continue
		System.out.print("Continue (y/n): ");
		choice = sc.next();
		System.out.println();
	   }	
	 
	  }
	
	}
		
		
