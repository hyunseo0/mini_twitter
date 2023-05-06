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

public class Register {

	JFrame frmWelcomeTwitter;
	JTextField NametextField;
	JTextField PhonetextField;
	JTextField IdtextField;
	JTextField PwdtextField;
	TwitterJdbc so;

	public Register() {
		so = new TwitterJdbc();
		
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.setBackground(new Color(244, 244, 244));
		frmWelcomeTwitter.setForeground(new Color(82, 82, 82));
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setForeground(new Color(0, 64, 128));
		frmWelcomeTwitter.setBounds(100, 100, 450, 300);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		NametextField = new JTextField();
		NametextField.setBounds(194, 80, 96, 21);
		frmWelcomeTwitter.getContentPane().add(NametextField);
		NametextField.setColumns(10);
		
		PhonetextField = new JTextField();
		PhonetextField.setBounds(194, 108, 96, 21);
		frmWelcomeTwitter.getContentPane().add(PhonetextField);
		PhonetextField.setColumns(10);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setForeground(new Color(29, 161, 242));
		NameLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		NameLabel.setBounds(122, 80, 57, 21);
		frmWelcomeTwitter.getContentPane().add(NameLabel);
		
		JLabel PhoneLabel = new JLabel("Phone");
		PhoneLabel.setForeground(new Color(29, 161, 242));
		PhoneLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		PhoneLabel.setBounds(122, 108, 81, 30);
		frmWelcomeTwitter.getContentPane().add(PhoneLabel);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setForeground(new Color(128, 128, 128));
		btnRegister.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnRegister.setBounds(194, 206, 100, 30);
		frmWelcomeTwitter.getContentPane().add(btnRegister);
		
		btnRegister.addActionListener(new register_action());
		
		JLabel ImgLabel = new JLabel("");
		ImgLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		ImgLabel.setIcon(new ImageIcon(login.class.getResource("/img/logo.png")));
		ImgLabel.setBounds(180, 10, 76, 60);
		frmWelcomeTwitter.getContentPane().add(ImgLabel);
		
		IdtextField = new JTextField();
		IdtextField.setColumns(10);
		IdtextField.setBounds(194, 136, 96, 21);
		frmWelcomeTwitter.getContentPane().add(IdtextField);
		
		JLabel IdLabel = new JLabel("ID");
		IdLabel.setForeground(new Color(29, 161, 242));
		IdLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		IdLabel.setBounds(122, 136, 81, 30);
		frmWelcomeTwitter.getContentPane().add(IdLabel);
		
		PwdtextField = new JTextField();
		PwdtextField.setColumns(10);
		PwdtextField.setBounds(194, 164, 96, 21);
		frmWelcomeTwitter.getContentPane().add(PwdtextField);
		
		JLabel PwdLabel = new JLabel("Password");
		PwdLabel.setForeground(new Color(29, 161, 242));
		PwdLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		PwdLabel.setBounds(122, 164, 81, 30);
		frmWelcomeTwitter.getContentPane().add(PwdLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.GRAY);
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(122, 206, 67, 30);
		frmWelcomeTwitter.getContentPane().add(btnBack);
		
		btnBack.addActionListener(new back_action());
		
		frmWelcomeTwitter.setVisible(true);
	}
	
	class register_action implements ActionListener //definition of login button event//
	{
		public void actionPerformed(ActionEvent e)
		{
			String name = NametextField.getText(); //gets information from textfield//
			String phone = PhonetextField.getText();
			String id = IdtextField.getText(); //gets information from textfield//
			String pwd = PwdtextField.getText();
			
			so.func_register(id, pwd, name, phone); //start main class's function 이 곳에서 문제 발생..//
		}
	}
	
	class back_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Gui_login();
			frmWelcomeTwitter.setVisible(false);
		}
	}
}
