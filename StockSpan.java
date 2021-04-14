import java.util.*;
public class StockSpan{
public static void main(String[]args){
int price[]={100,90,80,85,90,70,100};
int n=price.length;
int s[]=new int[n];
calculatespan(price,n,s);
printArray(s);
}
public static void calculatespan(int price[], int n, int s[]){
s[0]=1;
for(int i=1;i<n;i++){
s[i]=1;
for(int j=i-1;(j>=0)&&(price[i]>=price[j]);j--)
s[i]++;
}}
public static void printArray(int arr[]){
System.out.println(Arrays.toString(arr));
}
}