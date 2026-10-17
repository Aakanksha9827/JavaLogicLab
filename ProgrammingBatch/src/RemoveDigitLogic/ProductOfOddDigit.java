package RemoveDigitLogic;

public class ProductOfOddDigit {

	public static void main(String[] args) {
		int num=123456;
		int product=1;
		while(num!=0) {
			int digit=num%10;
			if(digit%2!=0) {
				product*=digit;
			}
			num=num/10;
		}
		System.out.println(product);
	}

}
