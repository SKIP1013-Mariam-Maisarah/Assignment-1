package assignment1;

import java.util.Scanner;

class DiningSystemForCruise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfPassenger1;
		int noOfPassenger2;
		int noOfPassenger3a;
		int noOfPassenger3c;
		double pricepackage1 = 88;
		double pricepackage2 = 108;
		double pricepackage3a = 100;
		double pricepackage3c = 20;
		double discountRate5 = 0.05;
		double discountRate8 = 0.08;
		double chargeRate = 0.02;
		double taxRate = 0.06;
		double cashPayment;
		String name;
		String ticketNo;
		String roomNo;
		String date = "12/12/2021";
		String time = "12:30 p.m.";
		String package1 = "Chinese Cuisine";
		String package2 = "Western Food";
		String package3a = "Buffet For Adult";
		String package3c = "Buffet For Child";
		String dis5 = "5%";
		String dis8 = "8%";
		String service = "2%";
		String sst = "6%";
			
		double sum;
		double sub;
		double mul1;
		double mul2;
		double mul3a;
		double mul3c;
		double discount5;
		double discount8;
		double charge;
		double tax;
		double subtotal1;
		double subtotal2;
		double subtotal3;
		
		System.out.println("WELCOME TO LIBERTY CRUISE");
		Scanner input = new Scanner(System.in);  // input is create new object for scanner input
				
		System.out.print("Please insert your name : ");
		name = input.nextLine();
		
		System.out.print("Please enter your cruise ticket number : ");
		ticketNo = input.next();
		
		System.out.print("Please enter your room number : ");
		roomNo = input.next();
		
		System.out.println();
		
		System.out.print("Which set of meal do you want to order?");
		System.out.print("\nChinese cuisine, Western food and Buffet are served today.");
		System.out.print("\n\n-----MENU FOR EACH SET-----");
		
		System.out.println("\n\nChinese Cuisine includes : ");
		System.out.println("(1) Rice");
		System.out.println("(2) Steamed Seabass with Spicy Sauce");
		System.out.println("(3) Lemon Chicken");
		System.out.println("(4) Tepanyaki Tofu");
		System.out.println("(5) Stir Fried Vegetables with Belacan");
		System.out.println("(6) Seaweed Soup");
		System.out.println("(7) Chilled Longan");
		
		System.out.println("\nWestern Food includes : ");
		System.out.println("(1) Tomato Rice");
		System.out.println("(2) Stir Fried Sotong with Green Pepper");
		System.out.println("(3) Baked Hawaiian Chicken");
		System.out.println("(4) Brocolli & Cauliflower");
		System.out.println("(5) Mushroom Soup");
		System.out.println("(6) Sparkling Water");
		System.out.println("(7) Fresh Fruit");
		
		System.out.println("\nBuffet includes : ");
		System.out.println("(1) Salad");
		System.out.println("(2) Rice");
		System.out.println("(3) Main Dishes");
		System.out.println("(4) BBQ Station");
		System.out.println("(5) Side Dishes");
		System.out.println("(6) Soup");
		System.out.println("(7) Beverages");
		System.out.println("(8) Fruits");
		System.out.println("(9) Dessert");
		
		System.out.print("\nPlease fill in the form below to select your choice.");
		
		System.out.println();
		
		System.out.print("\nTotal set of Chinese cuisine you order : ");
		noOfPassenger1 = input.nextInt();
		System.out.print("Price of Chinese cuisine for each set : RM " + pricepackage1);
		mul1 = (noOfPassenger1 * pricepackage1);
		System.out.print("\nPayment for Chinese cuisine : RM " + mul1);
		
		System.out.println();
		
		System.out.print("\nTotal set of Western food you order: ");
		noOfPassenger2 = input.nextInt();
		System.out.print("Price of Western food for each set : RM " + pricepackage2);
		mul2 = (noOfPassenger2 * pricepackage2);
		System.out.print("\nPayment for Western food : RM " + mul2);
		
		System.out.println();
		
		System.out.print("\nTotal set of Buffet for adult : ");
		noOfPassenger3a = input.nextInt();
		System.out.print("Price of Buffet for each adult : RM " + pricepackage3a);
		mul3a = (noOfPassenger3a * pricepackage3a);
		System.out.print("\nPayment for Buffet (adult) : RM " + mul3a);
		
		System.out.println();
		
		System.out.print("\nTotal set of Buffet for children (< 6) : ");
		noOfPassenger3c = input.nextInt();
		System.out.print("Price of Buffet for each children (< 6) : RM " + pricepackage3c);
		mul3c = (noOfPassenger3c * pricepackage3c);
		System.out.print("\nPayment for Buffet (children) : RM " + mul3a);
		System.out.print("\n***The requirement for children package is the age need to be smaller than 6 years old.*** ");
		
		System.out.println();
		
		sum = mul1 + mul2 + mul3a + mul3c;
		System.out.print("\nTotal amount : RM " + sum);
		
		charge = chargeRate * sum;
		System.out.print("\nService charge : RM " + charge);
		
		tax = taxRate * sum;
		System.out.print("\nSales and Service Tax (SST) : RM " + tax);
		
		subtotal1 = sum + charge + tax;
		System.out.print("\nSubtotal Without Discount Received, 2% Service Charge and 6% SST : RM " + subtotal1);
		
		System.out.print("\nTotal cash pay : RM ");
		cashPayment = input.nextDouble();
		
		sub = cashPayment - subtotal1;
		System.out.print("Changes : RM " + sub);
		
		System.out.println();
		
		System.out.println("Processing...");
		
		System.out.println();
		
		System.out.println("                              LIBERTY CRUISE                         ");
		System.out.println("                             PAYMENT RECEIPTS                         ");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("User        : " + name);
		System.out.println("Ticket No.  : " + ticketNo);
		System.out.println("Room No.    : " + roomNo);
		System.out.println("Date        : " + date);
		System.out.println("Time        : " + time);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("No       Item Name          Unit       Price Per Unit        Cost (RM)");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("1     " + package1 + "        " + noOfPassenger1 + "             " + pricepackage1 + "                 " + mul1);
		System.out.println("2     " + package2 + "           " + noOfPassenger2 + "            " + pricepackage2 + "                 " + mul2);
		System.out.println("3     " + package3a + "       " + noOfPassenger3a + "            " + pricepackage3a + "               " + mul3a);
		System.out.println("4     " + package3c + "       " + noOfPassenger3c + "             " + pricepackage3c + "                 " + mul3c);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Amount               :                                        " + sum);
		System.out.println("--------------------------------------------------------------- ----------");
		System.out.println("Service Charge (2%)  :                                          " + charge);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("SST (6%)             :                                          " + tax);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Subtotal             :                                        " + subtotal1);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Cash                 :                                        " + cashPayment);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Balance              :                                         " + sub);
		System.out.println("*************************************************************************");
		System.out.println("                           THANK YOU COME AGAIN                     ");
		System.out.println("*************************************************************************");
	}

}

