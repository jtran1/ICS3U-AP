package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {
	static final int Seconds_In_MINUTE = 60;

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		
		System.out.println("Hi, what is your first name?");
		String runner1firstname = scanner.nextLine();
		System.out.println("What is your last name?");
		String runner1lastname = scanner.nextLine();
		
		System.out.println("Enter the time of the first mile: ");
		String time1 = scanner.nextLine();
		int runner1minutes = Integer.parseInt(time1.split(":")[0]);
		double runner1seconds = Double.parseDouble(time1.split(":")[1]);
		double runner1totalseconds1 = runner1minutes*Seconds_In_MINUTE+runner1seconds;
		String SplitOneFinal= runner1minutes + ":" + formatter.format(runner1seconds);
		
		System.out.println("Enter the time of the second mile: ");
		String runner1time2 = scanner.nextLine();
		int runner1minutes2 = Integer.parseInt(runner1time2.split(":")[0]);
		double runner1seconds2 = Double.parseDouble(runner1time2.split(":")[1]);
		double runner1totalseconds2 = runner1minutes2*Seconds_In_MINUTE+runner1seconds2;
		double runner1totalsplit2seconds = runner1totalseconds2-runner1totalseconds1;
		int runner1minutes2final = (int)runner1totalsplit2seconds/Seconds_In_MINUTE;
		double runner1seconds2final = (double)(runner1totalsplit2seconds)%60; 
		String SplitTwoFinal= runner1minutes2final + ":" + formatter.format(runner1seconds2final);
		
		System.out.println("Enter the time of the third mile: ");
		String runner1time3 = scanner.nextLine();
		int runner1minutes3 = Integer.parseInt(runner1time3.split(":")[0]);
		double runner1seconds3 = Double.parseDouble(runner1time3.split(":")[1]);
		double runner1totalseconds3 = runner1minutes3*Seconds_In_MINUTE+runner1seconds3;
		double runner1totalsplit3seconds = runner1totalseconds3-runner1totalseconds2;
		int runner1minutes3final = (int)runner1totalsplit3seconds/Seconds_In_MINUTE;
		double runner1seconds3final = (double)(runner1totalsplit3seconds)%60;
		String SplitThreeFinal= runner1minutes3final + ":" + formatter.format(runner1seconds3final);
		
		System.out.println("Runner 1");
		System.out.printf("Name:%1s", runner1firstname + "," + runner1lastname);
		System.out.printf("\nTime of mile 1:%30s", SplitOneFinal);
		System.out.printf("\nTime of mile 2:%30s", SplitTwoFinal);
		System.out.printf("\nTime of mile 3:%30s", SplitThreeFinal);
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Hi, what is your first name?");		
		String runner2firstname = scanner.nextLine();
		System.out.println("What is your last name?");
		String runner2lastname = scanner.nextLine();
		
		System.out.print("Enter the time of the first mile: ");
		String runner2time1 = scanner.nextLine();
		int runner2minutes = Integer.parseInt(runner2time1.split(":")[0]);
		double runner2seconds = Double.parseDouble(runner2time1.split(":")[1]);
		double runner2totalseconds = runner2minutes*Seconds_In_MINUTE+runner2seconds;
		String SplitOneFinal2= runner2minutes + ":" + formatter.format(runner2seconds);
		
		System.out.print("Enter the time of the second mile: ");
		String runner2time2 = scanner.nextLine();
		int runner2minutes2 = Integer.parseInt(runner2time2.split(":")[0]);
		double runner2seconds2 = Double.parseDouble(runner2time2.split(":")[1]);
		double runner2totalseconds2 = runner2minutes2*Seconds_In_MINUTE+runner2seconds2;
		double runner2totalsplit2seconds = runner2totalseconds2-runner2totalseconds;
		int runner2minutes2final = (int)runner2totalsplit2seconds/Seconds_In_MINUTE;
		double runner2seconds2final = (double)(runner2totalsplit2seconds)%60; 
		String SplitTwoFinal2= runner2minutes2final + ":" + formatter.format(runner2seconds2final);
		
		System.out.println("Enter the time of the third mile: ");
		String runner2time3 = scanner.nextLine();
		int runner2minutes3 = Integer.parseInt(runner2time3.split(":")[0]);
		double runner2seconds3 = Double.parseDouble(runner2time3.split(":")[1]);
		double runner2totalseconds3 = runner2minutes3*Seconds_In_MINUTE+runner2seconds3;
		double runner2totalsplit3seconds = runner2totalseconds3-runner2totalseconds2;
		int runner2minutes3final = (int)runner2totalsplit3seconds/Seconds_In_MINUTE;
		double runner2seconds3final = (double)(runner2totalsplit3seconds)%60;
		String SplitThreeFinal2= runner2minutes3final + ":" + formatter.format(runner2seconds3final);
		
		System.out.println("Runner 2");
		System.out.printf("\nName:%1s", runner2firstname + "," + runner2lastname);
		System.out.printf("\nTime of mile 1:%30s", SplitOneFinal2);
		System.out.printf("\nTime of mile 2:%30s", SplitTwoFinal2);
		System.out.printf("\nTime of mile 3:%30s", SplitThreeFinal2);
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Hi, what is your first name?");
		String runner3firstname = scanner.nextLine();
		System.out.println("What is your last name?");
		String runner3lastname = scanner.nextLine();
		
		System.out.println("Enter the time of the first mile: ");
		String runner3time1 = scanner.nextLine();
		int runner3minutes = Integer.parseInt(runner3time1.split(":")[0]);
		double runner3seconds = Double.parseDouble(runner3time1.split(":")[1]);
		double runner3totalseconds1 = runner3minutes*Seconds_In_MINUTE+runner3seconds;
		String SplitOneFinal3= runner3minutes + ":" + formatter.format(runner3seconds);
		
		System.out.println("Enter the time of the second mile: ");
		String runner3time2 = scanner.nextLine();
		int runner3minutes2 = Integer.parseInt(runner3time2.split(":")[0]);
		double runner3seconds2 = Double.parseDouble(runner3time2.split(":")[1]);
		double runner3totalseconds2 = runner3minutes2*Seconds_In_MINUTE+runner3seconds2;
		double runner3totalsplit2seconds = runner3totalseconds2-runner3totalseconds1;
		int runner3minutes2final = (int)runner3totalsplit2seconds/Seconds_In_MINUTE;
		double runner3seconds2final = (double)(runner3totalsplit2seconds)%60; 
		String SplitTwoFinal3= runner3minutes2final + ":" + formatter.format(runner3seconds2final);
		
		System.out.println("Enter the time of the third mile: ");
		String runner3time3 = scanner.nextLine();
		int runner3minutes3 = Integer.parseInt(runner3time3.split(":")[0]);
		double runner3seconds3 = Double.parseDouble(runner3time3.split(":")[1]);
		double runner3totalseconds3 = runner3minutes3*Seconds_In_MINUTE+runner3seconds3;
		double runner3totalsplit3seconds = runner3totalseconds3-runner3totalseconds2;
		int runner3minutes3final = (int)runner3totalsplit3seconds/Seconds_In_MINUTE;
		double runner3seconds3final = (double)(runner3totalsplit3seconds)%60;
		String SplitThreeFinal3= runner3minutes3final + ":" + formatter.format(runner3seconds3final);
		
		System.out.println("Runner 3");
		System.out.printf("\nName:%1s", runner3firstname + "," + runner3lastname);
		System.out.printf("\nTime of mile 1:%30s", SplitOneFinal3);
		System.out.printf("\nTime of mile 2:%30s", SplitTwoFinal3);
		System.out.printf("\nTime of mile 3:%30s", SplitThreeFinal3);
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Hi, what is your first name?");
		String runner4firstname = scanner.nextLine();
		System.out.println("What is your last name?");
		String runner4lastname = scanner.nextLine();
		
		System.out.println("Enter the time of the first mile: ");
		String runner4time1 = scanner.nextLine();
		int runner4minutes = Integer.parseInt(runner4time1.split(":")[0]);
		double runner4seconds = Double.parseDouble(runner4time1.split(":")[1]);
		double runner4totalseconds1 = runner4minutes*Seconds_In_MINUTE+runner4seconds;
		String SplitOneFinal4= runner4minutes + ":" + formatter.format(runner4seconds);
		
		System.out.println("Enter the time of the second mile: ");
		String runner4time2 = scanner.nextLine();
		int runner4minutes2 = Integer.parseInt(runner4time2.split(":")[0]);
		double runner4seconds2 = Double.parseDouble(runner4time2.split(":")[1]);
		double runner4totalseconds2 = runner4minutes2*Seconds_In_MINUTE+runner4seconds2;
		double runner4totalsplit2seconds = runner4totalseconds2-runner4totalseconds1;
		int runner4minutes2final = (int)runner4totalsplit2seconds/Seconds_In_MINUTE;
		double runner4seconds2final = (double)(runner4totalsplit2seconds)%60; 
		String SplitTwoFinal4= runner4minutes2final + ":" + formatter.format(runner4seconds2final);
		
		System.out.println("Enter the time of the third mile: ");
		String runner4time3 = scanner.nextLine();
		int runner4minutes3 = Integer.parseInt(runner4time3.split(":")[0]);
		double runner4seconds3 = Double.parseDouble(runner4time3.split(":")[1]);
		double runner4totalseconds3 = runner4minutes3*Seconds_In_MINUTE+runner4seconds3;
		double runner4totalsplit3seconds = runner4totalseconds3-runner4totalseconds2;
		int runner4minutes3final = (int)runner4totalsplit3seconds/Seconds_In_MINUTE;
		double runner4seconds3final = (double)(runner4totalsplit3seconds)%60;
		String SplitThreeFinal4= runner4minutes3final + ":" + formatter.format(runner4seconds3final);
		
		System.out.println("Runner 4");
		System.out.printf("\nName:%1s", runner4firstname + "," + runner4lastname);
		System.out.printf("\nTime of mile 1:%30s", SplitOneFinal4);
		System.out.printf("\nTime of mile 2:%30s", SplitTwoFinal4);
		System.out.printf("\nTime of mile 3:%30s", SplitThreeFinal4);
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Hi, what is your first name?");
		String runner5firstname = scanner.nextLine();
		System.out.println("What is your last name?");
		String runner5lastname = scanner.nextLine();
		
		System.out.println("Enter the time of the first mile: ");
		String runner5time1 = scanner.nextLine();
		int runner5minutes = Integer.parseInt(runner5time1.split(":")[0]);
		double runner5seconds = Double.parseDouble(runner5time1.split(":")[1]);
		double runner5totalseconds1 = runner5minutes*Seconds_In_MINUTE+runner5seconds;
		String SplitOneFinal5= runner5minutes + ":" + formatter.format(runner5seconds);
		
		System.out.println("Enter the time of the second mile: ");
		String runner5time2 = scanner.nextLine();
		int runner5minutes2 = Integer.parseInt(runner5time2.split(":")[0]);
		double runner5seconds2 = Double.parseDouble(runner5time2.split(":")[1]);
		double runner5totalseconds2 = runner5minutes2*Seconds_In_MINUTE+runner5seconds2;
		double runner5totalsplit2seconds = runner5totalseconds2-runner5totalseconds1;
		int runner5minutes2final = (int)runner5totalsplit2seconds/Seconds_In_MINUTE;
		double runner5seconds2final = (double)(runner5totalsplit2seconds)%60; 
		String SplitTwoFinal5= runner5minutes2final + ":" + formatter.format(runner5seconds2final);
		
		System.out.println("Enter the time of the third mile: ");
		String runner5time3 = scanner.nextLine();
		int runner5minutes3 = Integer.parseInt(runner5time3.split(":")[0]);
		double runner5seconds3 = Double.parseDouble(runner5time3.split(":")[1]);
		double runner5totalseconds3 = runner1minutes3*Seconds_In_MINUTE+runner5seconds3;
		double runner5totalsplit3seconds = runner1totalseconds3-runner5totalseconds3;
		int runner5minutes3final = (int)runner5totalsplit3seconds/Seconds_In_MINUTE;
		double runner5seconds3final = (double)(runner5totalsplit3seconds)%60;
		String SplitThreeFinal5= runner5minutes3final + ":" + formatter.format(runner1seconds3final);
		
		System.out.println("Runner 5");
		System.out.printf("\nName:%1s", runner5firstname + "," + runner5lastname);
		System.out.printf("\nTime of mile 1:%30s", SplitOneFinal5);
		System.out.printf("\nTime of mile 2:%30s", SplitTwoFinal5);
		System.out.printf("\nTime of mile 3:%30s", SplitThreeFinal5);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("   ");
		System.out.printf("Name:%18s", runner1firstname + " , " + runner1lastname);
		System.out.printf("%8s", " ");
		System.out.printf("Name:%18s", runner2firstname + " , " + runner2lastname);
		System.out.printf("%8s", " ");
		System.out.printf("Name:%18s", runner3firstname + " , " + runner3lastname);
		System.out.printf("%8s", " ");
		System.out.printf("Name:%18s", runner4firstname + "," +runner4lastname);
		System.out.printf("%8s", " ");
		System.out.printf("Name:%18s", runner5firstname + "," +runner5lastname);
		System.out.println("         ");
		System.out.printf("\nSplit 1:%16s", SplitOneFinal );
		System.out.printf(" %29s", SplitOneFinal2);
		System.out.printf(" %32s", SplitOneFinal3);
		System.out.printf(" %29s", SplitOneFinal4);
		System.out.printf(" %29s", SplitOneFinal5);
		System.out.printf("\nSplit 2:%16s", SplitTwoFinal);
	System.out.printf(" %29s", SplitTwoFinal2);
		System.out.printf(" %32s", SplitTwoFinal3);
		System.out.printf(" %29s", SplitTwoFinal4);
		System.out.printf(" %29s", SplitTwoFinal5);
		System.out.printf("\nSplit 3:%16s", SplitThreeFinal);
		System.out.printf(" %29s", SplitThreeFinal2);
		System.out.printf(" %32s", SplitThreeFinal3);
		System.out.printf(" %29s", SplitThreeFinal4);
		System.out.printf(" %29s", SplitThreeFinal5);
		
		
	}

}
