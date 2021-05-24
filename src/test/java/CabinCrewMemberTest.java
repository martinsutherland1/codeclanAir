import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Ted", RankTypes.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Ted", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankTypes.FLIGHT_ATTENDANT, cabinCrewMember.getRankType());
    }

    @Test
    public void canTalk(){
        assertEquals("Welcome to your flight!", cabinCrewMember.talk());
    }


}
