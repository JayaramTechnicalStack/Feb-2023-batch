import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array1 [] = {1,3,5,6};


		int array2 [] = {5,6,2,4,6};
		int mergeArray[] = new int[array1.length  + array2.length];
		int index =0;
		for(int element :array1) {
			mergeArray[index] =element;
			index++;
		}
		for(int element :array2) {
			mergeArray[index] =element;
			index++;
		}
		System.out.println(Arrays.toString(mergeArray));
	
		/*
		 * 
		 * Object[] mergeArray = Stream.concat(Arrays.stream(array1),
		 * Arrays.stream(array2)).toArray();
		 * System.out.println(Arrays.deepToString(mergeArray));
		 */

	}

}
