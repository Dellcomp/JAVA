package Prc;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] arg)
	{
	int a,arm=0,n,temp;
	//int a;
	//int arm=0;
	//int n;
	//int temp;
	

	
	Scanner sc=new Scanner(System.in);
	for(int i=1; i<=1000000; i++) {
		//1 <=5 --> 1
		//2 <=5 --> 2
		//3 <=5 --> 3
		//5 <=5 --> 5
		//6 <=5 --> false
		
		
	
	System.out.println("Enter a number");
	
	n=sc.nextInt();
	
	temp=n;
	
	
	for( ;n!=0; n/=10 )	//! --> 0!=0 --> 0 false		
	{
		a=n%10;
		arm=arm+(a*a*a);			//temp = n = Entering the number
	}
	System.out.println("........................");
	
	if(arm==temp)
	
		System.out.println(temp+" is a armstrong number ");
	
		else
	
		System.out.println(temp+" is not a armstrong number ");
        }

	}
}