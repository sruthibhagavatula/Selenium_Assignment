package week1Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8;
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i<=n; i++)
		{
			System.out.println(a);	
			c=a+b;//c=1,a=0,b=1
			a=b;
			b=c;
		}

	}

}
