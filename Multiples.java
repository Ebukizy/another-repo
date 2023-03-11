import java.util.Scanner;

public class Multiples{	
	public static void main(String [] args){
	Scanner userInput = new Scanner(System.in);
	
	   System.out.println("Enter the first integers:" );
	   int a = userInput.nextInt();
	   
	    System.out.println("Enter the second integers:" );
	   int b = userInput.nextInt();
	   
	   int c = a * 3 % b * 2;
	   System.out.println("base on the userinput the answer is: " + c);
	   
	   
	   
	   
	   
	   
	   
	   }
	   
}	   
