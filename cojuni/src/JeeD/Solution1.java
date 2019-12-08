package JeeD;

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = 0; i < heights.length; i++) {
        	for(int j = 1; j < heights.length - i; j++) {
        		int firstNode = heights.length - i -1;
        		if(heights[firstNode] < heights[firstNode - j]) {
        			answer[firstNode] = firstNode - j + 1;
        			break;
        		}
        		else if(j == 1) {
        			answer[firstNode] = 0;
        		}
        	}

        }
        return answer;
    }
}