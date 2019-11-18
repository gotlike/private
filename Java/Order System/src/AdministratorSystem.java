import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
public class AdministratorSystem extends JFrame{
	static String UserName="user";
	static String PassWord="";
	static AdministratorSystem mainJFrame=new AdministratorSystem();
	static AWinListener wlist=new AWinListener();
	
	static JPanel pn_menuPanel=new JPanel();
	static JPanel totalList=new JPanel();
	static JPanel customerList=new JPanel();
	static JTabbedPane ShowPanel=new JTabbedPane();
	static JTabbedPane ad_MenuDirect=new JTabbedPane();
	
	static JButton[] bt_ad_Menu=new JButton[4];
	static JButton[] customer=new JButton[50];
	
	static String[] dishListName= {"����","����","ʱ��","��Ʒ","����","���ѽ��"};
	static String[] Menu= {"���嵥","�����嵥","�˳�ϵͳ","�˻�������"};
	static String[] dishName= {"�����ع���","�罷��ͷ","���Ӽ�","���Ŷ���","����","����","���������Ĵ�","��±��ţ��","������빽","�������","�߹��ӻ���","���ִ���","�����ֵ���","���ǲ���","������ˮ�ȵ���","�ɿ�����","�²˺��ӵ���","ˮ��Ŵ����","������˿","��������","���ո���","�������","��̦������","��������","ţ��С��","�±���ɫС��","��ɫС�Դ���","�ʴ���ըС��","�춹�ƽ��","ը���Ӹ�","�����ع���","�罷��ͷ","���ǲ���","�ɿ�����","��������","���ո���"};
	static String[] dishprice= {"45Ԫ","55Ԫ","45Ԫ","35Ԫ","45Ԫ","25Ԫ","35Ԫ","45Ԫ","45Ԫ","45Ԫ","25Ԫ","25Ԫ","45Ԫ","15Ԫ","35Ԫ","45Ԫ","45Ԫ","45Ԫ","45Ԫ","45Ԫ","25Ԫ","45Ԫ","45Ԫ","35Ԫ","45Ԫ","25Ԫ","15Ԫ","15Ԫ","15Ԫ","15Ԫ","45Ԫ","55Ԫ","15Ԫ","35Ԫ","45Ԫ","45Ԫ"};
	static double[] price= {45,55,45,35,45,25,35,45,45,45,25,25,45,15,35,45,45,45,45,45,25,45,45,35,45,25,15,15,15,15,45,55,15,45,45,25};
	
