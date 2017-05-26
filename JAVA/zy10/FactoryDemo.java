//手机标准
interface ICellPhone {
	void sendMsg();
}

/* HTC手机 */
class HTC implements ICellPhone {
	public void sendMsg() {
		System.out.println("已退出中国市场");
	}
}

/* IPhone手机 */
class IPhone implements ICellPhone {
	public void sendMsg() {
		System.out. println("在中国市场异常受欢迎");
	}
}

/* 手机工厂 */
class Factory {
	public static ICellPhone getInstance(String type){
		ICellPhone phone = null;
		if("htc".equals(type)){
			phone = new HTC();
		}else if("iphone".equals(type)){
			phone = new IPhone();
		}
		return phone;
	}
}

public class FactoryDemo {
	public static void main(String[] args) {
		ICellPhone p = Factory.getInstance("htc");
		p.sendMsg();
	}
}
