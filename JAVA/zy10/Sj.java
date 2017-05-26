public class Sj{
	public static void main(String[] args){	
		Iph p = Factory.getsj("htc");
		p.call();
	}
}
interface Iph{
	void call();
}
class HTC implements Iph{
	public void call(){
		System.out.println("��HTC��绰");
	}
}
class MI implements Iph{
	public void call(){
		System.out.println("��MI��绰");
	}
}
class Factory{
	public static Iph getsj(String type){
		Iph p = null;
		if("htc".equals(type)){
			p = new HTC();
		}else if("mi".equals(type)){
			p = new MI();
		}
		return p;
	} 
}
