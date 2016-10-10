package FlightReservation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class FlightReservation {
	public static void main(String [] Args)
	{
		int[] seats = new int[10];
		int option,exit=0;
		while(exit!=1)
		{
		Scanner reader = new Scanner(System.in);  
		System.out.println("Which class would you like to travel in? \n1.First\n2.Economy\n3.Exit\n"); // Prompting the user to select class
		option = reader.nextInt();
		switch(option)
			{
			case 1:
				int seatf=0,ifc;
				System.out.println("Please choose a seat number\n");  //Promoting the user to choose a seat number
				for(ifc=0;ifc<=4;ifc++) // Parsing to see the seats available and not filled.
				{
					if(seats[ifc]==0)
					System.out.println("Seat Number "+ifc+" EMPTY\n");
				}
				seatf= reader.nextInt();
				if(seatf <= 4 && seatf >= 0 && seats[seatf]==0) //Checking if the enterted seat number is with in First class and not filled
				{
					String name,conName;
					System.out.println("Please enter your name\n"); //Prompting the user to fill his name
					name=reader.next();
					name.toLowerCase();
					System.out.println("Please print your name to confirm this booking or Type \"no\" to cancel booking."); //Confirmation
					conName=reader.next();
					conName.toLowerCase();
					if(name.equals(conName))
					{
						String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(Calendar.getInstance().getTime()); //Getting System date and time
						seats[seatf]=1;
						System.out.println("Your Booking has been confirmed.");
						System.out.println("----------STAR ARLINES---------");
						System.out.println("Passanger Name: "+name+" Class: First"+"		Flight Number 777");
						System.out.println("Booking Time: "+timeStamp+"		Seat Number: "+seatf+"\n");
						System.out.println("Thanks for booking with STAR ARLINES. Have a safe flight.");
						System.out.println("Would you like to book more tickets?\n1.Yes\n2.No"); //Asking if the user wants to book more tickets or exit
						int should_exit;
						should_exit=reader.nextInt();
						switch(should_exit)
						{
						case 1:
							exit = 0;
							break;
						case 2:
							exit = 1;
							break;
						default:
							System.out.println("Please choose the right option.");
							break;
						}
						
					}
					else if(conName.equals("no")) //if the users types in No the booking gets cancelled
					{
						System.out.println("Your Booking has been cancelled.");
						exit=1;
					}
				}
				else if(seats[seatf]!=0) // Checking if the seats are full in First class and promoting the user to check in economy class
				{
					System.out.println("Sorry all the seats for this flight in first class are full. Would you like to book your ticket in Economy class?\n1.Yes\n2.No\n");
					int choice = reader.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Please choose option 2 to buy your tickets in Economy class.\n");
						break;
					case 2:
						System.out.println("We are sorry for the trouble caused. You could wait for the next flight in 3 hours.\n");
						break;
						default:
							System.out.println("Please select the right option.\n");
							break;
					}
				}
				else
				{
					System.out.println("Seat Number "+seatf+" is not in First Class.Please select a seat number within First Class.\n");
				}
				break;
			case 2:  //Same logics apply to economy class as first class
				int seate=0,ie;
				System.out.println("Please choose a seat number\n");
				for(ie=5;ie<=9;ie++)
				{
					if(seats[ie]==0)
					System.out.println("Seat Number "+ie+" EMPTY\n");
				}
				seate= reader.nextInt();
				if(seate >= 5 && seate <= 9 && seats[seate]==0)
				{
					String name,conName;
					System.out.println("Please enter your name\n");
					name=reader.next();
					name.toLowerCase();
					System.out.println("Please print your name to confirm this booking or Type \"no\" to cancel booking.");
					conName=reader.next();
					conName.toLowerCase();
					if(name.equals(conName))
					{
						String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(Calendar.getInstance().getTime());
						seats[seate]=1;
						System.out.println("Your Booking has been confirmed.");
						System.out.println("----------STAR ARLINES---------");
						System.out.println("Passanger Name: "+name+" Class: Economy"+"		Flight Number 777");
						System.out.println("Booking Time: "+timeStamp+"		Seat Number: "+seate+"\n");
						System.out.println("Thanks for booking with STAR ARLINES. Have a safe flight.");
						System.out.println("Would you like to book more tickets?\n1.Yes\n2.No");
						int should_exit;
						should_exit=reader.nextInt();
						switch(should_exit)
						{
						case 1:
							exit = 0;
							break;
						case 2:
							exit = 1;
							break;
						default:
							System.out.println("Please choose the right option.");
							break;
						}
						
					}
					else if(conName.equals("no"))
					{
						System.out.println("Your Booking has been cancelled.");
						exit=1;
					}
				}
				else if(seats[seate]!=0)
				{
					System.out.println("Sorry all the seats for this flight in first class are full. Would you like to book your ticket in First class?\n1.Yes\n2.No\n");
					int choice = reader.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Please choose option 1 to buy your tickets in First class.\n");
						break;
					case 2:
						System.out.println("We are sorry for the trouble caused. You could wait for the next flight in 3 hours.\n");
						break;
						default:
							System.out.println("Please select the right option.\n");
							break;
					}
					
				}
				else
				{
					System.out.println("Seat Number "+seate+" is not in First Class.Please select a seat number within First Class.\n");
				}
				break;
			case 3:
				System.out.println("You have successfully quit\n");
				exit =1;
				break;
			default:
				System.out.println("Please Select the right option \n1.First Class\n2.Economy Class\n");
				break;
			}
		}
	}

}
