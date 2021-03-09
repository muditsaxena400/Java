package array;
import java.util.Arrays;
import java.util.Scanner;

class duplicate1
{
	int find_duplicate(int arr[],int n)
	{ 
		Arrays.sort(arr);
		 if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;
	    }
}
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		System.out.println("enter length of array");
	    Scanner scanner=new Scanner(System.in);
	    n=scanner.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=scanner.nextInt();
			}
			scanner.close();
			Arrays.sort(arr);
			duplicate1 d1=new duplicate1();
			  int length = arr.length;
		        length = d1.find_duplicate(arr, length);  
		        //printing array elements  
		        for (int i=0; i<length; i++)  
		           System.out.print(arr[i]+" ");  
	}

}