package assignment1;

import java.util.Scanner;

class DiningSystemForCruise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfPassenger1;
		int noOfPassenger2;
		int noOfPassenger3a;
		int noOfPassenger3c;
		double pricepackage1 = 88;
		double pricepackage2 = 108;
		double pricepackage3a = 100;
		double pricepackage3c = 20;
		double discountRate5 = 0.05;
		double discountRate8 = 0.08;
		double chargeRate = 0.02;
		double taxRate = 0.06;
		double cashPayment;
		String name;
		String ticketNo;
		String roomNo;
		String date = "12/12/2021";
		String time = "12:30 p.m.";
		String package1 = "Chinese Cuisine";
		String package2 = "Western Food";
		String package3a = "Buffet For Adult";
		String package3c = "Buffet For Child";
		String dis5 = "5%";
		String dis8 = "8%";
		String service = "2%";
		String sst = "6%";
			
		double sum;
		double sub;
		double mul1;
		double mul2;
		double mul3a;
		double mul3c;
		double discount5;
		double discount8;
		double charge;
		double tax;
		double subtotal1;
		double subtotal2;
		double subtotal3;
		
		System.out.println("WELCOME TO LIBERTY CRUISE");
		Scanner input = new Scanner(System.in);  // input is create new object for scanner input
				
		System.out.print("Please insert your name : ");
		name = input.nextLine();
		
		System.out.print("Please enter your cruise ticket number : ");
		ticketNo = input.next();
		
		System.out.print("Please enter your room number : ");
		roomNo = input.next();
		
		System.out.println();
		
		System.out.print("Which set of meal do you want to order?");
		System.out.print("\nChinese cuisine, Western food and Buffet are served today.");
		System.out.print("\n\n-----MENU FOR EACH SET-----");
		
		System.out.println("\n\nChinese Cuisine includes : ");
		System.out.println("(1) Rice");
		System.out.println("(2) Steamed Seabass with Spicy Sauce");
		System.out.println("(3) Lemon Chicken");
		System.out.println("(4) Tepanyaki Tofu");
		System.out.println("(5) Stir Fried Vegetables with Belacan");
		System.out.println("(6) Seaweed Soup");
		System.out.println("(7) Chilled Longan");
		
		System.out.println("\nWestern Food includes : ");
		System.out.println("(1) Tomato Rice");
		System.out.println("(2) Stir Fried Sotong with Green Pepper");
		System.out.println("(3) Baked Hawaiian Chicken");
		System.out.println("(4) Brocolli & Cauliflower");
		System.out.println("(5) Mushroom Soup");
		System.out.println("(6) Sparkling Water");
		System.out.println("(7) Fresh Fruit");
		
		System.out.println("\nBuffet includes : ");
		System.out.println("(1) Salad");
		System.out.println("(2) Rice");
		System.out.println("(3) Main Dishes");
		System.out.println("(4) BBQ Station");
		System.out.println("(5) Side Dishes");
		System.out.println("(6) Soup");
		System.out.println("(7) Beverages");
		System.out.println("(8) Fruits");
		System.out.println("(9) Dessert");
		
		System.out.print("\nPlease fill in the form below to select your choice.");
		
		System.out.println();
		
		System.out.print("\nTotal set of Chinese cuisine you order : ");
		noOfPassenger1 = input.nextInt();
		System.out.print("Price of Chinese cuisine for each set : RM " + pricepackage1);
		mul1 = (noOfPassenger1 * pricepackage1);
		System.out.print("\nPayment for Chinese cuisine : RM " + mul1);
		
		System.out.println();
		
		System.out.print("\nTotal set of Western food you order: ");
		noOfPassenger2 = input.nextInt();
		System.out.print("Price of Western food for each set : RM " + pricepackage2);
		mul2 = (noOfPassenger2 * pricepackage2);
		System.out.print("\nPayment for Western food : RM " + mul2);
		
		System.out.println();
		
		System.out.print("\nTotal set of Buffet for adult : ");
		noOfPassenger3a = input.nextInt();
		System.out.print("Price of Buffet for each adult : RM " + pricepackage3a);
		mul3a = (noOfPassenger3a * pricepackage3a);
		System.out.print("\nPayment for Buffet (adult) : RM " + mul3a);
		
		System.out.println();
		
		System.out.print("\nTotal set of Buffet for children (< 6) : ");
		noOfPassenger3c = input.nextInt();
		System.out.print("Price of Buffet for each children (< 6) : RM " + pricepackage3c);
		mul3c = (noOfPassenger3c * pricepackage3c);
		System.out.print("\nPayment for Buffet (children) : RM " + mul3a);
		System.out.print("\n***The requirement for children package is the age need to be smaller than 6 years old.*** ");
		
		System.out.println();
		
		sum = mul1 + mul2 + mul3a + mul3c;
		System.out.print("\nTotal amount : RM " + sum);
		
		discount5 = discountRate5 * sum;
		System.out.print("\nTotal discount received (3 - 6 set) : RM " + discount5);
		
		charge = chargeRate * sum;
		System.out.print("\nService charge : RM " + charge);
		
		tax = taxRate * sum;
		System.out.print("\nSales and Service Tax (SST) : RM " + tax);
		
		subtotal2 = sum - discount5 + charge + tax;
		System.out.print("\nSubtotal after 5% Discount Received, 2% Service Charge and 6% SST : RM " + subtotal2);
		
		System.out.print("\nTotal cash pay : RM ");
		cashPayment = input.nextDouble();
		
		sub = cashPayment - subtotal2;
		System.out.print("Changes : RM " + sub);
		
		System.out.println();
		
		System.out.println("Processing...");
		
		System.out.println();
		
		System.out.println("                                   LIBERTY CRUISE                         ");
		System.out.println("                                  PAYMENT RECEIPTS                         ");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("User        : " + name);
		System.out.println("Ticket No.  : " + ticketNo);
		System.out.println("Room No.    : " + roomNo);
		System.out.println("Date        : " + date);
		System.out.println("Time        : " + time);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("No          Item Name           Unit          Price Per Unit          Cost (RM)");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1        " + package1 + "         " + noOfPassenger1 + "                " + pricepackage1 + "                 " + mul1);
		System.out.println("2        " + package2 + "            " + noOfPassenger2 + "               " + pricepackage2 + "                 " + mul2);
		System.out.println("3        " + package3a + "        " + noOfPassenger3a + "               " + pricepackage3a + "                   " + mul3a);
		System.out.println("4        " + package3c + "        " + noOfPassenger3c + "                " + pricepackage3c + "                  " + mul3c);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Amount                  :                                              " + sum);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Discount Received (5%)  :                                               " + discount5);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Service Charge (2%)     :                                               " + charge);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("SST (6%)                :                                               " + tax);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Subtotal                :                                              " + subtotal2);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Cash                    :                                              " + cashPayment);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Balance                 :                                               " + sub);
		System.out.println("***********************************************************************************");
		System.out.println("     Remember to withdraw 2 Gymnasium Ticket as a free gift with this receipt.     ");
		System.out.println("***********************************************************************************");
		System.out.println("                                THANK YOU COME AGAIN                     ");
		System.out.println("***********************************************************************************");
	}

}

