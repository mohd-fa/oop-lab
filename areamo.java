//342 Mohammed FA       Area of shapes using method overloading

import java.io.*;
import java.util.*;
import java.lang.Math;

class areamo{
	public static void main(String args[]){
		double area,a,b,c;
		char s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shape(r - rectangle, c - cicle, t - triangle): ");
		s = sc.next().charAt(0);
		
		System.out.println("Enter dimensions:");
		Dim shape = new Dim();
		switch(s){
			case 'c':
				a = sc.nextFloat();
				area = shape.Area(a);
				break;
			case 'r':
				a = sc.nextFloat();
				b = sc.nextFloat();
				area = shape.Area(a,b);
				break;
			case 't':
				a = sc.nextFloat();
				b = sc.nextFloat();
				c = sc.nextFloat();
				area = shape.Area(a,b,c);
				break;
			default:
				System.out.println("Error !");
				return;
			}
		System.out.println("Area = "+area);
	}
}
	
class Dim{
	double Area(double r){
		return 3.14*r*r;
	}
	double Area(double l,double b){
		return l*b;
	}
	double Area(double a, double b, double c){
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-b)*(s-a)*(s-c));
	}
}
