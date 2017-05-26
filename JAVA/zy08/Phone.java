public class Phone{
	public Ca ca;
	public Dx dx;
	public Phone(Ca ca,Dx dx){
		this.ca = ca;
		this.dx = dx;
	}
	
	public void call(){
		System.out.println("当前发送的号码是"+ca.haoma);
	}
	public void dxnr(){
		System.out.println("内容是"+dx.nr);
	}
}