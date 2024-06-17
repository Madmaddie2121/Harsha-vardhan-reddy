package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, password;
    JTextField tfpassword, tfusername;
    Login() {
        setSize(800,400);
        setLocation(200,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0, 0, 400, 400);
        add(p1);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\mallu\\OneDrive\\Documents\\NetBeansProjects\\Travel Management System\\src\\icons\\login.png");
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.setLayout(null);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
	lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN, 20));
	p2.add(lblusername);

	JLabel lblpassword = new JLabel("Password : ");
	lblpassword.setBounds(60,110,100,25);
	p2.add(lblpassword);

	tfusername = new JTextField();
	tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
	p2.add(tfusername);
	
	tfpassword = new JPasswordField();
	tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
	p2.add(tfpassword);
        
        
        login = new JButton("Login");
	login.setForeground(Color.WHITE);
	login.setBackground(new Color(133,193,233));
	login.setBounds(60,200,130,30);
        login.addActionListener(this);
	p2.add(login);
		
        signup = new JButton("SignUp");
	signup.setForeground(Color.WHITE);
	signup.setBackground(new Color(133,193,233));
	signup.setBounds(230,200,130,30);
        signup.addActionListener(this);
	p2.add(signup);

	password = new JButton("Forgot password");
        password.setForeground(Color.WHITE);
	password.setBackground(new Color(133, 193, 233));
	password.setBounds(60,250,130,30);
        password.addActionListener(this);
	p2.add(password);

//	JLabel text = new JLabel("Trouble in Login?");
//	text.setForeground(Color.red);
//	text.setBounds(230,250,150,20);
//	p2.add(text);

       /* JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 204));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);*/


        
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login){
            try {
                String username = tfusername.getText();
                String pass = tfpassword.getText();
                
                String query = "select * from account where username = '"+username+"' AND password = '"+pass+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Loading (username);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup();
        }else {
            setVisible(false);
            new ForgetPassword();
        
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
} 