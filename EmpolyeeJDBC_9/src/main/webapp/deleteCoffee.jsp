<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Coffee Product</title></head>
<body>
<h2>Delete Coffee by ID</h2>
<form method="post">
    Enter ID to Delete: <input type="number" name="id" required>
    <input type="submit" value="Delete">
</form>

<%
String id = request.getParameter("id");
if (id != null) {
    Connection con = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        // Delete record with given id
        ps = con.prepareStatement("DELETE FROM coffee WHERE id = ?");
        ps.setInt(1, Integer.parseInt(id));
        ps.executeUpdate();

        // Fetch remaining records
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM coffee");
%>

<h3>Remaining Records</h3>
<table border="1" cellpadding="5" cellspacing="0">
    <tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getInt("priced") %></td>
    </tr>
<%
        }
%>
</table>

<%
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (st != null) st.close(); } catch (Exception e) {}
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
}
%>
</body>
</html>
