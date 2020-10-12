package bigone.programmers.stackqueue;

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
}
