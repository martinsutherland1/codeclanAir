import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1, cabinCrewMember2, cabinCrewMember3, cabinCrewMember4;
    Plane plane;
    Passenger passenger1, passenger2, passenger3, passenger4, passenger5, passenger6;

    @Before
    public void before(){
        pilot = new Pilot("Sully", RankTypes.CAPTAIN, "CP1234");
        cabinCrewMember1 = new CabinCrewMember("Ted", RankTypes.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Robin", RankTypes.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Lily", RankTypes.FLIGHT_ATTENDANT);
        cabinCrewMember4 = new CabinCrewMember("Barney", RankTypes.FLIGHT_ATTENDANT);
        flight = new Flight(pilot, plane.BOEING747, "BA1234", "Liverpool", "GLA", "10:00");
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
        flight.addCrewMember(cabinCrewMember3);
        flight.addCrewMember(cabinCrewMember4);
        passenger1 = new Passenger("Martin Sutherland", 1);
        passenger2 = new Passenger("Katelyn Hayes", 1);
        passenger3 = new Passenger("Aldo Sutherland", 1);
        passenger4 = new Passenger("Mags Sutherland", 1);
        passenger5 = new Passenger("Lisa Sutherland", 1);
        passenger6 = new Passenger("John Forbes", 1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void findPlaneBaggageWeight(){
        assertEquals(600.00, flightManager.getReservedBaggage(), 0.0);
    }

    @Test
    public void baggageReservedForEachPassenger(){
        assertEquals(100.00, flightManager.getReservedBaggagePerPassenger(), 0.0);
    }

    @Test
    public void CheckBaggageBookedOnFlight(){
        assertEquals(600.00, flightManager.getBookedBaggage(), 0.0);
    }

    @Test
    public void checkBaggageWeightLeftOver(){
        assertEquals(0.00, flightManager.baggageAvailable(), 0.0);
    }


}
