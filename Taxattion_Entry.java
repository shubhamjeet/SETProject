
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Taxattion_Entry extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf3,tf4,tf6,tf7,tf8;
    JLabel l1,l2,l3,l4,l7,l8,l9,l12,Calicon1,Calicon2;
    JButton b1,b2,b3,b4,Cal1,Cal2;
    Database_Procedure16 db;
    
    public Taxattion_Entry()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        db = new Database_Procedure16();

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
        l2 = new JLabel("Tax Bill No.");
        l2.setBounds(80, 140, 140, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("Tax Type");
        l3.setBounds(580, 140, 140, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        l7 = new JLabel("From Date");
        l7.setBounds(80, 210, 140, 30);
        l7.setFont(myFont2);
        l7.setForeground(Color.BLACK);
        l8 = new JLabel("To Date");
        l8.setBounds(580, 210, 210, 30);
        l8.setFont(myFont2);
        l8.setForeground(Color.BLACK);
        l9 = new JLabel("Tax Payment");
        l9.setBounds(80, 280, 140, 30);
        l9.setFont(myFont2);
        l9.setForeground(Color.BLACK);
        l12 = new JLabel("Status");
        l12.setBounds(580, 280, 210, 30);
        l12.setFont(myFont2);
        l12.setForeground(Color.BLACK);
        
        tf1 = new JTextField();
        tf1.setBounds(210, 140, 200, 30);
        tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf3 = new JTextField();
        tf3.setBounds(210, 210, 200, 30);
        tf3.setBackground(Color.getColor("GREEN"));
        tf3.setFont(tf1.getFont().deriveFont(16.0f));
        tf4 = new JTextField();
        tf4.setBounds(210, 280, 200, 30);
        tf4.setBackground(Color.getColor("GREEN"));
        tf4.setFont(tf1.getFont().deriveFont(16.0f));
        tf7 = new JTextField();
        tf7.setBounds(740, 140, 250, 30);
        tf7.setBackground(Color.getColor("GREEN"));
        tf7.setFont(tf1.getFont().deriveFont(16.0f));
        tf8 = new JTextField();
        tf8.setBounds(740, 210, 250, 30);
        tf8.setBackground(Color.getColor("GREEN"));
        tf8.setFont(tf1.getFont().deriveFont(16.0f));
        tf6 = new JTextField();
        tf6.setBounds(740, 280, 250, 30);
        tf6.setBackground(Color.getColor("GREEN"));
        tf6.setFont(tf1.getFont().deriveFont(16.0f));
  
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(110, 480, 100, 30);
        b1.setFont(myFont3);
        b4 = new JButton("Print Tax Paid Receipts");
        b4.addActionListener(this);
        b4.setBounds(310, 480, 250, 30);
        b4.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(650, 480, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Taxation Bills");
        b3.setBounds(830, 480, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        Cal1 = new JButton();
        Cal1.addActionListener(this); 
        Cal1.setBounds(450, 200, 70, 40);
        Cal2 = new JButton();
        Cal2.addActionListener(this); 
        Cal2.setBounds(1050, 200, 70, 40);
        Calicon1 =  new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\calendar.png"));
        Calicon2 =  new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\calendar.png"));
        Cal1.add(Calicon1);
        Cal2.add(Calicon2);
       
        f1.add(Cal1);
        f1.add(Cal2);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l12);
        f1.add(tf1);
        f1.add(tf3);
        f1.add(tf4);
        f1.add(tf7);
        f1.add(tf8);
        f1.add(tf6);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Taxattion_Entry txe = new Taxattion_Entry();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         if(!tf1.getText().equals("") && !tf3.getText().equals("") && !tf4.getText().equals("") && !tf6.getText().equals("") && !tf7.getText().equals("") && !tf8.getText().equals(""))
         {
            try
         {
          db.pst2.setString(1,tf1.getText());
          db.pst2.setString(2,tf7.getText());
          db.pst2.setString(3,tf3.getText());
          db.pst2.setString(4,tf8.getText());
          db.pst2.setString(5,tf4.getText());
          db.pst2.setString(6,tf6.getText());
         }
       catch(Exception ae)
       {
          System.out.println("Exception "+ae);  
       }
         
           try 
           {
               db.rowaffected = db.pst2.executeUpdate();
               JOptionPane.showMessageDialog(null, "New Tax Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE);
               tf1.setText("");tf3.setText("");tf4.setText("");tf6.setText("");tf7.setText("");tf8.setText("");
           } 
           catch (SQLException ex) 
           {
               System.out.println("Error while Inserting Records  "+ex);
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
        TableExample18 t = new TableExample18();  
      } 
      if(e.getSource() == b4)
      {
          JOptionPane.showMessageDialog(null, "Taxation Bill is Printing","Print !",JOptionPane.INFORMATION_MESSAGE); 
      } 
      if(e.getSource() == Cal1)
      {
        tf3.setText(new DatePicker(f1).setPickedDate()); 
      }
      if(e.getSource() == Cal2)
      {
        tf8.setText(new DatePicker(f1).setPickedDate()); 
      }
    }
  
}
class Database_Procedure16
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure16()
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
           
            pst2=con.prepareStatement("INSERT INTO taxationentry (BillNo,Type,FromDate,ToDate,TaxPayment,Status)"+"VALUES(?,?,?,?,?,?)");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}