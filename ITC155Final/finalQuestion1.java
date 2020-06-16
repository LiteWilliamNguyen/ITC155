package ITC155Final;
import java.util.*;

//Write a method called equals that accepts two stacks of integer as parameter 
//and returns true if the two stacks store exactly the same sequence of integer 
//value in the same order. Your method must restore the two stacks to their original 
//state before returning. Use one stack as auxiliary storage.

public class finalQuestion1 {

	public static void main(String[] args) {
		Stack<Integer> num1 = new Stack<Integer>();
		num1.push(1);
		num1.push(2);
		num1.push(3);
		num1.push(4);
	  
	Stack<Integer> num2 = new Stack<Integer>();
		num2.push(1);
		num2.push(2);
		num2.push(3);
		num2.push(4);
		
	System.out.println(equals(num1,num2)); 

	
	Stack<Integer> num3 = new Stack<Integer>();
		num3.push(5);
		num3.push(6);
		num3.push(7);
  
	Stack<Integer> num4 = new Stack<Integer>();
		num4.push(8);
		num4.push(9);
		num4.push(10);

	System.out.println(equals(num3,num4)); 
}
	public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size() != s2.size()) {
			return false;
		}
		Stack<Integer> s3 = new Stack<Integer>();
		boolean bothEqual = true;
		
		while(s1 != null) {

			int n1=s1.pop();
			int n2=s2.pop();
			s3.push(n1);
			s3.push(n2);
			
			if(n1!=n2) {
				bothEqual=false;
				break;
			}
		} 
		while(s3!=null) {
			s1.push(s2.pop());
			s2.push(s3.pop());
		}
		return bothEqual;
		}
		
}
	
	
	
