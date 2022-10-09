package com.acts.shapeMenu;
import static java.lang.System.out;
import java.util.Scanner;
public class ShapeUtil {
	static Scanner sc = new Scanner(System.in);
	private static int arrSize =0;
	public static Shape addShape() {
		Shape s1;
		int choice = 0;
		
		do {
			out.println("Press:\n 1. to add Circle \n 2. to add Rectangle  \n 3. to add Square");
			choice = sc.nextInt();
			switch(choice) {

			case 1: { 
				out.println("Enter radius");
				int radius = sc.nextInt();
				s1= new Circle(radius);
				System.out.println("Circle added successfully");
				arrSize++;
				return s1;
			}
			case 2: { 
				out.println("Enter length");
				int length = sc.nextInt();
				out.println("Enter breadth");
				int breadth = sc.nextInt();
				s1= new Rectangle(length,breadth);
				System.out.println("Rectangle added successfully");
				arrSize++;
				return s1;
			}
			
			case 3: {
				out.println("Enter Side");
				int side = sc.nextInt();
				s1 = new Square(side);
				System.out.println("Square added successfully");
				arrSize++;
				return s1;
				
			}


			}

		}while(choice!= 0);
		return null;

	}
	public static int getArrSize() {
		return arrSize;
	}
    public static void getArea(Shape[] sh) {
    	
    	int choice = 0;
    	do {
    		out.println("1. For Circle Areas \n 2. For Rectangle Areas \n 3. For Square Areas);"
    				+ "\n 0. Exit");
    				choice = sc.nextInt();
    		switch(choice) {
    		case 1 : {
    			for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					if(sh[i] instanceof Circle ) {
						System.out.println("Circle "+(i+1)+" Area: "+sh[i].calcArea());
					}
				}
    			break;
    		}
    		case 2 : {
    			for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					if(sh[i] instanceof Rectangle ) {
						System.out.println("Rectangle "+(i+1)+" Area: "+sh[i].calcArea());
					}
				}
    			break;
    		}
    		case 3 : {
    			for(int i = 0; i<ShapeUtil.getArrSize(); i++) {
					if(sh[i] instanceof Square ) {
						System.out.println("Square "+(i+1)+" Area: "+sh[i].calcArea());
					}
				}
    			break;
    		}
    		}
    	}while (choice!=0);
        sc.close();
    }

}
