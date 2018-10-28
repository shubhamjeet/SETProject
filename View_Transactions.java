
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View_Transactions extends JFrame implements ActionListener
{
    JFrame f1;
    JLabel l1,l2,l4,background;
    JButton b3,b4,b5,b6,b7,b8;
    JPanel p1;
    String sections[] = {"Type","Admin","Doctor","Administrative Staff","Medical Staff","D.E.O."};
    public View_Transactions()
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
        l2 = new JLabel("Transactions :");
        l2.setBounds(500, 45, 140, 20);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLUE);
       
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);

        b3 = new JButton("View Staffs Payroll");
        b3.setBounds(500, 100, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b4 = new JButton("View Doctors Pay");
        b4.setBounds(500, 180, 180, 30);
        b4.setFont(myFont3);
        b4.addActionListener(this);
        b5 = new JButton("Exit");
        b5.setBounds(500, 500, 180, 30);
        b5.setFont(myFont3);
        b5.addActionListener(this);
        b6 = new JButton("View Patient Bills");
        b6.setBounds(500, 260, 180, 30);
        b6.setFont(myFont3);
        b6.addActionListener(this);
        b7 = new JButton("View Stocks Entry");
        b7.setBounds(500, 340, 180, 30);
        b7.setFont(myFont3);
        b7.addActionListener(this);
        b8 = new JButton("View Taxation Entry");
        b8.setBounds(500, 420, 180, 30);
        b8.setFont(myFont3);
        b8.addActionListener(this);
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
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(l2);
        
        background.add(p1);
        background.add(l1);
        background.add(l4); 
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      View_Transactions deo = new View_Transactions();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b3)
       {
          TableExample16 t = new TableExample16(); 
       }
       if(e.getSource() == b4)
       {
          TableExample7 t = new TableExample7(); 
       }
        if(e.getSource() == b5)
       {
           Admin_Login ad = new Admin_Login();
           f1.setVisible(false);
       }
       if(e.getSource() == b6)
       {
          TableExample10 t = new TableExample10();
       }
       if(e.getSource() == b7)
       {
         TableExample17 t = new TableExample17();  
       }
       if(e.getSource() == b8)
       {
          TableExample18 t = new TableExample18();  
       }
    }
  
}
