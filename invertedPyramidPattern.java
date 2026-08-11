import java.util.Scanner;
class invertedPyramidPattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
/*
n=5
* * * * *
*     *
*   *
* *
*

*/
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=n;j>=1;j--){
if(i==1||j==n||i==j)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}