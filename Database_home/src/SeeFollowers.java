
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
import javax.swing.border.LineBorder;

public class SeeFollowers {

	private JFrame frmWelcomeTwitter;
	TwitterJdbc so;

	SeeFollowers() {
		so = new TwitterJdbc();
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setLayout(null);
		
		JPanel Followingpanel = new JPanel();
		Followingpanel.setBackground(new Color(255, 255, 255));
		Followingpanel.setBounds(20, 20, 146, 41);
		frmWelcomeTwitter.getContentPane().add(Followingpanel);
		
		JLabel NameLabel = new JLabel("Followers");
		NameLabel.setForeground(new Color(29, 161, 242));
		NameLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		Followingpanel.add(NameLabel);
		
		JPanel Followingpagepanel = new JPanel();
		Followingpagepanel.setBorder(new LineBorder(new Color(42, 162, 242)));
		Followingpagepanel.setBackground(new Color(255, 255, 255));
		Followingpagepanel.setBounds(70, 71, 336, 418);
		frmWelcomeTwitter.getContentPane().add(Followingpagepanel);
		Followingpagepanel.setLayout(null);
		
		JPanel followingpersonpanel1 = new JPanel();
		followingpersonpanel1.setLayout(null);
		followingpersonpanel1.setBorder(new LineBorder(new Color(42, 162, 242)));
		followingpersonpanel1.setBackground(Color.WHITE);
		followingpersonpanel1.setBounds(39, 21, 250, 70);
		Followingpagepanel.add(followingpersonpanel1);
		
		JButton btnFollow11 = new JButton("Unfollow");
		btnFollow11.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow11.setBackground(Color.WHITE);
		btnFollow11.setBounds(163, 22, 75, 21);
		followingpersonpanel1.add(btnFollow11);
		
		JButton btnProfile11 = new JButton("");
		btnProfile11.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile11.setBounds(10, 10, 50, 50);
		followingpersonpanel1.add(btnProfile11);
		
		JButton btnName11 = new JButton("Sihun");
		btnName11.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName11.setBackground(Color.WHITE);
		btnName11.setBounds(69, 22, 91, 23);
		followingpersonpanel1.add(btnName11);
		
		JPanel followingpersonpanel2 = new JPanel();
		followingpersonpanel2.setLayout(null);
		followingpersonpanel2.setBorder(new LineBorder(new Color(42, 162, 242)));
		followingpersonpanel2.setBackground(Color.WHITE);
		followingpersonpanel2.setBounds(39, 101, 250, 70);
		Followingpagepanel.add(followingpersonpanel2);
		
		JButton btnFollow22 = new JButton("Follow");
		btnFollow22.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow22.setBackground(Color.WHITE);
		btnFollow22.setBounds(163, 22, 75, 21);
		followingpersonpanel2.add(btnFollow22);
		
		JButton btnProfile22 = new JButton("");
		btnProfile22.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile22.setBounds(10, 10, 50, 50);
		followingpersonpanel2.add(btnProfile22);
		
		JButton btnName22 = new JButton("Saerim");
		btnName22.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName22.setBackground(Color.WHITE);
		btnName22.setBounds(69, 22, 91, 23);
		followingpersonpanel2.add(btnName22);
		
		JPanel followingpersonpanel3 = new JPanel();
		followingpersonpanel3.setLayout(null);
		followingpersonpanel3.setBorder(new LineBorder(new Color(42, 162, 242)));
		followingpersonpanel3.setBackground(Color.WHITE);
		followingpersonpanel3.setBounds(39, 178, 250, 70);
		Followingpagepanel.add(followingpersonpanel3);
		
		JButton btnFollow33 = new JButton("Unfollow");
		btnFollow33.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow33.setBackground(Color.WHITE);
		btnFollow33.setBounds(163, 22, 75, 21);
		followingpersonpanel3.add(btnFollow33);
		
		JButton btnProfile33 = new JButton("");
		btnProfile33.setIcon(new ImageIcon(Explore.class.getResource("/img/profile.jpg")));
		btnProfile33.setBounds(10, 10, 50, 50);
		followingpersonpanel3.add(btnProfile33);
		
		JButton btnName33 = new JButton("Junho");
		btnName33.setFont(new Font("Calibri", Font.BOLD, 15));
		btnName33.setBackground(Color.WHITE);
		btnName33.setBounds(69, 22, 91, 23);
		followingpersonpanel3.add(btnName33);
		
		JPanel followingpersonpanel2_1 = new JPanel();
		followingpersonpanel2_1.setLayout(null);
		followingpersonpanel2_1.setBorder(new LineBorder(new Color(42, 162, 242)));
		followingpersonpanel2_1.setBackground(Color.WHITE);
		followingpersonpanel2_1.setBounds(39, 258, 250, 70);
		Followingpagepanel.add(followingpersonpanel2_1);
		
		JButton btnFollow22_1 = new JButton("Unfollow");
		btnFollow22_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFollow22_1.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow22_1.setBackground(Color.WHITE);
		btnFollow22_1.setBounds(163, 22, 75, 21);
		followingpersonpanel2_1.add(btnFollow22_1);
		
		JButton btnProfile22_1 = new JButton("");
		btnProfile22_1.setIcon(new ImageIcon(SeeFollowing.class.getResource("/img/profile.jpg")));
		btnProfile22_1.setBounds(10, 10, 50, 50);
		followingpersonpanel2_1.add(btnProfile22_1);
		
		JButton btnShinsung = new JButton("Shinsung");
		btnShinsung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShinsung.setFont(new Font("Calibri", Font.BOLD, 15));
		btnShinsung.setBackground(Color.WHITE);
		btnShinsung.setBounds(69, 22, 91, 23);
		followingpersonpanel2_1.add(btnShinsung);
		
		JPanel followingpersonpanel3_1 = new JPanel();
		followingpersonpanel3_1.setLayout(null);
		followingpersonpanel3_1.setBorder(new LineBorder(new Color(42, 162, 242)));
		followingpersonpanel3_1.setBackground(Color.WHITE);
		followingpersonpanel3_1.setBounds(39, 335, 250, 70);
		Followingpagepanel.add(followingpersonpanel3_1);
		
		JButton btnFollow33_1 = new JButton("Follow");
		btnFollow33_1.setFont(new Font("Calibri", Font.BOLD, 10));
		btnFollow33_1.setBackground(Color.WHITE);
		btnFollow33_1.setBounds(163, 22, 75, 21);
		followingpersonpanel3_1.add(btnFollow33_1);
		
		JButton btnProfile33_1 = new JButton("");
		btnProfile33_1.setIcon(new ImageIcon(SeeFollowing.class.getResource("/img/profile.jpg")));
		btnProfile33_1.setBounds(10, 10, 50, 50);
		followingpersonpanel3_1.add(btnProfile33_1);
		
		JButton btnKimwon = new JButton("JuYoung");
		btnKimwon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKimwon.setFont(new Font("Calibri", Font.BOLD, 15));
		btnKimwon.setBackground(Color.WHITE);
		btnKimwon.setBounds(69, 22, 91, 23);
		followingpersonpanel3_1.add(btnKimwon);
		
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.setBounds(100, 100, 500, 550);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeTwitter.setVisible(true);
	}
}
