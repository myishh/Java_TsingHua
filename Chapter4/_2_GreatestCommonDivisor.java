package Chapter4_HW;
import java.util.Scanner;

class Calculate {
	public static int GCD(int m, int n){
		int t;
		while(m % n != 0){
			t = m % n;
			m = n;
			n = t;
		}
		return n;
	}
	public static int LCM(int m, int n ){		
		return m * n / GCD(m, n);
	}
}

public class _2_GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, n;
		m = in.nextInt(); n = in.nextInt();
		System.out.print(Calculate.GCD(m, n) + " ");
		System.out.println(Calculate.LCM(m, n));
	}

}
