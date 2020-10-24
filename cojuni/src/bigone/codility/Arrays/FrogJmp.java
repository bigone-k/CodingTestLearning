package bigone.codility.Arrays;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if (D == 0 || Y == 0)
            return 0;

        // 나눈값
        int diffSize = (Y - X) / D;
        // 나머지값
        int pulsFlag = (Y - X) % D;

        return diffSize + ( pulsFlag > 0 ? 1 : 0);
    }

//    public static void main(String arg[])
//    {
//        int X = 10;
//        int Y = 90;
//        int D = 0;
//
//        System.out.println(new FrogJmp().solution(X,Y,D));
//    }
}
