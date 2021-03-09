package string;
import java.util.*;
class positive
{
	Boolean Alphabetical()
	{
		String s1=new String();
		Scanner scanner=new Scanner(System.in);
		s1=scanner.nextLine();
		scanner.close();
		 int n = s1.length(); 
		  
	        for (int i = 1; i < n; i++) {  
	            if (s1.charAt(i) < s1.charAt(i - 1)) { 
	                return false; 
	            } 
	        } 
	        return true; 
	}
}
public class Positive_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     positive p1=new positive();
     System.out.println(p1.Alphabetical());
	}
}