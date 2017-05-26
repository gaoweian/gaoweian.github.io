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
	private int currentX = 0;//当前棋子的x
	private int currentY = 0;//当前棋子的y
	
	public TestPaint(){
		this.addMouseListener(this);
	}
	//绘制 棋盘/棋子
	public void paint(Graphics g){
		//绘制棋盘
		for(int i = -1;i<15;i++){
			g.drawLine(20, (i*40+60), 620, (i*40+60));
			g.drawLine((i*40+60), 20, (i*40+60), 620);
		}
		//绘制棋子
		for(QIZi p:qzlist){
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), QIZi.SIZE, QIZi.SIZE);
		}
		//判断输赢
		isWin();
	}
	public void isWin(){
		
		
		//东
		int dx = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<5&&nowX<=620;nowX += 40,i++){
			QIZi qz = findQIZi(nowX,currentY);
			if(qz!=null){
				//判断黑子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//判断白子
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
		//西
		for(int nowX = currentX-40,i=0;i<5&&nowX>=0;nowX -= 40,i++){
			QIZi qz = findQIZi(nowX,currentY);
			if(qz!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//判断白子
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
//			System.out.println("黑子数"+dx);
//		}else{
//			System.out.println("白子数"+dx);
//		}
		//南
		int nb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620;nowY += 40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//判断白子
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
		
		//北
		for(int nowX = currentX,nowY=currentY-60,i=0;i<=5 && nowY>=0;nowY -= 40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//判断白子
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
		//东南 
		int dnxb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620 && nowX<=620;nowY += 40,nowX +=40,i++){
			QIZi qz = findQIZi(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//判断白子
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
		//西北
		for(int nowX = currentX-40,nowY=currentY-40,i=0;i<=5 && nowY>=0 && nowX>=0;nowY -= 40,nowX -=40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//判断白子
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
		//西南 
		int xndb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620 && nowX>0;nowY += 40,nowX -=40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//判断白子
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
		//东北
		for(int nowX = currentX+40,nowY=currentY-40,i=0;i<=5 && nowY>=0 && nowX<=620;nowY -= 40,nowX +=40,i++){
			QIZi point = findQIZi(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//判断白子
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
				System.out.println("黑子赢");
			}else{
				System.out.println("白子赢");
			}
		}
	}
	//找棋子QIZi point = findQIZi
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
		//记录当前棋子位置
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
				//黑棋
				point.setColor(Color.BLACK);
				isHei = false;
			}else{
				//白棋
				point.setColor(Color.WHITE);
				isHei = true;
			}
			qzlist.add(point);
			
			//用户触发 重画
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
