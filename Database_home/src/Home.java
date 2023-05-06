import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Home {

	String id;
	String result;
	JFrame frmWelcomeTwitter;
	JTextField textFieldWrite;
	TwitterJdbc so;
	JTextArea textcontent = new JTextArea(); //1st screen//
	JTextArea txtrImInAi = new JTextArea(); //2nd screen//
	
	Home(String input) {
		so = new TwitterJdbc();
		this.result = input;
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		JPanel Hipanel = new JPanel();
		Hipanel.setBackground(new Color(255, 255, 255));
		Hipanel.setBounds(20, 20, 146, 41);
		frmWelcomeTwitter.getContentPane().add(Hipanel);
		
		JLabel HiLabel = new JLabel("Hi! " + input);
		HiLabel.setForeground(new Color(29, 161, 242));
		HiLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		Hipanel.add(HiLabel);
		
		JPanel Barpanel = new JPanel();
		Barpanel.setBorder(new LineBorder(new Color(29, 162, 242)));
		Barpanel.setBackground(new Color(255, 255, 255));
		Barpanel.setBounds(20, 80, 138, 118);
		frmWelcomeTwitter.getContentPane().add(Barpanel);
		Barpanel.setLayout(null);
		
		JButton btnExplore = new JButton("Explore");
		btnExplore.setBackground(new Color(255, 255, 255));
		btnExplore.setBounds(12, 10, 114, 29);
		btnExplore.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnExplore);
		
		btnExplore.addActionListener(new explore_action());
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBackground(new Color(255, 255, 255));
		btnProfile.setBounds(12, 44, 114, 29);
		btnProfile.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnProfile);
		
		btnProfile.addActionListener(new profile_action());
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(255, 255, 255));
		btnLogout.setBounds(12, 78, 114, 29);
		btnLogout.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnLogout);
		
		btnLogout.addActionListener(new logout_action());
		
		JPanel postpanel = new JPanel();
		postpanel.setBorder(new LineBorder(new Color(29, 162, 242)));
		postpanel.setBackground(new Color(255, 255, 255));
		postpanel.setBounds(170, 260, 300, 240);
		frmWelcomeTwitter.getContentPane().add(postpanel);
		postpanel.setLayout(null);
		
		JPanel conentpanel = new JPanel();
		conentpanel.setBorder(new LineBorder(new Color(29, 162, 242)));
		conentpanel.setBackground(new Color(255, 255, 255));
		conentpanel.setBounds(15, 15, 270, 100);
		postpanel.add(conentpanel);
		conentpanel.setLayout(null);
		
		JTextArea textName = new JTextArea();
		textName.setFont(new Font("Calibri", Font.PLAIN, 15));
		textName.setBounds(12, 9, 65, 24);
		textName.setText(input);
		conentpanel.add(textName);
		
		textcontent.setFont(new Font("Calibri", Font.PLAIN, 15));
		textcontent.setText(" empty space");
		textcontent.setBounds(20, 55, 230, 35);
		conentpanel.add(textcontent);
		
		JTextArea textRefer = new JTextArea();
		textRefer.setText("@");
		textRefer.setBounds(20, 32, 20, 20);
		conentpanel.add(textRefer);
		
		JTextArea textRefername = new JTextArea();
		textRefername.setFont(new Font("Calibri", Font.ITALIC, 13));
		textRefername.setText("Sihun");
		textRefername.setBounds(40, 34, 60, 24);
		conentpanel.add(textRefername);
		
		JPanel conentpanel_1 = new JPanel();
		conentpanel_1.setLayout(null);
		conentpanel_1.setBorder(new LineBorder(new Color(29, 162, 242)));
		conentpanel_1.setBackground(Color.WHITE);
		conentpanel_1.setBounds(15, 125, 270, 100);
		postpanel.add(conentpanel_1);
		
		JTextArea txtrSihun = new JTextArea();
		txtrSihun.setText("Sihun");
		txtrSihun.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtrSihun.setBounds(12, 9, 65, 24);
		conentpanel_1.add(txtrSihun);
		
		txtrImInAi.setText(" empty space");
		txtrImInAi.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtrImInAi.setBounds(20, 55, 230, 35);
		conentpanel_1.add(txtrImInAi);
		
		JTextArea textRefer_1 = new JTextArea();
		textRefer_1.setText("@");
		textRefer_1.setBounds(20, 32, 20, 20);
		conentpanel_1.add(textRefer_1);
		

		JTextArea txtrHyunseo = new JTextArea();
		txtrHyunseo.setText(input);
		txtrHyunseo.setFont(new Font("Calibri", Font.ITALIC, 13));
		txtrHyunseo.setBounds(40, 34, 60, 24);
		conentpanel_1.add(txtrHyunseo);
		
		JPanel writepanel = new JPanel();
		writepanel.setBorder(new LineBorder(new Color(42, 162, 242)));
		writepanel.setBackground(new Color(255, 255, 255));
		writepanel.setBounds(170, 100, 300, 118);
		frmWelcomeTwitter.getContentPane().add(writepanel);
		writepanel.setLayout(null);
		//
		JTextArea textName_1 = new JTextArea();
		textName_1.setBounds(12, 10, 59, 24);
		textName_1.setText(input);
		textName_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		writepanel.add(textName_1);
		//
		textFieldWrite = new JTextField(40);
		textFieldWrite.setBounds(12, 35, 270, 50);
		writepanel.add(textFieldWrite);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(255, 255, 255));
		btnUpload.setFont(new Font("Calibri", Font.BOLD, 15));
		btnUpload.setBounds(190, 88, 90, 23);
		writepanel.add(btnUpload);
		
		btnUpload.addActionListener(new Upload_action());
		
		JTextArea txtrUpload = new JTextArea();
		txtrUpload.setForeground(new Color(42, 162, 242));
		txtrUpload.setFont(new Font("Calibri", Font.BOLD, 20));
		txtrUpload.setText("Upload");
		txtrUpload.setBounds(170, 70, 80, 24);
		frmWelcomeTwitter.getContentPane().add(txtrUpload);
		
		JTextArea txtrPost = new JTextArea();
		txtrPost.setText("Post");
		txtrPost.setForeground(new Color(42, 162, 242));
		txtrPost.setFont(new Font("Calibri", Font.BOLD, 20));
		txtrPost.setBounds(170, 227, 80, 24);
		frmWelcomeTwitter.getContentPane().add(txtrPost);
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.setBounds(100, 100, 500, 550);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.setVisible(true);
	}
	
	class Upload_action implements ActionListener //definition of login button event//
	{
		public void actionPerformed(ActionEvent e)
		{
			String uploadText=textFieldWrite.getText(); //gets information from textfield//
			String id = result;
			so.func_upload(id, uploadText); //start main class's function 이 곳에서 문제 발생..// // turn off current gui//
			textcontent.setText(so.func_getdata(id));
			txtrImInAi.setText(so.func_getdata2(id));
		}
	}
	
	class profile_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Profile();
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	class explore_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Explore();
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	class logout_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Logout();
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	
}


