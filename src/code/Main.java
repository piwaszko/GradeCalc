package src.code;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main{

	public static void printList(ArrayList<Class> list){

	int i = 0;

	for(Class theClass : list){

		System.out.println(i + ". " + theClass.getName());

		i++;

		}

	}

	public static void printMap(Map mp) {
    Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " : " + pair.getValue() + "%");
        //it.remove();  avoids a ConcurrentModificationException
    	}
	}

	public static void printCategoryMap(Map mp) {
    Iterator it = mp.entrySet().iterator();
    int counter = 0;
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(counter + ". " + pair.getKey() + " : " + pair.getValue() + "%");
        ++counter;
        //it.remove();  avoids a ConcurrentModificationException
    	}
	}

	public static void main(String[] main){
		
		Scanner sc = new Scanner(System.in);

		int option = 0;

		ArrayList<Class> classes = new ArrayList<Class>();

		while(option != 3){

			System.out.println("Please choose an option!\n");

			System.out.println("0: Add a class");

			System.out.println("1: Modify Classes");

			System.out.println("2: Print Classes");

			System.out.println("3: Quit");

			option = sc.nextInt();

			switch(option){

				case 0:

					System.out.print("\n");

					System.out.println("Please enter the class name: ");

					String className = new String();

					className = sc.next();

					classes.add(new Class(className));

					break;

				case 1:

					if(!classes.isEmpty()){

						System.out.println("\nSelect a class you want to modify!");

						printList(classes);

						int classToModify = sc.nextInt();

						if(Math.abs(classToModify) < classes.size()){

							int classModification = -1;

							while(classModification != 0){

								System.out.println("\nWould you like to... ");

								System.out.println("0. Main Menu");
								System.out.println("1. Delete this class");
								System.out.println("2. Add a category to this class");
								System.out.println("3. Modify a category");
								System.out.println("4. Print the current categories");

								classModification = sc.nextInt();

								switch(classModification){

									case 0:
									
										break;

									case 1:

										classes.remove(classToModify);

										classModification = 0;

										break;

                                	case 2:

                                    	System.out.println("\nPlease enter the name of the category. (i.e. \"Homework\")");
                                    	String categoryName = sc.next();

                                    	System.out.println("Please enter the weight this category holds on your grade. (i.e. 20.00)");
                                    	double categoryWeight = sc.nextDouble();

                                    	classes.get(classToModify).addCategory(categoryName, categoryWeight);

                                    	break;

                                	case 3:

                                		if(classes.get(classToModify).getCategorieSize() != 0){

                                    		System.out.println("\nPlease type the category you would like to modify...");

                                    		printMap(classes.get(classToModify).getCategories());

                                    		String categoryToModify = sc.next();

                                    		while(!classes.get(classToModify).categoryExists(categoryToModify)){

                                    			System.out.println("\nPlease enter a valid category...");

                                    			categoryToModify = sc.next();
                                    		}

                                    		int categoryModification = -1;
                                    		
                                    		while(categoryModification != 0){

                                    			System.out.println("\nWould you like to...");

                                    			System.out.println("0. Go back to class modification.");

                                    			System.out.println("1. Delete this category.");

                                    			categoryModification = sc.nextInt();

                                    			switch(categoryModification){

                                    				case 0:

                                    					break;

                                    				case 1:

                                    					classes.get(classToModify).deleteCategory(categoryToModify);

                                    					categoryModification = 0;

                                    				default:

                                    					System.out.println("Select a valid option!");

                                    			}

                                    		}

                                    	}

                                    	else{

                                    		System.out.println("You have no categories to modify!");

                                    	}
                                        
                                    	break;

                                    case 4:

                                		if(classes.get(classToModify).getCategorieSize() != 0){

                                    		printMap(classes.get(classToModify).getCategories());
                                    	}

                                    	else{

                                    		System.out.println("You have no categories to print!");

                                    	}
                                        
                                    	break;

									default:

										System.out.println("Select a valid option!");

										break;
								}
							}

						}

						else{

							System.out.println("\nThats not a valid index dummy!");

						}

					}

					else{

						System.out.println("\nYou have no classes to modify!");

					}

					break;

				case 2:

					System.out.print("\n");

					if(!classes.isEmpty()){

						printList(classes);
					}

					else{

						System.out.println("You have no classes to print!");

					}
				
					break;

				case 3:

					System.out.print("\n");


					System.out.println("Thanks for using!");

					break;

				default:

					System.out.print("\n");

					System.out.println("Please choose a valid option!");

					break;
			}

			System.out.print("\n");

		}

	}
}