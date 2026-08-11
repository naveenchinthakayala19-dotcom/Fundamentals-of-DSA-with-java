import java.util.Scanner;
class palindromePattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/* 
n=5
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A
*/
for(int i=1;i<=n;i++){
char ch='A';
for(int j=1;j<=i;j++){
System.out.print(ch+" ");
ch++;
}
ch--;
for(int j=1;j<=i-1;j++){
System.out.print(--ch +" ");
} 
System.out.println();
}
}
}