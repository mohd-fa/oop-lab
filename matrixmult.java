//342 Mohammed FA       multiply two matrix
import java.io.*;
import java.util.*;

class matrixmult{
	public static void main(String args[]){
		int m,n,p,q,i,j,k;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter order of matrix A:");
		m = sc.nextInt();
		n = sc.nextInt();
		
		System.out.println("Enter order of matrix B:");
		p = sc.nextInt();
		q = sc.nextInt();
		
		if (n != p){
			System.out.println("Multiplication not possible");
			return;
		}
		
		int a[][] = new int[m][n];
		int b[][] = new int[p][q]; 
		
		System.out.println("Enter elements of matrix A:");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j] = sc.nextInt();
				
		System.out.println("Enter elements of matrix B:");
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				b[i][j] = sc.nextInt();
		
		int c[][] = new int[m][q];
		
		for( i=0;i<m;i++)  
			for( j=0;j<q;j++){    
				c[i][j]=0;      
				for(k=0;k<n;k++)            
					c[i][j]+=a[i][k]*b[k][j];      
			}
			
		System.out.println("Product:");
		for(i=0;i<m;i++){
			for(j=0;j<q;j++)
				System.out.print(c[i][j]+"\t");
			System.out.println("");
		}
				
	}
}
