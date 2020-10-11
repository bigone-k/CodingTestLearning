package Template;

import java.util.*;

public class StringTemplate {
    public static void main(String arg[]) {
        // 접두사 찾기 ( String.startsWith
        // 접미사 찾기 ( String.endsWith
        String str1 = "12";
        String str2 = "123";

        System.out.println(str2.startsWith(str1));

        List<String> arr = new ArrayList<>();
        arr.add(str1);
        arr.add(str2);

        // Sort
        Collections.sort(arr, (a, b) -> {
            String as = String.valueOf(a);
            String bs = String.valueOf(b);

            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });

        for(String s : arr )
        {
            System.out.println(s);
        }
    }
}
