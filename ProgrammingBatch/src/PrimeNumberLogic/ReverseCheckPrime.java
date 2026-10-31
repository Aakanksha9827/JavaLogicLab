package PrimeNumberLogic;

public class ReverseCheckPrime {
public static void main(String[]args) {
int num=11;
int rev=0;
boolean flag=true;

while(num!=0) {
	int digit=num%10;
	rev=rev*10+digit;
	num=num/10;
}
for(int i=2;i<rev/2;i++) {
	if(rev%2==0) {
		flag=false;
	}
}
if(flag) {
	System.out.println("prime number");
}
else {
	System.out.println("not prime number");
}
}
}
