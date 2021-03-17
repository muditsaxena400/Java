package collections;
import java.util.*;
class Operations{
	static int sum=0;
public static int sum() {
SumAndAvg ob=new SumAndAvg();
ArrayList<Integer> number1=ob.input();


for(int i=0;i<6;i++) {
sum+=number1.get(i);
}
return sum;
}
public static float average() {
return sum/6;
}
}
public class SumAndAvg {

public ArrayList<Integer> input() {
Scanner sc=new Scanner(System.in);
int number=0;
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<6;i++)
    {  number=Integer.parseInt(sc.next());
        list.add(number);
    }
    sc.close();
    return list;
}
public static void main(String[] args) {
System.out.println("sum is:"+Operations.sum());
System.out.println("average is:"+Operations.average());
}
}