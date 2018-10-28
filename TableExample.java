
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExample extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from department");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Location", "Floor", "PhoneNo", "HOD", "Comem1", "Comem2", "Comem3", "Comem4"
            };
        
            Object[][] data = new Object[row][10];
            rs=st.executeQuery("Select * from department");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<10;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
     
    public static void main(String[] args)
    {
       TableExample t = new TableExample(); 
    }
}
 class TableExample1 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample1()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from doctor");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Age", "Sex", "Qualification", "Specialization", "Department", "Address", "ContactNo", "EmailID", "DrType", "VisitTimingFrom", "VisitTimingTo", "Username", "Password"
            };
        
            Object[][] data = new Object[row][15];
            rs=st.executeQuery("Select * from doctor");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<15;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample1 t = new TableExample1(); 
    }
}
class TableExample2 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample2()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from staff");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Age", "Sex", "Qualification", "Specialization", "Department", "Address", "ContactNo", "EmailID", "StaffType", "DutyTimingFrom", "DutyTimingTo", "Username", "Password"
            };
        
            Object[][] data = new Object[row][15];
            rs=st.executeQuery("Select * from staff");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<15;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample2 t = new TableExample2(); 
    }
}
class TableExample3 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample3()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from ward");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Location", "Floor", "PhoneNo", "HOD", "WardType"
            };
        
            Object[][] data = new Object[row][7];
            rs=st.executeQuery("Select * from ward");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<7;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample3 t = new TableExample3(); 
    }
}
class TableExample4 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample4()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from complainbox");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Complain", "Status"
            };
        
            Object[][] data = new Object[row][4];
            rs=st.executeQuery("Select * from complainbox");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<4;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample4 t = new TableExample4(); 
    }
}
class TableExample5 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample5()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from diagnosis");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Diagnosis", "Remark"
            };
        
            Object[][] data = new Object[row][4];
            rs=st.executeQuery("Select * from diagnosis");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<4;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample5 t = new TableExample5(); 
    }
}
class TableExample6 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample6()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from dischargesummary");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "AdmissionReason", "FinalDiagnosis", "ClinicalFindings", "Status"
            };
        
            Object[][] data = new Object[row][6];
            rs=st.executeQuery("Select * from dischargesummary");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<6;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample6 t = new TableExample6(); 
    }
}
class TableExample7 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample7()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from doctorpayments");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Type", "Department", "Salary", "ExtraDays", "TotalDays", "ExtraPayment", "TotalPayment"
            };
        
            Object[][] data = new Object[row][9];
            rs=st.executeQuery("Select * from doctorpayments");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<9;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample7 t = new TableExample7(); 
    }
}
class TableExample8 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample8()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from medicationreports");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "MedicineName", "Instructions", "Days", "Quantity"
            };
        
            Object[][] data = new Object[row][6];
            rs=st.executeQuery("Select * from medicationreports");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<6;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample8 t = new TableExample8(); 
    }
}
class TableExample9 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample9()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from appointments");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Date", "PatientID", "PatientName", "DoctorID", "DoctorName", "PatientContact", "Type"
            };
        
            Object[][] data = new Object[row][8];
            rs=st.executeQuery("Select * from appointments");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<8;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample9 t = new TableExample9(); 
    }
}
class TableExample10 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample10()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from patientbill");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Type", "BillNo", "RoomType", "NumberOfDays", "OtherCharge", "TreatmentFees", "TotalBill"
            };
        
            Object[][] data = new Object[row][9];
            rs=st.executeQuery("Select * from patientbill");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<9;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample10 t = new TableExample10(); 
    }
}
class TableExample11 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample11()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from patienthistoryrecords");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Allergies", "Warnings", "PreviousDisease", "Status", "Address", "PersonalInfo", "FamilyInfo"
            };
        
            Object[][] data = new Object[row][9];
            rs=st.executeQuery("Select * from patienthistoryrecords");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<9;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample11 t = new TableExample11(); 
    }
}
class TableExample12 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample12()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from patientregistration");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Age", "Sex", "Diagnosis", "Reason", "Doctor", "Address", "ContactNo", "Location", "Floor", "RoomNo", "BedNo"
            };
        
            Object[][] data = new Object[row][13];
            rs=st.executeQuery("Select * from patientregistration");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<13;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample12 t = new TableExample12(); 
    }
}
class TableExample13 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample13()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from prescribebloodtest");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "PatientID", "PatientName", "Diagnosis", "BloodTests", "Lab"
            };
        
            Object[][] data = new Object[row][5];
            rs=st.executeQuery("Select * from prescribebloodtest");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<5;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample13 t = new TableExample13(); 
    }
}
class TableExample14 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample14()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from prescribemedicines");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "PatientID", "PatientName", "Diagnosis", "Medicines", "Days", "Quantity"
            };
        
            Object[][] data = new Object[row][6];
            rs=st.executeQuery("Select * from prescribemedicines");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<6;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample14 t = new TableExample14(); 
    }
}
class TableExample15 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample15()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from roomallocation");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "RoomNo", "BedNo", "Location", "Floor", "PhoneNo", "PatientID", "PatientName", "Type"
            };
        
            Object[][] data = new Object[row][8];
            rs=st.executeQuery("Select * from roomallocation");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<8;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample15 t = new TableExample15(); 
    }
}
class TableExample16 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample16()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from staffpayroll");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Type", "Department", "Salary", "ExtraDuty", "Holidays", "Interest", "TotalPay"
            };
        
            Object[][] data = new Object[row][9];
            rs=st.executeQuery("Select * from staffpayroll");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<9;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample16 t = new TableExample16(); 
    }
}
class TableExample17 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample17()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from stockentry");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Date", "Type", "AvailableStock", "OrderedStock", "OrderDate", "TotalPayment", "BillNo", "DeliveryDate"
            };
        
            Object[][] data = new Object[row][9];
            rs=st.executeQuery("Select * from stockentry");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<9;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample17 t = new TableExample17(); 
    }
}
class TableExample18 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample18()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from taxationentry");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "BillNo", "Type", "FromDate", "ToDate", "TaxPayment", "Status"
            };
        
            Object[][] data = new Object[row][6];
            rs=st.executeQuery("Select * from taxationentry");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<6;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample18 t = new TableExample18(); 
    }
}
class TableExample19 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample19()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from vitalsignrecords");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Date", "PulseRate", "Temp", "Height", "B.P.", "Respiration", "Weight"
            };
        
            Object[][] data = new Object[row][9];
            rs=st.executeQuery("Select * from vitalsignrecords");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<9;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample19 t = new TableExample19(); 
    }
}

class TableExample20 extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    int row = 0;
    public TableExample20()
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
           
            st=con.createStatement();
            rs=st.executeQuery("select * from administration");
            while(rs.next())
            {
               row++;
            }
            String[] columns = new String[]
            {
              "ID", "Name", "Qualification", "Address",  "EmailID", "ContactNo", "Username", "Password"
            };
        
            Object[][] data = new Object[row][8];
            rs=st.executeQuery("Select * from administration");
	    for(int i1=0;i1<row;i1++)
            {
		rs.next();
		for(int j1=0;j1<8;j1++)
		{
		   data[i1][j1]=rs.getString(j1+1);
	        }				
	    }
        JTable table = new JTable(data, columns);
         
        this.add(new JScrollPane(table));
        this.setTitle("Database Data");
        this.setSize(1380, 740);
        this.setResizable(false);
        this.setLocation(-3,0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        this.setVisible(true);
           
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
    public static void main(String[] args)
    {
       TableExample20 t = new TableExample20(); 
    }
}
