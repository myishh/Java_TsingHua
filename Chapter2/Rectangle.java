/*
创建一个简单的表示矩形的Rectangle类，满足以下条件：

1、定义两个成员变量height和width，表示矩形的长和宽，类型为整型 2、定义一个getArea方法，返回矩形的面积 3、定义一个getPerimeter方法，返回矩形的周长 4、在main函数中，利用输入的2个参数分别作为矩形的长和宽，调用getArea和getPermeter方法，计算并返回矩形的面积和周长

输入：
输入2个正整数，中间用空格隔开，分别作为矩形的长和宽，例如：5 8

输出：
输出2个正整数，中间用空格隔开，分别表示矩形的面积和周长，例如：40 26
*/
package Chapter2_HW;

import java.util.Scanner;

public class Rectangle {
	
	private int height, width;
	
	public int getArea(){		
		return height * width;
	}
	
	public int getPerimeter(){
		return 2*(height + width);
	}	

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		int hei, wid;
//		hei = in.nextInt();
//		wid = in.nextInt();
////		System.out.println(hei * wid);
//		Rectangle rct = new Rectangle();
//		rct.height = hei;
//		rct.width = wid;
		
//		System.out.print(rct.getArea()+" "+rct.getPerimeter());
		
		String[] haha = new String[3];
		haha[0] = "God";
		haha[1] = "bless";
		haha[2] = "you";
		System.out.print(haha[3].equals("h"));
		
	}

}
