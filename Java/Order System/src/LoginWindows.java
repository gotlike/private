import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
public class LoginWindows extends JFrame {
	static LoginWindows mainJFrame=new LoginWindows();
	static LWinListener wlist=new LWinListener();
	protected static Component makeLoginPanel() {
		JPanel panel=new JPanel();
		
		JLabel lb_administratorLogin=new JLabel();
		JLabel lb_name=new JLabel();
		JLabel lb_pass=new JLabel();
		JLabel judgeStatus=new JLabel("�������˺�����");
		
		JTextField tf_name=new JTextField();
		JPasswordField pf_pass=new JPasswordField();
		
		JButton bt_login=new JButton("��¼");
		JButton bt_reset=new JButton("����");
		JButton bt_customerLogin=new JButton("�˿͵�¼");
		
		panel.setLayout(null);
		
		lb_administratorLogin.setText("����Ա��¼����");
		lb_administratorLogin.setSize(100,20);
		lb_administratorLogin.setBounds(0, 0, 100, 30);
		lb_administratorLogin.setForeground(Color.green);
		panel.add(lb_administratorLogin);
		
		lb_name.setText("�� ��");
		lb_name.setSize(20,20);
		lb_name.setFont(new Font("Ҷ����ë������2.0��",Font.BOLD,30));
		lb_name.setBounds(110,75,100,50);
		lb_name.setForeground(Color.green);
		panel.add(lb_name);

		tf_name.setBounds(193, 88, 133, 24);
		panel.add(tf_name);
		
		lb_pass.setText("����");
		lb_pass.setSize(20, 20);
		lb_pass.setBounds(110, 125, 100, 50);
		lb_pass.setForeground(Color.green);
		lb_pass.setFont(new Font("Ҷ����ë������2.0��",Font.BOLD,30));
		panel.add(lb_pass);
		
		pf_pass.setBounds(193, 140, 133, 24);
		panel.add(pf_pass);
		
		bt_login.setBounds(25, 190, 85,35);
		bt_login.setForeground(Color.BLACK);
		bt_login.setFont(new Font("��Բ",Font.BOLD,20));
		panel.add(bt_login);
		
		bt_reset.setBounds(150, 190, 85, 35);
		bt_reset.setForeground(Color.BLACK);
		bt_reset.setFont(new Font("��Բ",Font.BOLD,20));
		panel.add(bt_reset);
		
		bt_customerLogin.setBounds(260,190,130,35);
		bt_customerLogin.setForeground(Color.BLACK);
		bt_customerLogin.setFont(new Font("��Բ",Font.BOLD,20));
		panel.add(bt_customerLogin);
		
		judgeStatus.setSize(150,40);
		judgeStatus.setBounds(0, 20, 150, 40);
		judgeStatus.setForeground(Color.PINK);
		panel.add(judgeStatus);
		
		ImageIcon image=new ImageIcon("bg8.jpg");
		JLabel lb_image=new JLabel(image);
		lb_image.setBounds(0,0,420,280);
		panel.add(lb_image);
		
		bt_reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				tf_name.setText("");
				pf_pass.setText("");
				judgeStatus.setText("�������˺�����");
			}
			});
		bt_login.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				String password=new String(pf_pass.getPassword());
				if(tf_name.getText().equals(AdministratorSystem.UserName)&&password.equals(AdministratorSystem.PassWord)) {
					mainJFrame.dispose();
					AdministratorSystem.init();
				}
				else
				{
					pf_pass.setText("");
					judgeStatus.setText("�����������ȷ���룡");
				}
				
			}
			});
		bt_customerLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				mainJFrame.dispose();
				OrderSystem.init();
			}
			});
		
		return panel;
	}
	public static void init() {
		mainJFrame.setTitle("��¼����");
		mainJFrame.setBounds(0,0,420,280);
		mainJFrame.setLocationRelativeTo(null);
		mainJFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		mainJFrame.setResizable(false);
		Container container=mainJFrame.getContentPane();
		container.setLayout(new BorderLayout());
		
		Component cpn_loginPanel=makeLoginPanel();
		container.add(cpn_loginPanel,BorderLayout.CENTER);
		
		
		mainJFrame.addWindowListener(wlist);
		mainJFrame.setVisible(true);
		
	}

		
}