package baekjoon.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호  https://www.acmicpc.net/problem/9012
public class question_9012 {

	static class Solution {
		public static String solution(String expect) {

			Stack<Character> expectStack = new Stack<>();

			for(int i=0 ; i< expect.length() ;i++){
				char charExpect = expect.charAt(i);

				if(charExpect=='('){
					expectStack.add(charExpect);
				}else if(expectStack.isEmpty()){
						return "NO";
				}else{
					expectStack.pop();
				}
			}

			if(expectStack.isEmpty()){
				return "YES";
			}

			return "NO";
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader expect = new BufferedReader(new InputStreamReader(System.in));

		String str = expect.readLine();

		for(int i=0;i<Integer.parseInt(str);i++){
			System.out.println(Solution.solution(expect.readLine()));
		}
	}
}
