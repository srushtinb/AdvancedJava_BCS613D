

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/MysqlServlet")
public class Mysql_select extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection dbConnection = null;

        try {
            // MySQL connection
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "";

            dbConnection = DriverManager.getConnection(url, user, password);

            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

            out.println("<html><head><title>Coffee Records</title></head><body>");
            out.println("<h2>Coffee Table Records</h2>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + price + "</td></tr>");
            }

            out.println("</table>");
            out.println("</body></html>");

            rs.close();
            stmt.close();
            dbConnection.close();

        } catch (SQLException e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
}
