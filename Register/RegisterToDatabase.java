import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterToDatabase extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, NumberFormatException{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String fullname = request.getParameter("fullname");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		try{ 
			//database = gov_task;
			//table = userRecords;
			String url = "jdbc:mysql://localhost/gov_task";
			String user = "saman";
			String pass = "saman1";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url, user, pass);

			String sql = "insert into userRecords(fullname, address, age, email, phonenumber) values (?,?,?,?,?)";

			PreparedStatement prst = con.prepareStatement(sql); 

			prst.setString(1,fullname);
			prst.setString(2,address);
			prst.setInt(3,age);
			prst.setString(4,email);
			prst.setString(5,phonenumber);
			
			int i = prst.executeUpdate();
			
			if(i>0){
				writer.println("<h1>You are succesfully registered..</h1>");
				writer.println("<br>");
				writer.println("You are registered as: <br>");
				writer.println("<strong>ID</strong> : " + i);
				writer.println("<strong>Fullname</strong> : " + fullname);
				writer.println("<strong>Address</strong> : " + address);
				writer.println("<strong>Age</strong> : " + age);
				writer.println("<strong>Email</strong> : " + email);
				writer.println("<strong>Phone Number</strong> : " + phonenumber);
			}
		} catch(Exception e){
			System.out.println(e);
		}
		writer.close();
	}
}
