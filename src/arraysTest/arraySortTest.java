package arraysTest;

public class arraySortTest {

	public static void main(String[] args) {
		int[] arr = {1, 10, 3, 7, 6, 2};
		int temp = 0;
		System.out.println("Length of Array is: " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//To sort Array in Ascending order
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}		
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		int[] arr1 = {5, 12, 56, 2, 8};
		int  temp1 = 0;
		System.out.println("Length of Array is: " + arr1.length);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		//To sort Array in Descending order
		for(int i=0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]<arr1[j]) {
					temp1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp1;
				}
			}
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		//Bubble sorting
		int[] bub = {8, 42, 6, 0, 35, 2};
		int temp2 = 0;
		
		System.out.println("Length of Array is: " + bub.length);
		for(int i=0; i<bub.length; i++) {
			System.out.print(bub[i]+ " ");
		}
		System.out.println();
		
		for(int i=0; i<bub.length; i++) {
			for(int j=1; j<bub.length-i; j++) {
				if(bub[j-1]>bub[j]) {
					temp2 = bub[j-1];
					bub[j-1] = bub[j];
					bub[j] = temp2;
				}
			}
		}
		System.out.println("Array after bubble sort:");
		for(int i=0; i<bub.length; i++) {
			System.out.print(bub[i]+ " ");
		}
		System.out.println();
		
		char[] cArr = {'e','w','t','o','a','m'};
		char sbs;
		System.out.println("Length of Array is: " + cArr.length);
		for(int i=0; i<cArr.length; i++) {
			System.out.print(cArr[i]+ " ");
		}
		System.out.println();
		for(int i=0; i<cArr.length; i++) {
			for(int j=1; j<cArr.length-i; j++) {
				if(cArr[j-1]>cArr[j]) {
					sbs = cArr[j-1];
					cArr[j-1] = cArr[j];
					cArr[j] = sbs;
				}
			}
		}
		System.out.println("Array after bubble sort:");
		for(int i=0; i<cArr.length; i++) {
			System.out.print(cArr[i]+ " ");
		}
		System.out.println();
		
		int [] marks = new int [4];
		marks[0]=98;
		marks[1]=92;
		marks[2]=97;
		marks[3]=99;
		
		int sz = marks.length;
		System.out.println("New Marks Array:");
		for(int i = 0; i<sz; i++) {
			System.out.print(marks[i]+ " ");
		}
	}

}
