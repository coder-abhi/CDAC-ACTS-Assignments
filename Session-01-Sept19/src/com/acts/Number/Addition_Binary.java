
public class Addition_Binary {
	
	// Method 1: Convert Binary no to integer, add and convert back to binary
	 public static String addBinary(){
		 // The two input Strings, containing the binary representation of the two values:
		    String input0 = "1010";
		    String input1 = "10";

		    // Use as radix 2 because it's binary    
		    int number0 = Integer.parseInt(input0, 2);
		    int number1 = Integer.parseInt(input1, 2);

		    int sum = number0 + number1;
		    //System.out.print(sum);
		    return Integer.toBinaryString(sum); //returns the answer as a binary value;
		}
	 
	 // Method 2: Write Logic for solving binary operation
	 public static String sum(String b1, String b2) { 
		 int len1 = b1.length(); 
		 int len2 = b2.length(); 
		 // the final length of the result depends on the bigger length between b1 and b2
		 int maxLen = Math.max(len1, len2);

		 
		 int carry = 0; 
		 String res = ""; 
		 for (int i = 0; i < maxLen; i++) { 
			 // start from last char of String b1 and b2 
			 // left side is an int and right side is char 
			 // so we need to minus the decimal value of '0' 
			 //int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0; 
			 //int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0; 

			 int p = 0;
			 int q = 0;
			
			 if(i<len1){
				 //System.out.println(len1);
				  p = b1.charAt(len1 - 1 -i) - '0';
			 }else{
				  p = 0;
			 }
			 
			 if(i<len2){
				 //System.out.println(len2);
				  q = b2.charAt(len2 - 1 -i) - '0';
			 }else{
				  q = 0;
			 }
			 
			 int tmp = p + q + carry; 
			 carry = tmp / 2; 
			 res = tmp % 2 + res; 
			 } 
		 
		 	//return (carry == 0) ? res : "1" + res; 

		 	 if(carry == 0){
		 		 return res;
		 	 }else{
		 		 res = "1" + res;
		 	 }
		 	 return "";
	 
		 }
	 

	 
	public static void main (String [] args){

    Addition_Binary sa = new Addition_Binary();
		
	System.out.println(sa.addBinary());
	System.out.println(sa.sum("1010", "10"));
	

	}
}
