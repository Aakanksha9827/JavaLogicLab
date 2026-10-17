package RemoveDigitLogic;

public class OddCount {

	public static void main(String[] args) {
	int num=131572;
	int count=0;
	while(num!=0) {
		int digit=num%10;
		if(digit%2!=0) {
			count++;
		}
		num=num/10;
	}
	System.out.println(count);

	}

}
