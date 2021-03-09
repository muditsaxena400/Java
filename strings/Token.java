package string;
import java.util.*;
class tokenizer
{    void token1()
	{
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("\nEnter sequence of integers with space b/w them and press enter : ");
	                    String digit=scanner.nextLine();
	                    scanner.close();
	                    StringTokenizer token=new StringTokenizer(digit);
	                    int dig=0,sum=0;
	                    System.out.println("\nEntered digits are : ");
	                    while(token.hasMoreTokens())
	                    {
	                                String s=token.nextToken();
	                                dig=Integer.parseInt(s);
	                                System.out.print(dig+" ");
	                                sum=sum+dig;
	                    }
	                    System.out.println();
	                    System.out.println("Sum is : "+sum);
	        
}
}

public class Token {

  public static void main(String args[])
       {
               tokenizer t1=new tokenizer();
               t1.token1();
       }
  

}