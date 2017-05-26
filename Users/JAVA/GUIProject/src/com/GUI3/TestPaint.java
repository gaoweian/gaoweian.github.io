package com.GUI3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;

import org.w3c.dom.css.Counter;

public  class TestPaint extends JComponent implements MouseListener{
	int i=0;
	int x,y;
	java.util.List<QIZi> qzlist = new ArrayList<QIZi>();
	public boolean isHei = true;
	private int dangqianX = 0;
	private int dangqianY = 0;
	
	private int currentX = 0;//当前棋子的x的位置
	private int currentY = 0;//当前棋子的y的位置
	boolean isWinNow = false;
	public boolean kk = true;
	public boolean tt = true;
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
			g.fillOval(p.getX(), p.getY(), p.SIZE, p.SIZE);
		}
		//判断输赢
		isWin();
		if(isWinNow==true){
			
			if(isHei!=true){
				g.setFont(new Font("微软雅黑", 1, 50));
				g.setColor(Color.red);
				g.drawString("黑子赢", 300, 300);
				
			}else{
				g.setFont(new Font("微软雅黑", 1, 50));
				g.setColor(Color.gray);
				g.drawString("白子赢", 300, 300);
			}
			kk=false;
		}
	}
	public void isWin(){
		
		//东
		int dx = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<5&&nowX<=620;nowX += 40,i++){
			QIZi qz = show(nowX,currentY);
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
			QIZi qz = show(nowX,currentY);
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
		int nb = 0;
		for(int nowX = currentX,nowY=currentY-40,i=0;i<=5 && nowY>=0;nowY -= 40,i++){
			QIZi qz = show(nowX,nowY);
			if(qz!=null){
				//当前棋子是黑棋子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				} 
				//当前棋子是白棋子
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
						nb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=620;nowY += 40,i++){
			QIZi qz = show(nowX,nowY);
			if(qz!=null){
				//当前棋子是黑棋子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				} 
				//当前棋子是白棋子
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
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
			QIZi qz = show(nowX,nowY);
			if(qz!=null){
				//判断黑子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						dnxb++; 
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
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
		for(int nowX = currentX-40,nowY=currentY-4 ,i=0;i<=5 && nowY>=0 && nowX>=0;nowY -= 40,nowX -=40,i++){
			QIZi qz = show(nowX,nowY);
			if(qz!=null){
				//判断黑子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
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
			QIZi qz = show(nowX,nowY);
			if(qz!=null){
				//判断黑子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
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
			QIZi qz = show(nowX,nowY);
			if(qz!=null){
				//判断黑子
				if(isHei!=true){
					if(qz.getColor()==Color.BLACK){
																								xndb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(qz.getColor()==Color.WHITE){
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
			isWinNow = true;
			if(isHei != true){
				System.out.println("黑子赢");
			}else{
				System.out.println("白子赢");
			}
		}
	}
	//找棋子
	public QIZi show(int x,int y){
		for(QIZi p:qzlist){
			if(p.getX() == x && p.getY() == y){
				return p;
			}
		}
		return null;
	}
	public void mouseClicked(MouseEvent e) {
		kk=true;
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
			QIZi qz = new QIZi(x,y);
			if(isHei==true){
				//黑棋
				qz.setColor(Color.BLACK);
				isHei = false;
			}else{
				//白棋
				qz.setColor(Color.WHITE);
				isHei = true;
			}
			if(isWinNow == false){
				qzlist.add(qz);
			}
			//用户触发 重画
			this.repaint();			
		}
	}
	

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
