package bigone.codility.Interations;

public class BinaryGap {

    public int solution(int N) {
        int count = 0;
        int checkNum = 0;
        int result = 0;

        // java Int 4bit  >> 2의 4승
        for (int i = 0; i < 32; i++) {
            int Num = (N >> i) & 1;

            if (Num == 0)
            {
                count++;
            }
            else
            {
                checkNum++;

                if (checkNum == 2)
                {
                    result = result >= count ? result : count;
                    checkNum--;
                }
                count = 0;
            }
        }

        return result;
    }
//    public static void main (String arg[])
//    {
//        int N = 42;
//
//        new BinaryGap().solution(N);
//    }
}
