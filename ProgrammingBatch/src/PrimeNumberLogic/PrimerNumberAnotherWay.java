package PrimeNumberLogic;

public class PrimerNumberAnotherWay {
public static void main(String[]args) {
	//it cannot work good with negative values so to overcome this we right one more code prime numberr
	int num=7;
	int count=0;
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
