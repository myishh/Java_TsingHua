package Chapter3_HW;

import java.util.Scanner;

class Graph {	
	int area;
	
	public void getArea(String[] buffer){		
		System.out.println(area);		
	}	
}

class Rectangle extends Graph {
	int size = 2;
	
	public void getArea(String[] buffer){
		int[] sides = new int[size];
		for(int i = 0; i < size; i++){
			sides[i] = Integer.parseInt(buffer[i]);
		}
		area = sides[0] * sides[1];
		System.out.println(area);
	}
	
}

class Triangle extends Graph {
	int size = 3;
	
	public void getArea(String[] buffer){
		int[] sides = new int[size];
		for(int i = 0; i < size; i++){
			sides[i] = Integer.parseInt(buffer[i]);
		}	
		int p = (sides[0]+sides[1]+sides[2])/2;
		double bu = Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
		area = (int) bu;
		System.out.println(area);
	}
	
}

public class Area {

	public static void main(String[] args) {
		Scanner insize = new Scanner(System.in);
		Scanner indata = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		int n = insize.nextInt();
//		int n = 3;
		String[][] buffer = new String[n][];
//		String[][] buffer = {
//				{"5", "5"},
//				{"6", "6", "6"},
//				{"7", "7", "7"}
//							};
		for(int i = 0; i < n; i++){
			String s = indata.nextLine();
			buffer[i] = s.split("\\s+");
		}
		for(int i = 0; i < n; i++){
			if(buffer[i].length == 2){
				rec.getArea(buffer[i]);
			} else if(buffer[i].length == 3){
				tri.getArea(buffer[i]);
			} else {
				System.out.println("Input incorrect!");
			}
		}
		insize.close();
		indata.close();
	}

}
