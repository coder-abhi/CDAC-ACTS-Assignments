
public class PowerOfNum {
   static int base = 3, exponent = 4; // Class variables
   static long result = 1;      
   


	// Mthod 1: Using while loop
   public static void while_loop (){

	    while (exponent != 0) {
	      result = result * base;
	      --exponent;
	    }

	    System.out.println("Answer = " + result);
	   
   }
   
   // Method 2: Using for loop
   public static void for_loop(){

	    for (; exponent != 0; --exponent) {
	      result *= base;
	    }

	    System.out.println("Answer = " + result);
   }
   
   
   // Method 3: Using inbuilt function
   public static void pow_function(){
	   double result_1 = Math.pow(base, exponent); //local variable

	    System.out.println("Answer = " + result_1);
   }

	
	public static void main(String [] args){
		PowerOfNum pn = new PowerOfNum();
		pn.pow_function();
		pn.while_loop();
		pn.for_loop();	
	}

}
