package week1Assignment;

public class IsPrime {


	    public static void main(String[] args) {
	        int n = 13;
	        int count=0;
	        if(n<=1)
	        {
	        	System.out.println("The number is not prime");
	   
	        }
	        for (int i = 2; i <= n/2; i++) {
	            if (n % i == 0) {
	            count++;
	        }
	    }
	
	        if(count>1)
	        {
	        	System.out.println("The number is not prime");
	        }
	        else
	        	System.out.println("The number is prime");
	    }
}
