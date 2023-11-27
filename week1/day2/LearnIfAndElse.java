package week1.day2;

public class LearnIfAndElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 35;
		if(marks ==35)
		{
			System.out.println("pass");
		}
		
		int age = 18;
		if(age==17)
		{
			System.out.println("not eligible for vote");
		}
		else if (age>=18) {
			System.out.println("eligible for vote");
		}
		
		int value = 35;
		if( value ==35)
		{
			System.out.println("grade is D");
		}
		else if( value ==45)
		{
			System.out.println("grade is C");
		}
		else if( value ==95)
		{
			System.out.println("grade is A");
		}
		else if( (value >=35) && (value <=60))
		{
			System.out.println("grade is B");
		}

	}

}
