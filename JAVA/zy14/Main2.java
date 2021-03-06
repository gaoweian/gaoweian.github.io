import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class Main2 extends JFrame{
	public Main2(){
		this.setLayout(null);
		this.setTitle("在文本框内输入内容保存");
		//文本框
		
		JTextArea jTextArea = new JTextArea();//定义控件
		jTextArea.setText("请输入");
		jTextArea.setBounds(50, 80, 300, 200);//设置控件的位置
		this.add(jTextArea);//将其放到窗口中
		
		// 菜单栏
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu = new JMenu("文件 (F)");
		// 设置助记符为F，按下ALT + F 可以触发该菜单
	    jMenu.setMnemonic('F');
		JMenuItem open = new JMenuItem("新建");
		JMenuItem save = new JMenuItem("保存");

		jMenu.add(open);
		// 设置菜单分隔符
		jMenu.addSeparator();
		jMenu.add(save);
		jMenuBar.add(jMenu);
		// 设置菜单栏，使用这种方式设置菜单栏可以不占用布局空间
		this.setJMenuBar(jMenuBar);
		
//		JMenu jMenu2 = new JMenu("编辑 (E)");
//		jMenu2.setMnemonic('E');
//		JMenuItem c = new JMenuItem("复制");
//		JMenuItem v = new JMenuItem("粘贴");
//		
//		jMenu2.add(c);
//		// 设置菜单分隔符
//		jMenu2.addSeparator();
//		jMenu2.add(v);
//		jMenuBar.add(jMenu2);
//		// 设置菜单栏，使用这种方式设置菜单栏可以不占用布局空间
//		this.setJMenuBar(jMenuBar);
//		
//		JMenu jMenu3 = new JMenu("视图");
//
//		JMenuItem g = new JMenuItem("工具栏/视图");
//		JMenuItem k = new JMenuItem("全屏显示");
//		
//		jMenu3.add(g);
//		// 设置菜单分隔符
//		jMenu3.addSeparator();
//		jMenu3.add(k);
//		jMenuBar.add(jMenu3);
//		// 设置菜单栏，使用这种方式设置菜单栏可以不占用布局空间
//		this.setJMenuBar(jMenuBar);

		
		this.setBounds(500,400,500,400);//定义窗口大小
		this.setVisible(true);//定义窗口是否可见
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("test.txt");
				try{
					file.createNewFile();
					//char[] cc = new char[10];
					String s = jTextArea.getText();
					FileWriter fw = new FileWriter(file);
					fw.write(s);
					fw.close();
					System.out.println(s);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args) {
		new Main2();
	}
}

