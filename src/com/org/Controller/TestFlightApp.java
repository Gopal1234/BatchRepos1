package com.org.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.org.model.Flight;
import com.org.serviceimpl.FlightServiceImpl;

public class TestFlightApp {
	public static void main(String[] args) {
		FlightServiceImpl service=new FlightServiceImpl();
		//Map<Integer, Flight> map1=new HashMap();
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			
			
			System.out.println("Enter flight id");
			int fId=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter flight type");
		String fType=scanner.nextLine();
		System.out.println("Enter flight source");
		String fSource=scanner.nextLine();
		System.out.println("Enter flight destination");
		String fDest=scanner.nextLine();
		System.out.println("Enter flight cost");
		double fPrice=Double.parseDouble(scanner.nextLine());
		System.out.println("Enter flight date");
		String fDate=scanner.nextLine();	
	    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate flyingDate=LocalDate.parse(fDate,df);
	    Flight flight=new Flight(fId, fType, flyingDate, fPrice, fSource, fDest);	
			service.addFlight(flight);
		//map1.put(fId, flight);	
			
			
		}
		
		//service.addFlight(map1);
		
	Map<Integer, Flight>	m1= service.viewAllFlight();
	//Set<Entry<Integer, Flight>> mee=m1.entrySet();
		for(Map.Entry<Integer, Flight> me:m1.entrySet())
		{
			System.out.println(me.getKey() + " --->"+me.getValue().getFlightType() +" "+me.getValue().getFlightSource()+ " "+me.getValue().getFlightDestination());
		}
	}

}
