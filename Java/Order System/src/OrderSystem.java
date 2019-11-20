import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import java.text.DateFormat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
@SuppressWarnings("serial")
public class OrderSystem extends JFrame implements ActionListener{
	static OrderSystem mainJFrame=new OrderSystem();
	static OWinListener wlist=new OWinListener();
	static double total;
	static int num[]=new int[36];
	static JPanel PN_Dish1=new JPanel();
	static JPanel PN_Dish2=new JPanel();
	static JPanel PN_Dish3=new JPanel();
	static JPanel PN_Dish4=new JPanel();
	static JPanel PN_Dish5=new JPanel();
	static JPanel PN_Dish6=new JPanel();
	static JTabbedPane JTabPN_Dish=new JTabbedPane();
	static JTabbedPane MenuDirect=new JTabbedPane();
	
	
	
	static JPanel panel=new JPanel();
	
	
	static JPanel pn_menuPanel=new JPanel();
	static JPanel[] lb_dishButton=new JPanel[36];
		
	static JLabel lb_welcome=new JLabel("***吃得好餐厅欢迎您***");
	static JLabel lb_orderListLabel=new JLabel("请选择桌号：");
	static JLabel lb_orderPeoplesLabel=new JLabel("请输入用餐人数：");
	static JLabel lb_orderMenuListLabel=new JLabel("已点菜式列表：");
	static JLabel lb_totalBill=new JLabel("账单总额："+total+"元");
	static JLabel[] lb_num=new JLabel[36];
	
	static JLabel[] lb_dish=new JLabel[36];
	
	static JButton[] bt_dishImage=new JButton[36];
	
	static JTextField tf_orderPeoplesLabel=new JTextField();
		
	static JButton[]	bt_dishadd=new JButton[36];
	static JButton[]	bt_dishreduce=new JButton[36];
	static JCheckBox[] jck_dishchoose=new JCheckBox[36];
		
	static JButton bt_cancel=new JButton("取消");
	static JButton bt_Orders=new JButton("下单");
	static JButton bt_addOrder=new JButton("加单");
	static JButton bt_checkOut=new JButton("结账");	
	static JButton[] bt_Menu=new JButton[6];
	static JButton[] bt_dish=new JButton[36];
	
