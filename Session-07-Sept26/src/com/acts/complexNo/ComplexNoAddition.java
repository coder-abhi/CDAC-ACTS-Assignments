package com.acts.complexNo;

import java.util.Scanner;

public class ComplexNoAddition {
	//Instance Members or Data Members or Properties or Attributes
	private int real;
	private int img;
	
	//Class Variable
	/* Class variables or static variables are shared by all the objects but they doesn't belong to any object or instances */
	private static int count = 0;

	public ComplexNoAddition() {
		System.out.println("Default Ctor Called"); 
		this.real = 0;
		this.img = 0; 
		count++; 
		/* count is incremented inside constructor as when new object is created everytime constructor is called thus count gives total number of object created */  
	}

	public ComplexNoAddition(int real, int img) {
		System.out.println(" Parameterized Ctor called"); 
		this.real = real;
		this.img = img; 
		count++;
	}
	//this reference is always referring to Invoking Object/Reference
	/*every instance method receive this reference, even constructor as 
	  its a special instance method */

	//Instance method
	public ComplexNoAddition add(ComplexNoAddition c2) {
		ComplexNoAddition c3 = new ComplexNoAddition();
		c3.real = this.real + c2.real; //this is referring to c1
		c3.img = this.img + c2.img;
		return c3;
        //return new ComplexNumber(this.real + c2.real, this.img + c2.img);
		
	}
	
	//Class Method
	public static ComplexNoAddition add(ComplexNoAddition c1,ComplexNoAddition c2) {
		ComplexNoAddition c3 = new ComplexNoAddition();
		c3.real = c1.real + c2.real;
		c3.img = c1.img + c2.img;
		return c3;
	}

	//Get Stringified Object Data
	public String getString() {
		//this = null; can not change this reference because it is final/constant
		return "\n ComplexNumber[ real:" + this.real + ",img:" + this.img +"]";
		//return "\n ComplexNumber[ real:" + real + ",img:" + img +"]";
		//both are internally same as during compilation this is automatically translated
	}
	
	//Getters and Setters
	public int getReal() {
		return real; // or this.real;
	}
	
	public void setReal( int value) {
		 real = value; // this.real = value;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	//Static Getter to access static count
	// to access static data members we need static member function
	public static int getCount() {
		return count;
	}
	/*Static members cannot access instance data members because static methods are called using classname and they don't receive this reference*/
	
}
