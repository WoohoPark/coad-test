import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quest {

	public static void main(String[] args) {

		int[][] lines = {{2,-1,4},{-2,-1,4},{0,-1,1},{5,-8,-12},{5,8,12}};

		Quest quest = new Quest();

		String[] answer = quest.Solution(lines);

		for(String a : answer)
			System.out.println(a);
	}


	String[] Solution(int[][] lines){
		int linesSize = lines.length;
		List<Point> points = new ArrayList<>();
		for(int i=0; i < linesSize ; i++){
			for(int j=1; j < linesSize-1 ; j++){
				Point point = calculator( lines[i][0],lines[i][1],lines[i][2],lines[j][0],lines[j][1],lines[j][2]);
				if(point != null)
					points.add(point);
			}
		}

		Point maxPoint = maxPoint(points);
		Point minPoint = minPoint(points);

		int maxHeight = maxPoint.y- minPoint.y+1;
		int maxWidth = maxPoint.x- minPoint.x+1;

		char[][] table = new char[maxHeight][maxWidth];
		for(char[] row : table){
			Arrays.fill(row, '.');
		}

		for(Point point : points){
			int y = maxPoint.y - point.y;
			int x = point.x - minPoint.x;
			table[y][x] = '*';
		}

		int resultSize = table.length;
		String[] result = new String[resultSize];
		for(int z=0; z<resultSize; z++){
			result[z] = new String(table[z]);
		}
		return result;
	}

	private Point maxPoint(List<Point> points) {
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		for(Point point : points) {
			maxX = Math.max(point.x, maxX);
			maxY = Math.max(point.y, maxY);
		}
		return new Point(maxX, maxY);
	}

	private Point minPoint(List<Point> points) {
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		for(Point point : points) {
			minX = Math.min(point.x, minX);
			minY = Math.min(point.y, minY);
		}
		return new Point(minX, minY);
	}

	Point calculator(int a, int b, int e, int c, int d, int f){
		double x = (double)((b*f)-(e*d)) / ((a*d)-(b*c));
		double y = (double)((e*c)-(a*f)) / ((a*d)-(b*c));
		if(x%1 !=0 || y%1 !=0) return null;
		return new Point((int) x, (int) y);
	}
	@Getter
	class Point {
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
		int x;
		int y;
	}

}
