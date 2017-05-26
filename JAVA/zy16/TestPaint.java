package com.GUI2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComponent;

public  class TestPaint extends JComponent implements MouseListener{
	int i=0;
	int x,y;
	private boolean flag = false;
	java.util.List<QIZi> qzlist = new ArrayList<QIZi>();
	private boolean hei = true;
	private int dangqianX = 0;
	private int dangqianY = 0;
	
	private boolean isHei = true;
	private int currentX = 0;//��ǰ���ӵ�x
	private int currentY = 0;//��ǰ���ӵ�y
	
	public TestPaint(){
		this.addMouseListener(this);
	}
	//���� ����/����
	public void paint(Graphics g){
		//��������
		for(int i = -1;i<15;i++){
			g.drawLine(20, (i*40+60), 620, (i*40+60));
			g.drawLine((i*40+60), 20, (i*40+60), 620);
		}
		//��������
		for(QIZi p:qzlist){
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), QIZi.SIZE, QIZi.SIZE);
		}
		//�ж���Ӯ
		isWin();
	}
	public void isWin(){
		
		
		//��
		int dx = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<5&&nowX<=620;nowX += 40,i++){
			QIZi qz = findQIZi(nowX,currentY);
			if(qz!=null){
				//�жϺ���
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
						dx++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//��
		for(int nowX = currentX-40,i=0;i<5&&nowX>=0;nowX -= 40,i++){
			QIZi qz = findQIZi(nowX,currentY);
			if(qz!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dx++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
//		if(isHei!=true){
//			System.out.println("������"+dx);
//		}else{
//			System.out.println("������"+dx);
//		}
		//��
		int nb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620;nowY += 40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						nb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		
		//��
		for(int nowX = currentX,nowY=currentY-60,i=0;i<=5 && nowY>=0;nowY -= 40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						nb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//���� 
		int dnxb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620 && nowX<=620;nowY += 40,nowX +=40,i++){
			QIZi qz = findQIZi(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dnxb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//����
		for(int nowX = currentX-40,nowY=currentY-40,i=0;i<=5 && nowY>=0 && nowX>=0;nowY -= 40,nowX -=40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dnxb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//���� 
		int xndb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620 && nowX>0;nowY += 40,nowX -=40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						xndb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//����
		for(int nowX = currentX+40,nowY=currentY-40,i=0;i<=5 && nowY>=0 && nowX<=620;nowY -= 40,nowX +=40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//�жϰ���
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						xndb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dx>=5||nb>=5||dnxb>=5||xndb>=5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
	}
	//������QIZi point = findQIZi
	public QIZi findPoint(int x,int y){
		for(QIZi p:qzlist){
			if(p.getX() == x && p.getY() == y){
				return p;
			}
		}
		return null;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		
		double xianX = Math.round((x-20)/40.0);
		double xianY = Math.round((y-20)/40.0);
		x = ((int)xianX)*40;
		y = ((int)xianY)*40;
		//��¼��ǰ����λ��
		currentX = x;
		currentY = y;
		boolean isHave = false;
		for(QIZi p:qzlist){
			if(p.getX() == x && p.getY() == y){
				isHave = true;
			}
		}
		if(!isHave){
			QIZi point = new QIZi(x,y);
			if(isHei==true){
				//����
				point.setColor(Color.BLACK);
				isHei = false;
			}else{
				//����
				point.setColor(Color.WHITE);
				isHei = true;
			}
			qzlist.add(point);
			
			//�û����� �ػ�
			this.repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
