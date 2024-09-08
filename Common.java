package Arrays;

import java.util.Scanner;

public class Common {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //1st Array input
        System.out.print("Enter n:");
        int n=obj.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr1[i]=obj.nextInt();
        }
        //2nd Array input
        System.out.print("Enter m:");
        int m=obj.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++) {
        	arr2[i]=obj.nextInt();
        }
        //Common elements
        System.out.print("Common Elements={");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(arr1[i]==arr2[j]) {
        			System.out.print(arr1[i]+",");
        		}
        	}
        }
        System.out.print("}");
	}

}
