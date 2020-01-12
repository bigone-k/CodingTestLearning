package bigone;

import static java.lang.Math.max;

public class Mockexam {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int maxRes = answers.length;

        int[] APerReq = {1, 2, 3, 4, 5}; // 5
        int[] BPerReq = {2, 1, 2, 3, 2, 4, 2, 5};  // 8
        int[] CPerReq = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};  // 10

        int[] APer = new int[maxRes];
        int[] BPer = new int[maxRes];
        int[] CPer = new int[maxRes];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < maxRes) {
            int maxIdex = (i + APerReq.length >= maxRes) ? maxRes-i : APerReq.length;
            System.arraycopy(APerReq, 0, APer, i, maxIdex);
            i += maxIdex;
        }

        while (j < maxRes) {
            int maxIdex = (j + BPerReq.length >= maxRes) ? maxRes-j : BPerReq.length;
            System.arraycopy(BPerReq, 0, BPer, j, maxIdex);
            j += maxIdex;
        }

        while (k < maxRes) {
            int maxIdex = (k + CPerReq.length >= maxRes) ? maxRes-k : CPerReq.length;
            System.arraycopy(CPerReq, 0, CPer, k, maxIdex);
            k += maxIdex;
        }

        int[] result = new int[3];

        for(int q=0; q<maxRes; q++){
            if (answers[q] == APer[q])
                result[0]++;
            if (answers[q] == BPer[q])
                result[1]++;
            if (answers[q] == CPer[q])
                result[2]++;
        }

        int maxint = max(result[0], max(result[1], result[2]) );
        int index = 0;
        int index1 = 0;

        int[] answer11 = new int[3];

        while (index < 3) {
            if (maxint == result[index]) {
                answer11[index1] = (index+1);
                index1++;
            }
            index++;
        }

        answer = new int[index1];

        for(int w=0; w< index1; w++) {
            answer[w] = answer11[w];
        }

        return answer;
    }
}
