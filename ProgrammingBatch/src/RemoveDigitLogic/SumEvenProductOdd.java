package RemoveDigitLogic;

public class SumEvenProductOdd {
public static void main(String[]args) {
	int num=123456;
	int sum=0;
	int product=1;
	
	while(num!=0) {
		int digit=num%10;
		if(digit%2==0) {
			sum=sum+digit;
		}
		else {
			product=product*digit;
		}
		num=num/10;
	}
	System.out.println("Sum of even number is:"+sum);
	System.out.println("Product of odd number is:"+product);
}
}
