package JeeD;

import java.util.PriorityQueue;

public class Heap {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int value : scoville) {
        	pq.add(value);
        }
        while(true) {
        	if(pq.size() < 2) {
        		answer = -1;
        		break;
        	}
        	int newScoville = pq.poll() + (2 * pq.poll());
        	if(newScoville >= K) {
        		break;
        	}
        	else {
        		pq.add(newScoville);
        	}
        	answer++;
        }
        return answer;
    }
    
}
