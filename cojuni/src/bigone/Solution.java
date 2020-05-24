package bigone;

public class Solution {
    public int solution(int[] numbers, int target) {
        return DFS(numbers, target, 0, 0);
    }

    public int DFS(int[] numbers, int target, int index, int num) {
        System.out.println("-----b------");
        System.out.println(index);
        if(index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            int a = DFS(numbers, target, index + 1, num + numbers[index]);
            int b = DFS(numbers, target, index + 1, num - numbers[index]);
            return a + b;
        }
    }

    public static void main(String arg[]) {
        int[] arr = new int[]{
                30,14,15,16,4
        };

        int target = 19;

        System.out.println(new Solution().solution(arr, target));
    }
}
