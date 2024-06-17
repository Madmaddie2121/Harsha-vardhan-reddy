package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    
    Signup() {
        setBounds(200, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblUsername = new JLabel("Username");
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(50, 20, 125, 25);
	p1.add(lblUsername);
        
        tfusername = new JTextField();
	tfusername.setBounds(150, 20, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name");
	lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblname.setBounds(50, 80, 125, 25);
	p1.add(lblname);
        
        tfname = new JTextField();
	tfname.setBounds(150, 75, 300, 30);
        tfname.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfname);
        
        JLabel lblpassword = new JLabel("Password");
	lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblpassword.setBounds(50, 130, 125, 25);
	p1.add(lblpassword);
        
        tfpassword = new JTextField();
	tfpassword.setBounds(150, 130, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfpassword);
        
        JLabel lblsecurity = new JLabel("Security Question");
	lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblsecurity.setBounds(50, 175, 125, 25);
	p1.add(lblsecurity);
        
        security = new Choice();
        security.add("Fav Food Item");
        security.add("Your Lucky number");
        security.add("Fav Marvel superhero");
        security.add("your childhood superhero");
        security.setBounds(180, 180, 270, 30);
	p1.add(security);
        
        JLabel lblanswer  = new JLabel("Answer  ");
	lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblanswer.setBounds(50, 210, 125, 25);
	p1.add(lblanswer);
        
        tfanswer = new JTextField();
	tfanswer.setBounds(150, 210, 300, 30);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfanswer);
        
        create = new JButton("Create");
        create.setBackground(new Color(133,193,233));
        create.setForeground(Color.WHITE);
        create.setFont(new Font("Tahoma",Font.BOLD, 14));
        create.setBounds(80,265,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        back = new JButton("Back");
        back.setBackground(new Color(133,193,233));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD, 14));
        back.setBounds(250,265,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\mallu\\OneDrive\\Documents\\NetBeansProjects\\Travel Management System\\src\\icons\\signup.png");
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
            try{
                Conn c =new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Signup();
    }

}