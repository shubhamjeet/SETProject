
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Forget_Password extends JFrame implements ActionListener
{
    JFrame f1;
    JButton b1,b2;
    JTextField tf1;
    JLabel l1,l2;
    Database_Procedure1 db;
    public Forget_Password()
    {
       f1 = new JFrame();
       db = new Database_Procedure1();
       
       b1 = new JButton("Send");
       b1.addActionListener(this);
       b1.setBounds(60, 210, 80, 30);
       b2 = new JButton("Exit");
       b2.addActionListener(this);
       b2.setBounds(230, 210, 80, 30);
       b1.setFocusable(false);
       b2.setFocusable(false);
    
       
       l1 = new JLabel("Password will be Send automatically");
       l1.setFont(l1.getFont().deriveFont(16.0f));
       l1.setBounds(20, 30, 400, 30);
       l2 = new JLabel("Enter Registered Email_ID");
       l2.setFont(l2.getFont().deriveFont(13.0f));
       l2.setBounds(40, 110, 200, 30);
       
       tf1 = new JTextField();
       tf1.setBounds(270, 110, 200, 30);
       
       f1.add(b1);
       f1.add(b2);
       f1.add(l1);
       f1.add(l2);
       f1.add(b2);
       f1.add(tf1);
       
       f1.setSize(500, 300);
       f1.setLayout(null);
       f1.setLocation(650, 210);
       f1.setVisible(true);
       f1.setResizable(false);
       f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       
    }
    public static void main(String[] args)
    {
       Forget_Password ps = new Forget_Password(); 
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b2)
       {
           f1.setVisible(false);
       }
       if(e.getSource() == b1)
       {
           String reid = tf1.getText();
           if(!reid.equals(""))
           {
               String combo = (String) Welcome.cb.getSelectedItem();
           if(combo.equals("Board of Director"))
           {
               try 
           {
             db.pst1.setString(1, reid);
             db.rs = db.pst1.executeQuery();
           } 
           catch (SQLException ex)
           {
              System.out.println("Error while Taking Email ID   "+e);
           }
           try 
           {
               while(db.rs.next())
               {
                 Welcome.tf2.setText(db.rs.getString(1));
                 
               }
           } 
           catch (SQLException ex) 
           {
              System.out.println("Error while Giving Pssword   "+e);
           }
           }
           if(combo.equals("Doctor"))
           {
               try 
           {
               db.pst2.setString(1, reid);
               db.rs = db.pst2.executeQuery();
              
           } 
           catch (SQLException ex)
           {
              System.out.println("Error while Taking Email ID   "+e);
           }
         
           try 
           {
               while(db.rs.next())
               {
                 Welcome.tf2.setText(db.rs.getString(1));
               }
                
           } 
           catch (SQLException ex) 
           {
              System.out.println("Error while Giving Pssword   "+e);
           }
           }
           if(combo.equals("Administration"))
           {
              try 
           {
              db.pst3.setString(1, reid);
              db.rs = db.pst3.executeQuery();
           } 
           catch (SQLException ex)
           {
              System.out.println("Error while Taking Email ID"+e);
           }
         
           try 
           {
               while(db.rs.next())
               {
                  Welcome.tf2.setText(db.rs.getString(1));
               }
           } 
           catch (SQLException ex) 
           {
              System.out.println("Error while Giving Pssword   "+e);
           }  
           }
           
           if(combo.equals("Staff"))
           {
              try 
           {
              db.pst4.setString(1, reid);
              db.rs = db.pst4.executeQuery();
           } 
           catch (SQLException ex)
           {
              System.out.println("Error while Taking Email ID"+e);
           }
         
           try 
           {
               while(db.rs.next())
               {
                  Welcome.tf2.setText(db.rs.getString(1));
               }
           } 
           catch (SQLException ex) 
           {
              System.out.println("Error while Giving Pssword   "+e);
           }  
           }
           
          f1.setVisible(false);
          char[] temp_pwd2 = Welcome.tf2.getPassword();
          String pwd1 = String.copyValueOf(temp_pwd2);
          if(pwd1.equals(""))
          {
            JOptionPane.showMessageDialog(null, "failed ! Enter Valid Registered Email ID","Failed !",JOptionPane.ERROR_MESSAGE);               
          }
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Enter Email ID First","Failed !",JOptionPane.ERROR_MESSAGE);               
           }
           
       }
    }
    
}
class Database_Procedure1
{
    Connection con;
    PreparedStatement pst1,pst2,pst3,pst4;
    ResultSet rs;
    Database_Procedure1()
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
            pst1 = con.prepareStatement("select Password from boardofdirector where EmailID=?");
            pst2 = con.prepareStatement("select Password from doctor where EmailID=?");
            pst3 = con.prepareStatement("select Password from administration where EmailID=?");
            pst4 = con.prepareStatement("select Password from staff where EmailID=?");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}