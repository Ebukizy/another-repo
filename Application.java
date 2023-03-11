import java.util.Scanner;
public class Application{
	public static void main(String [] args){
	

 	  Scanner userInput = new Scanner(System.in);
	/**let assume that A which is the userInput is the lowest number and we want
	user to input 5 numbers and we want to get the lowest number
	*/
	
	System.out.println("Enter the first integers:" );
	    int A = userInput.nextInt();
	
	System.out.println("Enter the Second integers:");
	    int B = userInput.nextInt();
	   // we want to check if a is the lowest number
	   if(A > B){
	      B = B;
	   }  else { 
	      A = B;
	      }
	System.out.println("Enter the third integers:" );
	    int C = userInput.nextInt();
	 /*the pattern we follow is what we will keep using, still keep assuming that A 
	   is the lowest number. because the value in b has been assign to a if is the lowest
	   number, but if a is the lowest number A should be assign to A
	*/
	    if(A > C){
	      A = C;
	    } else {
	      A = C;
	      }
	System.out.println("Enter the fourth integers:" );
	    int D = userInput.nextInt();  
	 /*the pattern we follow is what we will keep using, still keep assuming that A 
	   is the lowest number. because the value in c has been assign to a if is the lowest
	   number, but if a is the lowest number A should be assign to A
	*/
	    if(A > D){
	      A = D;
	    } else {
	      A = A;
	      } 
	System.out.println("Enter the fith integers:" );
	    
	    int E = userInput.nextInt(); 
	 /*the pattern we follow is what we will keep using, still keep assuming that A 
	   is the lowest number. because the value in d has been assign to a if is the lowest
	   number, but if a is the lowest number A should be assign to A
	*/
	    if(A > E){
	      A = E;
	    } else {
	      A = A;  
	      }
	 System.out.println("the lowest number enter by the user is: " + A);

  
	/**let assume that A which is the userInput is the highest number and we want
	user to input 5 numbers and we want to get the highest number
	*/
	
	System.out.println("Enter the first integers:" );
	    int a = userInput.nextInt();
	
	System.out.println("Enter the Second integers:");
	    int b = userInput.nextInt();
	   // we want to check if a is the highest number
	   if(a < b){
	      a = b;
	   }  else { 
	      a = a;
	      }
	
	System.out.println("Enter the third integers:" );
	    int c = userInput.nextInt();
	 /*the pattern we follow is what we will keep using, still keep assuming that A 
	   is the highest number. because the value in b has been assign to a if is the highest
	   number, but if a is the highest number A should be assign to A
	*/
	    if(a < c){
	      a = c;
	    } else {
	      a = a;
	      }
	
	System.out.println("Enter the fourth integers:" );
	    int d = userInput.nextInt();  
	 /*the pattern we follow is what we will keep using, still keep assuming that A 
	   is the highest number. because the value in c has been assign to a if is the highest
	   number, but if a is the highest number A should be assign to A
	*/
	    if(a < d){
	      a = d;
	    } else {
	      a = a;
	      } 
	      
	      System.out.println("Enter the fith integers:" );
	    int e = userInput.nextInt(); 
	 /*the pattern we follow is what we will keep using, still keep assuming that A 
	   is the highest number. because the value in d has been assign to a if is the highest
	   number, but if a is the highest number A should be assign to A
	*/
	    if(a < e){
	      a = e;
	    } else {
	      a = a;  
	      }
	 System.out.println("the highest number enter by the user is: " + a);

















	}	

} 
