package assignment1;
import java.util.Scanner;
public class SystemToCalculateEstimatedServiceCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		String model;
		double brakecable = 35;
		double brakepads = 8;
		double brakedrums = 89;
		double carburetor = 55;
		double airfilter = 13;
		double fuelfilter = 10.40;
		double sparkplug = 8;
		double shockabsorber = 52.90;
		double chainsprocket = 49;
		double clutchplates = 50.20;
		double radials = 168;
		double breakshoe = 29.20;
		double drum = 242.80;
		double bearings = 22;
		int quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7;
		int quantity8, quantity9, quantity10, quantity11, quantity12, quantity13, quantity14;
		double discount1, discount2, discount3;
		double total1, total2, total3, total4;
		double subtotal, sst, grandtotal;
		
		System.out.print("Welcome to System to Calculate Estimated Service Charge");
		
		System.out.println("\n______________________________________________________________________________________________");
		System.out.println("| Braking problems    | Bad Throttle Response | Vibrations or jerking | High Fuel Consumption|");
		System.out.println("|_____________________|_______________________|_______________________|______________________|");
		System.out.println("|Item 1: Brake cable  |Item 1: Carburetor     |Item 1: Shock absorber |Item 1: Clutch plates |");
		System.out.println("|Item 2: Brake pads   |Item 2: Air filter     |Item 2: Chain sprocket |Item 2: Radials       |");
		System.out.println("|Item 3: Brake drums  |Item 3: Fuel filter    |                       |Item 3: Break shoe    |");
		System.out.println("|                     |Item 4: Spark plug     |                       |Item 4: Drum          |");
		System.out.println("|                     |                       |                       |Item 5: Bearings      |");             
		System.out.println("|_____________________|_______________________|_______________________|______________________|");
		System.out.println("50% off will be given for diagnose with more than two items");

		System.out.println("\nEnter model of motorcycle: ");
		model = scan.next();
		
		System.out.println("\nBraking Problems");
		System.out.print("Quantity of item 1: ");
		quantity1 = scan.nextInt();
		System.out.print("Quantity of item 2: ");
		quantity2 = scan.nextInt();
		System.out.print("Quantity of item 3: ");
		quantity3 = scan.nextInt();
		total1 = (brakecable*quantity1) + (brakepads*quantity2) + (brakedrums*quantity3);
		System.out.printf("Price: RM %.2f" , total1);
		discount1 = total1*0.5;
		System.out.printf("\nPrice after discount: RM %.2f" , discount1);
		
		System.out.println("");
		System.out.println("\nBad Throttle Response");
		System.out.print("Quantity of item 1: ");
		quantity4 = scan.nextInt();
		System.out.print("Quantity of item 2: ");
		quantity5 = scan.nextInt();
		System.out.print("Quantity of item 3: ");
		quantity6 = scan.nextInt();
		System.out.print("Quantity of item 4: ");
		quantity7 = scan.nextInt();
		total2 = (carburetor*quantity4) + (airfilter*quantity5) + (fuelfilter*quantity6) + (sparkplug*quantity7);
		System.out.printf("Price: RM %.2f" , total2);
		discount2 = total2*0.5;
		System.out.printf("\nPrice after discount: RM %.2f" , discount2);
		
		System.out.println("");
		System.out.println("\nVibrations or jerking");
		System.out.print("Quantity of item 1: ");
		quantity8 = scan.nextInt();
		System.out.print("Quantity of item 2: ");
		quantity9 = scan.nextInt();
		total3 = (shockabsorber*quantity8) + (chainsprocket*quantity9);
		System.out.printf("Price: RM %.2f" , total3);
		
		System.out.println("");
		System.out.println("\nHigh Fuel Consumption");
		System.out.print("Quantity of item 1: ");
		quantity10 = scan.nextInt();
		System.out.print("Quantity of item 2: ");
		quantity11 = scan.nextInt();
		System.out.print("Quantity of item 3: ");
		quantity12 = scan.nextInt();
		System.out.print("Quantity of item 4: ");
		quantity13 = scan.nextInt();
		System.out.print("Quantity of item 5: ");
		quantity14 = scan.nextInt();
		total4 = (clutchplates*quantity10) + (radials*quantity11) + (breakshoe*quantity12) + (drum*quantity13) + (bearings*quantity14);
		System.out.printf("Price: RM %.2f" , total4);
		discount3 = total4*0.5;
		System.out.printf("\nPrice after discount: RM %.2f" , discount3);
		
		System.out.println(" ");
		System.out.println("\nModel of motorcycle: " + model);
		subtotal = discount1 + discount2 + total3 + discount3;
		System.out.printf("Subtotal: RM %.2f" , subtotal);
		sst = subtotal*0.1;
		System.out.printf("\nSST: RM %.2f" , sst);
		grandtotal = subtotal + sst;
		System.out.printf("\nGrand total: RM %.2f" , grandtotal);	
	}

}
