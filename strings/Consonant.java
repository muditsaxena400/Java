package string;

public class Consonant {

static boolean isVowel(char c) {
if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') 
    {
      return false;
    }
      return true;
}
static String getConsonants(char[] c) 
{
   for(int i=0;i<c.length;i++) 
   {
   if(!isVowel(c[i])) 
   {
   if(c[i]=='z' || c[i]=='Z') 
   {
   c[i]='b';
   }
  else
   {
      c[i]=(char) (c[i]+1);

      if(isVowel(c[i]))
   {
      c[i]=(char)(c[i]+1);
    }
   }
   }
   }
   return String.valueOf(c);
}
public static void main(String[] args) 
  {
String str="mudit";
System.out.println("inserted string is:"+str);
System.out.println(getConsonants(str.toCharArray()));
  }
  }