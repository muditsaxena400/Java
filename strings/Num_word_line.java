package string;
import java.util.*;
import java.io.*;
public class Num_word_line {

public static void main(String[] args)throws IOException {
// TODO Auto-generated method stub
int nl=1,n1=0;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter the file name");
String str=sc.nextLine();
FileInputStream f=new FileInputStream(str);
int n=f.available();
for(int i=0;i<n;i++) {
ch=(char)f.read();
if(ch=='\n') {
nl++;
}
else if(ch==' ') {
n1++;
}
}
System.out.println("\nNumber of lines : "+nl);
         System.out.println("\nNumber of words : "+(nl+n1));
         System.out.println("\nNumber of characters : "+n);
sc.close();
f.close();
}
}