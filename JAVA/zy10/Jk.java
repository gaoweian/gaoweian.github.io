public class Jk{
	public static void main(String[] args){
		zhuban zb = new shubiao();
		zb.usbUSB();
	}	
}
//����ӿ�
interface zhuban{
	public abstract void usbUSB();//����������
}
class shubiao implements zhuban{
	public void usbUSB(){
		System.out.println("���");
	}
}
class jianban implements zhuban{
	public void usbUSB(){
		System.out.println("����");
	}
}