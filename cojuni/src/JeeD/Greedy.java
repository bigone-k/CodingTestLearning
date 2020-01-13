package JeeD;

public class Greedy {
	  public int solution(int n, int[] lost, int[] reserve) {
	        int answer=0;
	        int[] student=new int[n+1]; // 1~n까지의 인덱스를 사용!
	        
	        // student 배열 초기화
	        for(int i=1;i<=n;i++)
	            student[i]=1;
	        for(int l:lost){
	            student[l]--;
	        }
	        for(int r:reserve){
	            student[r]++;
	        }
	        
	        // 없는 친구끼리 빌려주기
	        for(int i=1;i<=n;i++){
	            if(student[i]==0){
	                if(i+1<=n && student[i+1]==2){
	                    student[i+1]--;
	                    student[i]++;
	                } else if(i-1>=1 && student[i-1]==2){
	                    student[i-1]--;
	                    student[i]++;
	                }
	            }
	        }
	        
	        // 체육복을 1개이상 가지고 있으면 수업을 들을 수 있음
	        for(int i=1;i<=n;i++){
	            if(student[i]>=1)
	                answer++;
	        }
	        
	        return answer;
	    }
}
