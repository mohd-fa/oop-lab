// 342 Mohammed FA       Exception handling
import java.io.*;
import java.util.*;

class BankException extends Exception{
	BankException(String str) { 
		super(str); 
	}
}

class excp {
	public static void main(String args[]) throws BankException{
		double balance,withdraw;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount in bank:");
		balance = sc.nextInt();
		System.out.println("Enter the amount to withdraw:");
		withdraw = sc.nextInt();
		try{
			if (withdraw > balance){
				BankException less = new BankException("Balance is less than "+withdraw);
		    		throw less;
	    		}
	    		System.out.println("Balance = "+(balance-withdraw));	
	    	}
	    	catch (BankException a){
			a.printStackTrace();
		}
		finally{
			System.out.println("Transaction Ended.");	
		}
	}
}
	    	
	    	
                    
