package Chapter4_HW;

import java.util.Scanner;

class Doit{
	int num;
	public Doit(int n){
		num = n;
	}
	public int pave(){
		if (num == 1){
			return 1;
		} else if (num == 2) {
			return 2;
		}
		int n1 = 1, n2 = 1, sn = 0;
		for(int i = 0; i <= num - 2; i++) {
			sn = n1 + n2;
			n1 = n2;
			n2 = sn;
		}
		return sn;
	}
	public int pave(int n){
		if (n == 1){
			return 1;
		} else if (n == 2) {
			return 2;
		}
		int n1 = 1, n2 = 1, sn = 0;
		for(int i = 0; i <= n - 2; i++) {
			sn = n1 + n2;
			n1 = n2;
			n2 = sn;
		}
		return sn;
	}
	
	
}

public class _3_Brick {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Doit d1 = new Doit(in.nextInt());
		System.out.println(d1.pave());
	}
}
/*
1: 1												(1)
2: 1 1, 2											(2)
3: 1 1 1, 1 2, 2 1									(3)
4: 1 1 1 1, 1 1 2, 1 2 1, 2 2, 2 1 1				(5)
5: 1 1 1 1 1, 1 1 1 2, 1 2 2, 2 1 2, 2 2 1, 2 1 1	(8)
6: 1 1 1 1 1 1, 1 1 1 1 2, 1 1 2 2, 2 2 2
*/