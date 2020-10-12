package bigone;

import bigone.programmers.heap.MoreSpicy;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MoreSpicyTest {
    MoreSpicy moreSpicy;
    int[] scoville;
    int K;
    int result;

    @Before
    public void setUp() {
        moreSpicy = new MoreSpicy();
        scoville = new int[] {0,0,0,0,0,0,0,0,0,0,0,0};
        K = 2;
        result = -1;
    }

    @Test
    public void runSolution() {
        assertThat(moreSpicy.solution(scoville, K), is(result));
    }
}