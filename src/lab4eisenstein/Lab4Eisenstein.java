package lab4eisenstein;

import java.util.Scanner;

public class Lab4Eisenstein {

	public static void main(String[] args) {
		
		
		System.out.println("After you enter an integer, the squares and cubes of all integers before that and including it will be displayed.");
		
		boolean run = true;
		while (run) {
		
		//System.out.println("After you enter an integer, the squares and cubes of all integers before that and including it will be displayed.");
		System.out.println("\nPlease enter an integer.\n");
		Scanner scnr = new Scanner(System.in);
		
		int enteredInteger = scnr.nextInt();
		
		
		System.out.println("Number\tSquared\tCubed");
		System.out.println("=======\t=======\t======");
		
		for(int i = 0; i<=enteredInteger; i++ ) {
			if (i-1 >= 0) {
				System.out.println(i+"\t"+i*i+"\t"+i*i*i);
			}
		}
		
				//Multiplication Table Shenanigans The Multiplication Table Failed
				/*System.out.println("\nMULTIPLICATION TABLE\n");
				
				System.out.println();
				
				for(int i = 1; i<=enteredInteger+1; i++) {
					System.out.print(i+"|\t");
				}
				
				System.out.println();
				
				for(int i = 1; i<=enteredInteger; i++ ) {
					
					if (i - 1 >= 0) {
						System.out.println(i+"\t"+i*(2)+"\t"+i*(3)+"\t"+i*(4)+"\t"+i*(5));
					}
				}
				*/
		
		System.out.println("\nWould you like to  enter another number? y/n");
		
		String getUserChoice1 = scnr.next() ;
		if (getUserChoice1.startsWith("y"))
			run = true;
		
		if (getUserChoice1.startsWith("n")) {
			run = false;
		System.out.println("Thank you for using this program.");
		}
		}
		}
	

}

