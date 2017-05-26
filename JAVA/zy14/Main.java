import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
	public Main(){
		this.setLayout(null);
		JLabel jLabel = new JLabel();
		jLabel.setText("QQ");//要实现的内容
		jLabel.setFont(new java.awt.Font("Dialog",1,15));
		
		jLabel.setBounds(10,5,30,30);//设置控件的位置
		this.add(jLabel);//将其放到窗口中
		
		JLabel jlabel = new JLabel();
		jlabel.setText("账号");//要实现的内容
		jlabel.setBounds(25, 40, 150, 20);//设置控件的位置
		this.add(jlabel);//将其放到窗口中

		JTextArea jTextArea = new JTextArea();//定义控件
		jTextArea.setBounds(65, 40, 150, 20);//设置控件的位置
		this.add(jTextArea);//将其放到窗口中
		
		JLabel label = new JLabel();
		label.setText("密码");//要实现的内容
		label.setBounds(25, 70, 150, 20);//设置控件的位置
		this.add(label);//将其放到窗口中

		JPasswordField text = new JPasswordField (); 
		text.setBounds(65, 70, 150, 20);
		text.setEchoChar('*');
		this.add(text);

		JButton jButton = new JButton();//定义控件
		jButton.setText("登录");//设置实现
		jButton.setBounds(65, 100, 150, 20);//设置控件的位置
		this.add(jButton);//将其放到窗口中
		
		this.setBounds(300,200,300,200);//定义窗口大小
		this.setVisible(true);//定义窗口是否可见
	}
	public static void main(String[] args) {
		new Main();
	}
}
