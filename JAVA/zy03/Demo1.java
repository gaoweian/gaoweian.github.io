/*public class Demo1{
	public static void main(String[] args){
		int [] arr = {6,9};
		System.out.println("前，第一个= " +arr[0]+",第二个=" +arr[1]);
		swap(arr,0,1);
		System.out.println("后，第一个= "+arr[0]+",第二个=" +arr[1]);
	}
	private static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}

*/

public class Demo1{
	public static void main(String[] args){
		int a = 12;
		int b = 24;
		System.out.println("a="+a+",b=" +b);
		swap(a,b);
		System.out.println("ka="+a+",b=" +b);
	}
	private static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
}