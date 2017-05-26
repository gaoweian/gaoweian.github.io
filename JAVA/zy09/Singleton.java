public class Singleton{
	public static void main(String[] args){
	Singleton1 s1 = Singleton1.getInstance();
	s1.say();
    Singleton2 s2 = Singleton2.getInstance();
	s2.say2();
	Singleton3 s3 = Singleton3.getInstance();
	s3.say3();
	}
}
    //恶汉模式
    class  Singleton1{
        //在内部准备好单类对象
		private static  Singleton1 instance = new Singleton1();
        private Singleton1(){};//创建私有的构造方法
        public void say(){
			System.out.println("我要发布圣旨");      
		}
        //提供一个静态可被外部访问的类
        public static Singleton1 getInstance(){
	    return instance;
        }
	}
    //懒汉模式
    class Singleton2{
         //在内部准备好单类对象
		 private static Singleton2 instance = null;
         private Singleton2(){};//创建私有的构造方法
         public void say2(){
			 System.out.println("我要发布圣旨");
         }
		 //提供一个静态可被外部访问的类
         public static Singleton2 getInstance(){
	     if(instance == null){
			 instance = new  Singleton2();
	     }
	     return instance;
		 }
    }
    enum Singleton3 {
		INSTANCE;//唯一实例
		public static Singleton3 getInstance(){
			return INSTANCE;
		}
		public void say3(){
			System.out.println("使用enum实现单例模式");
        }
	}


