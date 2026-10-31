package PrimeNumberLogic;

public class PrimeNumberFlag {

	public static void main(String[] args) {
	int num=6;
	boolean flag=true;
	if(num<=0) {
		flag=false;
	}
	else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}
	}

}
