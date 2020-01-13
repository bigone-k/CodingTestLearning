package JeeD;

public class Greedy {
	  public int solution(int n, int[] lost, int[] reserve) {
	        int answer=0;
	        int[] student=new int[n+1]; // 1~n������ �ε����� ���!
	        
	        // student �迭 �ʱ�ȭ
	        for(int i=1;i<=n;i++)
	            student[i]=1;
	        for(int l:lost){
	            student[l]--;
	        }
	        for(int r:reserve){
	            student[r]++;
	        }
	        
	        // ���� ģ������ �����ֱ�
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
	        
	        // ü������ 1���̻� ������ ������ ������ ���� �� ����
	        for(int i=1;i<=n;i++){
	            if(student[i]>=1)
	                answer++;
	        }
	        
	        return answer;
	    }
}
