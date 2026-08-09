import java.util.Scanner;
class pattern5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/** n=3
    1
    2 2
    3 3 3 **/
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println();
}
}
}