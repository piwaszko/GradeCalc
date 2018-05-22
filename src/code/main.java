package src.code;

import java.util.Scanner;
import java.util.ArrayList;


public class main{

	public static void main(String[] main){
		
		Scanner sc = new Scanner(System.in);

		int option = 0;

		ArrayList<Class> classes = new ArrayList<Class>(); 

		while(option < 1){

			System.out.println("Please choose an option!\n");

			System.out.println("0: Add a class");

			System.out.println("1: Print Classes");

			System.out.println("2: Quit");

			option = sc.nextInt();

			switch(option){

				case 0:

					System.out.println("Please enter the class name: ");

					String className = new String();

					className = sc.next();

					Class classToAdd = new Class(className);

				case 1:

					for(Class theClass : classes){

						System.out.println(theClass.getClassName());


					}
					
			}

			System.out.print("\n");

		}

		



	}
}