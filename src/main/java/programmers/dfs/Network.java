package programmers.dfs;


public class Network {

	static int answer = 0;

	public static void main(String[] args) {

		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		int n = 3;

		Network.Solution.solution(computers,n);

		System.out.println("answer"+answer);

	}

	static class Solution {

		public static void solution(int[][] computers, int n) {

			boolean[] visitiedNode = new boolean[n];

			for(int i=0; i<n; i++){
				if(!visitiedNode[i]){
					dfs(i,computers,n,visitiedNode);
					answer++;
				}
			}
		}

		private static void dfs(int i, int[][] computers, int n, boolean[] visitiedNode){

			visitiedNode[i] = true;

			for(int j=0; j<n; j++){
				if(computers[i][j] == 1 && !visitiedNode[j]){
					dfs(j,computers,n,visitiedNode);
				}
			}
		}
	}
}
