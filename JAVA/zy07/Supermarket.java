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
		System.out.println("商品名称："+spname+"，进价："+jhprice+"元，进货数量："+jhsumber+"个，售出的价格："+xsprice+"元，售出的数量："+xssumber+"个，库存数量"+kcsumber+"个");
	}
}