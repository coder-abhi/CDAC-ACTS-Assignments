package com.acts.wrapper;

public class WrapperTester {
	public static void main(String[] args) {


		int i = 78;
		double d = 9.2;
		String s="589";

		Integer var = new Integer(i);

		Integer var1 = Integer.valueOf(i);
		Integer var2 = Integer.valueOf(s);
		Integer var3 = Integer.parseInt(s);
		

	
		int i1 = var1.intValue();
		
	
		Integer iw4 = 14;
		Double dw3 = 23.98;
	
	
	    

	    Number num2 = 255.41;
	    System.out.println(num2.getClass().getName());
	    
	 
	    byte b = 15;
	    Object objRef = b;
	    System.out.println(objRef.getClass());
	    
	    objRef = true; 
	    objRef = "abhi";
	    objRef = 'A'; 
		
	}
	
}
