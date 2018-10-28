
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Add_Administrative extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf3,tf4,tf6,tf7,tf10,tf11,tf14;
    JLabel l1,l2,l3,l4,l7,l10,l11,l12,l13,l14;
    JButton b1,b2,b3;
    Database_Procedure_Add_Administrative db;
    public Add_Administrative()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        
        db = new Database_Procedure_Add_Administrative();

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
        l2 = new JLabel("ID");
        l2.setBounds(30, 140, 80, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("Name");
        l3.setBounds(390, 140, 140, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        l7 = new JLabel("Qualification");
        l7.setBounds(30, 230, 140, 30);
        l7.setFont(myFont2);
        l7.setForeground(Color.BLACK);
        l10 = new JLabel("Address");
        l10.setBounds(390, 230, 140, 30);
        l10.setFont(myFont2);
        l10.setForeground(Color.BLACK);
        l11 = new JLabel("Contact No.");
        l11.setBounds(30, 320, 140, 30);
        l11.setFont(myFont2);
        l11.setForeground(Color.BLACK);
        l12 = new JLabel("Email  ID");
        l12.setBounds(390, 320, 140, 30);
        l12.setFont(myFont2);
        l12.setForeground(Color.BLACK);
        l13 = new JLabel("Username");
        l13.setBounds(30, 410, 140, 30);
        l13.setFont(myFont2);
        l13.setForeground(Color.BLACK);
        l14 = new JLabel("Password");
        l14.setBounds(390, 410, 140, 30);
        l14.setFont(myFont2);
        l14.setForeground(Color.BLACK);
        
        tf1 = new JTextField();
        tf1.setBounds(160, 140, 200, 30);
        //tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf3 = new JTextField();
        tf3.setBounds(160, 230, 200, 30);
      //  tf3.setBackground(Color.getColor("GREEN"));
        tf3.setFont(tf1.getFont().deriveFont(16.0f));
        tf4 = new JTextField();
        tf4.setBounds(160, 320, 200, 30);
      //  tf4.setBackground(Color.getColor("GREEN"));
        tf4.setFont(tf1.getFont().deriveFont(16.0f));
        tf6 = new JTextField();
        tf6.setBounds(160, 410, 200, 30);
       // tf6.setBackground(Color.getColor("GREEN"));
        tf6.setFont(tf1.getFont().deriveFont(16.0f));
        tf7 = new JTextField();
        tf7.setBounds(550, 140, 250, 30);
        //tf7.setBackground(Color.getColor("GREEN"));
        tf7.setFont(tf1.getFont().deriveFont(16.0f));
        tf14 = new JTextField();
        tf14.setBounds(550, 230, 250, 60);
       // tf14.setBackground(Color.getColor("GREEN"));
        tf14.setFont(tf1.getFont().deriveFont(16.0f));
        tf10 = new JTextField();
        tf10.setBounds(550, 320, 250, 30);
        //tf10.setBackground(Color.getColor("GREEN"));
        tf10.setFont(tf1.getFont().deriveFont(16.0f));
        tf11 = new JTextField();
        tf11.setBounds(550, 410,250, 30);
       // tf11.setBackground(Color.getColor("GREEN"));
        tf11.setFont(tf1.getFont().deriveFont(16.0f));
       
         
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(50, 510, 100, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(290, 510, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Administrative List");
        b3.setBounds(570, 510, 250, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
      
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l7);
        f1.add(l10);
        f1.add(l11);
        f1.add(l12);
        f1.add(l13);
        f1.add(l14);
        
        f1.add(tf1);
        f1.add(tf3);
        f1.add(tf4);
        f1.add(tf6);
        f1.add(tf7);
        f1.add(tf14);
        f1.add(tf10);
        f1.add(tf11);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(-3,0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Add_Administrative ast = new Add_Administrative();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         
         if(!tf1.getText().equals("") && !tf3.getText().equals("") && !tf4.getText().equals("") && !tf6.getText().equals("") && !tf7.getText().equals("") && !tf10.getText().equals("") && !tf11.getText().equals("") && !tf14.getText().equals(""))
         {
            
         try
         {
          db.pst2.setString(1,tf1.getText());
          db.pst2.setString(2,tf7.getText());
          db.pst2.setString(3,tf3.getText());
          db.pst2.setString(4,tf14.getText());
          db.pst2.setString(5,tf4.getText());
          db.pst2.setString(6,tf10.getText());
          db.pst2.setString(7,tf6.getText());
          db.pst2.setString(8,tf11.getText());
         }
       catch(Exception ae)
       {
          System.out.println("Exception "+ae);  
       }
         
           try 
           {
               db.rowaffected = db.pst2.executeUpdate();
               JOptionPane.showMessageDialog(null, "New Administrative Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE);
               tf1.setText("");tf3.setText("");tf4.setText("");tf6.setText("");tf7.setText("");tf10.setText("");tf11.setText("");tf14.setText("");
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
          Admin_Login ad = new Admin_Login();
          f1.setVisible(false);
      }
      if(e.getSource() == b3)
      {
        TableExample20 t = new TableExample20();  
      }
       
    }
  
}
class Database_Procedure_Add_Administrative
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure_Add_Administrative()
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
           
            pst2 = con.prepareStatement("INSERT INTO administration(ID,Name,Qualification,Address,EmailID,ContactNo,Username,Password)"+"VALUES(?,?,?,?,?,?,?,?)");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}