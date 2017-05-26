//�ֻ���׼
interface ICellPhone {
	void sendMsg();
}

/* HTC�ֻ� */
class HTC implements ICellPhone {
	public void sendMsg() {
		System.out.println("���˳��й��г�");
	}
}

/* IPhone�ֻ� */
class IPhone implements ICellPhone {
	public void sendMsg() {
		System.out. println("���й��г��쳣�ܻ�ӭ");
	}
}

/* �ֻ����� */
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
