
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Logout{

	private JFrame frmWelcomeTwitter;

	public Logout() {
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.setBackground(new Color(244, 244, 244));
		frmWelcomeTwitter.setForeground(new Color(82, 82, 82));
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setForeground(new Color(0, 64, 128));
		frmWelcomeTwitter.setBounds(100, 100, 450, 300);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(29, 161, 242));
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnLogin.setBounds(180, 145, 76, 40);
		frmWelcomeTwitter.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new goToLogin_action());
		
		JLabel PwdLabel = new JLabel("You are Logged Out");
		PwdLabel.setForeground(new Color(29, 161, 242));
		PwdLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		PwdLabel.setBounds(111, 94, 213, 45);
		frmWelcomeTwitter.getContentPane().add(PwdLabel);
		
		JLabel ImgLabel = new JLabel("");
		ImgLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		ImgLabel.setBounds(182, 36, 76, 60);
		frmWelcomeTwitter.getContentPane().add(ImgLabel);
		frmWelcomeTwitter.setVisible(true);
	}
	
	class goToLogin_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Gui_login();
			frmWelcomeTwitter.setVisible(false);
		}
	}
}
