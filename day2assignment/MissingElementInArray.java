package day2assignment;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,7,6,8};
		int count = ar.length;
		int sum = (count+1) * (count+2)/2;
				for (int i=0;i<count;i++) {
					sum = sum - ar[i];
				
				}
		
System.out.println(sum);
	}

}
