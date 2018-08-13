package main;

import java.util.Scanner;

import entities.Formula;
import entities.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		Double a = sc.nextDouble();
		System.out.println("Enter the value of B: ");
		Double b = sc.nextDouble();
		System.out.println("Enter the value of C: ");
		Double c = sc.nextDouble();
		
		Formula formula = new Formula(a, b, c);
		try {
			formula.formula1();
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}
