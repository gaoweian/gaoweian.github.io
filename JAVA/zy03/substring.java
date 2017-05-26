public class substring {
 public int[] qs(int[] a) {
  int temp;
  for(int i=0;i<a.length;i++){
   for(int j=0;j<a.length;j++){
    if(a[i]>a[j]){
     temp = a[i];
     a[i] = a[j];
     a[j] = temp;
    }
   }
  }
  return a;
 }
 public static void main(String[] args) {
  int[] a = {2,5,11,1,9,3};
  substring ss = new substring();
  for(int i=0;i<a.length;i++){
  System.out.print(ss.qs(a)[i]+",");
  }
 }
}