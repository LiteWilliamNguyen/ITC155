package ITC155;
import java.util.*;
public class Assignment7stutter {

	public static void main(String[] args) {
		  Stack<Integer> s = new Stack<Integer>();
		  s.add(9);
		  s.add(14);
		  s.add(1);
		  s.add(7);
		  s.add(3);
		  stutter(s);  

	}
	public static void stutter(Stack<Integer> s){
		Queue<Integer> q = new LinkedList<Integer>();
	    while(!s.isEmpty()) {
	      int n = s.pop();
	      q.add(n);
	      q.add(n);
	    }
	    while(!q.isEmpty()){
	      s.push(q.remove());
	    }
	    System.out.println(s);
	  }

}
