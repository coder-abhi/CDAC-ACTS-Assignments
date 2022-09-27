import java.util.*;

public class Fibonacci {
	
	//Using recursion
	static int n1=0,n2=1,n3=0;  
	 static void printFibonacci(int count){   
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }  
	
	public static void main(String args[])  
	{    
		
	 int n1=0,n2=1,n3,i;  
	 
	 System.out.println("Enter the count upto which you want to print the ffibonacci series");
     Scanner sc = new Scanner(System.in); 
     int count = sc.nextInt();  

 	// Method 1: Using loop
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(i=0;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }  
	 
	 System.out.println(" ");
	 
	 System.out.print(0+" "+1);//printing 0 and 1    	 
	 Fibonacci fib = new Fibonacci(); 
	 
	 
	 fib.printFibonacci(count); // Calling recurssion
	}
}
