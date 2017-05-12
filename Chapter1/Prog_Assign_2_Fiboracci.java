/*求斐波拉契数
斐波拉契数为，Fib(N) = Fib(N-1)+Fib(N-2) F(0)=F(1)=1 用Java编写能求Fib(N)的程序 输入为N,须输出Fib(N)
如输入
3
输出：
3
*/

import java.util.Scanner;

public class Fiboracci {

	public static void main(String[] args) {
		
		Scanner innum = null;
		innum = new Scanner(System.in);
		int num = innum.nextInt();		
		System.out.println(Fib(num));			
	}
	
	public static int Fib(int n){
		if( n < 0) return 0;
			if(n >= 2 ){
				return Fib(n-1)+Fib(n-2);
			} else if(n == 1 ){
				return 1;
			} else  {
				return 1;
			} 
		} 
}

/* f(1) = f(0) = 1;
 * f(2) = f(1) + f(0) = 1 + 1 = 2;
 * f(3) = f(2) + f(1) = 2 + 1 = 3;
 * f(4) = f(3) + f(2) = 3 + 2 = 5; 
 * f(5) = f(4) + f(3) = 5 + 3 = 8;
 * f(6) = f(5) + f(4) = 8 + 5 = 13;
 */
 
