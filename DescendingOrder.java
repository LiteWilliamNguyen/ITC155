package ITC155;
import java.util.Scanner;
public class DescendingOrder {

public static void main(String[] args) {
int[] numbers = new int[10]; 
int numElements = 0; 
int i = 0; 

Scanner scnr = new Scanner(System.in);
System.out.println("Enter number, (max=10), separated by a space. -1 to exit :");
int input = scnr.nextInt();

while (input != -1) {
	numbers[i] = input; 
	i++;
	numElements++;
	input = scnr.nextInt(); }
selectionSortDescendTrace(numbers, numElements);
	scnr.close();}

public static void selectionSortDescendTrace(int[] numbers, int numElements) {
	for (int i = 0; i < numElements - 1; i++) {
		int biggestIndex = i;
		for (int j = i + 1; j < numElements; j++) { 
		if (numbers[j] > numbers[biggestIndex]) { 
			biggestIndex = j;}}
		int temporary = numbers[i];
		numbers[i] = numbers[biggestIndex];
		numbers[biggestIndex] = temporary;

	for (int k = 0; k < numElements; k++) { 
		System.out.print(numbers[k] + " ");}
		System.out.println();
		}}}