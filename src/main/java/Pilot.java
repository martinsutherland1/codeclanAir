public class Pilot {

    String name;
    RankTypes rank;
    String licenceNumber;

    public Pilot(String name, RankTypes rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public RankTypes getRank() {
        return rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String canTalk(){
        return "I'm flying the plane!";
    }
}


