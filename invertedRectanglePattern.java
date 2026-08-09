import java.util.Scanner;
class invertedRectanglePattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/** n=5
   5 4 3 2 *
   5 4 3 * 1
   5 4 * 2 1
   5 * 3 2 1
   * 4 3 2 1
**/
for(int i=1;i<=n;i++){
for(int j=n;j>=1;j--){
if(i==j)
System.out.print("* ");
else
System.out.print(j+" ");

}
System.out.println();
}
}
}