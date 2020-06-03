package ITC155;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.Test;

public class Assignment7isPalindromeTest {

	@Test
	public void test() {
		Queue<Integer> q = new LinkedList<Integer>();
		  q.add(3);
		  q.add(8);
		  q.add(17);
		  q.add(9);
		  q.add(17);
		  q.add(8);
		  q.add(3);
		 
		 Assertions.assertTrue(Assignment7isPalindrome.isPalindrome(q));
	}

}
