package week1.day1;
/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */
public class Mobile {
	
	public void makeCall() {
		System.out.println("This method is to make a call");
		String mobileModel;
		float mobileWeight;
	}
	public void sendMsg() {
		System.out.println("This method is to send message");
		boolean isFullCharged;
		int mobileCost;
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMsg();
		System.out.println("This is my mobile");
	}
}
