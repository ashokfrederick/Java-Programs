import java.util.*;
public class Cd{
public static void main(String[] args){
int arr[]={1,2,3,4,5,6,7,8,9};
int n=arr.length;
int m=9;
System.out.println("Minimum difference is:" + findMinDiff(arr,n,m));
}
public static int findMinDiff(int arr[],int n,int m){
if(m==0||n==0)
return 0;
Arrays.sort(arr);
if (n<m)
return -1;
int min_diff=Integer.MAX_VALUE;
for(int i=0;i+m-1<n;i++){
int diff=arr[i+m-1]-arr[i];
if(diff<min_diff)
min_diff=diff;
}
return min_diff;
}
}