package bigone.codility.TimeComplexity;

import java.util.*;

public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length==0)
            return 1;

        int pre = 0;
        //정렬
        Arrays.sort(A);

        for (int num : A)
            if (num - pre == 1)
                pre = num;
            else
                break;

        return pre + 1;
    }

    public static void main(String arg[])
    {
        int[] A = {};
        System.out.println(new PermMissingElem().solution(A));
    }
}
