import java.util.Scanner;
class HarshadNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
boolean res=harshad(num);
System.out.println(res);
}
private static boolean harshad(int num){
int sum=0;
int temp=num;
while(num!=0){
int r=num%10;
num=num/10;
sum=sum+r;
}
if(temp%sum==0)
return true;
else
return false;
}
}