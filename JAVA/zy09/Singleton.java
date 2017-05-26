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
    //��ģʽ
    class  Singleton1{
        //���ڲ�׼���õ������
		private static  Singleton1 instance = new Singleton1();
        private Singleton1(){};//����˽�еĹ��췽��
        public void say(){
			System.out.println("��Ҫ����ʥּ");      
		}
        //�ṩһ����̬�ɱ��ⲿ���ʵ���
        public static Singleton1 getInstance(){
	    return instance;
        }
	}
    //����ģʽ
    class Singleton2{
         //���ڲ�׼���õ������
		 private static Singleton2 instance = null;
         private Singleton2(){};//����˽�еĹ��췽��
         public void say2(){
			 System.out.println("��Ҫ����ʥּ");
         }
		 //�ṩһ����̬�ɱ��ⲿ���ʵ���
         public static Singleton2 getInstance(){
	     if(instance == null){
			 instance = new  Singleton2();
	     }
	     return instance;
		 }
    }
    enum Singleton3 {
		INSTANCE;//Ψһʵ��
		public static Singleton3 getInstance(){
			return INSTANCE;
		}
		public void say3(){
			System.out.println("ʹ��enumʵ�ֵ���ģʽ");
        }
	}


