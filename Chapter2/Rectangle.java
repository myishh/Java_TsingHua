//����һ���򵥵ı�ʾ���ε�Rectangle�࣬��������������
//
//1������������Ա����height��width����ʾ���εĳ��Ϳ�����Ϊ���� 2������һ��getArea���������ؾ��ε���� 3������һ��getPerimeter���������ؾ��ε��ܳ� 4����main�����У����������2�������ֱ���Ϊ���εĳ��Ϳ�����getArea��getPermeter���������㲢���ؾ��ε�������ܳ�
//
//���룺
//����2�����������м��ÿո�������ֱ���Ϊ���εĳ��Ϳ����磺5 8
//
//�����
//���2�����������м��ÿո�������ֱ��ʾ���ε�������ܳ������磺40 26

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
