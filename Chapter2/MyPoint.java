/*
 编写一个表示二维平面上的点的类MyPoint，满足以下条件：
1、定义private的成员变量x和y，表示点的x和y坐标，类型为double
2、定义两个MyPoint的构造方法，一个构造方法不带参数，而且x和y的初始值为0，另一个构造方法有两个参数，参数名为x和y，类型为double，用这两个参数分别作为初始x和y坐标
3、定义一个getD方法，有一个类型为MyPoint的对象参数，功能为返回当前对象和参数对象这两个坐标点的距离，返回值为double类型
4、编写测试的main方法，调用getD计算两个点之间的距离

输入：
输入2行数据， 总共4个有理数。每2个数据一组，表示一个点的x和y坐标，每行的2个数据用空格隔开。例如：
200.1 200.2
200.3 200.4

输出：
输出两个点之间的距离。例如：
0.28284271247464315
*/

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
