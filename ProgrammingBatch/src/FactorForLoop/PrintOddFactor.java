package FactorForLoop;

public class PrintOddFactor {

	public static void main(String[] args) {
	int num=6;
	for(int i=1;i<=num;i++) {
		if(num%i==0 && i%2!=0) {
			System.out.println(i);
		}
	}
	}

}
