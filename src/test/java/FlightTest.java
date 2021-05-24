import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
        flight.setSeatList(flight);
        passenger1 = new Passenger("Martin Sutherland", 1);
        passenger2 = new Passenger("Katelyn Hayes", 1);
        passenger3 = new Passenger("Aldo Sutherland", 1);
        passenger4 = new Passenger("Mags Sutherland", 1);
        passenger5 = new Passenger("Lisa Sutherland", 1);
        passenger6 = new Passenger("John Forbes", 1);


    }

    @Test
    public void hasSeatCount(){
        assertEquals(6, flight.getFlightCapacity());
    }

    @Test
    public void canAddCrewMember(){
        assertEquals(4, flight.getCrewCount());
    }

    @Test
    public void canBookPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void cantOverbookFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger1);
        assertEquals(6, flight.getPassengerCount());
    }

    @Test
    public void crewCanTalkToPassengers(){
        assertEquals("Welcome to your flight!", flight.crewMessage(cabinCrewMember1));
    }

    @Test
    public void pilotCanTalkToPassengers(){
        assertEquals("I'm flying the plane!", flight.pilotMessage(pilot));
    }

    @Test
    public void getFlightTotalWeight(){
        assertEquals(1200.00, flight.getFlightWeight(),0.0);
    }

    @Test
    public void checkDuplicateSeatNumber(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        assertEquals(false, flight.equals(flight.getSeatList()));


    }

}
