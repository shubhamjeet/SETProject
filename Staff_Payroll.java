
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Staff_Payroll extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf3,tf4,tf5,tf6,tf7,tf8,tf10;
    JLabel l1,l2,l3,l4,l7,l8,l9,l12,l13,l14,l15;
    JButton b1,b2,b3;
    JRadioButton rb3,rb4;
    Database_Procedure12 db;
    
    public Staff_Payroll()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        db = new Database_Procedure12();

        Font myFont = new Font("Times New Roman",Font.PLAIN,20);
        Font myFont2 = new Font("Times New Roman",Font.PLAIN,20);
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
        l2 = new JLabel("Staff  ID");
        l2.setBounds(30, 140, 80, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("Name");
        l3.setBounds(500, 140, 140, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        l7 = new JLabel("Salary");
        l7.setBounds(500, 280, 140, 30);
        l7.setFont(myFont2);
        l7.setForeground(Color.BLACK);
        l8 = new JLabel("Extra Duty (Hrs.)");
        l8.setBounds(30, 350, 160, 30);
        l8.setFont(myFont2);
        l8.setForeground(Color.BLACK);
        l9 = new JLabel("Department");
        l9.setBounds(30, 280, 140, 30);
        l9.setFont(myFont2);
        l9.setForeground(Color.BLACK);
        l12 = new JLabel("No. of Holidays");
        l12.setBounds(500, 350, 140, 30);
        l12.setFont(myFont2);
        l12.setForeground(Color.BLACK);
        l13 = new JLabel("Interest on Loan");
        l13.setBounds(30, 420, 140, 30);
        l13.setFont(myFont2);
        l13.setForeground(Color.BLACK);
        l14 = new JLabel("Total Payment Due");
        l14.setBounds(500, 420, 200, 30);
        l14.setFont(myFont2);
        l14.setForeground(Color.BLACK);
        l15 = new JLabel("Staff  Type");
        l15.setBounds(30, 210, 140, 30);
        l15.setFont(myFont2);
        l15.setForeground(Color.BLACK);
        
        tf1 = new JTextField();
        tf1.setBounds(200, 140, 200, 30);
        tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf3 = new JTextField();
        tf3.setBounds(200, 280, 200, 30);
        tf3.setBackground(Color.getColor("GREEN"));
        tf3.setFont(tf1.getFont().deriveFont(16.0f));
        tf4 = new JTextField();
        tf4.setBounds(200, 350, 200, 30);
        tf4.setBackground(Color.getColor("GREEN"));
        tf4.setFont(tf1.getFont().deriveFont(16.0f));
        tf5 = new JTextField();
        tf5.setBounds(200, 420, 200, 30);
        tf5.setBackground(Color.getColor("GREEN"));
        tf5.setFont(tf1.getFont().deriveFont(16.0f));
        tf7 = new JTextField();
        tf7.setBounds(710, 140, 250, 30);
        tf7.setBackground(Color.getColor("GREEN"));
        tf7.setFont(tf1.getFont().deriveFont(16.0f));
        tf8 = new JTextField();
        tf8.setBounds(710, 280, 250, 30);
        tf8.setBackground(Color.getColor("GREEN"));
        tf8.setFont(tf1.getFont().deriveFont(16.0f));
        tf6 = new JTextField();
        tf6.setBounds(710, 350, 250, 30);
        tf6.setBackground(Color.getColor("GREEN"));
        tf6.setFont(tf1.getFont().deriveFont(16.0f));
        tf10 = new JTextField();
        tf10.setBounds(710, 420, 250, 30);
        tf10.setBackground(Color.getColor("GREEN"));
        tf10.setFont(tf1.getFont().deriveFont(16.0f));
  
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(50, 580, 100, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(290, 580, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Staffs Payroll");
        b3.setBounds(570, 580, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
       
        rb3 = new JRadioButton("Permanent");
        rb3.setBounds(200, 200, 110, 50);
        rb3.setFont(myFont2);
        rb3.setForeground(Color.GRAY);
        rb3.addActionListener(this);
        rb4 = new JRadioButton("Temporary");
        rb4.setBounds(350, 200, 130, 50);
        rb4.setFont(myFont2);
        rb4.setForeground(Color.GRAY);
        rb4.addActionListener(this);
      
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l12);
        f1.add(l13);
        f1.add(l14);
        f1.add(l15);
        f1.add(tf1);
        f1.add(tf3);
        f1.add(tf4);
        f1.add(tf5);
        f1.add(tf7);
        f1.add(tf8);
        f1.add(tf6);
        f1.add(tf10);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(rb3);
        f1.add(rb4);
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Staff_Payroll stp = new Staff_Payroll();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         if(!tf1.getText().equals("") && !tf3.getText().equals("") && !tf4.getText().equals("") && !tf5.getText().equals("") && !tf6.getText().equals("") && !tf7.getText().equals("") && !tf8.getText().equals("") && !tf10.getText().equals(""))
         {
             if(rb3.isSelected() || rb4.isSelected())
             {
                try
         {
          db.pst2.setString(1,tf1.getText());
          db.pst2.setString(2,tf7.getText());
          db.pst2.setString(4,tf3.getText());
          db.pst2.setString(5,tf8.getText());
          db.pst2.setString(6,tf4.getText());
          db.pst2.setString(7,tf6.getText());
          db.pst2.setString(8,tf5.getText());
          db.pst2.setString(9,tf10.getText());
         
          if(rb3.isSelected())
          {
            db.pst2.setString(3,rb3.getText());  
          }
          else if(rb4.isSelected())
          {
             db.pst2.setString(3,rb4.getText());   
          }
       }
       catch(Exception ae)
       {
          System.out.println("Exception "+ae);  
       }
         
           try 
           {
               db.rowaffected = db.pst2.executeUpdate();
               JOptionPane.showMessageDialog(null, "New Staff Payment Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE);
               tf1.setText("");tf3.setText("");tf4.setText("");tf6.setText("");tf7.setText("");tf8.setText("");tf5.setText("");tf10.setText("");rb3.setSelected(false);rb4.setSelected(false);
           } 
           catch (SQLException ex) 
           {
               System.out.println("Error while Inserting Records  "+ex);
           } 
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Select Staff Type","Failed !",JOptionPane.ERROR_MESSAGE);      
             }
         }
         else
         {
             JOptionPane.showMessageDialog(null, "All Fields are Mendatory ! Fill Empty Fields","Failed !",JOptionPane.ERROR_MESSAGE);   
         }
         
      }
      if(e.getSource() == b2)
      {
          AdminStaff_Login deo = new AdminStaff_Login();  
          f1.setVisible(false);
      }
      if(e.getSource() == b3)
      {
         TableExample16 t = new TableExample16(); 
      }  
    }
  
}
class Database_Procedure12
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure12()
    {
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem","root","");
            if(con!=null)
            {
              System.out.println("Connection Established");
            }
            else
            {
              System.out.println("Error in Connection");  
            }
           
            pst2=con.prepareStatement("INSERT INTO staffpayroll (ID,Name,Type,Department,Salary,ExtraDuty,Holidays,Interest,TotalPay)"+"VALUES(?,?,?,?,?,?,?,?,?)");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}