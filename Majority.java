public class Majority{
public static void main(String[] args){
int arr[]={1,2,1,3,1,6,1,8,1};
int n=arr.length;
Majority(arr,n);
}
public static void Majority(int arr[],int n){
int maxcount=0;
int index=-1;
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<n;j++){
if(arr[i]==arr[j])
count++;
}
if(count>maxcount){
maxcount=count;
index=i;
}
}
if(maxcount>n/2)
System.out.println(arr[index]);
else
System.out.println("No Majority Elements");
}
}