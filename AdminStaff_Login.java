
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminStaff_Login extends JFrame implements ActionListener
{
    JFrame f1;
    JLabel l1,l2,l3,l4,background;
    JButton b1,b3,b4,b5,b6,b7,b8;
    JPanel p1;
    String sections[] = {"Type","Admin","Doctor","Administrative Staff","Medical Staff","D.E.O."};
    public AdminStaff_Login()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(new BorderLayout());
        background=new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\p3.jpg"));
        f1.add(background);
        background.setLayout(null);

        Font myFont = new Font("Times New Roman",Font.PLAIN,20);
        Font myFont2 = new Font("Times New Roman",Font.BOLD,22);
        Font myFont1 = new Font("lucida calligraphy",Font.BOLD,45);
        Font myFont4 = new Font("lucida calligraphy",Font.BOLD,17);
        l1 = new JLabel("Medicare Hospital");
        l1.setFont(myFont1);
        l1.setBounds(520, 10, 550, 70);
        l1.setForeground(Color.BLUE);
        l4 = new JLabel("Compassion. Innovation. Trust.");
        l4.setFont(myFont4);
        l4.setBounds(850, 70, 350, 30);
        l4.setForeground(Color.red);
        l2 = new JLabel("Menu");
        l2.setBounds(550, 10, 60, 20);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLUE);
        l3 = new JLabel("Welcome Administrative !");
        l3.setBounds(480, 240, 680, 80);
        l3.setFont(l3.getFont().deriveFont(45.0f));
        l3.setForeground(Color.BLUE);
       
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Home");
        b1.addActionListener(this);
        b1.setBounds(500, 40, 180, 30);
        b1.setFont(myFont3);
        b3 = new JButton("Staffs Payroll");
        b3.setBounds(500, 120, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b4 = new JButton("Doctors Payments");
        b4.setBounds(500, 200, 180, 30);
        b4.setFont(myFont3);
        b4.addActionListener(this);
        b5 = new JButton("Log Out");
        b5.setBounds(500, 520, 180, 30);
        b5.setFont(myFont3);
        b5.addActionListener(this);
        b6 = new JButton("Patient Bills");
        b6.setBounds(500, 280, 180, 30);
        b6.setFont(myFont3);
        b6.addActionListener(this);
        b7 = new JButton("Stocks Entry");
        b7.setBounds(500, 360, 180, 30);
        b7.setFont(myFont3);
        b7.addActionListener(this);
        b8 = new JButton("Taxation Entry");
        b8.setBounds(500, 440, 180, 30);
        b8.setFont(myFont3);
        b8.addActionListener(this);
        b1.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setOpaque(false);
        p1.setBounds(600, 90, 720, 700);
        p1.add(b1);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(l2);
        
        background.add(p1);
        background.add(l1);
        background.add(l3);
        background.add(l4); 
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      AdminStaff_Login deo = new AdminStaff_Login();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         AdminStaff_Login deo = new AdminStaff_Login();  
         f1.setVisible(false);
       }
       if(e.getSource() == b3)
       {
          Staff_Payroll stp = new Staff_Payroll();  
          f1.setVisible(false);
       }
       if(e.getSource() == b4)
       {
          Doctors_Payments dpp = new Doctors_Payments();  
          f1.setVisible(false);
       }
        if(e.getSource() == b5)
       {
          Welcome w = new Welcome();  
          JOptionPane.showMessageDialog(null, "Logout Successfully","Success !",JOptionPane.INFORMATION_MESSAGE); 
          f1.setVisible(false);
       }
       if(e.getSource() == b6)
       {
          Patient_Bills ppp = new Patient_Bills();  
          f1.setVisible(false);  
       }
       if(e.getSource() == b7)
       {
         Stock_Entry spp = new Stock_Entry();  
         f1.setVisible(false); 
       }
       if(e.getSource() == b8)
       {
          Taxattion_Entry txe = new Taxattion_Entry();  
          f1.setVisible(false);
       }
    }
  
}