	static String[] dishListName= {"菜品","数量","金额"};
	static String[] Menu= {"热销菜式","川菜","拌菜","点心","家常菜","小吃"};
	static String[] deskNum= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};
	static String[] dishName= {"布袋回锅肉","剁椒鱼头","辣子鸡","麻婆豆腐","烤鱼","豆干","火龙果炒澳带","老卤酱牛肉","凉拌金针菇","凉拌秋葵","蔬果杂烩拌菜","西柚大拌菜","叉烧酥点心","焦糖布丁","螺旋藻水饺点心","巧克力块","韭菜盒子点心","水果糯点心","干煸肉丝","宫爆鸡丁","红烧鸽子","芥菜肉汤","蒜苔炒腊肉","鱼香茄子","牛排小吃","陕北特色小吃","特色小吃春卷","鲜脆油炸小吃","红豆黄金饼","炸柿子糕","布袋回锅肉","剁椒鱼头","焦糖布丁","巧克力块","宫爆鸡丁","红烧鸽子"};
	static String[] dishprice= {"45元","55元","45元","35元","45元","25元","35元","45元","45元","45元","25元","25元","45元","15元","35元","45元","45元","45元","45元","45元","25元","45元","45元","35元","45元","25元","15元","15元","15元","15元","45元","55元","15元","35元","45元","45元"};
	static double[] price= {45,55,45,35,45,25,35,45,45,45,25,25,45,15,35,45,45,45,45,45,25,45,45,35,45,25,15,15,15,15,45,55,15,45,45,25};
	
	static Object[][] dishList=new Object[30][3];
	
	static JComboBox JCb_deskNum=new JComboBox(deskNum);
	static Container container=mainJFrame.getContentPane();
	
	static Dialog dialog=new Dialog(mainJFrame);

	public static void init() {
		mainJFrame.setTitle("点餐系统");
		mainJFrame.setBounds(0,0,1200,900);
		mainJFrame.setLocationRelativeTo(null);
		mainJFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		mainJFrame.setResizable(false);
		container.setLayout(null);
		container.setLayout(new BorderLayout());
		
		
		PN_Dish1.setLayout(null);
		PN_Dish2.setLayout(null);
		PN_Dish3.setLayout(null);
		PN_Dish4.setLayout(null);
		PN_Dish5.setLayout(null);
		PN_Dish6.setLayout(null);
		JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
		JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
		JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
		JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
		JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
		JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
		JTabPN_Dish.setBounds(250, 100, 600, 650);
		container.add(JTabPN_Dish);
		
		
		
		
		panel.setLayout(null);
		for(int i=0;i<36;i++) {
			num[i]=0;
		}
		for(int i=1;i<=36;i++){
			bt_dishImage[i-1]=new JButton();
			bt_dishImage[i-1].setIcon((new ImageIcon(new String(i+".jpg"))));
			bt_dishImage[i-1].addActionListener(new ActionListener(){
				@SuppressWarnings("resource")
				public void actionPerformed(ActionEvent e)
				{	
					int i=0,j;
					JButton bt=(JButton)e.getSource();
					for(j=0;j<36;j++)
					{
						if(bt==bt_dishImage[j])
						{
							i=j;
							break;
						}
					}
					
					if(j<36)
					{
						JButton bt_close=new JButton("关闭");
						String s=new String();
						try {
							s=new BufferedReader(new InputStreamReader(new FileInputStream(""+(i+1)+".doc"),"GB2312")).readLine();
						} catch (FileNotFoundException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						JTextArea jt=new JTextArea(s,10,20);
						jt.setBackground(null);
						jt.setOpaque(false);
						jt.setLineWrap(true);
						jt.setWrapStyleWord(true);
						jt.setLayout(new FlowLayout());
						jt.setEditable(false);
						jt.setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,22));
						jt.setForeground(Color.LIGHT_GRAY);
						bt_close.addActionListener(mainJFrame);
						bt_close.setBounds(350, 400, 100, 60);
						bt_close.setFont(new Font("幼圆",Font.BOLD,24));
						jt.setBounds(50, 100, 700, 300);
						dialog.removeAll();
						dialog.setLayout(null);
						dialog.setSize(800,500);
						dialog.add(bt_close);
						dialog.add(jt);
						dialog.setBounds(500, 300, 800, 500);
						dialog.setVisible(true);
						
						JLabel lb_image=new JLabel(new ImageIcon("dialog3.jpg"));
						lb_image.setBounds(0,0,800,500);
						dialog.add(lb_image);
						
					}
				}
			});
				
		}
		for(int i=0;i<36;i++){
			String str=new String(dishName[i]+"   "+dishprice[i]);
			lb_dish[i]=new JLabel(str);
			lb_dish[i].setSize(200, 50);
			
		}
		for(int i=0;i<36;i++){

			lb_num[i]=new JLabel("0");
			lb_num[i].setSize(40, 20);
			bt_dishadd[i]=new JButton("+");
			bt_dishadd[i].setSize(20, 20);
			bt_dishreduce[i]=new JButton("-");
			bt_dishreduce[i].setSize(20, 20);
			jck_dishchoose[i]=new JCheckBox();
			jck_dishchoose[i].setSize(20, 20);
			
		}
		for(int i=0;i<36;i++){
			lb_dishButton[i]=new JPanel(null);
			
			lb_dish[i].setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,20));
			bt_dishImage[i].setBounds(0,0,200, 200);
			lb_dish[i].setBounds(0, 200, 200, 50);
			jck_dishchoose[i].setBounds(0,250 , 30, 50);
			bt_dishreduce[i].setBounds(50,250 , 50, 40);
			lb_num[i].setBounds(110,250 , 40, 30);
			bt_dishadd[i].setBounds(150,250 , 50, 40);
			
			lb_dishButton[i].add(bt_dishImage[i]);
			lb_dishButton[i].add(lb_dish[i]);
			lb_dishButton[i].add(jck_dishchoose[i]);
			lb_dishButton[i].add(bt_dishreduce[i]);
			lb_dishButton[i].add(lb_num[i]);
			lb_dishButton[i].add(bt_dishadd[i]);
			
			
			PN_Dish2.add(lb_dishButton[i]);
			if(i<6) {
				PN_Dish2.add(lb_dishButton[i]);
				if(i==0)
					lb_dishButton[i].setBounds(0, 0, 200, 300);
				if(i==1)
					lb_dishButton[i].setBounds(200, 0, 200, 300);
				if(i==2)
					lb_dishButton[i].setBounds(400, 0, 200, 300);
				if(i==3)
					lb_dishButton[i].setBounds(0, 300, 200, 300);
				if(i==4)
					lb_dishButton[i].setBounds(200, 300, 200, 300);
				if(i==5)
					lb_dishButton[i].setBounds(400, 300, 200, 300);
			}
			if(i>=6&&i<12) {
				PN_Dish3.add(lb_dishButton[i]);
				if(i==6)
					lb_dishButton[i].setBounds(0, 0, 200, 300);
				if(i==7)
					lb_dishButton[i].setBounds(200, 0, 200, 300);
				if(i==8)
					lb_dishButton[i].setBounds(400, 0, 200, 300);
				if(i==9)
					lb_dishButton[i].setBounds(0, 300, 200, 300);
				if(i==10)
					lb_dishButton[i].setBounds(200, 300, 200, 300);
				if(i==11)
					lb_dishButton[i].setBounds(400, 300, 200, 300);
			}
			if(i>=12&&i<18) {
				PN_Dish4.add(lb_dishButton[i]);
				if(i==12)
					lb_dishButton[i].setBounds(0, 0, 200, 300);
				if(i==13)
					lb_dishButton[i].setBounds(200, 0, 200, 300);
				if(i==14)
					lb_dishButton[i].setBounds(400, 0, 200, 300);
				if(i==15)
					lb_dishButton[i].setBounds(0, 300, 200, 300);
				if(i==16)
					lb_dishButton[i].setBounds(200, 300, 200, 300);
				if(i==17)
					lb_dishButton[i].setBounds(400, 300, 200, 300);
			}
			if(i>=18&&i<24) {
				PN_Dish5.add(lb_dishButton[i]);
				if(i==18)
					lb_dishButton[i].setBounds(0, 0, 200, 300);
				if(i==19)
					lb_dishButton[i].setBounds(200, 0, 200, 300);
				if(i==20)
					lb_dishButton[i].setBounds(400, 0, 200, 300);
				if(i==21)
					lb_dishButton[i].setBounds(0, 300, 200, 300);
				if(i==22)
					lb_dishButton[i].setBounds(200, 300, 200, 300);
				if(i==23)
					lb_dishButton[i].setBounds(400, 300, 200, 300);
			}
			if(i>=24&&i<30) {
				PN_Dish6.add(lb_dishButton[i]);
				if(i==24)
					lb_dishButton[i].setBounds(0, 0, 200, 300);
				if(i==25)
					lb_dishButton[i].setBounds(200, 0, 200, 300);
				if(i==26)
					lb_dishButton[i].setBounds(400, 0, 200, 300);
				if(i==27)
					lb_dishButton[i].setBounds(0, 300, 200, 300);
				if(i==28)
					lb_dishButton[i].setBounds(200, 300, 200, 300);
				if(i==29)
					lb_dishButton[i].setBounds(400, 300, 200, 300);
			}
			if(i>=30&&i<36) {
				PN_Dish1.add(lb_dishButton[i]);
				if(i==30)
					lb_dishButton[i].setBounds(0, 0, 200, 300);
				if(i==31)
					lb_dishButton[i].setBounds(200, 0, 200, 300);
				if(i==32)
					lb_dishButton[i].setBounds(400, 0, 200, 300);
				if(i==33)
					lb_dishButton[i].setBounds(0, 300, 200, 300);
				if(i==34)
					lb_dishButton[i].setBounds(200, 300, 200, 300);
				if(i==35)
					lb_dishButton[i].setBounds(400, 300, 200, 300);
			}
			
			
			{
				bt_dishadd[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{	
						int i=0,j=0,status=0;
						JButton bt=(JButton)e.getSource();
						for(j=0;j<36;j++)
						{
							if(bt==bt_dishadd[j])
							{
								i=j;
								break;
							}
						}
						if(i==0)
						{
							j=30;
							status=1;
						}
						if(i==1)
						{
							j=31;
							status=1;
						}
						if(i==13)
						{
							j=32;
							status=1;
						}
						if(i==15)
						{
							j=33;
							status=1;
						}
						if(i==19)
						{
							j=34;
							status=1;
						}
						if(i==20)
						{
							j=35;
							status=1;
						}
						if(i==30)
						{
							j=0;
							status=1;
						}
						if(i==31)
						{
							j=1;
							status=1;
						}
						if(i==32)
						{
							j=13;
							status=1;
						}
						if(i==33)
						{
							j=15;
							status=1;
						}
						if(i==34)
						{
							j=19;
							status=1;
						}
						if(i==35)
						{
							j=20;
							status=1;
						}
						if(j<36)
						{
							if(num[i]==0) {
								jck_dishchoose[i].setSelected(true);
								if(status==1)
								{
									jck_dishchoose[j].setSelected(true);
								}
								
							}
							num[i]++;
							if(status==1)
							{
								num[j]++;
							}
							
							total+=price[i];
							lb_totalBill.setText("账单总额："+total+"元");
							String str=new String(""+num[i]+"");
							lb_num[i].setText(str);
							if(status==1)
							{
								String str1=new String(""+num[j]+"");
								lb_num[j].setText(str1);
							}
							
							UPdate();
						}
						
					}
				});
				
				bt_dishreduce[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						int i=0,j=0,status=0;;
						JButton bt=(JButton)e.getSource();
						for(j=0;j<36;j++)
						{
							if(bt==bt_dishreduce[j])
							{
								i=j;
								break;
							}
						}
						if(i==0)
						{
							j=30;
							status=1;
						}
						if(i==1)
						{
							j=31;
							status=1;
						}
						if(i==13)
						{
							j=32;
							status=1;
						}
						if(i==15)
						{
							j=33;
							status=1;
						}
						if(i==19)
						{
							j=34;
							status=1;
						}
						if(i==20)
						{
							j=35;
							status=1;
						}
						if(i==30)
						{
							j=0;
							status=1;
						}
						if(i==31)
						{
							j=1;
							status=1;
						}
						if(i==32)
						{
							j=13;
							status=1;
						}
						if(i==33)
						{
							j=15;
							status=1;
						}
						if(i==34)
						{
							j=19;
							status=1;
						}
						if(i==35)
						{
							j=20;
							status=1;
						}
						if(j<36)
						{
							if(num[i]>1) {
								num[i]--;
								if(status==1)
								{
									num[j]--;
								}
								
								total-=price[i];
								lb_totalBill.setText("账单总额："+total+"元");
								String str=new String(""+num[i]+"");
								lb_num[i].setText(str);
								if(status==1)
								{
									String str1=new String(""+num[j]+"");
									lb_num[j].setText(str1);
								}
								
							}
								
							else if(num[i]>0){
								num[i]--;
								if(status==1)
								{
									num[j]--;
								}
								
								total-=price[i];
								lb_totalBill.setText("账单总额："+total+"元");
								String str=new String(""+num[i]+"");
								lb_num[i].setText(str);
								if(status==1)
								{
									String str1=new String(""+num[j]+"");
									lb_num[j].setText(str1);
									jck_dishchoose[j].setSelected(false);
								}
								
								jck_dishchoose[i].setSelected(false);
								
							}
							UPdate();
						}
					}
					});
				
				jck_dishchoose[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						int i=0,j=0,status=0;
						JCheckBox bt=(JCheckBox)e.getSource();
						for(j=0;j<36;j++)
						{
							if(bt==jck_dishchoose[j])
							{
								i=j;
								break;
							}
						}
						if(i==0)
						{
							j=30;
							status=1;
						}
						if(i==1)
						{
							j=31;
							status=1;
						}
						if(i==13)
						{
							j=32;
							status=1;
						}
						if(i==15)
						{
							j=33;
							status=1;
						}
						if(i==19)
						{
							j=34;
							status=1;
						}
						if(i==20)
						{
							j=35;
							status=1;
						}
						if(i==30)
						{
							j=0;
							status=1;
						}
						if(i==31)
						{
							j=1;
							status=1;
						}
						if(i==32)
						{
							j=13;
							status=1;
						}
						if(i==33)
						{
							j=15;
							status=1;
						}
						if(i==34)
						{
							j=19;
							status=1;
						}
						if(i==35)
						{
							j=20;
							status=1;
						}
						if(j<36)
						{
							if(!jck_dishchoose[i].isSelected()) {		
								total-=num[i]*price[i];
								num[i]=0;
								if(status==1)
								{
									num[j]=0;
								}
								
								lb_totalBill.setText("账单总额："+total+"元");
								String str=new String(""+num[i]+"");
								lb_num[i].setText(str);
								if(status==1)
								{
									String str1=new String(""+num[j]+"");
									lb_num[j].setText(str1);
									jck_dishchoose[j].setSelected(false);
								}
								
							}
								
							else {
								if(num[i]==0) {
									num[i]++;
									if(status==1)
									{
										num[j]++;
									}
									
									total+=price[i];
									lb_totalBill.setText("账单总额："+total+"元");
									String str=new String(""+num[i]+"");
									lb_num[i].setText(str);
									if(status==1)
									{
										String str1=new String(""+num[j]+"");
										lb_num[j].setText(str1);
										jck_dishchoose[j].setSelected(true);
									}
									
								}
							}
							UPdate();
						}
					}
					});
			}
		}
	
		lb_welcome.setBounds(400, 0, 800, 100);
		lb_welcome.setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,36));
		lb_welcome.setForeground(Color.orange);
		panel.add(lb_welcome);
		
		bt_cancel.setBounds(300, 800, 100, 50);
		bt_Orders.setBounds(450, 800, 100, 50);
		bt_addOrder.setBounds(600,800, 100,50);
		bt_checkOut.setBounds(750, 800, 100, 50);
		panel.add(bt_cancel);
		panel.add(bt_Orders);
		panel.add(bt_addOrder);
		panel.add(bt_checkOut);
		
		pn_menuPanel.setLayout(null);	
		for(int i=0;i<6;i++) {
			bt_Menu[i]=new JButton(Menu[i]);
			bt_Menu[i].setBounds(30, 10+i*100, 160, 50);
			pn_menuPanel.add(bt_Menu[i]);
			
		}
		
		JLabel lb_imageMenu=new JLabel(new ImageIcon("bg21.jpg"));
		lb_imageMenu.setBounds(0,0,240,650);
		pn_menuPanel.add(lb_imageMenu);
		
		MenuDirect.addTab("菜式导航", null,pn_menuPanel , "");
		MenuDirect.setPreferredSize(new Dimension(230,650));
		MenuDirect.setBounds(0, 100, 240, 650);
		panel.add(MenuDirect);
		
		lb_orderListLabel.setBounds(900, 100, 150, 50);
		lb_orderListLabel.setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,20));
		lb_orderListLabel.setForeground(Color.green);
		panel.add(lb_orderListLabel);
		
		JCb_deskNum.setBounds(900, 150, 150, 30);
		panel.add(JCb_deskNum);
		
		lb_orderPeoplesLabel.setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,20));
		panel.add(lb_orderPeoplesLabel);
		
		lb_orderPeoplesLabel.setBounds(900,200,200,50);
		lb_orderPeoplesLabel.setForeground(Color.green);
		panel.add(tf_orderPeoplesLabel);
		
		tf_orderPeoplesLabel.setBounds(900, 250, 150, 30);
		lb_orderMenuListLabel.setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,20));
		panel.add(lb_orderMenuListLabel);
		
		lb_totalBill.setFont(new Font("叶根友毛笔行书2.0版",Font.BOLD,20));
		panel.add(lb_totalBill);
		
		lb_totalBill.setBounds(900,750,200,50);
		lb_totalBill.setForeground(Color.green);
		
		
		
		JLabel lb_image=new JLabel(new ImageIcon("bg6.jpg"));
		lb_image.setBounds(0,0,1200,900);
		panel.add(lb_image);
		
		
		container.add(makeRecordPanel());
		container.add(panel);
		mainJFrame.addWindowListener(wlist);
		mainJFrame.setVisible(true);
		
	
		
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////		
		
		bt_cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				for(int i=0;i<36;i++) {
					num[i]=0;
					jck_dishchoose[i].setSelected(false);
					lb_dishButton[i].remove(jck_dishchoose[i]);
					lb_dishButton[i].add(jck_dishchoose[i]);
					String str=new String(""+num[i]+"");
					lb_num[i].setText(str);
				}
				total=0;
				lb_totalBill.setText("账单总额："+total+"元");
				container.removeAll();
				container.add(JTabPN_Dish);
				container.add(panel);
				UPdate();
			}
			});
		
		bt_Orders.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String i=JCb_deskNum.getSelectedItem().toString();
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					DataOutputStream dos=new DataOutputStream(new FileOutputStream("00"+i+".doc"));
					BufferedWriter bw = new BufferedWriter(new FileWriter("00"+i+".doc"));


					for(int j=0;j<30;j++) {
						String desknum=new String(JCb_deskNum.getSelectedItem().toString());
						int people=0;
						if(!tf_orderPeoplesLabel.getText().equals(""))
						{
							people=Integer.parseInt(tf_orderPeoplesLabel.getText());
						}
						String time=getTime();
						int number=	num[j];
						if(num[j]==0)
							continue;
						String dish=new String(dishName[j]);
						double total=number*price[j];
						
						bw.write(desknum+"\n");
						bw.write(String.valueOf(people)+"\n");
						bw.write(time+"\n");
						bw.write(dish+"\n");
						bw.write(String.valueOf(number)+"\n");
						bw.write(String.valueOf(total)+"\n");
						
					}
					bw.close();
					dos.close();
					br.close();

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		bt_addOrder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				for(int i=0;i<36;i++) {
					num[i]=0;
					jck_dishchoose[i].setSelected(false);
					lb_dishButton[i].remove(jck_dishchoose[i]);
					lb_dishButton[i].add(jck_dishchoose[i]);
					String str=new String(""+num[i]+"");
					lb_num[i].setText(str);
				}
				container.removeAll();
				container.add(JTabPN_Dish);
				container.add(panel);
				UPdate();
			}
			});
		
		bt_checkOut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				for(int i=0;i<36;i++) {
					num[i]=0;
					jck_dishchoose[i].setSelected(false);
					lb_dishButton[i].remove(jck_dishchoose[i]);
					lb_dishButton[i].add(jck_dishchoose[i]);
					String str=new String(""+num[i]+"");
					lb_num[i].setText(str);
				}
				total=0;
				lb_totalBill.setText("账单总额："+total+"元");
				container.removeAll();
				container.add(JTabPN_Dish);
				container.add(panel);
				UPdate();
			}
			});
		
		
		
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		
		bt_Menu[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
				JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
				JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
				JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
				JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
				JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
			}
			});
		
		bt_Menu[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
				JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
				JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
				JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
				JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
				JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
			}
			});
		
		bt_Menu[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
				JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
				JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
				JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
				JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
				JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
			}
			});
		
		bt_Menu[3].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
				JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
				JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
				JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
				JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
				JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
			}
			});
		
		bt_Menu[4].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
				JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
				JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
				JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
				JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
				JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
			}
			});
		
		bt_Menu[5].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTabPN_Dish.addTab(Menu[5], null,PN_Dish6 , "");
				JTabPN_Dish.addTab(Menu[0], null,PN_Dish1 , "");
				JTabPN_Dish.addTab(Menu[1], null,PN_Dish2 , "");
				JTabPN_Dish.addTab(Menu[2], null,PN_Dish3 , "");
				JTabPN_Dish.addTab(Menu[3], null,PN_Dish4 , "");
				JTabPN_Dish.addTab(Menu[4], null,PN_Dish5 , "");
			}
			});
		
		

	}
	
	
	
	


	
	
	
	
	
	
	
	
	public static Component makeRecordPanel() {
		for(int j=0;j<30;j++) {
			dishList[j][0]=dishName[j];
		}
		
		for(int j=0;j<30;j++) {
			dishList[j][1]=num[j];
		}
		
		for(int j=0;j<30;j++) {
			dishList[j][2]=num[j]*price[j];
		}
		JPanel panel2=new JPanel();
		DefaultTableModel tableModel=new DefaultTableModel(dishList,dishListName);
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
		
		


		panel2.setBounds(900, 300, 250, 450);
		return panel2;
	}
	
	public static void UPdate() {
		
		for(int j=0;j<30;j++) {
			if(num[j]>0)
				dishList[j][0]=dishName[j];
		}

		for(int j=0;j<30;j++) {
			if(num[j]>0)
				dishList[j][1]=num[j];
		}

		for(int j=0;j<30;j++) {
			if(num[j]>0)
				dishList[j][2]=num[j]*price[j];
		}
		container.removeAll();
		container.add(JTabPN_Dish);
		container.add(makeRecordPanel());
		container.add(panel);
	}
	public static String getTime() {
		Date date1=new Date();
		DateFormat date=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		return date.format(date1);
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(((JButton)e.getSource()).getText().equals("关闭"))
		{
			dialog.dispose();
		}
	}
	
}
