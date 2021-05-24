import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Flight {

    Pilot pilot;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    String time;


    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Integer> seatNumbers;




    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String time) {
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.time = time;
        this.passengers = new ArrayList<Passenger>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.seatNumbers = new ArrayList<Integer>();

    }

    public void setSeatList(Flight flight){
        for (int i = 0; i < 6; i++){
            flight.seatNumbers.add(i + 1);
        }

    }

    public int getFlightCapacity(){
        return plane.getCapacity();
    }

    public double getFlightWeight(){
        return plane.getTotalWeight();
    }

    public String crewMessage(CabinCrewMember cabinCrewMember){
        return cabinCrewMember.talk();

    }

    public String pilotMessage(Pilot pilot){
        return pilot.canTalk();
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public int getCrewCount(){
        return this.cabinCrewMembers.size();
    }

    public void addCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger){

        int int_random = ThreadLocalRandom.current().nextInt(1, this.seatNumbers.size());

        if (this.passengers.size() < plane.getCapacity()){
            passenger.setFlight(this.flightNumber);
            int seat = int_random;
            this.seatNumbers.remove(seat);
            passenger.setSeat(seat);
            this.passengers.add(passenger);

        }

    }

    public ArrayList<Integer> getSeatList(){
        ArrayList<Integer> seats = null;


        for (Passenger passenger : getPassengers()){
            int seat = passenger.getSeat();
            seats.add(seat);



        }

        return seats;


    }

    private static <T> boolean checkForDuplicates(T... seats)
    {

        for (int i = 0; i < seats.length; i++)
        {
            for (int j = i + 1; j < seats.length; j++)
            {
                if (seats[i] != null && seats[i].equals(seats[j])) {
                    return true;
                }
            }
        }


        return false;
    }




    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }
}
