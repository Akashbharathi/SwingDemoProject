package javaprojects;

import java.awt.*;
public class Awt_Login {
	
	Awt_Login(){
		
		Frame frame=new Frame("LOGIN FORM");
		
		Label email=new Label("ENTER YOUR NAME");
		Label pass=new Label("ENTER YOUR PASSWORD");
		TextField emailtext=new TextField(20);
		TextField passtext=new TextField(20);
		
		Button b=new Button("submit here");
		b.setBackground(Color.BLUE);
		
		email.setBounds(50, 70, 100, 30);
		emailtext.setBounds(150, 70, 100, 30);
		pass.setBounds(50, 110, 100, 30);
        passtext.setBounds(150, 110, 100, 30);
        b.setBounds(200, 170, 80, 30);
		
        
        frame.add(email);
        frame.add(pass);
        frame.add(emailtext);
        frame.add(passtext);
        frame.add(b);
        
        
        frame.setVisible(true);
        frame.setSize(350,300);
        frame.setResizable(false);
        frame.setLayout(null);
		
	
	}

	public static void main(String[] args) {
		Awt_Login obj=new Awt_Login();
		
	}

}
