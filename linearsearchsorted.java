class linearsearchsorted{
public static void main(String args[]){
int ar[]={-1,3,5,7,9};
boolean res=ls(ar,5,5);
System.out.println(res);
}
private static boolean ls(int[] ar,int n, int key){
for(int i=0;i<n;i++){
if(key==ar[i])
return true;
if(key<ar[i])
return false;
}
return false;
}

}