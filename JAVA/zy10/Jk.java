public class Jk{
	public static void main(String[] args){
		zhuban zb = new shubiao();
		zb.usbUSB();
	}	
}
//定义接口
interface zhuban{
	public abstract void usbUSB();//方法的声明
}
class shubiao implements zhuban{
	public void usbUSB(){
		System.out.println("鼠标");
	}
}
class jianban implements zhuban{
	public void usbUSB(){
		System.out.println("键盘");
	}
}