package programmers.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortStree {

	public static void main(String[] args) {

		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int[] startPosition = {0,0};
		int[] endPosition = {maps[0].length,maps.length};
		boolean[][] visitied =new boolean[maps[0].length][maps.length];

		Solution.solution(maps,startPosition,endPosition,visitied);

	}

	static class Solution {
		public static void solution(int[][] maps, int[] startPosition, int[] endPosition, boolean[][] visitied) {

//			int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
			int answer= 0;
//			int[] startPosition = {0,0};
//			int[] endPosition = {maps[0].length,maps.length};
//			boolean[][] visitied =new boolean[maps[0].length][maps.length];
			Queue<Node> nodes = new LinkedList<>();
			nodes.offer(new Node(startPosition[0],startPosition[1],1));
			int[][] movePosition =	{{1,0},{0,1},{-1,0},{0,-1}}; //남동서북

			while(!nodes.isEmpty()){
				Node tempNode = nodes.poll();
				int tempX = tempNode.x;
				int tempY = tempNode.y;
				int tempM = tempNode.m;
				//001

				visitied[tempX][tempY] = true;
				//00

				//44
				if(endPosition[0]-1==tempX && endPosition[1]-1==tempY){
					answer=tempM;
					return;
				}

				for(int i=0; i<movePosition.length;i++){
					int sumX = tempX + movePosition[i][0];//1 -1
					int sumY = tempY + movePosition[i][1];//1 -1
					if(sumX < 0 || sumY < 0  || 4<sumX || 4<sumY) continue;
					if(maps[sumX][sumY] == 1 && visitied[sumX][sumY] == false){
						nodes.offer(new Node(sumX,sumY,tempM+1));
					}
				}
			}
			answer =- 1;
			return;
		}
	}

	static class Node{
		int x;
		int y;
		int m;

		Node(int x, int y, int m){
			this.x = x;
			this.y = y;
			this.m = m;
		}
	}

}
