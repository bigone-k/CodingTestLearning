package bigone;

import java.util.*;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, String> hashMap = new HashMap<>();

        for (String[] strings:clothes) {
            hashMap.put(strings[0], strings[1]);
        }
        System.out.println(hashMap);


        return answer;
    }

    public static void main(String arg[]) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        //new Solution().solution(clothes);
    }
}
