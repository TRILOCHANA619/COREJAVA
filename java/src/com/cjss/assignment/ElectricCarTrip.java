package com.cjss.assignment;

import java.util.ArrayList;

/**
 * An electric car's endurance is given by the amount of energy it can store in its battery (KWh)
 * and its efficiency (how many miles you can drive with one KWh of energy). Since electric
 * chargers are not yet so frequent on the road it is important to plan a trip according to where
 * the you can charge.
 *
 * The very first charging stations are found today on highways near cities.
 * A trip is defined by a set of cities separated by the number of miles between two cities.
 * It is useful to have system that tells you to stop when you are passing by a charger if there's
 * no further charging infrastructure within the given range. This test suite will bring you to
 * build such a system.
 *
 *
 *
 * Note1: "To be implemented" are the methods you need to implement
 * Note2: Feel free to add any additional POJO's or classes to support this problem
 */

public class ElectricCarTrip {

	int a=0;
	int b=0;
	String city=null;
	int batterySize=0;
	int lowSpeedPerformance=0;
	int highSpeedPerformance=0;
	int distanceByRespectToBatteryPercentage=0;
	int totalDistance1=0;
	int distanceByLowSpeed=0;
	int distanceByHighSpeed=0;
	int remaain=0;
	private ArrayList<String> place1=null;
	private String trip=null;
	private ArrayList<Integer> distance1=null;
	int chargePerHour=0;
	int distanceCovered=0;

	/** Setting the trip */
	public ElectricCarTrip(String trip){
		this.trip=trip;
	}

	/** Geetting the location of the current trip */
	public String locationOf(int participantId){
		participantId=totalDistance1;
		
		if (distanceByRespectToBatteryPercentage>=participantId) {
			
			return place1.get(place1.size()-1);
		} else {
			return place1.get((1));
		}
	}
	/** Starting the trip */
	public int startTripIn(String city, int batterySize, int lowSpeedPerformance, int highSpeedPerformance){
		place1=new ArrayList<String>();
		distance1=new ArrayList<Integer>();
		String[] trip1=trip.split("-");
		for (int i = 0; i < trip1.length; i++) {
			if (i%2==0) {
				String[] tripHour=trip1[i].split(":");
				if (tripHour.length>=2) {
					place1.add(tripHour[0]);
					chargePerHour=Integer.parseInt(tripHour[1]);
					a++;
					
				} else {
					place1.add(tripHour[0]);
					a++;
				}
				
			} else {
				distance1.add(Integer.parseInt(trip1[i]));
				b++;
			}
		}
		
		this.city=city;
		this.batterySize=batterySize;
		this.lowSpeedPerformance=lowSpeedPerformance;
		this.highSpeedPerformance=highSpeedPerformance;
		int totalDistance=0;
		for (int i = place1.indexOf(city); i < distance1.size(); i++) {
			totalDistance=totalDistance+distance1.get(i);
		}
		//System.out.println("Total distance :: "+totalDistance);
		totalDistance1=totalDistance;
		return totalDistance;
	}

	/**
	 * This method is used to travel from one location to other until there is enough charge.
	 * Don't try to invoke charge method in this when charging is not enough to travel
	 * @param participantId
	 */
	public void goWithLowSpeed(int participantId) {
	
		distanceByRespectToBatteryPercentage=batterySize*lowSpeedPerformance;
		
	
	}

	public String chargeOf(int participantId) {
		participantId=totalDistance1;
		if (distanceByRespectToBatteryPercentage>=participantId) {
			remaain=distanceByRespectToBatteryPercentage- participantId;
			distanceCovered=participantId;
		} else {
			int distance=0;
			for (int i = 0; i < distance1.size(); i++) {
				distance=distance+distance1.get(i);
				if (distance<distanceByRespectToBatteryPercentage) {
					remaain=distanceByRespectToBatteryPercentage- distance;
					distanceCovered=distanceCovered+distance;
					
				}
			}
		}
		float batteryRemain=((float)remaain/distanceByRespectToBatteryPercentage)*100;
		String percentage=Math.round(batteryRemain)+"%";
		return  percentage;
	}

