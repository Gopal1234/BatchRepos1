package com.org.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.org.model.Flight;
import com.org.service.FlightService;

public class FlightServiceImpl implements FlightService {

	private Map<Integer, Flight> mapOfFlight=new HashMap();
	
	public void addFlight(Flight flight)
	{ 
		
		mapOfFlight.put(flight.getFlightId(), flight);
	}
/*	@Override
	public void addFlight(Map<Integer, Flight> flightMap) {
      mapOfFlight=flightMap;

	}*/

	@Override
	public Map<Integer, Flight> viewAllFlight() {
		// TODO Auto-generated method stub
		return  mapOfFlight;
	}

	@Override
	public Flight removeFlight(int flightId) {

//list is containing key sets of map
		    Set<Integer> set=mapOfFlight.keySet();
		    List<Integer> list= new ArrayList(set);
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)==flightId)
{
				
				//Flight flight=mapOfFlight.get(flightId);
				Flight flight= mapOfFlight.remove(flightId);
return 	flight;
}
		}
		
		
		
		return null;
	}

	@Override
	public Set<Flight> searchFlightBySourceAndDestination(String source, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> sortFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
