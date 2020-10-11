package bigone.programmers;

import java.util.ArrayList;
import java.util.Stack;

public class ClawMachineKaKaO {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> boardStack;
        ArrayList<Stack<Integer>> stArray = new ArrayList<>();

        // stack 초기화
        for (int i = 0; i < board.length; i++) {
            boardStack = new Stack<Integer>();
            stArray.add(boardStack);
        }

        // stack binding
        for (int i = 0; i < board[0].length; i++) {
            for (int j = board.length - 1; j >= 0; j--) {
                if (board[j][i] != 0)
                    stArray.get(i).push(board[j][i]);
            }
        }

        Stack<Integer> resultStack = new Stack<Integer>();

        // select logic
        for (int k : moves) {
            if (!stArray.get(k - 1).isEmpty()) {
                int select = stArray.get(k - 1).pop();

                if (!resultStack.isEmpty() && resultStack.peek().equals(select)) {
                    resultStack.pop();
                    answer = answer + 2;
                } else {
                    resultStack.push(select);
                }
            }
        }

        return answer;
    }
}
