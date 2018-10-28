
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Add_Departments extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf2,tf3,tf4,tf6,tf7,tf8,tf9,tf10;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b1,b2,b3;
    JRadioButton rb1,rb2,rb3;
    Database_Procedure3 db;
    public Add_Departments()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        
        f1.setLayout(null);
        db = new Database_Procedure3();

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
        l4.setBounds(660, 70, 350, 30);
        l4.setForeground(Color.red);
        l2 = new JLabel("Dpt. ID");
        l2.setBounds(30, 140, 80, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("Dpt.  Name");
        l3.setBounds(390, 140, 140, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        l5 = new JLabel("Dpt. Location");
        l5.setBounds(30, 210, 140, 30);
        l5.setFont(myFont2);
        l5.setForeground(Color.BLACK);
        l6 = new JLabel("Dpt.  Floor");
        l6.setBounds(30, 280, 140, 30);
        l6.setFont(myFont2);
        l6.setForeground(Color.BLACK);
        l7 = new JLabel("Dpt. Phone No.");
        l7.setBounds(390, 280, 140, 30);
        l7.setFont(myFont2);
        l7.setForeground(Color.BLACK);
        l8 = new JLabel("Head of the Department (HOD)");
        l8.setBounds(30, 350, 350, 30);
        l8.setFont(myFont2);
        l8.setForeground(Color.BLACK);
        l9 = new JLabel("Commity Members");
        l9.setBounds(30, 420, 180, 30);
        l9.setFont(myFont2);
        l9.setForeground(Color.BLACK);
      
        tf1 = new JTextField();
        tf1.setBounds(160, 140, 200, 30);
        tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf2 = new JTextField();
        tf2.setBounds(550, 140, 250, 30);
        tf2.setBackground(Color.getColor("GREEN"));
        tf2.setFont(tf1.getFont().deriveFont(16.0f));
        tf3 = new JTextField();
        tf3.setBounds(160, 280, 200, 30);
        tf3.setBackground(Color.getColor("GREEN"));
        tf3.setFont(tf1.getFont().deriveFont(16.0f));
        tf4 = new JTextField();
        tf4.setBounds(550, 280, 250, 30);
        tf4.setBackground(Color.getColor("GREEN"));
        tf4.setFont(tf1.getFont().deriveFont(16.0f));
        tf6 = new JTextField();
        tf6.setBounds(330, 350, 250, 30);
        tf6.setBackground(Color.getColor("GREEN"));
        tf6.setFont(tf1.getFont().deriveFont(16.0f));
        tf7 = new JTextField();
        tf7.setBounds(230, 420, 250, 30);
        tf7.setBackground(Color.getColor("GREEN"));
        tf7.setFont(tf1.getFont().deriveFont(16.0f));
        tf8 = new JTextField();
        tf8.setBounds(230, 460, 250, 30);
        tf8.setBackground(Color.getColor("GREEN"));
        tf8.setFont(tf1.getFont().deriveFont(16.0f));
        tf9 = new JTextField();
        tf9.setBounds(230, 500, 250, 30);
        tf9.setBackground(Color.getColor("GREEN"));
        tf9.setFont(tf1.getFont().deriveFont(16.0f));
        tf10 = new JTextField();
        tf10.setBounds(230, 540, 250, 30);
        tf10.setBackground(Color.getColor("GREEN"));
        tf10.setFont(tf1.getFont().deriveFont(16.0f));
        
        
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(50, 610, 100, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(290, 610, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Department List");
        b3.setBounds(570, 610, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        
        rb1 = new JRadioButton("Building A");
        rb1.setBounds(160, 200, 140, 50);
        rb1.setFont(myFont2);
        rb1.setForeground(Color.GRAY);
        rb1.addActionListener(this);
        rb2 = new JRadioButton("Building B");
        rb2.setBounds(320, 200, 140, 50);
        rb2.setFont(myFont2);
        rb2.setForeground(Color.GRAY);
        rb2.addActionListener(this);
        rb3 = new JRadioButton("Building C");
        rb3.setBounds(480, 200, 140, 50);
        rb3.setFont(myFont2);
        rb3.setForeground(Color.GRAY);
        rb3.addActionListener(this);
        
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(tf1);
        f1.add(tf2);
        f1.add(tf3);
        f1.add(tf4);
        f1.add(tf6);
        f1.add(tf7);
        f1.add(tf8);
        f1.add(tf9);
        f1.add(tf10);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(rb1);
        f1.add(rb2);
        f1.add(rb3);
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setSize(1380, 740);
        f1.setLocation(-3, 0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Add_Departments aw = new Add_Departments();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         if(!tf1.getText().equals("") && !tf2.getText().equals("") && !tf3.getText().equals("") && !tf4.getText().equals("") && !tf6.getText().equals("") && !tf7.getText().equals("") && !tf8.getText().equals("") && !tf9.getText().equals("") && !tf10.getText().equals(""))
         {
            if(rb1.isSelected() || rb2.isSelected() || rb3.isSelected())
            {
                try
         {
          db.pst2.setString(1,tf1.getText());
          db.pst2.setString(2,tf2.getText());
          db.pst2.setString(4,tf3.getText());
          db.pst2.setString(5,tf4.getText());
          db.pst2.setString(6,tf6.getText());
          db.pst2.setString(7,tf7.getText());
          db.pst2.setString(8,tf8.getText());
          db.pst2.setString(9,tf9.getText());
          db.pst2.setString(10,tf10.getText());
         
          if(rb1.isSelected())
          {
            db.pst2.setString(3,rb1.getText());  
          }
          else if(rb2.isSelected())
          {
             db.pst2.setString(3,rb2.getText());   
          }
          else if(rb3.isSelected())
          {
            db.pst2.setString(3,rb3.getText());  
          }
      
       }
       catch(Exception ae)
       {
          System.out.println("Exception "+ae);  
       }
         
           try 
           {
               db.rowaffected = db.pst2.executeUpdate();
               JOptionPane.showMessageDialog(null, "New Department Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE);
               tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");tf6.setText("");tf7.setText("");tf8.setText("");tf9.setText("");tf10.setText("");rb1.setSelected(false);rb2.setSelected(false);rb3.setSelected(false);
           } 
           catch (SQLException ex) 
           {
               System.out.println("Error while Inserting Records  "+ex);
           }
            }
            else
            {
              JOptionPane.showMessageDialog(null, "Select Building Location","Failed !",JOptionPane.ERROR_MESSAGE);  
            }
         }
         else
         {
            JOptionPane.showMessageDialog(null, "All Fields are Mendatory ! Fill Empty Fields","Failed !",JOptionPane.ERROR_MESSAGE);   
         }
         
      }
       
      if(e.getSource() == b2)
      {
          Admin_Login ad = new Admin_Login();
          f1.setVisible(false);
      }
      
      if(e.getSource() == b3)
      {
        TableExample t = new TableExample();  
      }
       
    }  
    
  
}
class Database_Procedure3
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure3()
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
           
            pst2=con.prepareStatement("INSERT INTO department (ID,Name,Location,Floor,PhoneNo,HOD,Comem1,Comem2,Comem3,Comem4)"+"VALUES(?,?,?,?,?,?,?,?,?,?)");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}