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
        array = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        result = new int[] {5, 6, 3};
    }

    @Test
    public void runSolution() {
        assertThat(mockexam.solution(array), is(result));
    }
}