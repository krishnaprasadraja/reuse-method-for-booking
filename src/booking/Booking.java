package booking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Booking {
	public static void booking() {
		 Scanner sc=new Scanner (System.in);
			 
			 System.out.println("enter the car type:");
			 System.out.println("1:Micro");
			 System.out.println("2:Mini");
			 System.out.println("3:prime");
			LocalDate date= LocalDate.now();  
			String jDate=sc.next();
			LocalDate journyDate=LocalDate.parse(jDate);
			System.out.println("JOURNY DATE:"+journyDate);
			LocalTime time= LocalTime.now();  
			String jTime=sc.next();
			LocalTime journytime=LocalTime.parse(jTime);
			System.out.println("JOURNY TIME:"+journytime);
			
		}
		public static void peakhour() {
			

		Scanner sc=new Scanner (System.in);

		System.out.println("enter the car type:");
		System.out.println("1:Micro");
		System.out.println("2:Mini");
		System.out.println("3:prime");
		int cartype = sc.nextInt();






		switch(cartype)
		{
		case 1:
				 System.out.println("Micro is rs:10/km");
				 System.out.println("enter the km:");
				 int km=sc.nextInt();
				 int amount1=10*km;
				 System.out.println("Amount You Travelled:"+ amount1);
				 double tax1=amount1*0.07;
				 double gst1 =amount1+tax1;
				 System.out.println("TOTAL AMOUNT INCLUDE GST:"+ gst1);
				 
				 
				 
				 Scanner sc1 =new Scanner(System.in);
				 System.out.println("Enter the time to check the peak hour");
				 String time1 = sc1.next();
				 LocalTime peakChecker1= LocalTime.parse(time1);
				 int hourAlone1=peakChecker1.getHour();
				 System.out.println(hourAlone1);
				 if (hourAlone1 < 8 && hourAlone1 > 4) {
					 double peakhour1= gst1*0.0125;
					 double amt1=peakhour1+gst1;
				 	System.out.println("It is a peak hour"+ amt1);
				 }
				 	else
				 	{
				 		System.out.println("There is no extra money because,It is no peak hour");
				 	}	
				 break;
				 
				 
				 
				 
		case 2:
				 System.out.println("Mini is rs:15/km");
				 System.out.println("enter the km:");
				 int km1=sc.nextInt();
				 int amount2=15*km1;
				 System.out.println("Amount You Travelled:"+ amount2);
				 double tax2=amount2*0.07;
				 double gst2 =amount2+tax2;
				 System.out.println("TOTAL AMOUNT INCLUDE GST:"+ gst2);
				 
				 
				 
				 
				 Scanner sc2 =new Scanner(System.in);
				 System.out.println("Enter the time to check the peak hour");
				 String time2 = sc2.next();
				 LocalTime peakChecker2= LocalTime.parse(time2);
				 int hourAlone2=peakChecker2.getHour();
				 System.out.println(hourAlone2);
				 if (hourAlone2 < 8 && hourAlone2 > 4) {
					 double peakhour2= gst2*0.0125;
					 double amt2=peakhour2+gst2;
					 
				 	System.out.println("It is a peak hour,so Amount is 1.25% extra"+ amt2);
				 }
				 	else
				 	{
				 		System.out.println("There is no extra money because,It is no peak hour");
				 	}	
				 break;
				 
				 
				 
				 
		case 3:
				 System.out.println("Prime is rs:20/km");
				 System.out.println("enter the km:");
				 int km11=sc.nextInt();
				 int amount3=20*km11;
				 System.out.println("Amount You Travelled:"+ amount3);
				 double tax3=amount3*0.07;
				 double gst3=amount3+tax3;
				 System.out.println("TOTAL AMOUNT INCLUDE GST:"+ gst3);
				 
				 
				 
				 
				 
				 Scanner sc3 =new Scanner(System.in);
				 System.out.println("Enter the time to check the peak hour");
				 String time3 = sc3.next();
				 LocalTime peakChecker3= LocalTime.parse(time3);
				 int hourAlone3=peakChecker3.getHour();
				 System.out.println(hourAlone3);
				 if (hourAlone3 < 8 && hourAlone3 > 4) {
					 double peakhour3= gst3*0.0125;
					 double amt3=peakhour3+gst3;
				 	System.out.println("It is a peak hour"+amt3);
				 }
				 	else
				 	{
				 		System.out.println("There is no extra money because,It is no peak hour");
				 	}
				 break;
		}

		}
		}

