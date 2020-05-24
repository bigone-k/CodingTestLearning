package bigone;

import bigone.programmers.KNum;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KNumTest {
    KNum kNum;
    int[] array;
    int[][] commands;
    int[] result;

    @Before
    public void setUp() {
        kNum = new KNum();
        array = new int[] {1, 5, 2, 6, 3, 7, 4};
        commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        result = new int[] {5, 6, 3};
    }

    @Test
    public void runSolution() {
        assertThat(kNum.solution(array, commands), is(result));
    }
}