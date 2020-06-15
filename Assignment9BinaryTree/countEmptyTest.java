package ITC155.Assignment9BinaryTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class countEmptyTest {

	@Test
	void testLargeTree() {
  
		IntTree test1 = new IntTree(3);
        System.out.println("Large Tree structure:");
        test1.printSideways();
        System.out.println();
        System.out.println("Empty Branches: " + test1.countEmpty());
        System.out.println();
        assertEquals(test1.countEmpty(), 4);
	}
	@Test
	void testSmallTree() {
  
		IntTree test2 = new IntTree(5);
		System.out.println("Small Tree structure:");
        test2.printSideways();
        System.out.println();
        System.out.println("Empty Branches: " + test2.countEmpty());
        System.out.println();
        assertEquals(test2.countEmpty(), 6);
	}
	@Test
	void testSingleNodeTree() {

		IntTree test3 = new IntTree(7);
		System.out.println("SingleNode Tree structure:");
        test3.printSideways();
        System.out.println();
        System.out.println("Empty Branches: " + test3.countEmpty());
        System.out.println();
        assertEquals(test3.countEmpty(), 8);
	}
	@Test
	void testNullTree() {
  
		IntTree test4 = new IntTree();
    System.out.println("Null Tree structure:");
	    test4.printSideways();
	    System.out.println();
	    System.out.println("Empty Branches: " + test4.countEmpty());
	    System.out.println();
		assertEquals(test4.countEmpty(), 1);
	
	}

}
