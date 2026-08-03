class MinAndMaxofElementArray{
public static void main(String args[]){
int ar[]={-1,19,4,3,2};
int max=findmax(ar,5);
System.out.println(max);
}
private static int findmax(int[] ar,int n){
int max=ar[0];
for(int i=1;i<n;i++){
if(ar[i]>max)
max=ar[i];
}
return max;

}


}
