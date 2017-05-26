import java.io.*;
import java.net.*;
public class Client { 
	public static void main(String[] args){
		Socket t = null;
		OutputStream w = null;
		InputStream i = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("127.0.0.1",9989);  
			//客户端输出流
			System.out.println("正在向服务器发送数据");
			w = t.getOutputStream();  
			String s = "我是高维安";
			//byte[] v = s.getBytes();
			w.write(s.getBytes());
			w.flush();
			t.shutdownOutput();
			//客户端输入流
			System.out.println("接收服务器返回信息");
			i =  t.getInputStream();	
			byte[] b = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = i.read(b))!=-1){
				sb.append(new String(b,0,len));
			}   
			System.out.println("服务器:" + sb.toString());    
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(w != null){
				try {
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(i != null){
				try {
					i.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(t != null){
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