	static Container container=mainJFrame.getContentPane();
	
	
	public static void init()  {
		mainJFrame=new AdministratorSystem();
		container=mainJFrame.getContentPane();
		mainJFrame.setTitle("����Աϵͳ");
		mainJFrame.setBounds(0,0,1200,900);
		mainJFrame.setLocationRelativeTo(null);
		mainJFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		mainJFrame.setResizable(false);
		mainJFrame.addWindowListener(wlist);
		mainJFrame.setVisible(true);
		container.setLayout(null);
		container.setLayout(new BorderLayout());
		
		pn_menuPanel.removeAll();
		ShowPanel.removeAll();
		totalList.removeAll();
		
		totalList.setLayout(null);
		
	    totalList.add(makeRecordPanel());
		
		pn_menuPanel.setLayout(null);	
		for(int i=0;i<4;i++) {
			bt_ad_Menu[i]=new JButton(Menu[i]);
			bt_ad_Menu[i].setFont(new Font("��Բ",Font.BOLD,30));
			bt_ad_Menu[i].setBounds(25, 150+i*100, 200, 60);
			pn_menuPanel.add(bt_ad_Menu[i]);
			
		}
		
		JLabel lb_imageMenu=new JLabel(new ImageIcon("bg2.jpg"));
		lb_imageMenu.setBounds(0,0,250,700);
		pn_menuPanel.add(lb_imageMenu);
		
		ad_MenuDirect.addTab("�����˵�����", null,pn_menuPanel , "");
		ad_MenuDirect.setPreferredSize(new Dimension(250,700));
		ad_MenuDirect.setBounds(0, 100, 250, 700);
		container.add(ad_MenuDirect);

		
		
		
		
		
		customerList.setLayout(null);
		
		
	
		
		for(int i=0;i<50;i++) {
			customerList.removeAll();
			customer[i]=new JButton(""+(i+1)+"");
			customer[i].setFont(new Font("��Բ",Font.BOLD,14));
			customer[i].setBounds((25+ ((i%8)*50+(i%8)*50)),(15+ ((i/8)*50+(i/8)*50)), 50, 50);
			customerList.add(customer[i]);
			customer[i].addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int i=0,j;
					JButton bt=(JButton)e.getSource();
					for(j=0;j<50;j++)
					{
						if(bt==customer[j])
						{
							i=j;
							break;
						}
					}
					
					if(j<36)
					{
						customerList.removeAll();
						customerList.add(makeRecordPanel2((i+1)));
						ShowPanel.removeAll();
						ShowPanel.addTab(Menu[1], null,customerList , "");
					}
				}
				
			});
		}
		
		
		ShowPanel.addTab(Menu[0], null,totalList , "");
		container.add(ShowPanel);
		ShowPanel.setBounds(300, 100, 850, 700);
		
		
		JLabel lb_image=new JLabel(new ImageIcon("bg4.jpg"));
		lb_image.setBounds(0,0,900,600);
		container.add(lb_image);
		
		
		
		
		
		
		
		
		
		
		
		
		bt_ad_Menu[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				ShowPanel.removeAll();
				ShowPanel.addTab(Menu[0], null,totalList , "");
			}
			});
		
		bt_ad_Menu[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				customerList.removeAll();
				for(int i=0;i<50;i++) {
					customer[i].setFont(new Font("��Բ",Font.BOLD,14));
					customer[i].setBounds((25+ ((i%8)*50+(i%8)*50)),(15+ ((i/8)*50+(i/8)*50)), 50, 50);
					customerList.add(customer[i]);
				}
				
				ShowPanel.removeAll();
				ShowPanel.addTab(Menu[1], null,customerList , "");
				
			}
			});
		
		bt_ad_Menu[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				mainJFrame.dispose();
				System.exit(0);
				
			}
			});
		
		bt_ad_Menu[3].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				mainJFrame.dispose();
				LoginWindows.init();
				
			}
			});
		
		

		
	}
	
	public static Component makeRecordPanel2(int i) {
		
		String[][] aa=new String [1000000][6];
		int j=0,k=0;
	    BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("00"+i+".doc"));
			String s;
	    try {
			while((s=in.readLine())!=null) {
				aa[j][k++]=new String(s);
				if(k==6) {
					j++;
					k=0;
				}
			}
			in.close();
		} catch (IOException e1) {
				// TODO Auto-generated catch block
		}
		} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
			}
			
       
		JPanel panel3=new JPanel();
		DefaultTableModel tableModel=new DefaultTableModel(aa,dishListName);
		JTable table =new JTable(tableModel);
		JScrollPane scrollpane3=new JScrollPane(table);
		GridBagLayout gridbag=new GridBagLayout();
		GridBagConstraints constraints=new GridBagConstraints();	
		constraints.fill=GridBagConstraints.BOTH;
			
		constraints.anchor=constraints.NORTHWEST;
		scrollpane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			
		panel3.setLayout(gridbag);
			
			
		constraints.weightx=1;
		constraints.weighty=5;
		constraints.gridwidth=GridBagConstraints.REMAINDER;
		gridbag.setConstraints(scrollpane3,constraints);
		panel3.add(scrollpane3);
		
		


		panel3.setBounds(0, 0, 850, 700);
		return panel3;
	}
	
	public static Component makeRecordPanel() {
		
		String[][] a=new String [1000000][6];
		int j=0,k=0;
		for(int i=1;i<=50;i++) {
	        BufferedReader in;
			try {
				in = new BufferedReader(new FileReader("00"+i+".doc"));
				String s;
	        try {
				while((s=in.readLine())!=null) {
					a[j][k++]=new String(s);
					if(k==6) {
						j++;
						k=0;
					}
				}
				in.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
			}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
			}
        }
		JPanel panel2=new JPanel();
		DefaultTableModel tableModel=new DefaultTableModel(a,dishListName);
		JTable table =new JTable(tableModel);
		JScrollPane scrollpane2=new JScrollPane(table);
		GridBagLayout gridbag=new GridBagLayout();
		GridBagConstraints constraints=new GridBagConstraints();	
		constraints.fill=GridBagConstraints.BOTH;
			
		constraints.anchor=constraints.NORTHWEST;
		scrollpane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			
		panel2.setLayout(gridbag);
			
			
		constraints.weightx=1;
		constraints.weighty=5;
		constraints.gridwidth=GridBagConstraints.REMAINDER;
		gridbag.setConstraints(scrollpane2,constraints);
		panel2.add(scrollpane2);
		
		


		panel2.setBounds(0, 0, 850, 700);
		return panel2;
	}

}