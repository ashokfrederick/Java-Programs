import java.util.*;
public class Search{
public static void main(String[]args){
int mat[][]={{10,20,30,40},{15,25,35,45},{50,60,70,80},{55,65,75,85}};
search (mat,4,50);
}
public static int search(int[][] mat, int n, int x){
if(n==0)
return -1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
if (mat[i][j]==x){
System.out.println("Element found at :" + i + " , " + j );
return 1;
}
}
System.out.println("Element not found");
return 0;
}
}