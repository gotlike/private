import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class OWinListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
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
		OrderSystem.mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
