package Chapter4_HW;
import java.util.Scanner;

class Decide{
	public static boolean isPrime(int n){
		boolean res = true;
		for(int i = 2; i < n; i++){
			if(n % i == 0) res = false;
		}			
		return res;
	}
	public static boolean isEven(int n){
		boolean res = false;
		if(n % 2 == 0) res = true;
		return res;
	}
	
	
}


public class _1_GoethebachGuess {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n > 6 && Decide.isEven(n)) {
			for(int i = 1; i < n/2; i++){
				if(Decide.isPrime(i) && Decide.isPrime(n - i)){
					System.out.printf("%d = %d + %d\n", n, i, n - i);
				}
			}
		} else System.out.printf("Num must greater than 6, and must be an even.\n");	
	}
}