package Selenium_Assignment;

public class ArrayMissingElement {

	public int missingNumber(int []a, int n) {
        for (int i = 1; i <= n; i++) 
        {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) 
            	return i;
        }
		return -1;
    }

    public static void main(String args[]) {
        int n = 5;
        int a[] = {1, 2, 4, 5};
        ArrayMissingElement mn = new ArrayMissingElement();
        int ans = mn.missingNumber(a, n);
        System.out.println("The missing number is: " + ans);
    }

}


