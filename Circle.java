import java.util.Scanner;
public class Circle{
	public static void main(String [] args){
	// SCANNER CLASS
	Scanner userInput = new Scanner(System.in);
	//declare variables
	double pie = Math.PI;
	int radius = 0;

	System.out.println("Enter the radius of a circle:" );
	    int r = userInput.nextInt();
	
	//diameters of a circle 2*r*r
	 
	 System.out.printf("Diameters= %.1f\n", 2 *(double)radius);
	 
	 //circumfrence of the circle
	 
	  System.out.printf("Circumference= %.1f\n", 2*pie*(double)radius);
	  
	  //Area of a circle 
	  
	  System.out.printf("Area = %1f", pie*(double)(radius*radius));
	
















	}

}
