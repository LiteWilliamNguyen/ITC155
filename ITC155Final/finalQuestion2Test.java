package ITC155Final;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class finalQuestion2Test {

	@Test
	void test() {
		finalQuestion2 list1=new finalQuestion2();
		list1.insertInt(18);
		list1.insertStart(1);
		list1.insertSpecific(3, 2);	
		list1.insertInt(7);
		list1.insertInt(39);
		
		
		Assertions.assertEquals(true, list1.hasTwoConsequitive());
		
	
	}

}
