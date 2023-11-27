package week2.day1;

public class LearnBreakContinueSwitch {
	public static void main(String[] args) {
		//break terminate from the loop immediately
		for (int i = 0; i<10; i++) {
		if(i==3) { 
		//break;
		continue;//skip the specific execution
		}
		System.out.println(i);

		}

		
		int day=1;

		switch (day) {
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Thursday");
		break;
		case 4:
		System.out.println("Friday");
		break;

		default:
		System.out.println("invalid number");
		break;
		}


		}

		

}
