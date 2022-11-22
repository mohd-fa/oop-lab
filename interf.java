//342 Mohammed FA       Empoloyee interface

import java.io.*;
import java.util.*;

class interf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name :");
		String name = sc.nextLine();
		System.out.print("Enter age :");
		int age = Integer.parseInt(sc.nextLine());
		Student s1 = new Student(name,age);
		s1.printName();
		s1.printAge();
	}
}

interface Human{
	void printName();
}

interface Child extends Human{
	void printAge();
}

class Student implements Child{
	String name;
	int age;
	Student(String n, int a){
		name = n;
		age = a;
	}
	public void printName(){
		System.out.println("Name:"+ name);
	}
	public void printAge(){
		System.out.println("Age:"+ age);
	}
}
