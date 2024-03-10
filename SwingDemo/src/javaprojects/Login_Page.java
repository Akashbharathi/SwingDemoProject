package javaprojects;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login_Page extends JFrame{
	 
	JLabel user=new JLabel("ENTER USER NAME");
	JLabel pass=new JLabel("ENTER PASSWORD");
	JTextField usertxt=new JTextField();
	JPasswordField userpass=new JPasswordField();
	JButton button;
   
    Login_Page(){
    	
    	
    	 button=new JButton("Login Mee!");
    	
         setLayout(null);
    	 button.setBackground(Color.ORANGE);
    	
    	 user.setBounds(100,50,250,40);
    	 pass.setBounds(100,100,250,40);
    	 usertxt.setBounds(300,50,200,30);
         userpass.setBounds(300,100,200,30);
         button.setBounds(175,200,150,30);
         
         add(user);
    	 add(pass);
         add(usertxt);
         add(userpass);
         add(button);
         
    }

	public static void main(String[] args) {
		
		Login_Page object=new Login_Page();
		object.setVisible(true);
		//object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		object.setSize(800,500);
	 //	object.setBounds(100,50,700,600);
		object.setTitle("LOGIN FORM");
		object.setResizable(false);
	}

	

}
