package array;

import java.util.*;
class sec
{
	void sec_small()
	{   int n;
	System.out.println("enter length of array");
	    Scanner scanner=new Scanner(System.in);
	    n=scanner.nextInt();
		int arr[]=new int[n];
		System.out.println("enter value in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		scanner.close();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("second smallest element is");
        System.out.println(arr[1]);
	}
}
public class Second_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sec sc=new sec();
       sc.sec_small();
	}

}