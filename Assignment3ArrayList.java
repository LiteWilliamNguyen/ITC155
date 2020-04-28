package ITC155;
import java.util.ArrayList;

public class Assignment3ArrayList {

	public static void main(String[] args) {
	

	}
	/*Write a method called removeEvenLength that takes an ArrayList of
strings as a parameter and removes all of the strings of even length from
the list.*/
	public static void removeEvenLength(ArrayList<String> array) {
		for (int i = 0; i <array.size(); i++) {
			String word = array.get(i);
			if(word.length()%2==0) {
				array.remove(word);
			}
		}}
	/*Write a method called doubleList that takes an ArrayList of strings as
			a parameter and replaces every string with two of that same string. For
			example, if the list stores the values ["how", "are", "you?"] before
			the method is called, it should store the values ["how", "how", "are",
			"are", "you?", "you?"] after the method finishes executing.*/
	public static void doubleList(ArrayList<String> array) {
		int stringSize = array.size();
		for (int i = 0; i < stringSize; i++) {
			String word = array.get(i * 2);
			array.add(2*i+1, word);
		}
	}
}