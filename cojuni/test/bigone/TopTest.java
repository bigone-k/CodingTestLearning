package bigone;

import bigone.programmers.Top;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TopTest {
    Top top;
    int[] heights;
    int[] result;

    @Before
    public void setUp() {
        top = new Top();
        heights = new int[] {3,9,9,3,5,7,2};
        result = new int[] {0,0,0,3,3,3,6};
    }

    @Test
    public void runSolution() {
        assertThat(top.solution(heights), is(result));
    }
}