
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Welcome extends JFrame implements ActionListener
{
    JFrame f1;
    static JComboBox cb;
    JLabel l1,l2,l3,l4,background,login;
    JTextField tf1;
    static JPasswordField tf2;
    JButton b1,b2,b3;
    String sections[] = {"Type","Board of Director","Doctor","Administration","Staff"};
    Database_Procedure db;
    public Welcome()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setLayout(new BorderLayout());
        background = new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\p1.jpg"));
        f1.add(background);
        background.setLayout(null);
        
        db = new Database_Procedure();

        Font myFont = new Font("Times New Roman",Font.PLAIN,20);
        cb = new JComboBox(sections);
        cb.setBounds(790, 190, 180, 40);
        cb.setFont(myFont);
        
        Font myFont2 = new Font("Times New Roman",Font.BOLD,22);
        Font myFont1 = new Font("lucida calligraphy",Font.BOLD,45);
        Font myFont4 = new Font("lucida calligraphy",Font.BOLD,17);
        l1 = new JLabel("Medicare Hospital");
        l1.setFont(myFont1);
        l1.setBounds(350, 10, 890, 70);
        l1.setForeground(Color.BLUE);
        l4 = new JLabel("Compassion. Innovation. Trust.");
        l4.setFont(myFont4);
        l4.setBounds(680, 70, 350, 30);
        l4.setForeground(Color.red);
        l2 = new JLabel("Username");
        l2.setBounds(790, 250, 100, 40);
        l2.setFont(myFont2);
        l2.setForeground(Color.GRAY);
        l3 = new JLabel("Password");
        l3.setBounds(790, 310, 100, 40);
        l3.setFont(myFont2);
        l3.setForeground(Color.GRAY);
        
        tf1 = new JTextField();
        tf1.setBounds(920, 260, 200, 30);
       // tf1.setBackground(Color.getColor("GREEN"));
        tf1.setForeground(Color.BLUE);
        tf1.setFont(tf1.getFont().deriveFont(15.0f));
        tf2 = new JPasswordField();
        tf2.setBounds(920, 320, 200, 30);
       // tf2.setBackground(Color.getColor("GREEN"));
        tf2.setForeground(Color.BLUE);
        
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,18);
        b1 = new JButton("LogIn");
        b1.addActionListener(this);
        b1.setBounds(790, 380, 100, 35);
        b1.setFont(myFont3);
        b2 = new JButton("Forget Password");
        b2.setBounds(830, 450, 180, 35);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("Exit");
        b3.setBounds(980, 380, 80, 35);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
       
        background.add(l1);
        background.add(cb);
        background.add(l2);
        background.add(l3);
        background.add(l4); 
        background.add(tf1);
        background.add(tf2);
        background.add(b1);
        background.add(b2);
        background.add(b3);
   
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setSize(1380, 740);
        f1.setLocation(-3, 0);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
      Welcome w = new Welcome();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
            char[] temp_pwd=tf2.getPassword();
            String pwd = String.copyValueOf(temp_pwd);
            String uname = tf1.getText();
            System.out.println("Username : "+uname+"   Password : "+pwd);
            String combo = (String) cb.getSelectedItem();
            if(combo.equals("Board of Director"))
            {
                if(db.checkLogin1(uname, pwd))
                {
                   Admin_Login ad = new Admin_Login();
                   f1.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login failed ! Enter Valid Username and Password","Failed !",JOptionPane.ERROR_MESSAGE);
                } 
            }
            if(combo.equals("Doctor"))
            {
                if(db.checkLogin2(uname, pwd))
                {
                  Doctor_Login d = new Doctor_Login(); 
                  f1.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login failed ! Enter Valid Username and Password","Failed !",JOptionPane.ERROR_MESSAGE);
                } 
            }
            if(combo.equals("Administration"))
            {
                if(db.checkLogin3(uname, pwd))
                {
                   AdminStaff_Login as = new AdminStaff_Login();
                   f1.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login failed ! Enter Valid Username and Password","Failed !",JOptionPane.ERROR_MESSAGE);
                } 
            }
            if(combo.equals("Staff"))
            {
                if(db.checkLogin4(uname, pwd))
                {
                   MedicalStaff_Login ms = new MedicalStaff_Login();
                   f1.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login failed ! Enter Valid Username and Password","Failed !",JOptionPane.ERROR_MESSAGE);
                } 
            }
            if(combo.equals("Type"))
            {
                JOptionPane.showMessageDialog(null, "Login failed ! Select LogIn Type First","Failed !",JOptionPane.ERROR_MESSAGE);
            }
       }
       
       if(e.getSource() == b2)
       {
           String combo = (String) cb.getSelectedItem();
           if(combo.equals("Type"))
           {
             JOptionPane.showMessageDialog(null, "failed ! Select LogIn Type First","Failed !",JOptionPane.ERROR_MESSAGE); 
           }
           else if(tf1.getText().equals(""))
           {
             JOptionPane.showMessageDialog(null, "failed ! Enter Username First","Failed !",JOptionPane.ERROR_MESSAGE);   
           }
           else
           {
             Forget_Password ps = new Forget_Password();  
           }
           
       }
       
       if(e.getSource() == b3)
       {
          System.exit(0);
       }
    }
  
}
class Database_Procedure
{
    Connection con;
    PreparedStatement pst1,pst2,pst3,pst4;
    ResultSet rs;
    Database_Procedure()
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
            pst1 = con.prepareStatement("select * from boardofdirector where Username=? and Password=?");
            pst2 = con.prepareStatement("select * from doctor where Username=? and Password=?");
            pst3 = con.prepareStatement("select * from administration where Username=? and Password=?");
            pst4 = con.prepareStatement("select * from staff where Username=? and Password=?");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public Boolean checkLogin1(String uname,String pwd)
    {
        try
        {
            pst1.setString(1, uname);
            pst1.setString(2, pwd); 
            rs=pst1.executeQuery();
            if(rs.next())
            {
              return true;
            }
            else
            {
                return false;
            }
        } 
        catch (Exception e)
        {
            System.out.println("Error while validating   "+e);
            return false;
        }
    }
    public Boolean checkLogin2(String uname,String pwd)
    {
        try
        {
            pst2.setString(1, uname);
            pst2.setString(2, pwd); 
            rs=pst2.executeQuery();
            if(rs.next())
            {
              return true;
            }
            else
            {
                return false;
            }
        } 
        catch (Exception e)
        {
            System.out.println("Error while validating  "+e);
            return false;
        }
    }
    public Boolean checkLogin3(String uname,String pwd)
    {
        try
        {
            pst3.setString(1, uname);
            pst3.setString(2, pwd); 
            rs=pst3.executeQuery();
            if(rs.next())
            {
              return true;
            }
            else
            {
                return false;
            }
        } 
        catch (Exception e)
        {
            System.out.println("Error while validating  "+e);
            return false;
        }
    }
    public Boolean checkLogin4(String uname,String pwd)
    {
        try
        {
            pst4.setString(1, uname);
            pst4.setString(2, pwd); 
            rs=pst4.executeQuery();
            if(rs.next())
            {
              return true;
            }
            else
            {
                return false;
            }
        } 
        catch (Exception e)
        {
            System.out.println("Error while validating  "+e);
            return false;
        }
    }
}