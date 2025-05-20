<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Delete Coffee Product</h2>
<form method="post">
  ID to Delete: <input type="text" name="id"/><br/>
  <input type="submit" value="Delete"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

    if (request.getParameter("id") != null) {
        int id = Integer.parseInt(request.getParameter("id"));
        PreparedStatement ps = con.prepareStatement("DELETE FROM coffee WHERE id = ?");
        ps.setInt(1, id);

        int i = ps.executeUpdate();
        if (i > 0) out.println("<p style='color:green;'>Coffee deleted successfully.</p>");
        else out.println("<p style='color:red;'>Coffee ID not found.</p>");
    }

    // Show remaining records
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

    out.println("<h3>Remaining Coffee Records</h3>");
    while (rs.next()) {
        out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getDouble("price") + "<br>");
    }

} catch(Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (con != null) con.close();
}
%>
</body>
</html>