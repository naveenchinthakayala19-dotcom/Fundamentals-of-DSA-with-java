class SumofDigitsArray{
public static void main(String args[]){
int ar[]={5,-1,-3,19,4};
int sum=res(ar,5);
//System.out.println(sum);
}
private static int res(int[] ar,int n){
int sum=0;

int max=ar[0];
int min=ar[0];
for(int i=0;i<n;i++){
sum=sum+ar[i];
if(max<ar[i])
max=ar[i];
if(min>ar[i])
min=ar[i];
}
System.out.println("maximum number:: "+max);
System.out.println("minimum number:: "+min);
System.out.println("sum of smallest four digit number:: "+(sum-max));
System.out.println("sum of largest four digit number:: "+(sum-min));
return sum;
}
}