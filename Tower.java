import java.util.*;
public class Tower{
public static void main(String [] args){
move(4,"A","B","C");
}
public static void move(int n, String start, String temp, String end){
if(n==1){
System.out.println("Disk 1 Move " + start + " to " + end);
}
else{
move(n-1,start,end,temp);
System.out.println("Disk " + n + " Move " + start + " to " + end);
move(n-1,temp,start,end);
}
}
}
