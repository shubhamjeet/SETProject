
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Stock_Entry extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1,tf3,tf4,tf5,tf6,tf7,tf8,tf10,tf11;
    JLabel l1,l2,l3,l4,l7,l8,l9,l12,l13,l14,l15,Calicon1,Calicon2,Calicon3;
    JButton b1,b2,b3,b4,Cal1,Cal2,Cal3;
    Database_Procedure15 db;
    
    public Stock_Entry()
    {
        f1 = new JFrame();
        f1.setTitle("Hospital Management System");
        f1.setSize(1380, 740);
        f1.setLayout(null);
        db = new Database_Procedure15();

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
        l2 = new JLabel("Stock ID");
        l2.setBounds(80, 140, 80, 30);
        l2.setFont(myFont2);
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("Date");
        l3.setBounds(530, 140, 140, 30);
        l3.setFont(myFont2);
        l3.setForeground(Color.BLACK);
        l7 = new JLabel("Bill No.");
        l7.setBounds(530, 350, 140, 30);
        l7.setFont(myFont2);
        l7.setForeground(Color.BLACK);
        l8 = new JLabel("Available Stock");
        l8.setBounds(530, 210, 210, 30);
        l8.setFont(myFont2);
        l8.setForeground(Color.BLACK);
        l9 = new JLabel("Stock Type");
        l9.setBounds(80, 210, 140, 30);
        l9.setFont(myFont2);
        l9.setForeground(Color.BLACK);
        l12 = new JLabel("New Ordered Stock");
        l12.setBounds(80, 280, 210, 30);
        l12.setFont(myFont2);
        l12.setForeground(Color.BLACK);
        l13 = new JLabel("Stock Order Date");
        l13.setBounds(530, 280, 190, 30);
        l13.setFont(myFont2);
        l13.setForeground(Color.BLACK);
        l14 = new JLabel("Total Stock Payment");
        l14.setBounds(80, 350, 200, 30);
        l14.setFont(myFont2);
        l14.setForeground(Color.BLACK);
        l15 = new JLabel("Estimate Delivery Date");
        l15.setBounds(250, 420, 220, 30);
        l15.setFont(myFont2);
        l15.setForeground(Color.BLACK);
        
        tf1 = new JTextField();
        tf1.setBounds(250, 140, 200, 30);
        tf1.setBackground(Color.getColor("GREEN"));
        tf1.setFont(tf1.getFont().deriveFont(16.0f));
        tf3 = new JTextField();
        tf3.setBounds(250, 210, 200, 30);
        tf3.setBackground(Color.getColor("GREEN"));
        tf3.setFont(tf1.getFont().deriveFont(16.0f));
        tf4 = new JTextField();
        tf4.setBounds(250, 280, 200, 30);
        tf4.setBackground(Color.getColor("GREEN"));
        tf4.setFont(tf1.getFont().deriveFont(16.0f));
        tf5 = new JTextField();
        tf5.setBounds(250, 350, 200, 30);
        tf5.setBackground(Color.getColor("GREEN"));
        tf5.setFont(tf1.getFont().deriveFont(16.0f));
        tf7 = new JTextField();
        tf7.setBounds(760, 140, 250, 30);
        tf7.setBackground(Color.getColor("GREEN"));
        tf7.setFont(tf1.getFont().deriveFont(16.0f));
        tf8 = new JTextField();
        tf8.setBounds(760, 210, 250, 30);
        tf8.setBackground(Color.getColor("GREEN"));
        tf8.setFont(tf1.getFont().deriveFont(16.0f));
        tf6 = new JTextField();
        tf6.setBounds(760, 280, 250, 30);
        tf6.setBackground(Color.getColor("GREEN"));
        tf6.setFont(tf1.getFont().deriveFont(16.0f));
        tf10 = new JTextField();
        tf10.setBounds(760, 350, 250, 30);
        tf10.setBackground(Color.getColor("GREEN"));
        tf10.setFont(tf1.getFont().deriveFont(16.0f));
        tf11 = new JTextField();
        tf11.setBounds(500, 420, 200, 30);
        tf11.setBackground(Color.getColor("GREEN"));
        tf11.setFont(tf1.getFont().deriveFont(16.0f));
  
        Font myFont3 = new Font("Times New Roman",Font.PLAIN,16);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b1.setBounds(100, 580, 100, 30);
        b1.setFont(myFont3);
        b4 = new JButton("Print Stock Bill");
        b4.addActionListener(this);
        b4.setBounds(300, 580, 130, 30);
        b4.setFont(myFont3);
        b2 = new JButton("Exit");
        b2.setBounds(500, 580, 100, 30);
        b2.setFont(myFont3);
        b2.addActionListener(this);
        b3 = new JButton("View Stock Details");
        b3.setBounds(700, 580, 180, 30);
        b3.setFont(myFont3);
        b3.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        Cal1 = new JButton();
        Cal1.addActionListener(this); 
        Cal1.setBounds(1050, 130, 70, 40);
        Cal2 = new JButton();
        Cal2.addActionListener(this); 
        Cal2.setBounds(1050, 270, 70, 40);
        Cal3 = new JButton();
        Cal3.addActionListener(this); 
        Cal3.setBounds(750, 410, 70, 40);
        Calicon1 =  new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\calendar.png"));
        Calicon2 =  new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\calendar.png"));
        Calicon3 =  new JLabel(new ImageIcon("G:\\Netbeans Projects\\MCA_Project\\Hospital Management System\\calendar.png"));
        Cal1.add(Calicon1);
        Cal2.add(Calicon2);
        Cal3.add(Calicon3);
       
        f1.add(Cal1);
        f1.add(Cal2);
        f1.add(Cal3);
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
        f1.add(tf11);
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
      Stock_Entry ppp = new Stock_Entry();  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
       {
         if(!tf1.getText().equals("") && !tf3.getText().equals("") && !tf4.getText().equals("") && !tf5.getText().equals("") && !tf6.getText().equals("") && !tf7.getText().equals("") && !tf8.getText().equals("") && !tf10.getText().equals("") && !tf11.getText().equals(""))
         {
           try
         {
          db.pst2.setString(1,tf1.getText());
          db.pst2.setString(2,tf7.getText());
          db.pst2.setString(3,tf3.getText());
          db.pst2.setString(4,tf8.getText());
          db.pst2.setString(5,tf4.getText());
          db.pst2.setString(6,tf6.getText());
          db.pst2.setString(7,tf5.getText());
          db.pst2.setInt(8,Integer.parseInt(tf10.getText()));
          db.pst2.setString(9,tf11.getText());
         }
       catch(Exception ae)
       {
          System.out.println("Exception "+ae);  
       }
         
           try 
           {
               db.rowaffected = db.pst2.executeUpdate();
               JOptionPane.showMessageDialog(null, "New Stock Records Inserted","Success !",JOptionPane.INFORMATION_MESSAGE);
               tf1.setText("");tf3.setText("");tf4.setText("");tf6.setText("");tf7.setText("");tf8.setText("");tf5.setText("");tf11.setText("");tf10.setText("");
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
         TableExample17 t = new TableExample17();  
      } 
      if(e.getSource() == b4)
      {
          JOptionPane.showMessageDialog(null, "Stock Bill is Printing","Print !",JOptionPane.INFORMATION_MESSAGE); 
      }
      if(e.getSource() == Cal1)
      {
        tf7.setText(new DatePicker(f1).setPickedDate()); 
      }
      if(e.getSource() == Cal2)
      {
        tf6.setText(new DatePicker(f1).setPickedDate()); 
      }
      if(e.getSource() == Cal3)
      {
        tf11.setText(new DatePicker(f1).setPickedDate()); 
      }
    }
  
}
class Database_Procedure15
{
    Connection con;
    PreparedStatement pst2;
    int rowaffected = 0;
    Database_Procedure15()
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
           
            pst2=con.prepareStatement("INSERT INTO stockentry (ID,Date,Type,AvailableStock,OrderedStock,OrderDate,TotalPayment,BillNo,DeliveryDate)"+"VALUES(?,?,?,?,?,?,?,?,?)");
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}