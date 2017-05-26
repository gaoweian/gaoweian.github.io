package com.GUI4;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;

public class QiPan extends JComponent{
	
	static List<Pieces> pieces = new ArrayList<Pieces>();//�������
	TiShi tiShi1 = new TiShi();//��ʾ��Ϣ��
	String message;//��ŵ�ǰ��ʾ��Ϣ
	static boolean b = true;//������Ϸ��ʼ����.true--->��Ϸ����;false--->��Ϸ������;
	Pieces pi = null;//��ŵ�ǰ����
	public void paint(Graphics g) {
		//������̱���ɫ
		g.setColor(new Color(245, 131, 65));
		g.fillRect(0, 0, 850, 850);
		//������������
		for(int i = 0;i<=21;i++){
			int a = i*40+20;
			//�����������ɫ
			g.setColor(new Color(0,0,0));
			g.drawLine(20,a,820,a);
			g.drawLine(a,20,a,820);
		}
//		//��������
		for(Pieces p:pieces){
			//��ȡ������ɫ
			if(p.isB()){
				g.setColor(new Color(0, 0, 0));
			}else{
				g.setColor(new Color(255, 255, 255));
			}
			//��������
			g.fillOval(p.getX(), p.getY(),p.WITCH, p.WITCH);
		}
		//���
		if(pieces.size()>0){
			Pieces p2 = pieces.get(pieces.size()-1);
			g.setColor(new Color(200, 0, 0));
			g.fillOval(p2.getX()+10, p2.getY()+10,10,10);
		}
	}
	/**
	 * ��������
	 */
	public boolean chuangJian(MouseEvent e,boolean color){
		//������Ϸ��ʼ����.true--->��Ϸ����;false--->��Ϸ������;
		if(b){
			return true;
		}
		//��ȡ����
		int xx = e.getX();
		int yy = e.getY();
		Pieces pi = new Pieces(xx, yy,color);
		//�ж��Ƿ�������ӣ��������򴴽�
		
		if(pp(pi.getX(),pi.getY())!=null){
			pi = new Pieces(xx, yy,!color);
			return true;
		}
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(Main.socket.getOutputStream());
			objectOutputStream.writeObject(pi);
			objectOutputStream.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		draw(pi);
		return false;
	}
	public void jie(Pieces ppi){
		pieces.add(ppi);
		pi = ppi;
		draw();
	}
	/**
	 * �����������ж�
	 */
	public void draw(){
		//����
		GameWindow.qiPan.repaint();
		message = "x = "+((pi.getX()-5)/40+1) +"   y = "+((pi.getY()-5)/40+1)+"   ";
		//�ж�ʤ��
		if(result(pi,1)||result(pi,2)||result(pi,3)||result(pi,4)){
			message = "��Ϸ������"+"��ϲ"+(pi.isB()? "����":"����")+"Ӯ�ˣ�";
			b = true;
//			jButton1.setText("��ʼ��Ϸ");
		}
		GameWindow.tiShi.repaint2(pi.isB(),message);
	}
	/**
	 * ��ʼ�����
	 */
	public boolean startAndEnd(TiShi tiShi){
		tiShi1 = tiShi;
		b = !b;
		if(b){
			if(pieces.size()==0){
				message = "��Ϸ������"+"��ϲ����Ӯ�ˣ�";
			}else{
				message = "��Ϸ������"+"��ϲ"+(pi.isB()? "����":"����")+"Ӯ�ˣ�";
			}
			tiShi1.repaint2(pi==null?true:pi.isB(),message);
			return true;
		}
		pieces.clear();
		this.repaint();
		message = "��Ϸ�ѿ�ʼ��";
		tiShi1.repaint2(pi==null?true:pi.isB(),message);
		return false;
	}
	/**
	 * ���¿�ʼ
	 */
	public void resume(TiShi tiShi){
		tiShi1 = tiShi;
		pieces.clear();
		b = false;
		this.repaint();
		message = "��Ϸ�ѿ�ʼ��";
		tiShi1.repaint2(pi==null?true:pi.isB(),message);
	}
	/**
	 * ����
	 */
	public boolean takeBack(){
		if(pieces.size()==0){
			message = "�޷����壬�����壡";
			tiShi1.repaint2(pi==null?true:pi.isB(),message);
			return true;
		}
		pieces.remove(pieces.size()-1);
		this.repaint();
		return false;
	}
	
	
	/**
	 * ͨ��x��y���������ӣ�����з���true,û�з���false
	 *
	 */
	public Pieces pp(int x,int y){
		for(Pieces p:pieces){
			if(p.getX()==x&&p.getY()==y){
				return p;
			}
		}
		return null;
	}
	/**
	 *�ж�ʤ��
	 */
	public boolean result(Pieces s,int h){
		int sum = 1;
		int x = s.getX();
		int y = s.getY();
		for(int i = 0;i<=4;i++){
			if(h==1){//�ж�"����"
				x-=40;
			}else if(h==2){//�ж�"|"
				y-=40;
			}else if(h==3){//�ж�"/"
				x-=40;
				y+=40;
			}else if(h==4){//�ж�"\"
				x-=40;
				y-=40;
			}
			//�ж���ɫ
			if(pp(x,y)!=null&&s.isB()==pp(x,y).isB()){
				sum++;
			}else{
				break;
			}
			
		}
		x = s.getX();
		y = s.getY();
		for(int i = 0;i<=4;i++){
			if(h==1){//�ж�"����"
				x+=40;
			}else if(h==2){//�ж�"|"
				y+=40;
			}else if(h==3){//�ж�"/"
				x+=40;
				y-=40;
			}else if(h==4){//�ж�"\"
				x+=40;
				y+=40;
			}
			//�ж���ɫ
			if(pp(x,y)!=null&&s.isB()==pp(x,y).isB()){
				sum++;
			}else{
				break;
			}
		}
		String cs = null;
		if(h==1){//�ж�"����"
			cs="��";
		}else if(h==2){//�ж�"|"
			cs="��";
		}else if(h==3){//�ж�"/"
			cs="��б";
		}else if(h==4){//�ж�"\"
			cs="��б";
		}
		message += cs+"="+sum+"   ";
		//System.out.println("x="+s.getX()+"\ty="+s.getY()+"\tcolot="+s.isB()+"\t"+c+"="+sum);
		if(sum>=5){
			return true;
		}else{
			return false;
		}
	}

}
