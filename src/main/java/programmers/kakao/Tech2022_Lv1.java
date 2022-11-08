package programmers.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Tech2022_Lv1 {

	public static void main(String[] args) {

		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		String[][] tokens = {{"R", "T"}, {"C", "F"}, {"J","M"}, {"A","N"}};

		HashMap<Integer, HashMap<String, Integer>> tokensMap = new HashMap<Integer, HashMap<String, Integer>>();

		for (int i = 0; i < tokens.length; i++) {
			String[] token = tokens[i];
			int tokenSize = token.length;
			HashMap<String, Integer> tokenMap = new HashMap<>();

			for (int j = 0; j < tokenSize; j++) {

				tokenMap.put(token[j], 0);
				tokensMap.put(i, tokenMap);
			}
		}

		int surveySize = survey.length;

		for (int k = 0; k < surveySize; k++) {
			String strSurvey = survey[k];
			String[] strArr = new String[2];
			strArr[0] = String.valueOf(strSurvey.charAt(0));
			strArr[1] = String.valueOf(strSurvey.charAt(1));

			HashMap<String, Integer> tempMap = new HashMap<>();

			int scoreNum = choices[k];

			if (strSurvey.contains("R")) {
				tempMap = tokensMap.get(0);
			}
			if (strSurvey.contains("C")) {
				tempMap = tokensMap.get(1);
			}
			if (strSurvey.contains("J")) {
				tempMap = tokensMap.get(2);

			}
			if (strSurvey.contains("A")) {
				tempMap = tokensMap.get(3);
			}

			Arrays.stream(strArr).sorted();

			if (scoreNum > 4) {
				scoreNum = scoreNum - 4;
				tempMap.put(strArr[1], tempMap.get(strArr[1]) + scoreNum);
			} else if (scoreNum == 4) {
				continue;
			} else {
				tempMap.put(strArr[0], tempMap.get(strArr[0]) + scoreNum);
			}

			String answer;


		}

		for(int l=0 ; l<tokensMap.size() ; l++){
			HashMap<String, Integer> resultMap = tokensMap.get(l);

			if(resultMap.get(0) == resultMap.get(1)){
				Set<String> strings = resultMap.keySet();

			}


		}
			System.out.println("ㅂ");


	}

//	public String solution(String[] survey, int[] choices) {
//
//
//	}

}
