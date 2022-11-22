//342 Mohammed FA       Implement calculator

import java.io.*;
import java.util.*;

class calc{
	public static void main(String args[]){
		int a, b, result;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter operation:");
		op = sc.next().charAt(0);
		switch(op){
			case '+':
				result = a+b;
				break;
			case '-':
				result = a-b;
				break;
			case '*':
				result = a*b;
				break;
			case '/':
				result = a/b;
				break;
			default:
				System.out.println("Error !");
				return;
			}
		System.out.println("Result = "+result);
	}
}
