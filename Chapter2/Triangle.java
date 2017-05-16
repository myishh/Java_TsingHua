/*
编写一个三角形类，能根据输入的3个double类型数据构造三角形对象，定义三个构造方法。
如果这3个数据满足构成三角形的条件，直接构造三角形。否则，如果3个数的最大值大于0，则自动构造以最大值为边的等边三角形。如果最大值也不大于0，则将三角形类的三边都初始化为0。
再定义一个getArea方法，计算所构造的三角形的面积，返回类型为double。
最后，编写main方法，测试getArea方法，计算三角形的面积。

输入：
输入三个有理数，中间用空格隔开。例如：
8.9 6.4 7.2

输出：
输出三角形的面积。例如：
22.78812396293297

 */
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
