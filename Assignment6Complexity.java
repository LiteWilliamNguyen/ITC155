package ITC155;

/*
 * p. 888 ex. 4, 5 Complexity classes. Be sure to explain your reasoning for full credit. 
 * Write the answers as comments on top of your java file where you solved the following problem. 
 * - 40 points
 * Code a solution and a test for p. 890, ex 18 Write a modified version sort a selection sort 
 * algorithm - 60 points
 */
public class Assignment6Complexity {

	public static void main(String[] args) {
		int[] sortExample = {9, 10, 5, 2, 6, 7, 1};
		modifiedReverseSort(sortExample);
		for(int i = 0; i < sortExample.length; i++) {
			System.out.println(i + ", " ); 
		}
	}

/*
 * To which complexity class does the following algorithm belong?
Consider N to be the length or size of the array or collection passed to
the method. Explain your reasoning.
 */
	/* this complexity class should follow the O(N), because it seem to be "a linear algorithm
	 * that are directly proportional to N, that compute sum of a list of number
	*/
	public static int[] mystery1(int[] list) {
		int[] result = new int[2 * list.length];
		for (int i = 0; i < list.length; i++) {
			result[2 * i] = list[i] / 2 + list[i] % 2;
			result[2 * i + 1] = list[i] / 2;
		}
		return result;
	}	
	
/*
 * To which complexity class does the following algorithm belong?
 */
	/*
	 * This algorithm is O(N) because complexity grows in direct proportion to N 
	 */
	public static void mystery2(int[] list) {
		for(int i = 0; i < list.length/ 2; i++) {
			int j = list.length -1 -i;
			int temp = list[i];
			list[i]= list[j];
			list[j]= temp;
		}
	}
/*
 * Write a modified version of the selection sort algorithm that selects the
largest element each time and moves it to the end of the array, rather
than selecting the smallest element and moving it to the beginning. Will
this algorithm be faster than the standard selection sort? What will its
complexity class (big-Oh) be?
 */
	public static void modifiedReverseSort(int[] sortExample) {
		for (int i = sortExample.length -1; i > 0; i--) {
			//max int and swap with i
			int max = i;
			for(int j = i-1; j > 0; i-- ) {
				if(sortExample[j] > sortExample[max]) {
					max = j;
				}
			}
		}
	}
	
}
