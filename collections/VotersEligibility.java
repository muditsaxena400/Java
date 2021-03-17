package collections;
import java.util.HashMap;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Date;  
public class VotersEligibility {
	static void votersList()throws Exception
	{   int n;
	Scanner scanner=new Scanner(System.in);
	n=scanner.nextInt();
	String s=new String();
	int id;
	
		for(int i=0;i<n;i++)
		{
			
			s=scanner.nextLine();
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 
			Date date1=formatter1.parse(s);
			id=scanner.nextInt();
		}
		scanner.close();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
