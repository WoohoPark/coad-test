package baekjoon.bruteforcing;

import java.util.Scanner;

public class question_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maxSize= sc.nextInt();
		int targetNumber = sc.nextInt();
		int answer= 0;

		int[] cards = new int[maxSize];
		for(int x=0 ; x<mize ; x++)
			cards[x]= sc.nextInt();

		for(int i=0; i<maxSize;i++){
			for(int j=i+1;j<maxSize;j++){
				for(int k=j+1;k<maxSize;k++){
					int sum = cards[i]+cards[j]+cards[k];
					if(answer<sum && sum<=targetNumber){
						answer= sum;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
