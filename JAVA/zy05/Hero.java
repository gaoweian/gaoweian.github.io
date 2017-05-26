public class Hero{
       //声明类的属性信息
        String name;    //姓名属性
        String zhuangbei;    //装备
        int type;           //人物类型
        String pfname;    //皮肤
        int heat;           //伤害值
public Hero(String name,String zhuangbei,int type,String pfname,int heat){
	this.name=name;
	this.zhuangbei=zhuangbei;
	this.type=type;
	this.pfname=pfname;
	this.heat=heat;
}
public void say(){
	System.out.println("火车类型："+name+",装备："+zhuangbei+"人物类型："+type+",皮肤："+pfname+"，伤害值"+heat);
}
	//声明类的动作信息
public void jineng(){
	System.out.println("闪现");
}
public void move(){
	System.out.println("MOVE");
}
public void pudong(){
	System.out.println("pudong");
}
}