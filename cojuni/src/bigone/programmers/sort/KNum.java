package bigone.programmers.sort;

import java.util.Arrays;

public class KNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int startIdx;
        int endIdx;
        int returnIdx;
        int[] temp_arr;
        int k;

        for (int i = 0; i < commands.length; i++) {
            k = 0;

            startIdx = commands[i][commands[i].length - 3];
            endIdx = commands[i][commands[i].length - 2];
            returnIdx = commands[i][commands[i].length - 1];

            temp_arr = new int[endIdx - startIdx + 1];

            for (int j = startIdx - 1; j < endIdx; j++) {
                temp_arr[k++] = array[j];
            }

            Arrays.sort(temp_arr);

            answer[i] = temp_arr[returnIdx - 1];
        }

        return answer;
    }
}
