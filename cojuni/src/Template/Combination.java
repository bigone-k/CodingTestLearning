package Template;

import java.util.*;

public class Combination {

    public static void main(String arg[]) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int r = 3;
        boolean[] visited = new boolean[n];

        // 조합
        BasicCombination(arr, visited, 0, n, r);
    }

    public static void BasicCombination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            BasicCombination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}