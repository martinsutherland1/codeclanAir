public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double getReservedBaggage(){
        return flight.getFlightWeight() / 2;
    }

    public double getReservedBaggagePerPassenger() {
        return getReservedBaggage() / flight.getFlightCapacity();
    }

    public double getBookedBaggage() {
        int total = 0;
        int bags = 0;

        for (Passenger passenger : flight.getPassengers()){
           bags = passenger.getBags();
            total = bags + total;


        }

        return total * 100;

    }

    public double baggageAvailable() {
        return getReservedBaggage() - getBookedBaggage();
    }
}
