import java.awt.*;
import javax.swing.*;

public class Lab1 {
    public Lab1(){
        JFrame f = new JFrame("Logi ");
        Container cp = f.getContentPane();
        cp.setLayout(null);

        JLabel I1 = new JLabel("USER :");
        I1.setBounds(50, 0, 100, 50);
        cp.add(I1);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 10, 150, 25);
        cp.add(t1);
        JLabel I2 = new JLabel("Password :");
        I2.setBounds(23, 37, 100, 50);
        cp.add(I2);
        JTextField t2 = new JTextField();
        t2.setBounds(100, 50, 150, 25);
        cp.add(t2);
        JButton b1 = new JButton("Login");
        b1.setBounds(100, 87, 100, 30);
        cp.add(b1);
        f.setSize(300, 160);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
}