public class Demo2 {
	//private static boolean NuberFormatExceptione;
	public static void main(String[] args){
		int[] a=new int[5];
		try{
			for(int i=0;i<a.length;i++){
				a[i]=Integer.parseInt(args[i]);
			}
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}catch (NumberFormatException e){
			System.out.println("������������������");
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("�������������������������");
		}
	}
}


