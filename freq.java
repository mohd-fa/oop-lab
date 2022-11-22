//342 Mohammed FA       frequency of given character

import java.io.*;
import java.util.*;

class freq{
	public static void main(String args[]){
		String s;
		char c;
		int i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		s = sc.nextLine();
		System.out.println("Enter a character:");
		c = sc.next().charAt(0);
		int length = s.length();
		for(i=0; i<length ;i++)
			if (c == s.charAt(i))
				count++; 
		System.out.println(c+" is occured "+count+" times in "+s);
	}
}
