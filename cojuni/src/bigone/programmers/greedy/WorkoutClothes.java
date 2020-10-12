package bigone.programmers.greedy;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkoutClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashMap<Integer, Integer> student = new HashMap<Integer, Integer>();

        for (int i=0; i<n; i++)
        {
            student.put(i+1, 1);
        }

        for(int lostval : lost)
        {
            student.replace(lostval, student.get(lostval) - 1);
        }

        for(int reserveval : reserve)
        {
            student.replace(reserveval, student.get(reserveval) + 1);
        }

        AtomicInteger reserveCnt = new AtomicInteger();

        student.forEach((key, value) -> {
            if (value == 0) {
                int preReserve = student.containsKey(key-1) ? student.get(key-1) : 1;
                int aftReserve = student.containsKey(key+1) ? student.get(key+1) : 1;

                if (preReserve == 2) {
                    student.replace(key-1, --preReserve);

                    student.replace(key, ++value);
                }
                else {
                    if (aftReserve == 2) {
                        student.replace(key+1, --aftReserve);

                        student.replace(key, ++value);
                    }
                }

                if (student.get(key) == 0)
                    reserveCnt.incrementAndGet();
            }
        });

        answer = n - reserveCnt.intValue();

        return answer;
    }
}
