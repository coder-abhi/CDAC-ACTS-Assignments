package com.acts.shapeMenu;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;


public class ShapeMenuTester {
	public static void main(String []args) {
		int choice = 0;
		int counter = 0;
		Shape[] sh = new Shape[100];
		Scanner sc = new Scanner (System.in);

		do {
			out.println("Select : "
					+ "\n 1.Add a shape"
					+ "\n 2.Display all shapes info"
					+ "\n 3.Display all circle info"
					+ "\n 4.Display all rectangle info"
					+ "\n 5.Display all square info"
					+ "\n 6.Display areas of shapes"
					+ "\n 0.Exit");
			choice = sc.nextInt();

			switch(choice) {

			case 1 :{
				sh[counter++] = ShapeUtil.addShape();
				break;
			}
			case 2 :{
				System.out.println("Shapes are: \n");
				for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					System.out.println(sh[i].toString());	
				}
				break;
			}
			case 3 :{
				for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					if(sh[i] instanceof Circle ) {
						System.out.println(sh[i].toString());
					}
				}
				break;
			}
			case 4 :{
				for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					if(sh[i] instanceof Rectangle ) {
						System.out.println(sh[i].toString());
					}
				}
				break;
			} 
			
			case 5 :{
				for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					if(sh[i] instanceof Square ) {
						System.out.println(sh[i].toString());
					}
				}
				break;
			} 
			case 6 : {
				ShapeUtil.getArea(sh);
				break;
			}
			
			
			case 0 : {
				System.out.println("Exit");
				System.exit(0);
			}

			}
		}while(choice!= 0);

	}
}