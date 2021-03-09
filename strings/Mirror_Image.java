package string;

import java.util.Scanner;
//import java.util.*;
public class Mirror_Image {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String str=sc.next();
StringBuffer sb =new StringBuffer(str);

//System.out.println("you have entered"+sb);
//StringBuffer a=sb.append(sc.nextLine());
StringBuffer rev=sb.reverse();
System.out.println("output is:\n"+str+"|"+rev);
sc.close();
}
}
