import java.io.*;
import java.awt.*;
import javax.swing.*;
public class lab2 {
    public lab2(){
        File fi = null;
        FileReader fr = null;
        BufferedReader br = null;
        JFrame f = new JFrame("Logi ");
        Container cp = f.getContentPane();
        cp.setLayout(null);

        JLabel I1 = new JLabel("Name  :");
        I1.setBounds(50, 0, 100, 50);
        cp.add(I1);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 10, 150, 25);
        cp.add(t1);
        JLabel I2 = new JLabel("Car lincense :");
        I2.setBounds(15, 37, 100, 50);
        cp.add(I2);
        JTextField t2 = new JTextField();
        t2.setBounds(100, 50, 150, 25);
        cp.add(t2);
       
        try {
            fi = new File("Thailand_PRV.csv");
            fr = new FileReader(fi);
            br = new BufferedReader(fr);
           
            JComboBox<String> I = new JComboBox<>();
            String d;
            while ((d = br.readLine()) != null) {              
              //  String []s = d.split(".");              
                I.addItem(d);
            }
           

            I.setSelectedIndex(2);
            I.setBounds(100, 150, 100, 30);
            cp.add(I);
        } catch (Exception e) {
           System.out.println(e);
        }
        finally{
            try {
                br.close();fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        

        JButton b1 = new JButton("Ok");
        b1.setBounds(100, 87, 100, 30);
        cp.add(b1);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
}
