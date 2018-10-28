
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class File_Medical_Reports extends JFrame implements ActionListener
{
    JFrame f1;
    JLabel l1,l2,l4,background;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JPanel p1;

    public File_Medical_Reports()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(new BorderLayout());
        background=new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\p2.jpg"));
        f1.add(background);
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
        l2 = new JLabel("Add Medical Reports");
        l2.setBounds(30, 30, 380, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.DARK_GRAY);
       
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Diagnosis");
        b1.addActionListener(this);
        b1.setBounds(30, 70, 180, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Medication");
        b2.setBounds(30, 140, 180, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("Complain");
        b3.setBounds(30, 200, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b4 = new JButton("Vital Sign");
        b4.setBounds(30, 260, 180, 30);
        b4.setFont(myFont3);
        b4.addActionListener(this);
        b5 = new JButton("Patient History");
        b5.setBounds(30, 320, 180, 30);
        b5.setFont(myFont3);
        b5.addActionListener(this);
        b6 = new JButton("Discharge Summary");
        b6.setBounds(30, 380, 180, 30);
        b6.setFont(myFont3);
        b6.addActionListener(this);
        b7 = new JButton("Exit");
        b7.setBounds(30, 440, 180, 30);
        b7.setFont(myFont3);
        b7.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setOpaque(false);
        p1.setBounds(30, 160, 320, 700);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
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
      File_Medical_Reports ad = new File_Medical_Reports();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         Diagnosis d = new Diagnosis();  
         f1.setVisible(false);
       }
       if(e.getSource() == b2)
       {
         Medication md = new Medication();  
         f1.setVisible(false);
       }
       if(e.getSource() == b3)
       {
          Complain cd = new Complain();    
          f1.setVisible(false);
       }
       if(e.getSource() == b4)
       {
          Vital_Sign vs = new Vital_Sign();  
          f1.setVisible(false);
       }
       if(e.getSource() == b5)
       {
         Patient_History ps = new Patient_History();  
         f1.setVisible(false);
       }
       if(e.getSource() == b6)
       {
         Discharge_Summary ds = new Discharge_Summary();  
         f1.setVisible(false);
       }
       if(e.getSource() == b7)
       {
          MedicalStaff_Login ms = new MedicalStaff_Login();  
          f1.setVisible(false);
       }
       
    }
  
}
