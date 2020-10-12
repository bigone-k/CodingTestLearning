package bigone.programmers.stackqueue;

import java.util.*;

public class FunctionDevelpe {
    public static int maxNumber = 100;
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        ArrayList<Integer> arr = new ArrayList<>();

        int days = -1;
        for (int i = 0; i < progresses.length; i++) {
            if (speeds[i] != 0)
            {
                int processday = (int) Math.ceil((maxNumber - progresses[i]) / (double)speeds[i]);

                if (days >= processday) {
                    arr.set(arr.size() - 1, arr.get(arr.size() - 1) + 1);
                } else {
                    arr.add(1);
                    days = processday;
                }
            }
        }

        answer = arr.stream().mapToInt(i -> i).toArray();

        for (int i : answer)
            System.out.println(i);

        return answer;
    }
}
