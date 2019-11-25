import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuItemActionListener extends JFrame implements ActionListener {

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(((JMenuItem)e.getSource()).getText().equals("ÍË³öÏµÍ³"))
		{
			if(OrderSystem.oddStatus!=0)
			{
				OrderSystem.dialog.dispose();
				JButton bt_cancel1=new JButton("¹Ø±Õ");
				String s1=new String("ÇëÏÈ½áÕË£¡");
				JLabel jt1=new JLabel(s1);
				jt1.setFont(new Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ",Font.BOLD,40));
				jt1.setForeground(Color.LIGHT_GRAY);
				bt_cancel1.addActionListener(OrderSystem.mainJFrame);
				bt_cancel1.setBounds(300, 400, 120, 60);
				bt_cancel1.setFont(new Font("Ó×Ô²",Font.BOLD,24));
				
				
				jt1.setBounds(250, 100, 400, 300);
				
				OrderSystem.dialog.removeAll();
				OrderSystem.dialog.setLayout(null);
				OrderSystem.dialog.setSize(800,500);
				OrderSystem.dialog.add(bt_cancel1);

				OrderSystem.dialog.add(jt1);
				OrderSystem.dialog.setBounds(500, 300, 800, 500);
				OrderSystem.dialog.setVisible(true);
						
				JLabel lb_image1=new JLabel(new ImageIcon("dialog3.jpg"));
				lb_image1.setBounds(0,0,800,500);
				OrderSystem.dialog.add(lb_image1);
				return;
			}
			System.exit(0);
		}
		if(((JMenuItem)e.getSource()).getText().equals("ÍË³öµÇÂ¼"))
		{
			if(OrderSystem.oddStatus!=0)
			{
				OrderSystem.dialog.dispose();
				JButton bt_cancel1=new JButton("¹Ø±Õ");
				String s1=new String("ÇëÏÈ½áÕË£¡");
				JLabel jt1=new JLabel(s1);
				jt1.setFont(new Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ",Font.BOLD,40));
				jt1.setForeground(Color.LIGHT_GRAY);
				bt_cancel1.addActionListener(OrderSystem.mainJFrame);
				bt_cancel1.setBounds(300, 400, 120, 60);
				bt_cancel1.setFont(new Font("Ó×Ô²",Font.BOLD,24));
				
				
				jt1.setBounds(250, 100, 400, 300);
				
				OrderSystem.dialog.removeAll();
				OrderSystem.dialog.setLayout(null);
				OrderSystem.dialog.setSize(800,500);
				OrderSystem.dialog.add(bt_cancel1);

				OrderSystem.dialog.add(jt1);
				OrderSystem.dialog.setBounds(500, 300, 800, 500);
				OrderSystem.dialog.setVisible(true);
						
				JLabel lb_image1=new JLabel(new ImageIcon("dialog3.jpg"));
				lb_image1.setBounds(0,0,800,500);
				OrderSystem.dialog.add(lb_image1);
				return;
			}
			OrderSystem.mainJFrame.dispose();
			LoginWindows.init();
		}
		if(((JMenuItem)e.getSource()).getText().equals("ËÎÌå")||((JMenuItem)e.getSource()).getText().equals("Ó×Ô²")||((JMenuItem)e.getSource()).getText().equals("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ")||((JMenuItem)e.getSource()).getText().equals("ºÚ")||((JMenuItem)e.getSource()).getText().equals("À¶")||((JMenuItem)e.getSource()).getText().equals("»Ò")||((JMenuItem)e.getSource()).getText().equals("ÂÌ")||((JMenuItem)e.getSource()).getText().equals("³È")||((JMenuItem)e.getSource()).getText().equals("·Ûºì")||((JMenuItem)e.getSource()).getText().equals("ºì")||((JMenuItem)e.getSource()).getText().equals("»Æ"))
		{
			if(((JMenuItem)e.getSource()).getText().equals("ËÎÌå")||((JMenuItem)e.getSource()).getText().equals("Ó×Ô²")||((JMenuItem)e.getSource()).getText().equals("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ"))
			{
				OrderSystem.fontType=new String(((JMenuItem)e.getSource()).getText());
			}
			else
			{
				if(((JMenuItem)e.getSource()).getText().equals("ºÚ"))
				{
					OrderSystem.fontColor=Color.BLACK;
				}
				if(((JMenuItem)e.getSource()).getText().equals("À¶"))
				{
					OrderSystem.fontColor=Color.BLUE;
				}
				if(((JMenuItem)e.getSource()).getText().equals("»Ò"))
				{
					OrderSystem.fontColor=Color.GRAY;
				}
				if(((JMenuItem)e.getSource()).getText().equals("ÂÌ"))
				{
					OrderSystem.fontColor=Color.GREEN;
				}
				if(((JMenuItem)e.getSource()).getText().equals("³È"))
				{
					OrderSystem.fontColor=Color.ORANGE;
				}
				if(((JMenuItem)e.getSource()).getText().equals("·Ûºì"))
				{
					OrderSystem.fontColor=Color.PINK;
				}
				if(((JMenuItem)e.getSource()).getText().equals("ºì"))
				{
					OrderSystem.fontColor=Color.RED;
				}
				if(((JMenuItem)e.getSource()).getText().equals("»Æ"))
				{
					OrderSystem.fontColor=Color.YELLOW;
				}
				
				
			}
			OrderSystem.mainJFrame.dispose();
			OrderSystem.init();
		}
	}
	
}
