import java.util.Scanner;
import java.util.ArrayList;

public class Main{

	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	Grocery user = new Grocery();
	 ArrayList<String> groceryList = new ArrayList<>();
	
	while (true){
		System.out.println("=== Welcome to your Grocery App ===");
		System.out.println("");

		System.out.println("	1. Add Items");
		System.out.println("	2. Remove Items");
		System.out.println("	3. Show Items");

		System.out.println("");

		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		input.nextLine();
		
	switch (choice){

		case 1 -> {
	try{
		System.out.print("Add items: ");
		String userInput = input.nextLine();
		if (userInput.matches("\\d+")) {
           	throw new IllegalArgumentException("input must be a string");
		}
		user.addItems(groceryList, userInput);
	}catch (IllegalArgumentException error){

	System.out.println("error: " + error.getMessage());
	}
	}
		case 2 -> {
	try{
		System.out.print("Remove items: ");
		String toRemove = input.nextLine();
		if (toRemove.matches("\\d+")) {
           	throw new IllegalArgumentException("input must be a string");
		}
		user.removeItems(groceryList, toRemove);
	}catch (IllegalArgumentException error){

	System.out.println("error: " + error.getMessage());
	}
				
	}
		case 3 -> {

		if (groceryList.isEmpty()) {
		System.out.println("You no get items yet");
		} else {
		System.out.println("Your grocery items:");

		for (String item : groceryList) {
		System.out.println(" - " + item);
		}
                }
                }

                default -> System.out.println("Invalid choice.");


	}
	}

	}

}



