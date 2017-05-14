/*求斐波拉契数
斐波拉契数为，Fib(N) = Fib(N-1)+Fib(N-2) F(0)=F(1)=1 用Java编写能求Fib(N)的程序 输入为N,须输出Fib(N)
如输入
3
输出：
3
*/

import java.util.Scanner;
//Four methods could be used: recursion, iteration, array, formula
public class Fiboracci {

	public static void main(String[] args) {
		
		Scanner innum = null;
		innum = new Scanner(System.in);
		int num = innum.nextInt();		
		System.out.println(Fib(num));	//using the recursion method
		System.out.println(Fib_I(num)); //using the iteration method
		System.out.println(Fib_A(num));	//using the array method
	}
	
	//Recursion, but it is a pretty costy and low-efficent method
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
	//Iteration, performance is better than the recursion one
	public static int Fib_I(int n){
		if (n < 2){
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
	
	//Array, need more memory than iteration
	public static int Fib_A(int n){
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i <= n; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
	
	//Formula
	public static int Fib_F(int n){
		return (Math.pow((1+Math.sqrt(5))/2, n+1) - Math.pow((1-Math.sqrt(5))/2, n+1))/Math.sqrt(5);
	}
	
}

/* f(1) = f(0) = 1;
 * f(2) = f(1) + f(0) = 1 + 1 = 2;
 * f(3) = f(2) + f(1) = 2 + 1 = 3;
 * f(4) = f(3) + f(2) = 3 + 2 = 5; 
 * f(5) = f(4) + f(3) = 5 + 3 = 8;
 * f(6) = f(5) + f(4) = 8 + 5 = 13;
 */
 
