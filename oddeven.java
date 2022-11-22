//342 Mohammed FA       Print odd or even

import java.io.*;
import java.util.*;

class oddeven{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers:");
		a = sc.nextInt();
		if (a%2 == 0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}
}
