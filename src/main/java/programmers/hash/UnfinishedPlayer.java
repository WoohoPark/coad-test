package programmers.hash;

import java.util.HashMap;
import java.util.Map;

//완주하지 못한 선수 https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
public class UnfinishedPlayer {

	static class Solution {
		public static String solution(String[] participant, String[] completion) {

			HashMap<String, Integer> solutionMap = new HashMap<>();
			String answer = "";

			for (String p : participant) {
				solutionMap.put(p, solutionMap.getOrDefault(p,0)+ 1);
			}

			for(String c :completion){
				solutionMap.put(c,solutionMap.get(c)-1);
			}

			for (Map.Entry<String, Integer> stringIntegerEntry : solutionMap.entrySet()) {
				if(0 < stringIntegerEntry.getValue()){
					answer = stringIntegerEntry.getKey();
					break;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		String[] participant={"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(Solution.solution(participant,completion));
	}
}
