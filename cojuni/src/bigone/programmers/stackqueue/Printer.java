package bigone.programmers.stackqueue;

import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 내림차순 Collections.reverseOrder()
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities)
            priorityQueue.offer(i);

        while (!priorityQueue.isEmpty())
        {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priorityQueue.peek())
                {
                    priorityQueue.remove();
                    answer++;

                    if (i == location)
                    {
                        priorityQueue.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
