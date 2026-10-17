package RemoveDigitLogic;

public class ProductOfDigit {
public static void main(String[]args) {
	int num=12345;
	int product=1;
	while(num!=0) {
		int digit=num%10;
		product*=digit;
		num=num/10;
	}
	System.out.println(product);
}
}
