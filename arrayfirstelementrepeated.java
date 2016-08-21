package guvi;

import java.util.Scanner;

public class arrayfirstelementrepeated {
	public static void main(String arg[]){
		int arr[]=new int[7];
		Scanner ff=new Scanner(System.in);
		for(int i=0;i<7;i++){
			arr[i]=ff.nextInt();
		}
		int count=0;
	for(int j=0;j<7;j++){
		for(int k=j+1;k<7;k++){
			if(arr[j]==arr[k]){
				System.out.println("the first element repeated "+arr[j]);
				count++;
			}
		
		}
		break;
	}
	
	if(count==0){
		System.out.println("there are no repeated numbers");
	}
	
	
	
	
	
	
	
	}
}
