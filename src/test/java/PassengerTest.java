import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    Pilot pilot;
    Plane plane;

    @Before
    public void before(){
        passenger = new Passenger("Martin Sutherland", 1);
        flight = new Flight(pilot, plane.BOEING747, "BA1234", "Liverpool", "GLA", "10:00");
    }

    @Test
    public void passengerHasName(){
        assertEquals("Martin Sutherland", passenger.getName());
    }

    @Test
    public void passengerHasBag(){
        assertEquals(1, passenger.getBags());
    }

    @Test
    public void passengerHasFlight(){
        flight.addPassenger(passenger);
        assertEquals("BA1234", passenger.getFlight());
    }

    @Test
    public void passengerHasSeat(){
        flight.addPassenger(passenger);
        assertEquals(1, passenger.getSeat());
    }


}
