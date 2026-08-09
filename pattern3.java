import java.util.Scanner;
class pattern3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/** n=3
    __1
    _12
    123 **/
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print(k);
}
System.out.println();
}
}
}