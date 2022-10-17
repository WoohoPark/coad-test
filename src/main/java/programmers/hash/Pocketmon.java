package programmers.hash;

import java.util.HashSet;

//포켓몬 https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
public class Pocketmon {
	static class Solution {
		public static int solution(int[] nums) {
			HashSet<Integer> distinctPocketmon = new HashSet<>();
			int pickCount = nums.length/2;

			for(int n : nums)
				distinctPocketmon.add(n);

			if(pickCount< distinctPocketmon.size()){
				return pickCount;
			}
			return distinctPocketmon.size();
		}
	}

	public static void main(String[] args) {
		int[] nums={3,1,2,3};
		System.out.println(Solution.solution(nums));
	}
}
