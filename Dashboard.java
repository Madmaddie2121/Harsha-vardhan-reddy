package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackage, bookpackage;
    JButton viewpackage, viewhotels, destination, bookhotel, viewBookHotel, payments, deletePersonalDetails;
    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\mallu\\OneDrive\\Documents\\NetBeansProjects\\Travel Management System\\src\\icons\\dashboard.png");
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50 );
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50 );
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50 );
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,20));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50 );
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);
        
        checkpackage = new JButton("Check Packages");
        checkpackage.setBounds(0, 200, 300, 50 );
        checkpackage.setBackground(new Color(0, 0, 102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackage.setMargin(new Insets(0,0,0, 110));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
        bookpackage = new JButton("Book Packages");
        bookpackage.setBounds(0, 250, 300, 50 );
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0,0,0, 120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("view Booked Packages");
        viewpackage.setBounds(0, 300, 300, 50 );
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0,0,0, 120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50 );
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0,0,0, 130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50 );
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0,0,0, 140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewBookHotel = new JButton("View Book Hotel");
        viewBookHotel.setBounds(0, 450, 300, 50 );
        viewBookHotel.setBackground(new Color(0, 0, 102));
        viewBookHotel.setForeground(Color.WHITE);
        viewBookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookHotel.setMargin(new Insets(0,0,0, 70));
        viewBookHotel.addActionListener(this);
        p2.add(viewBookHotel);
        
        destination = new JButton("Destination");
        destination.setBounds(0, 500, 300, 50 );
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destination.setMargin(new Insets(0,0,0, 125));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50 );
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0,0,0, 155));
        payments.addActionListener(this);
        p2.add(payments);
        
        ImageIcon i4 = new ImageIcon("C:\\Users\\mallu\\OneDrive\\Documents\\NetBeansProjects\\Travel Management System\\src\\icons\\home.jpg");
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 60);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 40));
        image.add(text);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if(ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if(ae.getSource() == checkpackage ){
            new CheckPackage();
        } else if (ae.getSource() == bookpackage){
            new BookPackage(username);
        } else if (ae.getSource() == viewpackage){
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels){
            new CheckHotels();
        } else if (ae.getSource() == destination){
            new Destinations();
        } else if (ae.getSource() == bookhotel){
            new BookHotel(username);
        } else if(ae.getSource() == viewBookHotel){
            new ViewBookedHotel(username);
        } else if(ae.getSource() == payments){
            new Payment();
        }
    }
    
    public static void main(String[] args){
        new Dashboard("");
    }
}
 