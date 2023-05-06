import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ChangePwd {

	JFrame frmWelcomeTwitter;
	JTextField CurrentPwdtextField;
	JTextField NewPwdtextfield;
	TwitterJdbc so;
	
	public ChangePwd() {
		so = new TwitterJdbc();
		
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.setBackground(new Color(244, 244, 244));
		frmWelcomeTwitter.setForeground(new Color(82, 82, 82));
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		//frmWelcomeTwitter.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setForeground(new Color(0, 64, 128));
		frmWelcomeTwitter.setBounds(100, 100, 450, 300);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		CurrentPwdtextField = new JTextField();
		CurrentPwdtextField.setBounds(215, 91, 96, 21);
		frmWelcomeTwitter.getContentPane().add(CurrentPwdtextField);
		CurrentPwdtextField.setColumns(10);
		
		NewPwdtextfield = new JTextField();
		NewPwdtextfield.setBounds(215, 118, 96, 21);
		frmWelcomeTwitter.getContentPane().add(NewPwdtextfield);
		NewPwdtextfield.setColumns(10);
		
		JLabel CurrentPwdLabel = new JLabel("Current Password");
		CurrentPwdLabel.setForeground(new Color(29, 161, 242));
		CurrentPwdLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		CurrentPwdLabel.setBounds(96, 91, 119, 21);
		frmWelcomeTwitter.getContentPane().add(CurrentPwdLabel);
		
		JLabel NewPwdLabel = new JLabel("New password");
		NewPwdLabel.setForeground(new Color(29, 161, 242));
		NewPwdLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		NewPwdLabel.setBounds(96, 119, 108, 30);
		frmWelcomeTwitter.getContentPane().add(NewPwdLabel);
		
		JButton btnRegister = new JButton("Apply");
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setForeground(new Color(128, 128, 128));
		btnRegister.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnRegister.setBounds(194, 206, 100, 30);
		frmWelcomeTwitter.getContentPane().add(btnRegister);
		
		btnRegister.addActionListener(new changePwd_action());
		
		JLabel ImgLabel = new JLabel("");
		ImgLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		ImgLabel.setIcon(new ImageIcon(login.class.getResource("/img/logo.png")));
		ImgLabel.setBounds(180, 10, 76, 60);
		frmWelcomeTwitter.getContentPane().add(ImgLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.GRAY);
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(122, 206, 67, 30);
		
		btnBack.addActionListener(new backToLogin_action());
		
		frmWelcomeTwitter.getContentPane().add(btnBack);
		frmWelcomeTwitter.setVisible(true);
	}

	class changePwd_action implements ActionListener //definition of login button event//
	{
		public void actionPerformed(ActionEvent e)
		{
			String CurrentPW=CurrentPwdtextField.getText(); //gets information from textfield//
			String NewPW=NewPwdtextfield.getText();
			
			so.func_changePwd(CurrentPW, NewPW); //start main class's function 이 곳에서 문제 발생..//
			frmWelcomeTwitter.setVisible(false); // turn off current gui//
		}
	}
	
	class backToLogin_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new login();
			frmWelcomeTwitter.setVisible(false);
		}
	}
}
