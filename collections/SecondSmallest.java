package collections;
import java.util.*;
public class SecondSmallest {
static void getSecondSmallest()
{
	int n;
	Scanner scanner=new Scanner(System.in);
	n=scanner.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=scanner.nextInt();
	}
	scanner.close();
	List<Integer> map = new ArrayList<Integer>(); 
	  
    // adding elements of array to arrayList. 
	for(int i=0;i<n;i++)
	{
		map.add(arr[i]);
	}
	Collections.sort(map);

    System.out.println(map.get(1)); 
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSecondSmallest();
	
	}

}
