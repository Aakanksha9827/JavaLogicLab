package RemoveDigitLogic;

public class EvenCount {
public static void main(String[]args) {
	int num=123456;
	int count=0;
	while(num!=0) {
		int digit=num%10;
		if(digit%2==0) {
			count++;
		}
		num=num/10;
	}
	System.out.println(count);
}
}
