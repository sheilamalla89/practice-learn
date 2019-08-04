package basics;

public class Factorial {
	
	// fac(0) = 1
	// fac(1) = n*f(0) = 1*1	= 1
	// fac(2) = n*f(1)*f(0) = 2*1*1 = 2
	// fac(3) = n*fac(2)*fac(1)*fac(0) = 3*2*1*1 = 6
	// fac(4) = n*fac(3)*fac(2)*fac(1)*fac(0) = 4*3*2*1*1 = 24
	public static void main(String[] args) {
		
		System.out.println(fac(4));
	}
	
	public static int fac(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 1;
		}
		return (n*fac(n-1));
	}
}
