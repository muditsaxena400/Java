package collections;
import java.util.*;

public class NumberSquares {
	static void getSquares()
	{
		 int n;
		 System.out.println("enter total number of elemets");
		 Scanner scanner=new Scanner(System.in);
		 n=scanner.nextInt();
		 	int arr[]=new int[n];
		 	System.out.println("enter values");
		 	for(int i=0;i<n;i++)
		 	{
		 	
		         arr[i]=scanner.nextInt();
		 	}
		 	int square;
		 	scanner.close();
		 	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		 	for(int i=1;i<=n;i++)
		 	{
		 		square=arr[i]*arr[i];
		 		map.put(i, square);
		 	}
		 	for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSquares();
	}
}
