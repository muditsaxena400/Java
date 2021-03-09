package array;
import java.util.Scanner;

class sorts
{
	void sort_strings()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string");
		String num=scanner.nextLine();
		scanner.close();
		char arr[]=num.toCharArray();
		int size=arr.length;
		char temp;
		for(int i=0;i<size;i++)
		{
			arr[i]=Character.toLowerCase(arr[i]);
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			if(i<(size+1)/2)
				arr[i]=Character.toUpperCase(arr[i]);
			else
				arr[i]=Character.toLowerCase(arr[i]);
			
			System.out.println(arr[i]);;
		}
			
	}
}
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorts s1=new sorts();
		s1.sort_strings();

	}
}