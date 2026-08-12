import java.util.Scanner;
class rowWiseSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
/*r=3
c=2
3 4
5 6 
7 8
o/p
7
11
15
*/
int mat[][]=new int[r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
mat[i][j]=sc.nextInt();
}
}
for(int i=0;i<r;i++){
int sum=0;
for(int j=0;j<c;j++){
sum=sum+mat[i][j];
}
System.out.println(sum);
}
}
}