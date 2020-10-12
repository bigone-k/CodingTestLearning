package bigone.programmers.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Top {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        Stack<Integer> topStack = new Stack<Integer>();
        Queue<Integer> topQueue = new LinkedList<Integer>();

        for(int i = 0; i < heights.length; i++) {
            while (!topStack.isEmpty())
            {
                if(topStack.peek() > heights[i]) {
                    answer[i] = topStack.size();
                    break;
                }
                else {
                    topQueue.add(topStack.pop());
                }
            }

            while (!topQueue.isEmpty()) {
                topStack.push(topQueue.poll());
            }

            topStack.push(heights[i]);
            if(answer[i] == 0)
                answer[i] = 0;
        }

        return answer;
    }
}
