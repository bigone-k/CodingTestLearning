package bigone.codility.Arrays;

import java.util.*;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> set = new HashSet<>();

        for (int i: A) {
            if (set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }

        return set.iterator().next();
    }

    public static void main (String arg[])
    {
        int[] A = { 1, 3, 1, 3, 7, 7, 4};

        System.out.println(new OddOccurrencesInArray().solution(A));
    }
}
