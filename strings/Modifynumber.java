package string;
import java.util.*;
class modify
{
	int modifyNumber()
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		scanner.close();
		String s=Integer.toString(n);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{   if(i==s.length()-1)
		{
			char ch=s.charAt(i);
			int a=Integer.parseInt(String.valueOf(ch));   
			sb.insert(i,a);
			break;
		}
			char ch=s.charAt(i);                       
			char ch1=s.charAt(i+1);
			int a=Integer.parseInt(String.valueOf(ch));            
			int a1=Integer.parseInt(String.valueOf(ch1));
			int b=Math.abs(a-a1);
			sb.insert(i,b);
		}
		String s1=sb.toString();
		int j=Integer.parseInt(s1);  
		return j;
	}
}
public class Modifynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       modify m1=new modify();
      System.out.println(m1.modifyNumber());
	}
}