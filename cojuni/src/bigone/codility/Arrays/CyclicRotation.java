package bigone.codility.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length == 0)
            return A;

        int[] resultArr = new int[A.length];
        int retationCnt = K % A.length;
        if (retationCnt == 0)
            return A;


        for (int i = 0; i < A.length; i++) {
            if ( i >= A.length - retationCnt )
            {
                resultArr[i - (A.length - retationCnt)] = A[i];
            }
            else
            {
                resultArr[i + retationCnt] = A[i];
            }
        }

        return resultArr;
    }

//    public static void main (String arg[])
//    {
//        int[] A = { 3, 8, 9, 7, 6 };
//        int K = 5;
//
//        new CyclicRotation().solution(A, K);
//    }
}
