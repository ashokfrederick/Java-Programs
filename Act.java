public class Act{
public static void main(String[] args){
int s[]={1,3,5,7,9};
int f[]={3,5,9,11,7};
int n=s.length;
printmaxactivities(s,f,n);
}
public static void printmaxactivities(int s[],int f[],int n){
int i,j;
System.out.println("Following Activites are selected : ");
i=0;
System.out.println(i + " ");
for(j=1;j<n;j++){
if(s[j]>=f[i]){
System.out.println(j + " ");
i=j;
}}}
}