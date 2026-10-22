package RemoveDigitLogic;

public class SpyNumber {

	public static void main(String[]args) {
		int num=123;
		int sum=0;
		int product=1;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			product*=digit;
			num=num/10;
		}
	
		if(sum==product) {
			System.out.println("It is spy number");
		}
		else {
			System.out.println("It is not spy number");
		}
	}
}
