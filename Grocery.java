import java.util.ArrayList;

public class Grocery {

	public ArrayList<String> addItems(ArrayList<String> myLists, String userInput) {
 	myLists.add(userInput);

        return myLists;
    }
	
	public ArrayList<String> removeItems(ArrayList<String> myLists, String toRemove){

       	myLists.remove(toRemove);

        return myLists;
	
	}

}