
public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {1,4,3,6,9,8,5,2};
		 int target = 10;
		 
		 int len = arr.length;
		 int i=0,j=len-1;
		 while(i<j) {
			 int sum = arr[i] +arr[j];
			 if(sum == target) {
				 System.out.println(arr[i]+","+arr[j]);
				 i++;
				 j--;
			 }else if(sum <target) {
				 i++;
			 }else {
				 j--;
			 }
		 }
			/*
			 * int le for(int i =0; i<arr.length;i++) { for(int j =i+1;j<arr.length;j++) {
			 * if(arr[i] + arr[j] == target) { System.out.println(); } } }
			 */
	}

}
