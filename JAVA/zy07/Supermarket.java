public class Supermarket{
	String spname;
	double jhprice;
	int jhsumber;
	double xsprice;
	int xssumber;
	int kcsumber;
	public Supermarket(String spname,double jhprice,int jhsumber,double xsprice,int xssumber,int kcsumber){
		this.spname=spname;
		this.jhprice=jhprice;
		this.jhsumber=jhsumber;
		this.xsprice=xsprice;
		this.xssumber=xssumber;
		this.kcsumber=kcsumber;
	}
	public void say(){
		System.out.println("��Ʒ���ƣ�"+spname+"�����ۣ�"+jhprice+"Ԫ������������"+jhsumber+"�����۳��ļ۸�"+xsprice+"Ԫ���۳���������"+xssumber+"�����������"+kcsumber+"��");
	}
}