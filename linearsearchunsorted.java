class linearsearchunsorted{
public static void main(String args[]){
int ar[]={2,77,34,12,90};
boolean res=ls(ar,5,1);
System.out.println(res);
}
private static boolean ls(int[] ar,int n,int key){
for(int i=0;i<n;i++){
if(key==ar[i])
return true;
}

return false;
}
}