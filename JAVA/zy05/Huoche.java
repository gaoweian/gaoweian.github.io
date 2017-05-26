public class Huoche{
        String name; 
        char sj;      
        char carea; 
        char darea;
public  Huoche(String name,char sj,char carea,char darea){
	this.name=name;
	this.sj=sj;
	this.carea=carea;
	this.darea=darea;
}
public void say(){
	System.out.println("火车类型："+name+",时间："+sj+"出发地点："+carea+",到达地点："+darea);
}
public void sleep(){
	System.out.println("睡觉");
}
public  void eat(){
	System.out.println("吃饭");
}
}