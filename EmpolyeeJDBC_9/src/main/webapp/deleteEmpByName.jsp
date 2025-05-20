<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Emp by Name</title></head>
<body>
<h2>Delete Employees (Name starts with 'S')</h2>
<form method="post" action="deleteEmpByName.jsp">
    <input type="submit" name="delete" value="Delete All Starting with 'S'">
</form>

<%
Connection con = null;
int total = 0;

try {
    // Load driver (optional in newer versions but helps avoid "No suitable driver" issues)
    Class.forName("com.mysql.cj.jdbc.Driver");

    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC", "root", "");

    if (request.getParameter("delete") != null) {
        PreparedStatement ps = con.prepareStatement("DELETE FROM Emp WHERE Emp_Name LIKE 'S%'");
        ps.executeUpdate();
    }

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    out.println("<h3>Salary Report</h3>");
    while (rs.next()) {
        int eno = rs.getInt("Emp_NO");
        String ename = rs.getString("Emp_Name");
        int basic = rs.getInt("Basicsalary");
        total += basic;
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
Emp_No : <%= eno %><br/>
Emp_Name: <%= ename %><br/>
Basic : <%= basic %><br/>
<%
    }
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
Grand Salary: <%= total %><br/>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    rs.close();
    st.close();
} catch (Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
} finally {
    if (con != null) try { con.close(); } catch (Exception ignore) {}
}
%>
</body>
</html>
