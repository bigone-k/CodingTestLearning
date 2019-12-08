package JeeD;

import java.util.Arrays;

public class kNumber {
	public static void main(String[] args) {
		int a[] ={1, 5, 2, 6, 3, 7, 4};
		int b[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(a, b);
	}
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
        	int[] arrTemp = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
        	Arrays.sort(arrTemp);
        	answer[i] = arrTemp[(commands[i][2] - 1)];
        }
        return answer;
    }
}
