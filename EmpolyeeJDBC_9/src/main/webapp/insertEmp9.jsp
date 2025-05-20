<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Employee</title></head>
<body>
<h2>Insert into Emp Table</h2>
<form method="post">
    Emp No: <input type="number" name="empno" required><br/>
    Name: <input type="text" name="empname" required><br/>
    Basic Salary: <input type="number" name="salary" required><br/>
    <input type="submit" value="Insert">
</form>

<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");
int total = 0;

if (empno != null && empname != null && salary != null) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        ps.setInt(1, Integer.parseInt(empno));
        ps.setString(2, empname);
        ps.setInt(3, Integer.parseInt(salary));
        ps.executeUpdate();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Emp");
%>
<h3>Salary Report</h3>
<%
        while (rs.next()) {
            int eno = rs.getInt(1);
            String ename = rs.getString(2);
            int basic = rs.getInt(3);
            total += basic;
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
Emp_No : <%=eno%><br/>
Emp_Name: <%=ename%><br/>
Basic : <%=basic%><br/>
<%
        }
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
Grand Salary: <%=total%><br/>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
}
%>
</body>
</html>
