
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Doctor_Login extends JFrame implements ActionListener
{
    JFrame f1;
    JLabel l1,l3,l4,background;
    JButton b1,b2,b3,b4,b5;
    JPanel p1;
    public Doctor_Login()
    {
        f1 = new JFrame();
        p1 = new JPanel();
        p1.setBounds(0, 100, 1350, 550);
        p1.setOpaque(true);
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        f1.add(p1);
        background=new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\p6.png"));
        p1.add(background);
        background.setLayout(null);

        Font myFont = new Font("Times New Roman",Font.PLAIN,20);
        Font myFont2 = new Font("Times New Roman",Font.BOLD,22);
        Font myFont1 = new Font("lucida calligraphy",Font.BOLD,45);
        Font myFont4 = new Font("lucida calligraphy",Font.BOLD,17);
        l1 = new JLabel("Medicare Hospital");
        l1.setFont(myFont1);
        l1.setBounds(320, 10, 550, 70);
        l1.setForeground(Color.BLUE);
        l4 = new JLabel("Compassion. Innovation. Trust.");
        l4.setFont(myFont4);
        l4.setBounds(650, 70, 350, 30);
        l4.setForeground(Color.red);
        l3 = new JLabel("Welcome Doctor !");
        l3.setBounds(930, 160, 480, 80);
        l3.setFont(l3.getFont().deriveFont(45.0f));
        l3.setForeground(Color.BLUE);
       
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Home");
        b1.addActionListener(this);
        b1.setBounds(30, 650, 180, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Prescribed Blood Test");
        b2.setBounds(290, 650, 180, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("Prescribed Medicines");
        b3.setBounds(550, 650, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b4 = new JButton("Shifting Appoinments");
        b4.setBounds(810, 650, 180, 30);
        b4.setFont(myFont3);
        b4.addActionListener(this);
        b5 = new JButton("Log Out");
        b5.setBounds(1070, 650, 180, 30);
        b5.setFont(myFont3);
        b5.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        
        background.add(l3);
        f1.add(l1);
        f1.add(l4);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Doctor_Login d = new Doctor_Login();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
       {
         Doctor_Login d = new Doctor_Login();  
         f1.setVisible(false);
       }
       if(e.getSource() == b2)
       {
         Prescribed_Blood_Test bl = new Prescribed_Blood_Test();  
         f1.setVisible(false);
       }
       if(e.getSource() == b3)
       {
          Prescribed_Medicines md = new Prescribed_Medicines();  
          f1.setVisible(false);
       }
       if(e.getSource() == b4)
       {
          ShiftingAppointments sal = new ShiftingAppointments();  
          f1.setVisible(false);
       }
        if(e.getSource() == b5)
        {
          Welcome w = new Welcome();  
          JOptionPane.showMessageDialog(null, "Logout Successfully","Success !",JOptionPane.INFORMATION_MESSAGE); 
          f1.setVisible(false);
        } 
    }
  
}
