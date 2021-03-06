import java.net.*;
import java.io.*;

public class Server {        
   public static void main(String args[]) {
	   ServerSocket s = null;
	   Socket t = null;
	   InputStream i = null;
	   OutputStream w = null;
	   try{
		   
			//创建服务端，并开通注册端口
			System.out.println("创建成功，正在等待客户端连接");
			s = new ServerSocket(9989);  
			//监听对应端口 阻塞
			System.out.println("等待客户端发送数据");
			t = s.accept();
			//服务端输入流
			System.out.println("正在接收客户端发送数据");
			i =  t.getInputStream();	
			byte[] b = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = i.read(b))!=-1){
				sb.append(new String(b,0,len));
			}
			System.out.println("服务器:你是");
			System.out.println("客户端:"+sb);//.toString()
			String cc = new String(t.getInetAddress().getHostAddress());
			System.out.println("地址是："+cc); 
			//服务端输出流
			System.out.println("向客户端返回消息");
			w = t.getOutputStream(); 
			String ss = "已接收消息"+sb;
			w.write(ss.getBytes());
			w.flush();
			//w.close();        
			//t .close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("关闭输出流");
			if(w != null){
				try {
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("关闭输入流");
			if(i != null){
				try {
					i.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("接收结束");
			if(t != null){
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("关闭连接");
			if(s != null){
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}    
}   