package assignment1;

import java.util.Scanner;

class DiningSystemForCruise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfPassenger1;
		int noOfPassenger2;
		int noOfPassenger3a;
		int noOfPassenger3c;
		double pricepackage1 = 88;
		double pricepackage2 = 108;
		double pricepackage3a = 100;
		double pricepackage3c = 20;
		double discountRate5 = 0.05;
		double discountRate8 = 0.08;
		double chargeRate = 0.02;
		double taxRate = 0.06;
		double cashPayment;
		String name;
		String ticketNo;
		String roomNo;
		String date = "12/12/2021";
		String time = "12:30 p.m.";
		String package1 = "Chinese Cuisine";
		String package2 = "Western Food";
		String package3a = "Buffet For Adult";
		String package3c = "Buffet For Child";
		String dis5 = "5%";
		String dis8 = "8%";
		String service = "2%";
		String sst = "6%";
			
		double sum;
		double sub;
		double mul1;
		double mul2;
		double mul3a;
		double mul3c;
		double discount5;
		double discount8;
		double charge;
		double tax;
		double subtotal1;
		double subtotal2;
		double subtotal3;
		
		System.out.println("WELCOME TO LIBERTY CRUISE");
		Scanner input = new Scanner(System.in);  // input is create new object for scanner input
				
		System.out.print("Please insert your name : ");
		name = input.nextLine();
		
		System.out.print("Please enter your cruise ticket number : ");
		ticketNo = input.next();
		
		System.out.print("Please enter your room number : ");
		roomNo = input.next();
		
		System.out.println();
		
		System.out.print("Which set of meal do you want to order?");
		System.out.print("\nChinese cuisine, Western food and Buffet are served today.");
		System.out.print("\n\n-----MENU FOR EACH SET-----");
		
		System.out.println("\n\nChinese Cuisine includes : ");
		System.out.println("(1) Rice");
		System.out.println("(2) Steamed Seabass with Spicy Sauce");
		System.out.println("(3) Lemon Chicken");
		System.out.println("(4) Tepanyaki Tofu");
		System.out.println("(5) Stir Fried Vegetables with Belacan");
		System.out.println("(6) Seaweed Soup");
		System.out.println("(7) Chilled Longan");
		
		System.out.println("\nWestern Food includes : ");
		System.out.println("(1) Tomato Rice");
		System.out.println("(2) Stir Fried Sotong with Green Pepper");
		System.out.println("(3) Baked Hawaiian Chicken");
		System.out.println("(4) Brocolli & Cauliflower");
		System.out.println("(5) Mushroom Soup");
		System.out.println("(6) Sparkling Water");
		System.out.println("(7) Fresh Fruit");
		
		System.out.println("\nBuffet includes : ");
		System.out.println("(1) Salad");
		System.out.println("(2) Rice");
		System.out.println("(3) Main Dishes");
		System.out.println("(4) BBQ Station");
		System.out.println("(5) Side Dishes");
		System.out.println("(6) Soup");
		System.out.println("(7) Beverages");
		System.out.println("(8) Fruits");
		System.out.println("(9) Dessert");
		
		System.out.print("\nPlease fill in the form below to select your choice.");
		
		System.out.println();
		
		System.out.print("\nTotal set of Chinese cuisine you order : ");
		noOfPassenger1 = input.nextInt();
		System.out.print("Price of Chinese cuisine for each set : RM " + pricepackage1);
		mul1 = (noOfPassenger1 * pricepackage1);
		System.out.print("\nPayment for Chinese cuisine : RM " + mul1);
		
		System.out.println();
		
		System.out.print("\nTotal set of Western food you order: ");
		noOfPassenger2 = input.nextInt();
		System.out.print("Price of Western food for each set : RM " + pricepackage2);
		mul2 = (noOfPassenger2 * pricepackage2);
		System.out.print("\nPayment for Western food : RM " + mul2);
		
		System.out.println();
		
		System.out.print("\nTotal set of Buffet for adult : ");
		noOfPassenger3a = input.nextInt();
		System.out.print("Price of Buffet for each adult : RM " + pricepackage3a);
		mul3a = (noOfPassenger3a * pricepackage3a);
		System.out.print("\nPayment for Buffet (adult) : RM " + mul3a);
		
		System.out.println();
		
		System.out.print("\nTotal set of Buffet for children (< 6) : ");
		noOfPassenger3c = input.nextInt();
		System.out.print("Price of Buffet for each children (< 6) : RM " + pricepackage3c);
		mul3c = (noOfPassenger3c * pricepackage3c);
		System.out.print("\nPayment for Buffet (children) : RM " + mul3a);
		System.out.print("\n***The requirement for children package is the age need to be smaller than 6 years old.*** ");
		
		System.out.println();
		
		sum = mul1 + mul2 + mul3a + mul3c;
		System.out.print("\nTotal amount : RM " + sum);
		
		discount8 = discountRate8 * sum;
		System.out.print("\nTotal discount received (7 - 10 set) : RM " + discount8);
		
		charge = chargeRate * sum;
		System.out.print("\nService charge : RM " + charge);
		
		tax = taxRate * sum;
		System.out.print("\nSales and Service Tax (SST) : RM " + tax);
		
		subtotal3 = sum - discount8 + charge + tax;
		System.out.print("\nSubtotal after 8% Discount Received, 2% Service Charge and 6% SST : RM " + subtotal3);
		
		System.out.print("\nTotal cash pay : RM ");
		cashPayment = input.nextDouble();
		
		sub = cashPayment - subtotal3;
		System.out.println("Changes : RM " + sub);
		
		System.out.println();
		
		System.out.println("Processing...");
		
		System.out.println();
		
		System.out.println("                                   LIBERTY CRUISE                         ");
		System.out.println("                                  PAYMENT RECEIPTS                         ");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("User        : " + name);
		System.out.println("Ticket No.  : " + ticketNo);
		System.out.println("Room No.    : " + roomNo);
		System.out.println("Date        : " + date);
		System.out.println("Time        : " + time);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("No          Item Name           Unit          Price Per Unit          Cost (RM)");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1        " + package1 + "         " + noOfPassenger1 + "                " + pricepackage1 + "                 " + mul1);
		System.out.println("2        " + package2 + "            " + noOfPassenger2 + "               " + pricepackage2 + "                 " + mul2);
		System.out.println("3        " + package3a + "        " + noOfPassenger3a + "               " + pricepackage3a + "                 " + mul3a);
		System.out.println("4        " + package3c + "        " + noOfPassenger3c + "                " + pricepackage3c + "                  " +mul3c);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Amount                  :                                              " + sum);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Discount Received (8%)  :                                               " + discount8);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Service Charge (2%)     :                                               " + charge);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("SST (6%)                :                                               " + tax);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Subtotal                :                                              " + subtotal3);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Cash                    :                                             " + cashPayment);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Balance                 :                                              " + sub);
		System.out.println("***********************************************************************************");
		System.out.println(" Remember to withdraw 4 Magic Performance Ticket as a free gift with this receipt.");
		System.out.println("***********************************************************************************");
		System.out.println("                                THANK YOU COME AGAIN                     ");
		System.out.println("***********************************************************************************");
	}

}
