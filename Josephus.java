public class Josephus{
public static void main (String [] args){
int n=7;
int k=3;
System.out.println("Survived Position : " + Josephus(n,k));
}
public static int Josephus(int n, int k){
if(n==1)
return 1;
else
return (Josephus(n-1, k) + k-1) % n+1;
}
}
