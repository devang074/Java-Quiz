package quiz.applicationn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, exit;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Quiz");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("tahoma", Font.BOLD, 40));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        name.setBackground(Color.blue);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.cyan);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("exit");
        exit.setBounds(915, 270, 120, 25);
        exit.setBackground(Color.cyan);
        exit.addActionListener(this);
        add(exit);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == exit) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}