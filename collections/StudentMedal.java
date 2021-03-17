package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMedal {
      static void getStudents()
      {
    	  HashMap<Integer,Float> map=new HashMap<Integer,Float>();
    	  HashMap<Integer,String> output=new HashMap<Integer,String>();
    	  int n;
    	  Scanner scanner=new Scanner(System.in);
    	  n=scanner.nextInt();
    	  String medal=new String();
    	  for(int i=1;i<=n;i++)
    	  {   System.out.println("enter student"+i+"registration and marks");
    		  int regnum;
    	      regnum=scanner.nextInt();
    	      float marks=scanner.nextInt();
    		  map.put(regnum, marks);
    		  if(map.get(regnum)>=90)
    		  {
    			  medal="Gold";
    			  output.put(regnum, medal);
    		  }
    		  else if(map.get(regnum)>=80 && map.get(regnum)<90)
    		  {
    			  medal="Silver";
    			  output.put(regnum, medal);
    		  }
    		  else if(map.get(regnum)>=70 && map.get(regnum)<80)
    		  {
    			  medal="Bronze";
    			  output.put(regnum, medal);
    		  }
    		  else
    		  {
    			  medal="Not qualified";
    			  output.put(regnum, medal);
    		  }
    	  }
    	  scanner.close();
    	  for(Map.Entry m : output.entrySet()){    
  		    System.out.println(m.getKey()+" "+m.getValue());
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getStudents();
	}

}
