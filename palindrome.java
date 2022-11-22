//342 Mohammed FA       Print if number is palindrtome

import java.io.*;
import java.util.*;

class palindrome{
	public static void main(String args[]){
		int a,rev=0,dig,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers:");
		a = sc.nextInt();
		temp = a;
		while(a > 0){
			dig = a%10;
			a/=10;
			rev=rev*10+dig;
		}
		if (rev == temp)
			System.out.println(temp+" is palindrome");
		else
			System.out.println(temp+" is not palindrome");
	}
}
