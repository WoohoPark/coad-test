package baekjoon.breadthfirstsearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_3184 {

	public static void main(String[] args) {

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String xy= br.readLine();
			String[] xyBox = xy.split(" ");
			int x = Integer.parseInt(xyBox[0]);
			int y = Integer.parseInt(xyBox[1]);

			for(int i=0; i<x ;i++){
				String line = br.readLine();
				char[] exceptLine = new char[line.length()];

				for(int j=0; j<line.length();j++){
					exceptLine[j] = line.charAt(j);
				}


			}

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
