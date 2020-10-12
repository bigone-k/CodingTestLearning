package Template;

public class Permutation {

    static void BasicPermutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];

                BasicPermutation(arr, output, visited, depth + 1, n, r);

                visited[i] = false;
            }
        }
    }

    // 배열 출력
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String arg[]) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int r = 3;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        BasicPermutation(arr, output, visited, 0, n, r);
    }


}
