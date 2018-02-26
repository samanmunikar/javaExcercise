import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Search extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String id_str = request.getParameter("id");
		String fullname = request.getParameter("fullname");
		String phonenumber = request.getParameter("phonenumber");

		int id = Integer.valueOf(id_str);

		try{
			//database = gov_task;
			//table = userRecords;
			String url = "jdbc:mysql://localhost/gov_task";
			String user = "saman";
			String pass = "saman1";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url,user,pass);

			String sql = "select * from userRecords where id=? and fullname=? and phonenumber=?";
			PreparedStatement prst = con.prepareStatement(sql);

			prst.setInt(1,id);
			prst.setString(2,fullname);
			prst.setString(3,phonenumber);

			writer.println("<table width = 50% border=1");
			writer.println("<caption>Results:</caption>");

			ResultSet rs = prst.executeQuery();
			/*Printing column names*/
			ResultSetMetaData rsmd = rs.getMetaData();
			int total = rsmd.getColumnCount();
			writer.println("<tr>");
			for (int i=1;i<=total;i++) {
				writer.print("<th>" + rsmd.getColumnName(i)+"</th>");
			}

			writer.print("</tr>");

			//printing result
			while(rs.next()){
				writer.print("<tr><td>"+rs.getInt(1)+"</td><td>"+
					rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+
					rs.getInt(4)+"</td><td>"+rs.getString(5)+"</td><td>"+
					rs.getString(6)+"</td></tr>");
			}

			writer.println("</table>");
		}catch(Exception e){
			e.printStackTrace();
		} finally{
			writer.close();
		}
	}
}