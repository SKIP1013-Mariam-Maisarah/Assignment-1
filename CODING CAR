package assignment1;
import java.util.Scanner;
public class CarProbSolution {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String carBrand,carModel,engineCode,engineSpec1,engineSpec2,engineSpec3,engineMaxRPMString,newEngineRPMRedlineString;	
		int carManufacturedYr;
		double engineCurrentHP,engineCurrentTorque,engineMaxRPM,packageIntakeHP,packageIntakeTorque,packageHotColdPipeHP,packageHotColdPipeTorque,
		packageIntercoolerHP,packageIntercoolerTorque,packageDownpipeHP,packageDownpipeTorque,packageCatBackExhaustHP,
		packageCatBackExhaustTorque,packageMidpipeHP,packageMidpipeTorque,packageECUHP,packageECUTorque,packageTotalOutputHP,packageTotalOutputTorque,
		newEngineHP,newEngineTorque,newEngineRPMRedline; 
		packageIntakeHP=17;
		packageIntakeTorque=36;
		packageHotColdPipeHP=8;
		packageHotColdPipeTorque=13;
		packageIntercoolerHP=32;
		packageIntercoolerTorque=53;
		packageDownpipeHP=36;
		packageDownpipeTorque=37;
		packageCatBackExhaustHP=14;
		packageCatBackExhaustTorque=22;
		packageMidpipeHP=15;
		packageMidpipeTorque=20;
		packageECUHP=45;
		packageECUTorque=79;
		packageTotalOutputHP=(packageIntakeHP+packageHotColdPipeHP+packageIntercoolerHP+packageDownpipeHP+packageCatBackExhaustHP+packageMidpipeHP+packageECUHP);
		packageTotalOutputTorque=(packageIntakeTorque+packageHotColdPipeTorque+packageIntercoolerTorque+packageDownpipeTorque+packageCatBackExhaustTorque+packageMidpipeTorque+packageECUTorque);
	
		System.out.println("Welcome to EvoClub Tuning Workshop");
		System.out.println("Enter the details and specifications of the car");
		System.out.println("Car Brand:");
		carBrand=sc.next();
		System.out.println("Car Brand: "+carBrand);
		System.out.println("Car Model:");
		carModel=sc.next();
		System.out.println("Car Model: "+carModel);
		System.out.println("Car Manufactured Year:");
		carManufacturedYr=sc.nextInt();
		System.out.println("Car Manufactured in "+carManufacturedYr);
		System.out.println("Engine Code:");
		engineCode=sc.next();
		System.out.println("Engine Code: "+engineCode);
		System.out.println("Engine Spec(Capacity,Arrangement of Cylinders, Type of aspiration):");
		engineSpec1=sc.next();
		engineSpec2=sc.next();
		engineSpec3=sc.next();
		System.out.println("Engine Spec: "+engineSpec1+" "+engineSpec2+" "+engineSpec3);
		System.out.println("Current Engine Horsepower:");
		engineCurrentHP=sc.nextDouble();
		System.out.println("Current Engine Horsepower: "+engineCurrentHP+"HP");
		System.out.println("Current Engine Torque(Nm):");
		engineCurrentTorque=sc.nextDouble();
		System.out.println("Current Engine Torque: "+engineCurrentTorque+"Nm");
		engineMaxRPM=((engineCurrentHP/(engineCurrentTorque*0.73756)*5252));
		engineMaxRPMString=("Current Engine Max RPM Redline: "+(String.format("%.2f",engineMaxRPM))+"RPM");
		System.out.println(engineMaxRPMString);
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("|Your car info:                            |");
		System.out.println("|Car Brand: "+carBrand+"                            |");
		System.out.println("|Car Model: "+carModel+"                             |");
		System.out.println("|Car Manufactured Year: "+carManufacturedYr+"               |");
		System.out.println("|Engine Code: "+engineCode+"                          |");
		System.out.println("|Engine Spec: "+engineSpec1+","+engineSpec2+","+engineSpec3+"           |");
		System.out.println("|Current Engine Horsepower: "+engineCurrentHP+"          |");
		System.out.println("|Current Engine Torque(Nm): "+engineCurrentTorque+"          |");
		System.out.println("|"+engineMaxRPMString+"|");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
		System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
		System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
		System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
		System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
		System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
		System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
		System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
		System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("|Engine Stats and Data after tuning:|");
		newEngineHP=engineCurrentHP+packageTotalOutputHP;
		newEngineTorque=engineCurrentTorque+packageTotalOutputTorque;
		System.out.println("|Engine Horsepower: "+newEngineHP+"HP         |");
		System.out.println("|Engine Torque: "+newEngineTorque+"Nm            |");
		newEngineRPMRedline=((newEngineHP/(newEngineTorque*0.73756)*5252));
		newEngineRPMRedlineString=(String.format("%.2f",newEngineRPMRedline));
		System.out.println("|Engine Max RPM Redline: "+newEngineRPMRedlineString+"RPM |");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}	
}
