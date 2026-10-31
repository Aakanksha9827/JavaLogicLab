package PrimeNumberLogic;

public class PrimeReverse {

	public static void main(String[] args) {
		int num=18;
		int count=0;
		int rev=0;
	   boolean flag=true;
	  if(num<=0) {
		  flag=false;
	  }
	  else {
	  for(int i=2;i<=num/2;i++) {
		  if(num%i==0) {
			  flag=false;
		  }
	  }
	  if(flag) {
		 while(num!=0) {
			 int digit=num%10;
			 rev=rev*10+digit;
			 num=num/10;
		 } 
		 System.out.println(rev);
	  }
	  else {
		  System.out.println("not prime number");
	  }
	  }
	}
}
