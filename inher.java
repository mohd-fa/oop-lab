//342 Mohammed FA       Empoloyee inheritance

import java.io.*;
import java.util.*;

class inher{
	public static void main(String args[]){
		int i,n1,n2,age;
		String name;
		Scanner sc = new Scanner(System.in);
		Manager[] m;
		Officer[] o;
		
		System.out.print("Enter number of manager:");
		n1 = Integer.parseInt(sc.nextLine());
		m = new Manager[n1];
		
		for(i =0; i<n1; i++){
			System.out.print("Enter name :");
			name = sc.nextLine();
			System.out.print("Enter age :");
			age = Integer.parseInt(sc.nextLine());
			m[i] = new Manager(name,age);
			m[i].addData();
		}
		
		System.out.println();
		System.out.print("Enter number of officer:");
		n2 = Integer.parseInt(sc.nextLine());
		o = new Officer[n2];
		
		for(i =0; i<n2; i++){
			System.out.print("Enter name :");
			name = sc.nextLine();
			System.out.print("Enter age :");
			age = Integer.parseInt(sc.nextLine());
			o[i] = new Officer(name,age);
			o[i].addData();
		}
		
		System.out.println();
		System.out.println("Manager details:");
		
		for(i =0; i<n1; i++){
			System.out.println();
			m[i].printData();
		}
		
		System.out.println();
		System.out.println("Officer details:");
		
		for(i =0; i<n2; i++){
			System.out.println();
			o[i].printData();
		}
	}
}
	
class Employee{
	Scanner sc = new Scanner(System.in);
	String name, address;
	int age;
	long ph;
	float salary;
	
	Employee(String n, int a){
		name = n;
		age =a;
	}
	
	
	void printSalary(){
		System.out.println("Salary : " + salary);
	}
	
	void addData(){
		System.out.print("Enter address:");
		address = sc.nextLine();
		System.out.print("Enter phone number:");
		ph = Long.parseLong(sc.nextLine());
		System.out.print("Enter salary:");
		salary = Float.parseFloat(sc.nextLine());	
	}
	
	void printData(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
		printSalary();
	}
}

class Manager extends Employee{
	String dept;
	
	Manager(String n, int a){
		super(n, a);
	}
	
	void addData(){
		super.addData();
		System.out.print("Enter department:");
		dept = super.sc.nextLine();
	}
	
	void printData(){
		super.printData();
		System.out.println("Department : " + dept);
		System.out.println();	
	}
}

class Officer extends Employee{
	String spec;
	Officer(String n, int a){
		super(n, a);
	}
	
	void addData(){
		super.addData();
		System.out.print("Enter specialization:");
		spec = super.sc.nextLine();
	}
	
	void printData(){
		super.printData();
		System.out.println("Specialization : " + spec);
		System.out.println();
	}
}
