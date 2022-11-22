//342 Mohammed FA       Empoloyye inheritance

import java.io.*;
import java.util.*;

class hi{
	public static void main(String args[]){
		int i,n1,n2;
		Scanner sc = new Scanner(System.in);
		Employee[] m;

		
		System.out.print("Enter number of manager:");
		n1 = sc.nextInt();
		m = new Employee[n1];
		for(i =0; i<n1; i++){
			m[i] = new Employee();
			System.out.print("Enter name of manager:");
			System.out.print(i);
			m[i].name = sc.nextLine();
		}
		for(i =0; i<n1; i++){
			System.out.println(m[i].name);

		}
		}
		}
		
		
class Employee{
	String name;
}


