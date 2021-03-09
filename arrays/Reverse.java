package array;
import java.util.*;
import java.util.Arrays;
class reverse1
{
	void getSorted()
	{   int n;
	System.out.println("enter size of array");
	Scanner scanner=new Scanner(System.in);
	n=scanner.nextInt();
	System.out.println("enter values");
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<arr.length;i++)
		{
			String s=Integer.toString(arr[i]);
			 char ch[]=s.toCharArray();  
			    String rev="";  
			    for(int j=ch.length-1;j>=0;j--){  
			        rev+=ch[j];  
			    }
			    int num=Integer.parseInt(rev);  
			    arr1[i]=num;
		}
		Arrays.sort(arr1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}
}
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse1 r1=new reverse1();
		r1.getSorted();
		}
}
