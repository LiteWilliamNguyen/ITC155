package ITC155;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment8LinkedListTest {

	@Test
	void testTrue() {
		//creates a sorted LinkedList of various elements
		//should test isSorted: True.
		Assignment8LinkedList list = new Assignment8LinkedList();
		list.add(-3);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(42);
		list.add(87);
		assertTrue(list.isSorted());
	}
	@Test
	void testIdenticalTrue() {
		//creates a LinkedList of all identical elements
		//should test isSorted: True.
		Assignment8LinkedList list = new Assignment8LinkedList();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		assertTrue(list.isSorted());
	}
	@Test
	void testFalse() {
		//creates a LinkedList of unsorted elements
		//should test isSorted: False.
		Assignment8LinkedList list = new Assignment8LinkedList();
		list.add(-3);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(40);
		list.add(87);
		assertFalse(list.isSorted());
	}
	@Test
	void testSingleTrue() {
		//creates a LinkedList of only one element
		//should test isSorted: True.
		Assignment8LinkedList list = new Assignment8LinkedList();
		list.add(42);
		assertTrue(list.isSorted());
	}
	@Test
	void testEmptyTrue() {
		//creates a LinkedList that is empty
		//should test isSorted: True.
		Assignment8LinkedList list = new Assignment8LinkedList();
		assertTrue(list.isSorted());
	}
}
