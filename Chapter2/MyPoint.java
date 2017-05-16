package Chapter2_HW;
import java.util.Scanner;

public class MyPoint {
	
	private double x, y;
	
	MyPoint(){
		x = 0.0d;
		y = 0.0d;
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getD(MyPoint mp){
		double dist = (this.x - mp.x)*(this.x - mp.x) + (this.y - mp.y)*(this.y - mp.y);
		return Math.sqrt(dist);		
	}
	
	public static void main(String[] args){
		MyPoint p1, p2;
		Scanner in = new Scanner(System.in);
		p1 = new MyPoint(in.nextDouble(), in.nextDouble());
		p2 = new MyPoint(in.nextDouble(), in.nextDouble());
		System.out.println(p1.getD(p2));
	}

}
