package FactorForLoop;

public class ProductOfEvenFactor {

	public static void main(String[] args) {
		int num=6;
		int product=1;
		for(int i=1;i<=num;i++) {
		if(num%i==0 && i%2==0) {
			product*=i;
		}
		}
		System.out.println(product);

	}

}
