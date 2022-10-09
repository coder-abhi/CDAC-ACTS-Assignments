package com.acts.complexNo;
//Util classes contains all static methods
public class ComplexUtil {
	//Class method
	public static ComplexNoAddition add(ComplexNoAddition c1,ComplexNoAddition c2) {
		//No this reference is received 
		
//		ComplexNoAddition c3 = new ComplexNoAddition();  
//		c3.real=c1.real + c2.real;                   c
//		c3.img=c1.img + c2.img;
		
		/* gives error as private data members cannot be accessed outside class for this getters and setters are used . Setters are for modification and getters are for read only access */
		
		ComplexNoAddition c3 = new ComplexNoAddition();
		c3.setReal(c1.getReal() + c2.getReal());
		c3.setImg(c1.getImg() + c2.getImg());
		return c3;
		//or
//		return new ComplexNumber(c1.getReal() + c2.getReal(),
//				c1.getImg() +c2.getImg());
	}
}