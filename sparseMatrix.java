import java.util.Scanner;
class sparseMatrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int mat[][]=new int[r][c];
int totalelement=r*c;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
mat[i][j]=sc.nextInt();
}
}
int zero=0;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(mat[i][j]==0)
zero++;
}
}
int nonzero=totalelement-zero;
if(zero>nonzero)
System.out.println("yes");
else
System.out.println("No");
}
}