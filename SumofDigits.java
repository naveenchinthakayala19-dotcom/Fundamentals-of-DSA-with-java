import java.util.Scanner;
class SumofDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
//long n=123l;
long sum=digits(n);
System.out.println(sum);
}
private static long digits(long n){
long sum=0;
while(n!=0){
long r=n%10;
n=n/10;
sum=sum+r;
}
return sum;
}


}