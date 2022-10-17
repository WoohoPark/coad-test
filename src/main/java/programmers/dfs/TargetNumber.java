package programmers.dfs;

public class TargetNumber {

	static int answer = 0;
	static class Solution {
		public static void dfs(int total, int idx, int[] numbers, int target) {
			if(idx==numbers.length){
				if(total==target){
					answer++;
				}
				return;
			}
			dfs(total+numbers[idx],idx+1,numbers,target);
			dfs(total-numbers[idx],idx+1,numbers,target);
		}
	}

	public static void main(String[] args) {

		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;

		Solution.dfs(0,0,numbers,target);

		System.out.println(answer);
	}
}
