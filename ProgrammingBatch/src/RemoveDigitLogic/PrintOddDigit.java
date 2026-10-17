package RemoveDigitLogic;

public class PrintOddDigit {

	public static void main(String[] args) {
		int num=123879;
		while(num!=0) {
			int digit=num%10;
			// digit%2!=0 also we used this condition
			if(digit%2==1) {
				System.out.println(digit);
			}
			num=num/10;
		}

	}

}
