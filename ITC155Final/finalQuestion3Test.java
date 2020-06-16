package ITC155Final;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class finalQuestion3Test {

	@Test
	void test() {
		finalQuestion3 test = new finalQuestion3(); 
		finalQuestion3Node testNode = null;
		
		testNode = test.insert(testNode, 2); 
		testNode = test.insert(testNode, 1); 
		testNode = test.insert(testNode, 5); 
		testNode = test.insert(testNode, 10);
		testNode = test.insert(testNode, 4); 
		
		Assertions.assertEquals(true, finalQuestion3.isFull(testNode));
	}

}
