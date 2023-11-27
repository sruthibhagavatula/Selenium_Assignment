package week1.day2;

public class LearnOperator {

	public static void main(String[] args) {
		//Arithmetic operators
System.out.println(5+5);
System.out.println(5-5);
System.out.println(5*5);
System.out.println(5/5);
System.out.println(5%5);

//Assignment operator
int a = 5;//declare and initialize
a = a+5;
a+=5;
System.out.println(a);

//Comparision operator
System.out.println(5==5);
System.out.println(5!=5);
System.out.println(5>=5);
System.out.println(5>5);
System.out.println(5<5);
System.out.println(5<=5);

//logical operator
System.out.println((5==5) && (5<3));
System.out.println((5==5) || (4>9));

//logical not
boolean flag = true;
System.out.println(flag);
System.out.println(!flag);

//unary operator
int b=10;
System.out.println(b++); //(post increment - it will print and then increment in next line
System.out.println(b);//11
System.out.println(--b);// (pre increment - it will decrement and then print in next line 10
System.out.println(b);//10



	}

}
