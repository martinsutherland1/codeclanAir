import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Sully", RankTypes.CAPTAIN, "CP1234");
    }

    @Test
    public void testHasName(){
        assertEquals("Sully", pilot.getName());
    }

    @Test
    public void testHasRank(){
        assertEquals(RankTypes.CAPTAIN, pilot.getRank());
    }

    @Test
    public void testHasLicence(){
        assertEquals("CP1234", pilot.getLicenceNumber());
    }

    @Test
    public void canTalkToPassengers(){
        assertEquals("I'm flying the plane!", pilot.canTalk());
    }


}
