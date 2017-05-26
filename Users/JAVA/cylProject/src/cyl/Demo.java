package cyl;

public class Demo{
	public static void main(String[]args){
		/*int[]i={1,2,3,4,5};
		StringBuilder sb=new StringBuilder();
		for(int j:i){
			sb.append(j).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);*/
		
		/*StringBuilder sb = new StringBuilder("ABCDE");
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		for(int i=0;i<sb.length();i+=2){
		sb.insert(i,",");
		}
		sb.deleteCharAt(0);
		System.out.println(sb);*/
		String str="ABCD";
		byte[] bys = str.getBytes();
		StringBuilder sBuilder = new StringBuilder("");
		for (byte b : bys) {
			sBuilder.append((char)b).append(",");
		}
		sBuilder.deleteCharAt(sBuilder.length()-1);
		System.out.println(sBuilder.toString());

	}
}

