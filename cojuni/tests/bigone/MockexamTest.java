package bigone;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MockexamTest {
    Mockexam mockexam;
    int[] array;
    int[] result;

    @Before
    public void setUp() {
        mockexam = new Mockexam();
        array = new int[]{1,3,2,4,2};
        result = new int[] {1,2,3};
    }

    @Test
    public void runSolution() {
        assertThat(mockexam.solution(array), is(result));
    }
}