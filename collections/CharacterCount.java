package collections;
import java.util.*;

public class CharacterCount {
static void countChars()
{   int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
	char arr[]=new char[n];
	for(int i=0;i<n;i++)
	{
		char c=scanner.next().charAt(0);
        arr[i]= c;
	}
	scanner.close();
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(int i=0;i<n;i++)
	{       int sum=0;
		for(int j=0;j<=i;j++)
		{    
		if(arr[i]==arr[j])
		{   
	         sum++;	    
		}
	}
		map.put(arr[i],sum);
	}
		for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countChars(); 
	}

}
