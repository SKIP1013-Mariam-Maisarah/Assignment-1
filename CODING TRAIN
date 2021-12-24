package assignment1;

import java.util.Scanner;

public class PurchasingTicketSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double norSAdult = 65.70;
		double norSChild, norSStud, norSOKU, norSSenior;
		double hotSAdult, hotSChild, hotSStud, hotSOKU, hotSSenior;
		double cafeSAdult, cafeSChild, cafeSStud, cafeSOKU, cafeSSenior;
		double totalnorSAdult, totalnorSChild, totalnorSStud, totalnorSOKU, totalnorSSenior;
		double totalhotSAdult, totalhotSChild, totalhotSStud, totalhotSOKU, totalhotSSenior;
		double totalcafeSAdult, totalcafeSChild, totalcafeSStud, totalcafeSOKU, totalcafeSSenior;
		double sst = 0.06;
		double tax;
		double sum;
		double subtotal;
		double earlyBal = 700;
		double finalBal;
		int norSAdultQuan, norSChildQuan, norSStudQuan, norSOKUQuan, norSSeniorQuan;
		int hotSAdultQuan, hotSChildQuan, hotSStudQuan, hotSOKUQuan, hotSSeniorQuan;
		int cafeSAdultQuan, cafeSChildQuan, cafeSStudQuan, cafeSOKUQuan, cafeSSeniorQuan;
	
		String date = "30/12/2021";
		String time = "4:30 p.m.";
		String orderID = "301221003";
		String category1 = "Adult Passenger (Normal Seat)";
		String category2 = "Adult Passenger (Hot Seat)";
		String category3 = "Adult Passenger (Cafeteria Seat)";
		String category4 = "Child Passenger (Normal Seat)";
		String category5 = "Child Passenger (Hot Seat)";
		String category6 = "Child Passenger (Cafeteria Seat)";
		String category7 = "Student Passenger (Normal Seat)";
		String category8 = "Student Passenger (Hot Seat)";
		String category9 = "Student Passenger (Cafeteria Seat)";
		String category10 = "Disabled Passenger (Normal Seat)";
		String category11 = "Disabled Passenger (Hot Seat)";
		String category12 = "Disabled Passenger (Cafeteria Seat)";
		String category13 = "Senior Passenger (Normal Seat)";
		String category14 = "Senior Passenger (Hot Seat)";
		String category15 = "Senior Passenger (Cafeteria Seat)";
		String payMethod = "Malaysia Railways e-Wallet";
		String clientName;
		String depSt; 
		String destSt;
		
		hotSAdult = (norSAdult * 110) / 100;
		cafeSAdult = (norSAdult * 115) / 100;
		
		norSChild = (norSAdult * 90) / 100;
		hotSChild = (hotSAdult * 90) / 100;
		cafeSChild = (cafeSAdult * 90) / 100;
		
		norSStud = (norSAdult * 80) / 100;
		hotSStud = (hotSAdult * 80) / 100;
		cafeSStud = (cafeSAdult * 80) / 100;
		
		norSOKU = (norSAdult * 60) / 100;
		hotSOKU = (hotSAdult * 60) / 100;
		cafeSOKU = (cafeSAdult * 60) / 100;
		
		norSSenior = (norSAdult * 70) / 100;
		hotSSenior = (hotSAdult * 70) / 100;
		cafeSSenior = (cafeSAdult * 70) / 100;
		
	
		System.out.println("\n                                               Welcome to Malaysia Railways                                            ");
		System.out.println("                                                Purchasing Ticket System!                                                ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");

		
		System.out.print("Please enter your name: ");
		clientName = input.nextLine();
		System.out.println("Welcome " + clientName + "!");
		System.out.println(" ");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("Where do you want to go, "+ clientName + "?");
		System.out.print("Departure Station: ");
		depSt = input.nextLine();
		System.out.print("Destination Station: ");
		destSt = input.nextLine();
		
		System.out.println(" ");
		System.out.println("You have selected to depart at " + depSt + " Station and arrive at " + destSt + " Station.");
		System.out.println(" ");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
		System.out.println("    ________________________________________________________________________________________________________________");
		System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
		System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
		System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
		System.out.println("    |                  |                              |                             |                              |");
		System.out.printf ("    |      ADULT"           );
		System.out.printf ("       |           RM%.2f" , norSAdult);
		System.out.printf ("            |          RM%.2f", hotSAdult );
		System.out.printf ("            |           RM%.2f", cafeSAdult );
		System.out.print  ("            |");
		System.out.println("");
		System.out.println("    |                  |                              |                             |                              |");
		
		System.out.printf ("    |      CHILD"           );
		System.out.printf ("       |           RM%.2f" , norSChild);
		System.out.printf ("            |          RM%.2f", hotSChild );
		System.out.printf ("            |           RM%.2f", cafeSChild );
		System.out.print  ("            |");
		System.out.println("");
		System.out.println("    |                  |                              |                             |                              |");
		
		System.out.printf ("    |     STUDENT"    );
		System.out.printf ("      |           RM%.2f" , norSStud);
		System.out.printf ("            |          RM%.2f", hotSStud );
		System.out.printf ("            |           RM%.2f", cafeSStud );
		System.out.print  ("            |");
		System.out.println("");
		System.out.println("    |                  |                              |                             |                              |");
		
		System.out.printf ("    |     DISABLED"     );
		System.out.printf ("     |           RM%.2f" , norSOKU);
		System.out.printf ("            |          RM%.2f", hotSOKU );
		System.out.printf ("            |           RM%.2f", cafeSOKU );
		System.out.print  ("            |");
		System.out.println("");
		System.out.println("    |                  |                              |                             |                              |");
		
		System.out.printf ("    |      SENIOR"          );
		System.out.printf ("      |           RM%.2f" , norSSenior);
		System.out.printf ("            |          RM%.2f", hotSSenior );
		System.out.printf ("            |           RM%.2f", cafeSSenior );
		System.out.print  ("            |");
		System.out.println("");
		System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
		
		System.out.println("");
		System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
		System.out.println("");
		System.out.print("Adult Passenger (Normal Seat): ");
		norSAdultQuan = input.nextInt();
		System.out.print("Adult Passenger (Hot Seat): ");
		hotSAdultQuan = input.nextInt();
		System.out.print("Adult Passenger (Cafeteria Seat): ");
		cafeSAdultQuan = input.nextInt();
		System.out.println("");
		
		System.out.print("Child Passenger (Normal Seat): ");
		norSChildQuan = input.nextInt();
		System.out.print("Child Passenger (Hot Seat): ");
		hotSChildQuan = input.nextInt();
		System.out.print("Child Passenger (Cafeteria Seat): ");
		cafeSChildQuan = input.nextInt();
		System.out.println("");
		
		System.out.print("Student Passenger (Normal Seat): ");
		norSStudQuan = input.nextInt();
		System.out.print("Student Passenger (Hot Seat): ");
		hotSStudQuan = input.nextInt();
		System.out.print("Student Passenger (Cafeteria Seat): ");
		cafeSStudQuan = input.nextInt();
		System.out.println("");
		
		System.out.print("Disabled Passenger (Normal Seat): ");
		norSOKUQuan = input.nextInt();
		System.out.print("Disabled Passenger (Hot Seat): ");
		hotSOKUQuan = input.nextInt();
		System.out.print("Disabled Passenger (Cafeteria Seat): ");
		cafeSOKUQuan = input.nextInt();
		System.out.println("");
		
		System.out.print("Senior Passenger (Normal Seat): ");
		norSSeniorQuan = input.nextInt();
		System.out.print("Senior Passenger (Hot Seat): ");
		hotSSeniorQuan = input.nextInt();
		System.out.print("Senior Passenger (Cafeteria Seat): ");
		cafeSSeniorQuan = input.nextInt();
		System.out.println("");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");
		
		totalnorSAdult = norSAdultQuan * norSAdult;
		totalhotSAdult = hotSAdultQuan * hotSAdult;
		totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
		totalnorSChild = norSChildQuan * norSChild;
		totalhotSChild = hotSChildQuan * hotSChild;
		totalcafeSChild = cafeSChildQuan * cafeSChild;
		totalnorSStud = norSStudQuan * norSStud;
		totalhotSStud = hotSStudQuan * hotSStud;
		totalcafeSStud = cafeSStudQuan * cafeSStud;
		totalnorSOKU = norSOKUQuan * norSOKU;
		totalhotSOKU = hotSOKUQuan * hotSOKU;
		totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
		totalnorSSenior = norSSeniorQuan * norSSenior;
		totalhotSSenior = hotSSeniorQuan * hotSSenior;
		totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
		
		sum = totalnorSAdult + totalnorSChild + totalnorSStud + totalnorSOKU + totalnorSSenior + totalhotSAdult + totalhotSChild + totalhotSStud + totalhotSOKU + totalhotSSenior + totalcafeSAdult + totalcafeSChild + totalcafeSStud + totalcafeSOKU + totalcafeSSenior;
		tax = sst * sum;
		subtotal = sum + tax;
		finalBal = earlyBal - subtotal;
		
		System.out.println("                                                  MALAYSIA RAILWAYS                                                      ");
		System.out.println("                                            TICKET PURCHASED CONFIRMATION                                                ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Name                       : " + clientName);
		System.out.println("Order ID.                  : " + orderID);
		System.out.println("Date Purchased             : " + date);
		System.out.println("Time Purchased             : " + time);
		System.out.println("Payment Method             : " + payMethod);
		System.out.println("Departure Station          : " + depSt + " Station");
		System.out.println("Destination Station        : " + destSt + " Station");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("No             Ticket Categories                            Quantity                                   Cost (RM)        ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf ("\n1          " + category1 + "                       " + norSAdultQuan + "                                         %.2f" , totalnorSAdult);
		System.out.printf ("\n2          " + category2 + "                          " + hotSAdultQuan + "                                         %.2f" , totalhotSAdult);
		System.out.printf ("\n3          " + category3 + "                    " + cafeSAdultQuan + "                                         %.2f", totalcafeSAdult);
		System.out.printf ("\n4          " + category4 + "                       " + norSChildQuan + "                                         %.2f" , totalnorSChild);
		System.out.printf ("\n5          " + category5 + "                          " + hotSChildQuan + "                                         %.2f" , totalhotSChild);
		System.out.printf ("\n6          " + category6 + "                    " + cafeSChildQuan + "                                         %.2f" , totalcafeSChild);
		System.out.printf ("\n7          " + category7 + "                     " + norSStudQuan + "                                         %.2f" , totalnorSStud);
		System.out.printf ("\n8          " + category8 + "                        " + hotSStudQuan + "                                         %.2f" , totalhotSStud);
		System.out.printf ("\n9          " + category9 + "                  " + cafeSStudQuan + "                                         %.2f" , totalcafeSStud);
		System.out.printf ("\n10         " + category10 + "                    " + norSOKUQuan + "                                         %.2f" , totalnorSOKU);
		System.out.printf ("\n11         " + category11 + "                       " + hotSOKUQuan + "                                         %.2f" , totalhotSOKU);
		System.out.printf ("\n12         " + category12 + "                 " + cafeSOKUQuan + "                                         %.2f" , totalcafeSOKU);
		System.out.printf ("\n13         " + category13 + "                      " + norSSeniorQuan + "                                         %.2f" , totalnorSSenior);
		System.out.printf ("\n14         " + category14 + "                         " + hotSSeniorQuan + "                                         %.2f" , totalhotSSenior);
		System.out.printf ("\n15         "  + category15 + "                   " + cafeSSeniorQuan + "                                         %.2f" , totalcafeSSenior);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Amount                                        :                                                         %.2f" , sum);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Sales and Service Tax (SST)                   :                                                         %.2f" , tax);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Subtotal                                      :                                                         %.2f" , subtotal);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Malaysia Railways e-Wallet Balance            :                                                         %.2f" , finalBal);

		
		
		
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("                                                    Congratulations!                                                       ");
		System.out.println("                                           You purchases have been confirmed                                               ");
		System.out.println("                                       Please be at the station 30 minutes earlier                                         ");
		System.out.println("                                            Have a nice day " + clientName +"!                                                ");
		
	}

}
