package FactorForLoop;

public class SumOfOddFactor {

	public static void main(String[] args) {
		int num=6;
		int sum=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0 && i%2!=0) {
			sum+=i;
		}
		}
		System.out.println(sum);

	}

}
