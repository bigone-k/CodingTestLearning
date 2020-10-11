package bigone.programmers;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++)
        {
            for (int j = i+1; j < prices.length; j++) {
                answer[i]++;

                if (prices[i] > prices[j])
                {
                    break;
                }
            }
        }

        for(int l : answer)
            System.out.println(l);

        return answer;
    }

    public static void main(String arg[]) {
        int[] prices = {1, 2, 1, 3, 3};

        new StockPrice().solution(prices);
    }
}
