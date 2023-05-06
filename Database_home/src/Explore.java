import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.sql.*;

public class Explore {

	JFrame frmWelcomeTwitter;
	JTextField textFieldWrite;
	TwitterJdbc so;

	Explore() {
		
		so = new TwitterJdbc();
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		JPanel Explorepanel = new JPanel();
		Explorepanel.setBackground(new Color(255, 255, 255));
		Explorepanel.setBounds(20, 20, 146, 41);
		frmWelcomeTwitter.getContentPane().add(Explorepanel);
		
		JLabel NameLabel = new JLabel("Explore");
		NameLabel.setForeground(new Color(29, 161, 242));
		NameLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		Explorepanel.add(NameLabel);
		
		JPanel Barpanel = new JPanel();
		Barpanel.setBorder(new LineBorder(new Color(29, 162, 242)));
		Barpanel.setBackground(new Color(255, 255, 255));
		Barpanel.setBounds(20, 80, 138, 118);
		frmWelcomeTwitter.getContentPane().add(Barpanel);
		Barpanel.setLayout(null);
		
		JButton btnExplore = new JButton("Explore");
		btnExplore.setBackground(new Color(235, 235, 235));
		btnExplore.setBounds(12, 10, 114, 29);
		btnExplore.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnExplore);
		
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
		
		JPanel searchpanel = new JPanel();
		searchpanel.setBorder(new LineBorder(new Color(42, 162, 242)));
		searchpanel.setBackground(new Color(255, 255, 255));
		searchpanel.setBounds(170, 80, 300, 412);
		frmWelcomeTwitter.getContentPane().add(searchpanel);
		searchpanel.setLayout(null);
		
		textFieldWrite = new JTextField();
		textFieldWrite.setText("Hyun");
		textFieldWrite.setBounds(12, 10, 226, 29);
		searchpanel.add(textFieldWrite);
		textFieldWrite.setColumns(10);
		
		JButton btnUpload = new JButton("");
		btnUpload.setIcon(new ImageIcon(Explore.class.getResource("/img/search.png")));
		btnUpload.setBackground(new Color(255, 255, 255));
		btnUpload.setFont(new Font("Calibri", Font.BOLD, 10));
		btnUpload.setBounds(246, 12, 29, 29);
		searchpanel.add(btnUpload);
		
		JPanel searchpersonpanel1 = new JPanel();
		searchpersonpanel1.setBorder(new LineBorder(new Color(42, 162, 242)));
		searchpersonpanel1.setBackground(new Color(255, 255, 255));
		searchpersonpanel1.setBounds(25, 80, 250, 70);
		searchpanel.add(searchpersonpanel1);
		searchpersonpanel1.setLayout(null);
		
		JButton btnFollow1 = new JButton("Unfollow");
		btnFollow1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFollow1.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow1.setBackground(new Color(255, 255, 255));
		btnFollow1.setBounds(163, 22, 75, 21);
		searchpersonpanel1.add(btnFollow1);
		
		JButton btnProfile1 = new JButton("");
		btnProfile1.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile1.setBounds(10, 10, 50, 50);
		searchpersonpanel1.add(btnProfile1);
		
		JButton btnName1 = new JButton("Hyunseo");
		btnName1.setBackground(new Color(255, 255, 255));
		btnName1.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName1.setBounds(69, 22, 91, 23);
		searchpersonpanel1.add(btnName1);
		
		JPanel searchpersonpanel2 = new JPanel();
		searchpersonpanel2.setLayout(null);
		searchpersonpanel2.setBorder(new LineBorder(new Color(42, 162, 242)));
		searchpersonpanel2.setBackground(Color.WHITE);
		searchpersonpanel2.setBounds(25, 160, 250, 70);
		searchpanel.add(searchpersonpanel2);
		
		JButton btnFollow2 = new JButton("Follow");
		btnFollow2.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow2.setBackground(Color.WHITE);
		btnFollow2.setBounds(163, 22, 75, 21);
		searchpersonpanel2.add(btnFollow2);
		
		JButton btnProfile2 = new JButton("");
		btnProfile2.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile2.setBounds(10, 10, 50, 50);
		searchpersonpanel2.add(btnProfile2);
		
		JButton btnName2 = new JButton("Hyunsu");
		btnName2.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName2.setBackground(Color.WHITE);
		btnName2.setBounds(69, 22, 91, 23);
		searchpersonpanel2.add(btnName2);
		
		JPanel searchpersonpanel3 = new JPanel();
		searchpersonpanel3.setLayout(null);
		searchpersonpanel3.setBorder(new LineBorder(new Color(42, 162, 242)));
		searchpersonpanel3.setBackground(Color.WHITE);
		searchpersonpanel3.setBounds(25, 240, 250, 70);
		searchpanel.add(searchpersonpanel3);
		
		JButton btnFollow3 = new JButton("Follow");
		btnFollow3.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow3.setBackground(Color.WHITE);
		btnFollow3.setBounds(163, 22, 75, 21);
		searchpersonpanel3.add(btnFollow3);
		
		JButton btnProfile3 = new JButton("");
		btnProfile3.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile3.setBounds(10, 10, 50, 50);
		searchpersonpanel3.add(btnProfile3);
		
		JButton btnName3 = new JButton("Hyunju");
		btnName3.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName3.setBackground(Color.WHITE);
		btnName3.setBounds(69, 22, 91, 23);
		searchpersonpanel3.add(btnName3);
		
		JPanel searchpersonpanel4 = new JPanel();
		searchpersonpanel4.setLayout(null);
		searchpersonpanel4.setBorder(new LineBorder(new Color(42, 162, 242)));
		searchpersonpanel4.setBackground(Color.WHITE);
		searchpersonpanel4.setBounds(25, 317, 250, 70);
		searchpanel.add(searchpersonpanel4);
		
		JButton btnFollow4 = new JButton("Follow");
		btnFollow4.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow4.setBackground(Color.WHITE);
		btnFollow4.setBounds(163, 22, 75, 21);
		searchpersonpanel4.add(btnFollow4);
		
		JButton btnProfile4 = new JButton("");
		btnProfile4.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile4.setBounds(10, 10, 50, 50);
		searchpersonpanel4.add(btnProfile4);
		
		JButton btnName4 = new JButton("Hyunzi");
		btnName4.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName4.setBackground(Color.WHITE);
		btnName4.setBounds(69, 22, 91, 23);
		searchpersonpanel4.add(btnName4);
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.setBounds(100, 100, 500, 550);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.setVisible(true);
	}
	
	class profile_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Profile();
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
