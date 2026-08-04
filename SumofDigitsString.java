import java.util.Scanner;
class SumofDigitsString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n=sc.next();
//String n="123";
long sum=digitstringsum(n);
System.out.println(sum);

}
private static long digitstringsum(String n){
long sum=0;
for(int i=0;i<n.length();i++){
char ch=n.charAt(i);
sum=sum+ch-48;
}
return sum;
}
}