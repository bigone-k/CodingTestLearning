package bigone;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WorkoutClothesTest {
    WorkoutClothes workoutClothes;
    int n;
    int[] lost;
    int[] reserve;

    int result;

    @Before
    public void setUp() {
        workoutClothes = new WorkoutClothes();

        //5	[2, 4]	[1, 3, 5]	5
        //5	[2, 4]	[3]	4
        //3	[3]	[1]	2
        n = 5;
        lost = new int[]{1,2,3,4,5};
        reserve = new int[]{1,2,3,4,5};
        result = 5;
    }

    @Test
    public void runSolution() {
        assertThat(workoutClothes.solution(n, lost, reserve), is(result));
    }
}