import java.util.Scanner;
class PowerofNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number::");
int num=sc.nextInt();
System.out.println("Enter power::");
int n=sc.nextInt();
int res=power(num,n);
System.out.println(res);
}
private static int power(int num,int n){
int p=1;
for(int i=1;i<=n;i++){
p=p*num;
}
return p;
}



}