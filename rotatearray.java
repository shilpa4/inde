package guvi;


import java.util.Scanner;

public class rotatearray {
public static void main(String arg[]){
	int arr[]=new int[7];
	Scanner ff=new Scanner(System.in);
	for(int i=0;i<7;i++){
		arr[i]=ff.nextInt();
	}
	int size,count=0;
	System.out.println("enter the size");
	size=ff.nextInt();
	int arr1[]=new int[7];
	for(int j=size;j<7;j++){
		arr1[count]=arr[j];
		count++;
	}
	for(int k=0;k<size;k++){
		arr1[count]=arr[k];
		count++;
	}
	System.out.println("the rotated array is");

	for(int p=0;p<count;p++){
		System.out.println(arr1[p]);
	}
}
}
