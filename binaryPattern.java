import java.util.Scanner;
class binaryPattern{
public  static void main(String args[]){
Scanner sc=new Scanner(System.in);
boolean flag=true;
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(flag ==true){
System.out.print(1);
flag=false;
}
else{
System.out.print(0);
flag=true;
}
}
System.out.println();
}
}
} 