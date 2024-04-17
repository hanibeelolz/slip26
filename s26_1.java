import java.sql.*; 
public class DeleteEmployeeDetails { 
public static void main(String[] args) { 
try { 
 String url ="jdbc:odbc:employee_datClass.forName(“org.postgresql.Driver ");
Connection cn=DriverManager.getConnection("jdbc:odbc:employee_data","","");
Connection con = DriverManager.getConnection(url, username, 
password); 
PreparedStatement pstmt = con.prepareStatement("DELETE FROM Employee WHERE ENo=?"); 
int employeeID = Integer.parseInt(args[0]); 
pstmt.setInt(1, employeeID); 
int rowsAffected = pstmt.executeUpdate(); 
System.out.println(rowsAffected + " row(s) deleted."); 
pstmt.close(); 
con.close(); 
} catch (Exception e) { 
e.printStackTrace(); 
} 
} 
}
