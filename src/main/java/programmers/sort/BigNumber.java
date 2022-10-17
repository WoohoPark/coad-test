package programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumber {
	public static void main(String[] args) {

		int[] numbers = {3, 30, 34, 5, 9};
		String out = Solution.solution(numbers);
		System.out.println(out);
	}
	static class Solution {
		public static String solution(int[] numbers) {

			String[] temp = new String[numbers.length];

			for(int a=0; a<numbers.length;a++){
				temp[a]= String.valueOf(numbers[a]);
			}

			Arrays.sort(temp, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return (o2+o1).compareTo(o1+o2);
				}
			});

			String answer = "";
			for(int i=0;i<temp.length;i++){
				if(i==0 && temp[i].equals("0")){
					return answer  ="0";
				}
				answer += temp[i];
			}
			return answer;
		}
	}
}
