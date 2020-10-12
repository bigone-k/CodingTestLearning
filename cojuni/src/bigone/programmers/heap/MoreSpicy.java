package bigone.programmers.heap;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;
//        최대힙 구현 방식
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int sco : scoville)
            pq.add(sco);

        while(pq.peek() < K) {
            if(pq.size()<2)
                return -1;

            int scoville1 = pq.poll();
            int scoville2 = pq.poll();

            pq.add(scoville1 + (scoville2*2));

            answer++;
        }

        return answer;
    }
}
