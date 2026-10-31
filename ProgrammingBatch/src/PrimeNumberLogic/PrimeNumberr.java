package PrimeNumberLogic;

public class PrimeNumberr {
public static void main(String[]args) {
	int num=17;
	int count=0;
	if(num>=0) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
	
}
}
