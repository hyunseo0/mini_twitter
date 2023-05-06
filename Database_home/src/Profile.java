
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import javax.swing.JTextArea;
import javax.swing.DropMode;

public class Profile {

	JFrame frmWelcomeTwitter;
	TwitterJdbc so;
	
	
	Profile() {
		so = new TwitterJdbc();
		
		String id=so.get_ID();
		
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		JPanel Explorepanel = new JPanel();
		Explorepanel.setBackground(new Color(255, 255, 255));
		Explorepanel.setBounds(20, 20, 146, 41);
		frmWelcomeTwitter.getContentPane().add(Explorepanel);
		
		JLabel NameLabel = new JLabel("Profile");
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
		btnExplore.setBackground(new Color(255, 255, 255));
		btnExplore.setBounds(12, 10, 114, 29);
		btnExplore.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnExplore);
		
		btnExplore.addActionListener(new explore_action());
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBackground(new Color(235, 235, 235));
		btnProfile.setBounds(12, 44, 114, 29);
		btnProfile.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnProfile);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(255, 255, 255));
		btnLogout.setBounds(12, 78, 114, 29);
		btnLogout.setFont(new Font("Calibri", Font.BOLD, 15));
		Barpanel.add(btnLogout);
		
		btnLogout.addActionListener(new logout_action());
		
		JPanel searchpanel = new JPanel();
		searchpanel.setBorder(new LineBorder(new Color(42, 162, 242)));
		searchpanel.setBackground(new Color(255, 255, 255));
		searchpanel.setBounds(170, 20, 300, 412);
		frmWelcomeTwitter.getContentPane().add(searchpanel);
		searchpanel.setLayout(null);
		
		JButton btnProfile1 = new JButton();
		btnProfile1.setBounds(35, 20, 50, 50);
		searchpanel.add(btnProfile1);
		btnProfile1.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		
		JButton btnName1 = new JButton();
		btnName1.setBounds(91, 32, 164, 38);
		searchpanel.add(btnName1);
		btnName1.setBackground(new Color(255, 255, 255));
		btnName1.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JButton btnFollow1 = new JButton("following");
		btnFollow1.setBounds(49, 80, 105, 25);
		searchpanel.add(btnFollow1);

		btnFollow1.addActionListener(new seeFollowing_action()); //see followers function//
		
		btnFollow1.setFont(new Font("Calibri", Font.BOLD, 15));
		btnFollow1.setBackground(new Color(255, 255, 255));
		
		JButton btnFollower = new JButton("follower");
		btnFollower.setFont(new Font("Calibri", Font.BOLD, 15));
		btnFollower.setBackground(Color.WHITE);
		btnFollower.setBounds(166, 80, 105, 25);
		searchpanel.add(btnFollower);
		
		btnFollower.addActionListener(new seeFollowers_action()); //see followers function//
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Calibri", Font.BOLD, 15));
		textArea.setText("0");
		textArea.setBounds(86, 110, 70, 24);
		searchpanel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Calibri", Font.BOLD, 15));
		textArea_1.setText("1");
		textArea_1.setBounds(201, 110, 70, 24);
		searchpanel.add(textArea_1);
		
		JButton btnPost = new JButton("post");
		btnPost.setFont(new Font("Calibri", Font.BOLD, 15));
		btnPost.setBackground(Color.WHITE);
		btnPost.setBounds(49, 151, 105, 25);
		searchpanel.add(btnPost);
		
		JPanel postpanel1 = new JPanel();
		postpanel1.setBorder(new LineBorder(new Color(42, 162, 242)));
		postpanel1.setBackground(new Color(255, 255, 255));
		postpanel1.setBounds(24, 196, 250, 80);
		searchpanel.add(postpanel1);
		postpanel1.setLayout(null);
		
		JTextArea textName_1 = new JTextArea();
		textName_1.setBounds(15, 5, 59, 24);
		textName_1.setText("Hyunseo");
		textName_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		postpanel1.add(textName_1);
		
		JTextArea textcontent_1 = new JTextArea();
		textcontent_1.setBounds(18, 52, 101, 24);
		textcontent_1.setText("where are you?");
		textcontent_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		postpanel1.add(textcontent_1);
		
		JTextArea textRefer_1 = new JTextArea();
		textRefer_1.setBounds(20, 30, 11, 24);
		textRefer_1.setText("@");
		postpanel1.add(textRefer_1);
		
		JTextArea textRefername_1 = new JTextArea();
		textRefername_1.setBounds(35, 33, 33, 20);
		textRefername_1.setText("Sihun");
		textRefername_1.setFont(new Font("Calibri", Font.ITALIC, 13));
		postpanel1.add(textRefername_1);
		
		JPanel postpanel2 = new JPanel();
		postpanel2.setLayout(null);
		postpanel2.setBorder(new LineBorder(new Color(42, 162, 242)));
		postpanel2.setBackground(Color.WHITE);
		postpanel2.setBounds(24, 286, 250, 80);
		searchpanel.add(postpanel2);
		
		JTextArea textName2 = new JTextArea();
		textName2.setText("Hyunseo");
		textName2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textName2.setBounds(15, 5, 59, 24);
		postpanel2.add(textName2);
		
		JTextArea textcontent2 = new JTextArea();
		textcontent2.setText("I Love DB ! Last calss, I learned ..");
		textcontent2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textcontent2.setBounds(18, 30, 220, 40);
		postpanel2.add(textcontent2);
		
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.setBounds(100, 100, 500, 550);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.setVisible(true);
	}
	class seeFollowers_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new SeeFollowers();
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	class seeFollowing_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new SeeFollowing();
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
