import java.util.*;
public class Main{
public static void main (String[ ]arg){
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
if(num==0){
System.out.println("zero");
}else{
String result=num>0?"positive" :"Negative";
System.out.println(result);
}
}
}
