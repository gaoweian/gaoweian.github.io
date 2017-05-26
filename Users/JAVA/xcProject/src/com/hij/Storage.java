package com.hij;
/**
 * �ֿ���
 * */
public class Storage {
	private final static int MAX_SIZE = 100;//���òֿ��������
	private int size;
	public Storage(int size){
		this.size= size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	//���
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			setSize(getSize()+number);
			System.out.println("������"+number+"��ǰ���Ϊ"+getSize());
		}else{
			System.out.println("�����������ͣ�������ȴ�����������");
			try {
				this.wait();//�����ȡ�ö��������̴߳��ڵȴ�״̬
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//֪ͨ����������
		this.notifyAll();
	}
	//ȡ�� 
	public synchronized void pop(int number){
		if(getSize()-number<0){
			System.out.println("��治�㣬�ȴ�����������");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("���ѳɹ�"+number+"������ǰ���"+getSize()+"��");
		}
		//֪ͨ������������
		this.notifyAll();
	}
}
