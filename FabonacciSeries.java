import java.util.Scanner;
class FabonacciSeries{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int res=series(num);
System.out.println(res);
}
private static int series(int num){
int sum=0;
int a=0,c=0;
int b=1;
if(num<1)
System.out.println("value should be greater than 0");
for(int i=3;i<=num;i++){
c=a+b;
a=b;
b=c;
}
if(num==1)
return 0;
if(num==2)
return 1;

else
return c;
}
}