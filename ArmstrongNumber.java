import java.util.Scanner;
class ArmstrongNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
boolean res=arm(num);
System.out.println(res); 
}
private static boolean arm(int num){
int sum=0;
int temp=num;
while(num!=0){
int r=num%10;
num=num/10;
sum=sum+(r*r*r);
}
if(sum==temp)
return true;
else
return false;
}
}