import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class Main2 extends JFrame{
	public Main2(){
		this.setLayout(null);
		this.setTitle("���ı������������ݱ���");
		//�ı���
		
		JTextArea jTextArea = new JTextArea();//����ؼ�
		jTextArea.setText("������");
		jTextArea.setBounds(50, 80, 300, 200);//���ÿؼ���λ��
		this.add(jTextArea);//����ŵ�������
		
		// �˵���
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu = new JMenu("�ļ� (F)");
		// �������Ƿ�ΪF������ALT + F ���Դ����ò˵�
	    jMenu.setMnemonic('F');
		JMenuItem open = new JMenuItem("�½�");
		JMenuItem save = new JMenuItem("����");

		jMenu.add(open);
		// ���ò˵��ָ���
		jMenu.addSeparator();
		jMenu.add(save);
		jMenuBar.add(jMenu);
		// ���ò˵�����ʹ�����ַ�ʽ���ò˵������Բ�ռ�ò��ֿռ�
		this.setJMenuBar(jMenuBar);
		
//		JMenu jMenu2 = new JMenu("�༭ (E)");
//		jMenu2.setMnemonic('E');
//		JMenuItem c = new JMenuItem("����");
//		JMenuItem v = new JMenuItem("ճ��");
//		
//		jMenu2.add(c);
//		// ���ò˵��ָ���
//		jMenu2.addSeparator();
//		jMenu2.add(v);
//		jMenuBar.add(jMenu2);
//		// ���ò˵�����ʹ�����ַ�ʽ���ò˵������Բ�ռ�ò��ֿռ�
//		this.setJMenuBar(jMenuBar);
//		
//		JMenu jMenu3 = new JMenu("��ͼ");
//
//		JMenuItem g = new JMenuItem("������/��ͼ");
//		JMenuItem k = new JMenuItem("ȫ����ʾ");
//		
//		jMenu3.add(g);
//		// ���ò˵��ָ���
//		jMenu3.addSeparator();
//		jMenu3.add(k);
//		jMenuBar.add(jMenu3);
//		// ���ò˵�����ʹ�����ַ�ʽ���ò˵������Բ�ռ�ò��ֿռ�
//		this.setJMenuBar(jMenuBar);

		
		this.setBounds(500,400,500,400);//���崰�ڴ�С
		this.setVisible(true);//���崰���Ƿ�ɼ�
		
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