	/**
	 * This method is used to travel from one location to other until there is enough charge.
	 * Don't try to invoke charge method in this when no enough charging
	 * @param participantId
	 */
	public void goWithHighSpeed(int participantId) {
		participantId=totalDistance1;
		
		distanceByRespectToBatteryPercentage=batterySize*highSpeedPerformance;

	}

	public void charge(int id, int hoursOfCharge) {
		batterySize=hoursOfCharge*chargePerHour;
		totalDistance1=totalDistance1-distanceCovered;
		//System.out.println("new total distance is "+totalDistance1);
		
	
	}

	// Don't change this method
	public static void main(String args[]) {

		System.out.println("Task1: START");
		shouldGetAtDestinationWithLowerCharge();
		System.out.println("Task1: COMPLETE");

		System.out.println("Task2: START");
		shouldGoToFinalDestination();
		System.out.println("Task2: COMPLETE");

		System.out.println("Task3: START");
		shouldStayAtIntermediateStopIfNotEnoughCharge();
		System.out.println("Task3: COMPLETE");

		System.out.println("Task4: START");
		shouldConsumeMoreWhenSprinting();
		System.out.println("Task4: COMPLETE");

		System.out.println("Task5: START");
		shouldMoveMultipleParticipantsAccordingly();
		System.out.println("Task5: COMPLETE");

		System.out.println("Task6: START");
		shouldAllowCharging();
		System.out.println("Task6: COMPLETE");
	}

	// Don't change this method
	public static void shouldGetAtDestinationWithLowerCharge() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER");
		int batterySize = 85; //KWh
		int lowSpeedPerformance = 5; //miles per KWh
		int highSpeedPerformance = 5; //miles per KWh
		int participantId = trip.startTripIn("EDINBURGH", batterySize, lowSpeedPerformance, highSpeedPerformance);
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId)); // Should print 41%
	}

	// Don't change this method
	public static void shouldGoToFinalDestination() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-100-LEEDS");
		int participantId = trip.startTripIn("EDINBURGH", 85, 5, 5);
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print LEEDS
		System.out.println(trip.chargeOf(participantId)); // Should print 18%
	}

	// Don't change this method
	public static void shouldStayAtIntermediateStopIfNotEnoughCharge() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-500-LONDON");
		int participantId = trip.startTripIn("EDINBURGH", 85, 5, 5);
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId));  // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId)); // Should print 41%
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId)); // Should print 41%
	}

	// Don't change this method
	public static void shouldConsumeMoreWhenSprinting() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-100-BIRMINGHAM");
		int participantId = trip.startTripIn("EDINBURGH", 85, 5, 3);
		trip.goWithHighSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId));  // Should print 2%
	}

	// Don't change this method
	public static void shouldMoveMultipleParticipantsAccordingly() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-100-BIRMINGHAM");
		int id1 = trip.startTripIn("EDINBURGH", 85, 5, 3);
		int id2 = trip.startTripIn("MANCHESTER", 70, 5, 3);
		trip.goWithHighSpeed(id1);
		trip.goWithLowSpeed(id2);
		System.out.println(trip.locationOf(id1)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(id1)); // Should print 2%
		System.out.println(trip.locationOf(id2)); // Should print BIRMINGHAM
		System.out.println(trip.chargeOf(id2)); // Should print 71%
	}

	// Don't change this method
	public static void shouldAllowCharging() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER:25-100-BIRMINGHAM"); //25 is the KWh charged per hour at MANCHESTER
		int id = trip.startTripIn("EDINBURGH", 85, 5, 3);
		trip.goWithHighSpeed(id);
		System.out.println(trip.locationOf(id)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(id)); // Should print 2%
		int hoursOfCharge = 3;
		trip.charge(id, hoursOfCharge);
		trip.goWithHighSpeed(id);
		System.out.println(trip.locationOf(id)); // Should print BIRMINGHAM
		System.out.println(trip.chargeOf(id)); // Should print 51%
	}
}

