package Chapter3_HW;

//教师学生评分
/*
学校要进行年终总结，需要对教师和学生的评分结果进行统计。学生的统计数据有三个，教师的统计数据有四个。请
你实现一个统计系统，对输入的数据进行整理。 
请你实现一个Person类表示人员，并实现一些必要的方法，再实现Teacher类和Student类，通过类的继承机制完成
这个任务。

输入格式：
首先输入一个数字N，表示输入统计的人数。
接下来是N行，每行是用空格隔开的一系列数字。

输出格式：
N行，每行是一个标识符加一个平均得分（向下取整的整数），用空格隔开。
学生的标识符是Student，教师的标识符是Teacher。

输入样例：
2
2 3 4
2 3 4 5

输出样例：
Student 3
Teacher 3

 */
import java.util.Scanner;

class Person {
	int age; String name;
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}	
	public Person(){
		age = 0;
		name = null;
	}	
	public int getAge(){
		return age;
	}	
	public String getName(){
		return name;
	}
}

class Teacher extends Person{
	int[] score = new int[4];
	int scoreSize = 4;
	
	public Teacher(){
		super();
	}
	public Teacher(int age, String name){
		super(age, name);
	}		
	public int getAverageScore(){
		return (score[0] + score[1] + score[2] + score[3])/4; 
	}	
	public void showAve(String[] c){
		//全部转换为int
		for(int i = 0; i < scoreSize; i++) {
			score[i] = Integer.parseInt(c[i]);
		}
		System.out.println("Teacher "+ getAverageScore());		
	}
}

class Student extends Person {
	int[] score = new int[3];
	int scoreSize = 3;
	
	public Student(){
		super();
	}
	public Student(int age, String name){
		super(age, name);
	}	
	public int getAverageScore(){
		return (score[0] + score[1] + score[2])/3; 
	}	
	public void showAve(String[] c){
		//string转换为int
		for(int i = 0; i < scoreSize; i++) {
			score[i] = Integer.parseInt(c[i]);
		}
		System.out.println("Student "+ getAverageScore());
	}

}

public class Grading {
	public static void main(String[] args) {
		Scanner insize = new Scanner(System.in);
		Scanner inele = new Scanner(System.in);
		//创建2个对象
		Student stu = new Student();
		Teacher tch = new Teacher();
		//输入一个n
		int n = insize.nextInt();
		
		//二维数组用于存储输入的数字
		String[][] buffer = new String[n][];
		//输入，并把每一行输入的string以空格分隔
		for(int i = 0; i < n; i++){
			//输入一行数字
			String s = inele.nextLine();
			//以空格和回车划分成string数组并存入二维数组buffer
			buffer[i] = s.split("\\s+");
		}
		//对每一行输入，分别调用对应的方法
		for(int i = 0; i < n; i++) {
			if(buffer[i].length == 3){
				stu.showAve(buffer[i]);
			} else if (buffer[i].length == 4){
				tch.showAve(buffer[i]);
			} else {
				System.out.println("Input is incorrect!");
			}
		}
	}
}
/*
1.输入一行数字
2.切分成array
3.把本数组从string转换成int
4.判断数组长度length，如果是3则调用student的方法，如果是4则调用teacher方法


 */
