package bigone;

import bigone.programmers.hash.UnfulfilledPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class UnfulfilledPlayerTest {
    UnfulfilledPlayer unfulfilledPlayer;
    String[] participant;
    String[] completion;
    String result;

    @Before
    public void setUp() {
        unfulfilledPlayer = new UnfulfilledPlayer();
        participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        completion = new String[] {"stanko", "ana", "mislav"};
        result = "mislav";
    }

    @Test
    public void runSolution() {
        assertThat(unfulfilledPlayer.solution(participant, completion), is(result));
    }
}