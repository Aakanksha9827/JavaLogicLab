package RemoveDigitLogic;

public class PrintEvenDigit {

	public static void main(String[] args) {
		int num=2246782;
		while(num!=0) {
			int digit=num%10;
			if(digit%2==0) {
				System.out.println(digit);
			}
			num=num/10;
		}
	}

}
