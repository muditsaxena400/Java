package collections;
import java.util.*;
public class Sort 
{
	static void findsort()
	{
	int n;
	System.out.println("enter value of n");
	Scanner scanner=new Scanner(System.in);
	n=scanner.nextInt();
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 System.out.println("enter values");
	 for(int i=0;i<n;i++)
	 {
		 int a=scanner.nextInt();
		 list.add(a);
	 }
	 scanner.close();
	 Collections.sort(list);
	 System.out.println(list);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        findsort();  
}
}