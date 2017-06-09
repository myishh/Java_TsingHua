package Chapter3_HW;

//��ʦѧ������
/*
ѧУҪ���������ܽᣬ��Ҫ�Խ�ʦ��ѧ�������ֽ������ͳ�ơ�ѧ����ͳ����������������ʦ��ͳ���������ĸ�����
��ʵ��һ��ͳ��ϵͳ������������ݽ������� 
����ʵ��һ��Person���ʾ��Ա����ʵ��һЩ��Ҫ�ķ�������ʵ��Teacher���Student�࣬ͨ����ļ̳л������
�������

�����ʽ��
��������һ������N����ʾ����ͳ�Ƶ�������
��������N�У�ÿ�����ÿո������һϵ�����֡�

�����ʽ��
N�У�ÿ����һ����ʶ����һ��ƽ���÷֣�����ȡ�������������ÿո������
ѧ���ı�ʶ����Student����ʦ�ı�ʶ����Teacher��

����������
2
2 3 4
2 3 4 5

���������
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
		//ȫ��ת��Ϊint
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
		//stringת��Ϊint
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
		//����2������
		Student stu = new Student();
		Teacher tch = new Teacher();
		//����һ��n
		int n = insize.nextInt();
		
		//��ά�������ڴ洢���������
		String[][] buffer = new String[n][];
		//���룬����ÿһ�������string�Կո�ָ�
		for(int i = 0; i < n; i++){
			//����һ������
			String s = inele.nextLine();
			//�Կո�ͻس����ֳ�string���鲢�����ά����buffer
			buffer[i] = s.split("\\s+");
		}
		//��ÿһ�����룬�ֱ���ö�Ӧ�ķ���
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
1.����һ������
2.�зֳ�array
3.�ѱ������stringת����int
4.�ж����鳤��length�������3�����student�ķ����������4�����teacher����


 */
