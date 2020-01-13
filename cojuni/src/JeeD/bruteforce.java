package JeeD;

import java.util.*;
public class bruteforce {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int answerCnt = 0;
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        result.put(1, 0);
        result.put(2, 0);
        result.put(3, 0);
        for(int i = 0; i < answers.length; i++) {
        	int curr = 0;
        	curr = i % answer1.length;
        	if(answer1[curr] == answers[i]) {
        		result.put(1 , result.get(1) + 1);
        	}
        	curr = i % answer2.length;
        	if(answer2[curr] == answers[i]) {
        		result.put(2 , result.get(2) + 1);
        	}
        	curr = i % answer3.length;
        	if(answer3[curr] == answers[i]) {
        		result.put(3 , result.get(3) + 1);
        	}
        }
        int max = 0;
        for(int rs : result.keySet()) {
        	if(result.get(rs) >= max) {
        		max = result.get(rs);
        	}
        }
        int maxCnt = 0;
        for(int rs : result.keySet()) {
        	
        	if(result.get(rs) == max) {
        		maxCnt++;
        	}
        }
        answer = new int[maxCnt];
        int index = 0;
        for(int rs : result.keySet()) {
        	if(result.get(rs) == max) {        		
        		answer[index++] = rs;
        	}
        }
        return answer;
    }
    
}
