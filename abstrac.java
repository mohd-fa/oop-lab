//342 Mohammed FA       Empoloyee inheritance

import java.io.*;
import java.util.*;
import java.lang.Math.*;

class abstrac{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter base and height of Triangle: ");
		a=sc.nextInt();
		b=sc.nextInt();
		Triangle tri1 = new Triangle(a,b);
		System.out.print("Enter legth and breadth of Rectangle: ");
		a=sc.nextInt();
		b=sc.nextInt();
		Rectangle rect1 = new Rectangle(a,b);
		System.out.print("Enter length of side of Hexagon: ");
		a=sc.nextInt();
		Hexagon hex1 = new Hexagon(a);
		System.out.println("No of sides of Rectangle: "+rect1.noOfSides());
		System.out.println("Area of Rectangle"+rect1.area());
		System.out.println("No of sides of Triangle: "+tri1.noOfSides());
		System.out.println("Area of Triangle: "+tri1.area());
		System.out.println("No of sides of Hexagon: "+hex1.noOfSides());
		System.out.println("Area of Hexagon: "+hex1.area());
		
	}
}
	
abstract class Shape{
	abstract int noOfSides();
	abstract double area();
	
	
}

class Triangle extends Shape{
	int b,h;
	Triangle(int h,int b){
		this.h = h;
		this.b = b;
	}
	int noOfSides(){
		return 3;
	}
	double area(){
		return b*h/2;
	}
}

class Rectangle extends Shape{
	int l,b;
	Rectangle(int l,int b){
		this.l = l;
		this.b = b;
	}
	int noOfSides(){
		return 4;
	}
	double area(){
		return l*b;
	}
}

class Hexagon extends Shape{
	int s;
	Hexagon(int s){
		this.s = s;
	}
	int noOfSides(){
		return 6;
	}
	double area(){
		return 3*Math.sqrt(3)/2*s*s;
	}
	
}
