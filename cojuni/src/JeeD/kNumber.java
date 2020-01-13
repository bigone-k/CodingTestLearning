package JeeD;

import java.util.Arrays;

public class kNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
        	int[] arrTemp = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
        	Arrays.sort(arrTemp);
        	answer[i] = arrTemp[(commands[i][2] - 1)];
        }
        return answer;
    }
}
