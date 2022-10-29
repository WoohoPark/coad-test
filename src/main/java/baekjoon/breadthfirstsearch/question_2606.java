package baekjoon.breadthfirstsearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2606
public class question_2606 {
	static int answer =0;

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int nodeCount= Integer.parseInt(br.readLine());
			int linkCount = Integer.parseInt(br.readLine());
			int[][] nodes = new int[nodeCount][nodeCount];
			boolean[] visitedNode = new boolean[nodeCount];

			for(int i=0;i<linkCount;i++){
				String[] linkBox = br.readLine().split(" ");
				nodes[Integer.parseInt(linkBox[0])-1][Integer.parseInt(linkBox[1])-1] = 1;
				nodes[Integer.parseInt(linkBox[1])-1][Integer.parseInt(linkBox[0])-1] = 1;
			}

			dfs(0,nodes,visitedNode);

			System.out.println(answer);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	static void dfs(int index ,int[][] nodes ,boolean[] visitedNode){
		if(visitedNode[index]) return;

		visitedNode[index] = true;

		for(int i=0; i < nodes.length ; i++){
			if(!visitedNode[i] && (nodes[index][i] == 1)){
				answer++;
				dfs(i,nodes,visitedNode);
			}
		}
	}
}
