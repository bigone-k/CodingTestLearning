package bigone.programmers;

public class Network {
    static boolean[][] visit;
    public int solution(int n, int[][] computers) {
        int answer = 0;

        visit = new boolean[n][n];

        for ( int i=0; i<n; i++)
        {
            if (!visit[i][i]){
                answer++;
                bfs(i, n, computers);
            }
        }

        return answer;
    }

    public void bfs ( int start, int count, int[][] computers ) {

        for( int j=0; j<count; j++ ){
            if( !visit[start][j] && computers[start][j] == 1 ) {
                visit[start][j] = true;

                bfs(j, count, computers);
            }
        }
    }
}
