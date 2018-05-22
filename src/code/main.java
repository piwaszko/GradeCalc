package src.code;

import java.util.Scanner;

public class main{

	public static void main(String[] main){
		
		Scanner sc = new Scanner(System.in);

		int option = 0;

		while(option < 1){

			System.out.println("Please choose an option!\n");

			System.out.println("0: Add a class");

			System.out.println("1: Quit");

			option = sc.nextInt();

			switch(option){

				case 0:
					System.out.println("Please enter the class name: ");

					String className = new String();

					className = sc.next();

					System.out.println("The class you entered is: " + className);
			}

			System.out.print("\n");

		}

		



	}
}