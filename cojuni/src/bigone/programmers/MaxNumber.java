package bigone.programmers;

import java.util.*;

public class MaxNumber {
    public String solution(int[] numbers) {
        String answer = "";

        String[] arr = new String[numbers.length];

        // int Array to String Array
        for( int i=0; i < numbers.length; i++ ){
            arr[i] = String.valueOf(numbers[i]);
        }

        // Sort
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // toString()
        StringBuffer sb = new StringBuffer();

        for( int i=0; i < arr.length; i++ ){
            sb.append(arr[i]);
        }

        answer = sb.toString();

        if(answer.startsWith("0"))
            return "0";

        return answer;
    }
}
