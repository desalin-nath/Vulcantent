package com.picnic.cal;

public class Calculator {
		
		
	int add(int a,int b,int c) {
			
	return a+b+c;

			
		}

		int add(int a,int b) {
			
	return a+b;
			
		
	}
		
		
		
	int subtract(int a,int b,int c) {
			
	return a-b-c;

			
		}
		
	int subtract(int a,int b)
	 {
			
	return a-b;
			

		}
		
		
	int Multiplication(int a,int b,int c) 
	{
		
		return a*b*c;
			

		}
		
	int Multiplication(int a,int b) {
			
	return a*b;
			
		
	}
		
		
		
		
	int Division(int a,int b,int c) 
	{
			
	return a/b/c;
			
		
	}
		
	int Division(int a,int b)
	 {
			
	return a/b;
			
		
	}
		
		
		

		
	public static void main(String[] args) {
			
			
	Calculator calculator = new Calculator();
			
			
	System.out.println(" addition of 3 numbers is" + calculator.add(5, 4, 5));
			
	System.out.println(" addition of 2 numbers is" + calculator.add(6,  8));
			
			
	System.out.println(" substraction  of 3 numbers is " + calculator.subtract(8, 7, 2));
			
	System.out.println(" substraction of 2 numbers is " + calculator.subtract(4,  2));
			
			
	System.out.println(" multiplication of 3 numbers is " + calculator.Multiplication(5, 7, 8));
			
	System.out.println(" multiplication of 2 numbers is " + calculator.Multiplication(8,  9));
			
			
	System.out.println(" Division of 3 numbers is " + calculator.Division(9, 3, 1));
			
	System.out.println("Division of 2 numbers is " + calculator.Division(10,  2));
			
		
	}

	}



