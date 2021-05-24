public class CabinCrewMember {

    private String name;
    private RankTypes rankType;

    public CabinCrewMember(String name, RankTypes rankType) {
        this.name = name;
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public RankTypes getRankType() {
        return rankType;
    }

    public String talk(){
        return "Welcome to your flight!";
    }
}
