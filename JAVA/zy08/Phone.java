public class Phone{
	public Ca ca;
	public Dx dx;
	public Phone(Ca ca,Dx dx){
		this.ca = ca;
		this.dx = dx;
	}
	
	public void call(){
		System.out.println("��ǰ���͵ĺ�����"+ca.haoma);
	}
	public void dxnr(){
		System.out.println("������"+dx.nr);
	}
}