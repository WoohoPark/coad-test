package programmers.hash;

import java.util.*;

//전화번호 https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
public class PhoneNumber {
	static class Solution {
		public static boolean solution(String[] phone_book) {
			Arrays.sort(phone_book);
			for(int i=0; i<phone_book.length-1; i++){
				if(phone_book[i+1].startsWith(phone_book[i])){
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		String[] phone_book ={"119", "97674223", "1195524421"};
		System.out.println(Solution.solution(phone_book));
	}
}
