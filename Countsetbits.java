import java.util.Scanner;
public class Countsetbits{
public static void main (String [] args){
Scanner in=new Scanner(System.in);
System.out.print("Enter a Number : ");
int num=in.nextInt();
int setbitcount=Countsetbits(num);
System.out.println("Total Number Of Set Bits : " + setbitcount);
}
public static int Countsetbits(int num){
int count=0;
while(num>0){
count +=num & 1;
num>>=1;
}
return count;
}
}