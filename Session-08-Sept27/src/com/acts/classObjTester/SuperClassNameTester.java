package com.acts.classObjTester;

import com.acts.classObj.SuperClassName;

public class SuperClassNameTester {

	public static void main(String[] args) {
		SuperClassName obj = new SuperClassName();
		System.out.println("Class Name is : "+obj.getClass());
		System.out.println("Super Class Name is : "+obj.getClass().getSuperclass());
	}

}
