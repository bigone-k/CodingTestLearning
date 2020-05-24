package bigone;

import java.util.LinkedList;

public class Solution {
    public int solution(String numbers) {
        int answer = 0;
        int[] intarray = new int[numbers.length()];
        LinkedList<Integer> list = new LinkedList<>();

        // 문자열 치환처리
        numbers = numbers.replaceAll("  "  ,"");

        // 문자열 파싱
        for ( int i = 0 ; i < numbers.length(); i++ )
            intarray[i] = Integer.parseInt(numbers.substring(i,i+1));

        permutation(list, intarray, 4, 2);

        return answer;
    }
    public static void main(String arg[]) {
        String numbers = "0123";

        System.out.println("result : " + new Solution().solution(numbers));
    }

    //중복조합
    private static void reCombination(LinkedList<Integer> list, int n, int r, int index) {
        if(r == 0){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        if(index == n) return;

        list.add(index);
        reCombination(list, n, r-1, index);
        list.removeLast();
        reCombination(list, n, r, index+1);
    }

    //조합
    private static void combination(LinkedList<Integer> list, int n, int r, int index) {
        if(r == 0){//r이 0이면 다 뽑았다는 뜻
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        if(index == n) return; //다 탐색했으면 종료..

        list.add(index);
        combination(list, n, r-1, index+1);//뽑았으니 ,r-1
        list.removeLast();
        combination(list, n, r, index+1);//안뽑았으니, r
    }

    //중복순열
    private static void rePermutation(LinkedList<Integer> list, int n, int r) {
        if(list.size() == r){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++){
            list.add(i);
            rePermutation(list, n, r);
            list.removeLast();//해당 넘버를 다시 제거 (즉,뽑지 않고 다음 번호 뽑기위함)

        }

    }

    //순열
    private static void permutation(LinkedList<Integer> list, int[] check, int n, int r) {
        if(list.size() == r){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++){//**중복 순열과 다른 점
            if(check[i] == 0){//자기자신을 못뽑게 해야지 중복이 안됨(이미 뽑은 것은 뽑지 않도록 체크)
                check[i] = 1;//자기자신을 못뽑게 해야지 중복이 안됨
                list.add(i);
                permutation(list, check, n, r);
                list.removeLast();//해당 넘버를 다시 제거 (즉,뽑지 않고 다음 번호 뽑기위함)
                check[i] = 0;
            }
        }
    }
}
