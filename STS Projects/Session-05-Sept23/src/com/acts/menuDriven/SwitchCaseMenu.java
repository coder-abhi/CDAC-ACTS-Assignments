package com.acts.menuDriven;
import java.util.*;
public class SwitchCaseMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int choice = 0;
		double bill = 0.0;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1. Dosa (Rs 30)");
			System.out.println("2. Poha (Rs 20)");
			System.out.println("3. Idli (Rs 20)");
			System.out.println("4. Tea (Rs 10)");
			System.out.println("5. Coffee (Rs 20)");
			System.out.println("6. Stop and Generate Bill");
			System.out.println("Enter Selection");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Dosa Selected");
				bill = bill + 30;
				break;
			}
			case 2: {
				System.out.println("Poha Selected");
				bill = bill + 20;
				break;
			}
			case 3: {
				System.out.println("Idli Selected");
				bill = bill + 20;
				break;
			}
			case 4: {
				System.out.println("Tea Selected");
				bill = bill + 10;
				break;
			}
			case 5: {
				System.out.println("Coffee Selected");
				bill = bill + 20;
				break;
			}
			case 6: {
				System.out.println("Total Bill :"+bill);
				break;
			}

			}

		}while(choice!=0);

		sc.close();
	}
}