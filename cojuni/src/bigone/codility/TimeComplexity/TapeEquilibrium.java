package bigone.codility.TimeComplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < A.length; i++) {
            right += A[i];
        }

        int minDiff = Integer.MAX_VALUE;

        for (int p = 1; p < A.length; p++) {
            left += A[p - 1];
            right -= A[p - 1];

            int diff = Math.abs(left - right);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String arg[])
    {
        int[] A = {1,1};

        System.out.println(new TapeEquilibrium().solution(A));
    }
}
