import java.util.Scanner;

public class Triangle {
	
	private double x, y, z;
	
	Triangle(double a, double b, double c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
	Triangle(double a){
		this.x = a;
		this.y = a;
		this.z = a;
	}
	Triangle(){
//		this.x = 0.0d;
//		this.y = 0.0d;
//		this.z = 0.0d;
	}
	
	public double getArea(){
		double p = (x + y + z)/2;
		return Math.sqrt(p*(p-x)*(p-y)*(p-z));
	}
	
	public static double getMax(double x, double y, double z){
		double max = 0.0;
		if(x >= y && y >= z) max = x;
		if(x >= y && y <= z && x >= z) max = x;
		if(x >= y && y <= z && x <= z) max = z;
		if(x <= y && y <= z) max = z;
		if(x <= y && z <= y) max = y;
		return max;		
	}
	
	public static void main(String[] args){
		double x, y, z, max;
		Scanner in = new Scanner(System.in);
		
		//这里如果不加上" = null"，最后print的时候会提示"local variable may not have been initialized"
		Triangle t1 = null;
		x = in.nextDouble();
		y = in.nextDouble();
		z = in.nextDouble();
		max = getMax(x,y,z);
		
		if(((x+y)>z)&&((x-y)<z)&&x>0&&y>0&&z>0){
			t1 = new Triangle(x, y, z);		
		}
		else if(getMax(x,y,z) > 0){
			t1 = new Triangle(max);
		}
		else if(getMax(x,y,z) <= 0)	{
			t1 = new Triangle(0.0d, 0.0d, 0.0d);
		}
		
		System.out.println(t1.getArea());
		
	}

}
