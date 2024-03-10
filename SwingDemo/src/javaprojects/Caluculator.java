package javaprojects;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Caluculator implements ActionListener{
	
	JFrame f;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdot,bequal,bclr,bdel;
	static double a=0,b=0,result=0;
	static int operator=0;
	
	Caluculator(){     // constructor
		
		f=new JFrame("MY CALCULATOR APP");
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20,20,300,350);
		f.setResizable(false);
		Font font=new Font("Arial",Font.BOLD,20);
		
		tf=new JTextField();
		//f.add(tf);
		tf.setFont(font);
		tf.setBackground(Color.CYAN);
		tf.setForeground(Color.BLACK);
		tf.setBounds(40, 40, 200, 50);
		
		// create buttons
		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		badd=new JButton("+");
		badd.setFont(font);
		bsub=new JButton("-");
		bsub.setFont(font);
		bdiv=new JButton("/");
		bdiv.setFont(font);
		bmul=new JButton("*");
		bmul.setFont(font);
		bdot=new JButton(".");
		bdot.setFont(font);
		bdel=new JButton("Delete");
		bclr=new JButton("clear");
		bequal=new JButton("=");
		bequal.setFont(font);
		
		b7.setBounds(40, 100, 50,40);
	    b8.setBounds(90, 100, 50,40);
	    b9.setBounds(140, 100, 50,40);
	    bdiv.setBounds(190, 100, 50,40);
	    
	    b4.setBounds(40, 140, 50,40);
	    b5.setBounds(90, 140, 50,40);
	    b6.setBounds(140, 140, 50,40);
	    bmul.setBounds(190, 140, 50,40);
	    
	    b1.setBounds(40, 180, 50,40);
	    b2.setBounds(90, 180, 50,40);
	    b3.setBounds(140, 180, 50,40);
	    bsub.setBounds(190, 180, 50,40);
	    
	    bdot.setBounds(40, 220, 50,40);
	    b0.setBounds(90, 220, 50,40);
	    bequal.setBounds(140, 220, 50,40);
	    badd.setBounds(190, 220, 50,40);
	    
	    bdel.setBounds(40, 260, 100,40);
	    bclr.setBounds(140, 260, 100,40);
	    
	    // ADD ACTIONLISTENER METHODS TO PERFORM BUTTONS
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    b5.addActionListener(this);
	    b6.addActionListener(this);
	    b7.addActionListener(this);
	    b8.addActionListener(this);
	    b9.addActionListener(this);
	    b0.addActionListener(this);
	    badd.addActionListener(this);
	    bsub.addActionListener(this);
	    bmul.addActionListener(this);
	    bdiv.addActionListener(this);
	    bdot.addActionListener(this);
	    bequal.addActionListener(this);
	    bdel.addActionListener(this);
	    bclr.addActionListener(this);
	    
	    
	    // add components	
	    
        f.add(tf);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
	    f.add(bdiv);
	    f.add(bdot);
	    f.add(bdel);
	    f.add(bclr);
	    f.add(bequal);
	    
	}

	public static void main(String[] args) {
		
		Caluculator obj=new Caluculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==bclr) { 
			tf.setText("");
		}
		if (e.getSource()==bdel) {
			String s=tf.getText();
			tf.setText("");
			for(int i=0;i<s.length()-1;i++)
			tf.setText(tf.getText()+s.charAt(i));
		}
		
		if (e.getSource()==b1) {
			tf.setText(tf.getText().concat("1"));
		}
		if (e.getSource()==b2) {
			tf.setText(tf.getText().concat("2"));
		}
		if (e.getSource()==b3) {
			tf.setText(tf.getText().concat("3"));
		}
		if (e.getSource()==b4) {
			tf.setText(tf.getText().concat("4"));
		}
		if (e.getSource()==b5) {
			tf.setText(tf.getText().concat("5"));
		}
		if (e.getSource()==b6) {
			tf.setText(tf.getText().concat("6"));
		}
		if (e.getSource()==b7) {
			tf.setText(tf.getText().concat("7"));
		}
		if (e.getSource()==b8) {
			tf.setText(tf.getText().concat("8"));
		}
		if (e.getSource()==b9) {
			tf.setText(tf.getText().concat("9"));
		}
		if (e.getSource()==b0) {
			tf.setText(tf.getText().concat("0"));
		}
		if (e.getSource()==bdot) {
			tf.setText(tf.getText().concat("."));
		}
		if (e.getSource()==badd) {
			a=Double.parseDouble(tf.getText());
			operator=1;
			tf.setText("");
		  }
		if (e.getSource()==bsub) {
			a=Double.parseDouble(tf.getText());
			operator=2;
			tf.setText("");
		  }
		if (e.getSource()==bmul) {
			a=Double.parseDouble(tf.getText());
			operator=3;
			tf.setText("");
		  }
		if (e.getSource()==bdiv) {
			a=Double.parseDouble(tf.getText());
			operator=4;
			tf.setText("");
		  }
		
		if (e.getSource()==bequal) {
			b=Double.parseDouble(tf.getText());
			
			switch(operator) {
			
			case 1:
				result=a+b;
				break;
				
			case 2:
				result=a-b;
				break;
				
			case 3:
				result=a*b;
				break;
				
			case 4:
				result=a/b;
				break;
			  }
			
			tf.setText(""+result);
			
		  }
		
		
		
		
		
	}

}
