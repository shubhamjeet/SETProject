
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class ShiftingAppointments extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf2;
    JLabel l1,l2,l3,l4,Calicon;
    JButton b1,b2,b3,Calendar;
    Database_Procedure10 db;
    
    public ShiftingAppointments()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        db = new Database_Procedure10();

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
        l2 = new JLabel("Appointment ID");
        l2.setBounds(80, 140, 150, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("New Appointment Date");
        l3.setBounds(80, 210, 240, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        
        
        tf1 = new JTextField();
        tf1.setBounds(320, 140, 250, 30);
        tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf2 = new JTextField();
        tf2.setBounds(320, 210, 250, 30);
        tf2.setBackground(Color.getColor("GREEN"));
        tf2.setFont(tf1.getFont().deriveFont(16.0f));
        
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(50, 290, 100, 30);
        b1.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(290, 290, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Appointments List");
        b3.setBounds(570, 290, 250, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        Calendar = new JButton();
        Calendar.addActionListener(this); 
        Calendar.setBounds(590, 200,70,40);
        Calicon =  new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\calendar.png"));
        Calendar.add(Calicon);
        
	
        f1.add(Calendar);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(tf1);
        f1.add(tf2);
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
      ShiftingAppointments sal = new ShiftingAppointments();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() == b1)
      {
        if(!tf1.getText().equals("") && !tf2.getText().equals(""))
        {
          try
         {
          db.pst2.setString(1,tf2.getText());
          db.pst2.setString(2,tf1.getText());
         }
         catch(Exception ae)
         {
            System.out.println("Exception "+ae);  
         }
          try 
           {
               db.rowaffected = db.pst2.executeUpdate();
               if(db.rowaffected>0)
               {
                  JOptionPane.showMessageDialog(null, "New Appointment Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE); 
                  tf1.setText("");tf2.setText("");
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "Enter Correct ID Or Date !","Failed !",JOptionPane.ERROR_MESSAGE);   
               }
               
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
         Doctor_Login d = new Doctor_Login();   
         f1.setVisible(false);
      }
      
      if(e.getSource() == Calendar)
      {
        tf2.setText(new DatePicker(f1).setPickedDate()); 
      }
      
      if(e.getSource() == b3)
      {
         TableExample9 t = new TableExample9(); 
      }
    
    }
  
}
class Database_Procedure10
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure10()
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
           
            pst2=con.prepareStatement("UPDATE appointments set Date=? where ID=?");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
 }
