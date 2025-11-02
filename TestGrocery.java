import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;


	public class TestGrocery{
	
	@Test
	void testThatAddItemsIncreasesWhenAItemIsAdded(){

	Grocery user = new Grocery();
	ArrayList<String> myList = new ArrayList<>();
	
	ArrayList<String> actual = user.addItems(myList, "banana");

	ArrayList<String> expected = new ArrayList<>(Arrays.asList("banana"));

	assertEquals (expected, actual);

	}

	@Test
	void testThatRemoveItemsDecreasesWhenItemsIsRemoved(){

	Grocery user = new Grocery();
	ArrayList<String> myList = new ArrayList<>();

	user.addItems(myList, "oil");
	user.addItems(myList, "eggs");

	ArrayList<String> actual = user.removeItems(myList, "oil");

	ArrayList<String> expected = new ArrayList<>(Arrays.asList("eggs"));	

	assertEquals (expected, actual);
	}
	
}


