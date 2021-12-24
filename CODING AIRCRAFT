package assignment1;

import java.util.Scanner;

public class FlightPriceTicketSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare variable and its value
		String name;
		String destination;
		String departureDate;
		String departureTime;
		int totalIndividualPack, totalDuoPack, totalFamiliaPack;
		
		float individualPrice, duoPrice, familiaPrice;
		float individualPrice2,duoPrice2,familiaPrice2;
		float foodPrice = 30;
		float baggagePrice = 90;
		float seatPrice = 180;
		int disc1 = 95;
		int disc2 = 85;
		int disc3 = 75;	
		
		float totalIndividual,totalDuo,totalFamilia;
		float totalIndividual2,totalDuo2,totalFamilia2;
		float totalPrice;
		float finalPrice;
		float savePrice;
		int orderNumber = (int)(Math.random() * 10000);
		
		
		//Calculate every package before promotion
		individualPrice = seatPrice;
		duoPrice = (seatPrice * 2) + (baggagePrice * 2);
		familiaPrice= (seatPrice * 5) + (baggagePrice * 5) + (foodPrice * 5);
		
		//Calculate every package after promotion
		individualPrice2 = (individualPrice * disc1 ) /100;
		duoPrice2= (duoPrice *disc2) / 100;
		familiaPrice2 = (familiaPrice * disc3)/100;

		
		//Display package deals during the holiday promotion deals
		//Display original price and after promotion price
		System.out.println("\n                                 WELCOME TO GERAK AIRWAYS                       ");
		System.out.println("                              HOLIDAY DECEMBER PROMO DEALS                      ");
		System.out.println("                            Travel Together, Get Better Deals                   ");
		System.out.print(" ");
		System.out.println("_______________________________________________________________________________________" );
		System.out.println("|    INDIVIDUAL PACKAGE     |         DUO PACKAGE       |        FAMILIA PACKAGE       |");
		System.out.println("|___________________________|___________________________|______________________________|");
		System.out.printf("|BEFORE PROMO PRICE:RM%.2f" ,individualPrice);
		System.out.printf("|BEFORE PROMO PRICE:RM%.2f" ,duoPrice);
		System.out.printf("|BEFORE PROMO PRICE:RM%.2f" ,familiaPrice);
		System.out.print("  |");
		System.out.println("");
		System.out.printf("|AFTER PROMO PRICE:RM %.2f", individualPrice2);
		System.out.printf("|AFTER PROMO PRICE :RM%.2f",duoPrice2);
		System.out.printf("|AFTER PROMO PRICE:RM%.2f " ,familiaPrice2 );
		System.out.print("  |");
		System.out.println("");
		System.out.println("|      (ONE WAY PER PERSON) |     (ONE WAY TWO PERSON)  |    (ONE WAY FIVE PERSON)     |");
		System.out.println("|      -No food included    |    -Not food included     |    - Included food           |");
		System.out.println("|      -No 7kgs baggage     |    -7kgs baggage included |    - 7kgs baggage included   |");
		System.out.println("|                           |                           |                              |" );
		System.out.println("|    EXTRA 5% DISCOUNT      |    EXTRA 15% DISCOUNT     |       EXTRA 25% DISCOUNT     |");
		System.out.println("|___________________________|___________________________|______________________________|" );
		
		//User input the information using Scanner
		System.out.println("\n\n                                   GERAK AIRWAYS                               ");
		System.out.println("                             FLIGHT PRICE TICKET SYSTEM                            ");
		System.out.println("                            HOLIDAY DECEMBER PROMO DEALS                           ");
		System.out.println("                         Travel Together, Get Better Deals                         ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.print(" Please insert name: ");
		name=input.nextLine();
		
		System.out.print(" Please insert destination: ");
		destination=input.nextLine();
		
		System.out.print(" Please insert departure date: ");
		departureDate=input.nextLine();
		
		System.out.print(" Please insert departure time: ");
		departureTime=input.nextLine();
		
		System.out.print(" Please insert the number of individual package to book: ");
		totalIndividualPack=input.nextInt();
		
		System.out.print(" Please insert the number of duo package to book: ");
		totalDuoPack=input.nextInt();
		
		System.out.print(" Please insert the number of familia package to book: ");
		totalFamiliaPack=input.nextInt();
		
		//Calculate total price input from the users
		//Calculate to show the differences of before after total promotion price
		totalIndividual2 = individualPrice2 * totalIndividualPack;
		totalDuo2= duoPrice2 * totalDuoPack;
		totalFamilia2 = familiaPrice2 * totalFamiliaPack;
		totalIndividual = individualPrice * totalIndividualPack;
		totalDuo= duoPrice * totalDuoPack;
		totalFamilia = familiaPrice * totalFamiliaPack;
		totalPrice = totalIndividual + totalDuo +totalFamilia;
		finalPrice = totalIndividual2 + totalDuo2 +totalFamilia2;
		savePrice = totalPrice - finalPrice;
		
		System.out.println("____________________________________________________________________________________");
		//Display user flight payment details
		System.out.println("\n                                   GERAK AIRWAYS                              ");
		System.out.println("                                 FLIGHT PAYMENT DETAILS                           ");
		System.out.println("No of Order:" +orderNumber);
		System.out.println("\nName: " +name);
		System.out.println("Destination: " +destination);
		System.out.println("Departure Date: " +departureDate);
		System.out.println("Departure Time: " +departureTime);
		System.out.println("Total individual package: " +totalIndividualPack);
		System.out.println("Total duo package: " +totalDuoPack);
		System.out.println("Total familia package: " +totalFamiliaPack);
		System.out.printf("Total price BEFORE discount: RM%.2f" ,totalPrice);
		System.out.println("");
		System.out.printf("Total price AFTER discount: RM%.2f" ,finalPrice);
		System.out.println("");
		System.out.printf("CONGRATULATIONS!! YOU GET TO SAVE YOUR TICKET FLIGHT FOR DECEMBER PROMOTION WITH RM%.2f" ,savePrice);
		System.out.println("");
		System.out.println("\n*********************************************************************************");
		System.out.println("\n                   YOUR PURCHASE HAVE BEEN SUCCESSFULLY BOOOKED                 ");
		System.out.println("\n                      THANK YOU FOR BOOKING WITH GERAK AIRWAYS                  ");
		System.out.println("\n                         Travel Together, Get Better Deals                      ");
		System.out.println("\n*********************************************************************************");
		System.out.println("_____________________________________________________________________________________");
		
	}

}
