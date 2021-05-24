import java.util.Random;

public class Passenger {


    private String name;
    private int bags;
    private String flight;
    private int seat;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = "";
        this.seat = 0;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public void setFlight(String flightNumber) {
        this.flight = flightNumber;
    }

    public String getFlight() {
        return this.flight;
    }

    public void setSeat(int rand){
        this.seat = rand;
    }

    public int getSeat(){
        return this.seat;
    }
}
