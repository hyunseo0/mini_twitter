
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.sql.*;

class Gui_login{
	JFrame frmWelcomeTwitter;
	JTextField IdtextField;
	JTextField PwdtextField;
	TwitterJdbc so;
	String temp;
	Gui_login () { //constructor//
				
		so = new TwitterJdbc();
		
		frmWelcomeTwitter = new JFrame();
		frmWelcomeTwitter.setBackground(new Color(244, 244, 244));
		frmWelcomeTwitter.setForeground(new Color(82, 82, 82));
		frmWelcomeTwitter.setTitle("Welcome Twitter!");
		frmWelcomeTwitter.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeTwitter.getContentPane().setForeground(new Color(0, 64, 128));
		frmWelcomeTwitter.setBounds(100, 100, 450, 300);
		frmWelcomeTwitter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btnLogin = new JButton("Login");  //login button//
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(29, 161, 242));
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnLogin.setBounds(273, 112, 76, 40);
		
		btnLogin.addActionListener(new login_action());
		
		frmWelcomeTwitter.getContentPane().setLayout(null);
		frmWelcomeTwitter.getContentPane().add(btnLogin);
		
		IdtextField = new JTextField();
		IdtextField.setBounds(162, 112, 96, 21);
		frmWelcomeTwitter.getContentPane().add(IdtextField);
		IdtextField.setColumns(10);
		
		PwdtextField = new JTextField();
		PwdtextField.setBounds(162, 140, 96, 21);
		frmWelcomeTwitter.getContentPane().add(PwdtextField);
		PwdtextField.setColumns(10);
		
		JLabel IdLabel = new JLabel("ID");
		IdLabel.setForeground(new Color(29, 161, 242));
		IdLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		IdLabel.setBounds(90, 112, 57, 21);
		frmWelcomeTwitter.getContentPane().add(IdLabel);
		
		JLabel PwdLabel = new JLabel("Password");
		PwdLabel.setForeground(new Color(29, 161, 242));
		PwdLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		PwdLabel.setBounds(90, 140, 81, 30);
		frmWelcomeTwitter.getContentPane().add(PwdLabel);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setForeground(new Color(128, 128, 128));
		btnRegister.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnRegister.setBounds(162, 171, 100, 30);
		
		//
		btnRegister.addActionListener(new regist_action());
		//
		
		frmWelcomeTwitter.getContentPane().add(btnRegister);
		
		JButton btnChangePwd = new JButton("Change Pwd");  //change pwd button//
		btnChangePwd.setBackground(new Color(240, 240, 240));
		btnChangePwd.setForeground(new Color(128, 128, 128));
		btnChangePwd.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnChangePwd.setBounds(263, 171, 119, 30);
		
		frmWelcomeTwitter.getContentPane().add(btnChangePwd);
		
		//
		btnChangePwd.addActionListener(new changePwd_action());
		//
		
		JButton ImgLabel = new JButton("");
		ImgLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		ImgLabel.setBounds(182, 36, 76, 60);
		ImgLabel.setIcon(new ImageIcon(Explore.class.getResource("/img/logo.png")));
		frmWelcomeTwitter.getContentPane().add(ImgLabel);
		frmWelcomeTwitter.setVisible(true);
	}
	class regist_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new Register();
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	class changePwd_action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new ChangePwd();
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	class login_action implements ActionListener //definition of login button event//
	{
		public void actionPerformed(ActionEvent e)
		{
			String Id=IdtextField.getText(); //gets information from textfield//
			String Pwd=PwdtextField.getText();
			so.func_login(Id, Pwd); //start main class's function 이 곳에서 문제 발생..//
			so.set_ID(Id);
			frmWelcomeTwitter.setVisible(false);
		}
	}
	
	
}

class TwitterJdbc
{
	//connecting to the database//
	 
		Connection con;
	   Statement stmt;
	   TwitterJdbc() {
	     String url="jdbc:mysql://localhost:3306/madang"; 
	     String userid="madang";
	     String pwd="1234";
	  
	     try { 	
	       con=DriverManager.getConnection(url, userid, pwd);
	       System.out.println("MySQL connection..\n");
	     } catch(SQLException e) {
	         e.printStackTrace();
	       }	     
	   }
	   
	   void func_login(String Id, String Pwd)
		{
		   String query="select name from user_info where id="+ "\""+Id+"\"" + " and pwd=" + "\""+ Pwd+ "\"";
			String temp_ID = null;
			try
			{
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				
				if(rs.next()==true) //if login success//
				{
					temp_ID=rs.getString(1);
				
					new Home(temp_ID); //turn on Home gui and give //
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Error:Wrong ID or Password!");
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	   
	   void func_changePwd(String CurrentPW, String NewPW)
		{
			String query="update user_info set pwd = " + "\"" + NewPW + "\"" + "where pwd =" + "\"" + CurrentPW + "\"";
			try {
				Statement stmt=con.createStatement();
				stmt.executeUpdate(query);
		 } catch(SQLException e) {
		  	  	 e.printStackTrace();
		   }
		}
	   
	   void func_register(String id, String pwd, String name, String phone)
		{
			String query="insert into user_info values (" + "\"" + id + "\"" + " , " + "\"" + pwd + "\"" + " , " + "\"" + name + "\"" +  " , " + "\"" + phone + "\")"; 
			try {
				Statement stmt=con.createStatement();
				stmt.executeUpdate(query);
		 } catch(SQLException e) {
		  	  	 e.printStackTrace();
		   }
		}
	   
	   void func_upload(String id, String content)
		{
			String query="insert into post_info values (" + "\"" + id + "\"" + " , " + "\"" + content + "\")";
			try {
				Statement stmt=con.createStatement();
				stmt.executeUpdate(query);
		 } catch(SQLException e) {
		  	  	 e.printStackTrace();
		   }
		}
	   
	   String func_getdata(String id)
	   {
		   String query="select content from post_info where id=\""+ id +"\""; 
		   String result=null;
		   
		   try {
			   Statement stmt=con.createStatement();
			   ResultSet rs=stmt.executeQuery(query);
			   

			   while(rs.next()==true) //if there's content //
				{
					result=rs.getString(1);
					
				}
				
			   
		   }
		   catch(SQLException e)
		   {
			   e.printStackTrace();
		   }
		   
		   return result;
		   
	   }
	   
	   String func_getdata2(String id) //to show past messages on home gui//
	   {
		   
		   String query="select content from post_info where id=\""+ id +"\""; 
		   String result=null;
		
		   int i=0;
		   
		   try {
			   Statement stmt=con.createStatement();
			   ResultSet rs=stmt.executeQuery(query);
			   
			   
			  
			  rs.afterLast(); 
			  rs.previous();
			  rs.previous();
			  
			  result=rs.getString(1); //error occured here//
			   
			   
		   }
		   catch(SQLException e)
		   {
			   e.printStackTrace();
		   }
		   
		   if(result==null)
		   {
			   result="empty space";
		   }
		   
		   
		   
		   return result;
		   
		   
	   }
	   
	   int getResultSetSize(ResultSet resultSet) { //finding the length of resultset's row//
		    int size = -1;

		    try {
		        resultSet.last();
		        size = resultSet.getRow();
		        resultSet.beforeFirst();
		    } catch(SQLException e) {
		        return size;
		    }

		    return size;
		}
	   
	   String temp;
	   
	   void set_ID(String Id)
	   {
		  temp=Id; //get id from gui//
		   
	   }
	   
	   String get_ID()
	   {
		   
		   return temp; //for sending to other gui//
	   }
	   
}


public class login {
	public static void main(String[] args) {
        Gui_login start = new Gui_login();
    }
}
