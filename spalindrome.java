//342 Mohammed FA       Print if string is palindrtome

import java.io.*;
import java.util.*;

class spalindrome{
	public static void main(String args[]){
		String a,rev="";
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		a = sc.nextLine();
		int length =  a.length();
		for(i=length-1; i>=0;i--)
			rev += a.charAt(i);
		if (rev.equals(a))
			System.out.println(a+" is palindrome");
		else
			System.out.println(a+" is not palindrome");
	}
}
