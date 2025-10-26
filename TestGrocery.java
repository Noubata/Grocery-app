import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class TestGrocery{

	@Test
	public void testThatGroceryHasItems(){

	Grocery user = new Grocery();

	int result = user.items();

	assertEquals(0, result);
	
	}
	
	@Test
	public void testThatOneItemIsAddedToTheGroceryAndTheTotalIsOne(){
	
	Grocery user = new Grocery();

	int result = user.addItems("Banana", "Cheese");

	assertEquals(2, result);
	}

}

