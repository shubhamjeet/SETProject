
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Room_Allocation extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton b1,b2,b3;
    JRadioButton rb1,rb2,rb3;
    Database_Procedure7 db;
    public Room_Allocation()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        db = new Database_Procedure7();

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
        l2 = new JLabel("Room  No.");
        l2.setBounds(30, 140, 140, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("Bed  No.");
        l3.setBounds(500, 140, 140, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        l5 = new JLabel("Room Location");
        l5.setBounds(30, 210, 140, 30);
        l5.setFont(myFont2);
        l5.setForeground(Color.BLACK);
        l6 = new JLabel("Room Floor");
        l6.setBounds(30, 280, 140, 30);
        l6.setFont(myFont2);
        l6.setForeground(Color.BLACK);
        l7 = new JLabel("Room Phone No.");
        l7.setBounds(500, 280, 140, 30);
        l7.setFont(myFont2);
        l7.setForeground(Color.BLACK);
        l8 = new JLabel("Patient ID");
        l8.setBounds(30, 350, 350, 30);
        l8.setFont(myFont2);
        l8.setForeground(Color.BLACK);
        l10 = new JLabel("Patient Name");
        l10.setBounds(500, 350, 350, 30);
        l10.setFont(myFont2);
        l10.setForeground(Color.BLACK);
        l9 = new JLabel("Room Type");
        l9.setBounds(30, 420, 180, 30);
        l9.setFont(myFont2);
        l9.setForeground(Color.BLACK);
      
        tf1 = new JTextField();
        tf1.setBounds(160, 140, 200, 30);
        tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf2 = new JTextField();
        tf2.setBounds(710, 140, 250, 30);
        tf2.setBackground(Color.getColor("GREEN"));
        tf2.setFont(tf1.getFont().deriveFont(16.0f));
        tf3 = new JTextField();
        tf3.setBounds(160, 280, 200, 30);
        tf3.setBackground(Color.getColor("GREEN"));
        tf3.setFont(tf1.getFont().deriveFont(16.0f));
        tf4 = new JTextField();
        tf4.setBounds(710, 280, 250, 30);
        tf4.setBackground(Color.getColor("GREEN"));
        tf4.setFont(tf1.getFont().deriveFont(16.0f));
        tf5 = new JTextField();
        tf5.setBounds(160, 350, 200, 30);
        tf5.setBackground(Color.getColor("GREEN"));
        tf5.setFont(tf1.getFont().deriveFont(16.0f));
        tf6 = new JTextField();
        tf6.setBounds(710, 350, 250, 30);
        tf6.setBackground(Color.getColor("GREEN"));
        tf6.setFont(tf1.getFont().deriveFont(16.0f));
        tf7 = new JTextField();
        tf7.setBounds(160, 420, 200, 30);
        tf7.setBackground(Color.getColor("GREEN"));
        tf7.setFont(tf1.getFont().deriveFont(16.0f));
        
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(50, 600, 100, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(290, 600, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Rooms List");
        b3.setBounds(570, 600, 180, 30);
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
        f1.add(l10);
        f1.add(tf1);
        f1.add(tf2);
        f1.add(tf3);
        f1.add(tf4);
        f1.add(tf5);
        f1.add(tf6);
        f1.add(tf7);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(rb1);
        f1.add(rb2);
        f1.add(rb3);
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Room_Allocation ba = new Room_Allocation();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         if(!tf1.getText().equals("") && !tf2.getText().equals("") && !tf3.getText().equals("") && !tf4.getText().equals("") && !tf5.getText().equals("") && !tf6.getText().equals("") && !tf7.getText().equals(""))
         {
            if(rb1.isSelected() || rb2.isSelected() || rb3.isSelected())
            {
               try
         {
          db.pst2.setInt(1,Integer.parseInt(tf1.getText()));
          db.pst2.setInt(2,Integer.parseInt(tf2.getText()));
          db.pst2.setString(4,tf3.getText());
          db.pst2.setString(5,tf4.getText());
          db.pst2.setString(6,tf5.getText());
          db.pst2.setString(7,tf6.getText());
          db.pst2.setString(8,tf7.getText());
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
               JOptionPane.showMessageDialog(null, "New Room Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE);
               tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");tf6.setText("");tf7.setText("");tf5.setText("");rb1.setSelected(false);rb2.setSelected(false);rb3.setSelected(false);
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
          MedicalStaff_Login as = new MedicalStaff_Login();  
          f1.setVisible(false);
       }
      if(e.getSource() == b3)
      {
         TableExample15 t = new TableExample15(); 
      }
  
  }
}        
class Database_Procedure7
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure7()
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
           
            pst2=con.prepareStatement("INSERT INTO roomallocation (RoomNo,BedNo,Location,Floor,PhoneNo,pID,pName,Type)"+"VALUES(?,?,?,?,?,?,?,?)");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}