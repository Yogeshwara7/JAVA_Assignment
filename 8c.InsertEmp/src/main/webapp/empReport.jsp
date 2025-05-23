<%@ page import="java.sql.*" %>
<html>
<head><title>Salary Report</title></head>
<body>
<h2>Salary Report</h2>
<%
    double grandTotal = 0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee", "root", "");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            int eno = rs.getInt("empno");
            String ename = rs.getString("empname");
            double basic = rs.getDouble("basicsalary");
            grandTotal += basic;

            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
            out.println("Emp_No : " + eno + "<br>");
            out.println("Emp_Name : " + ename + "<br>");
            out.println("Basic : " + basic + "<br>");
        }

        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
        out.println("<strong>Grand Salary : " + grandTotal + "</strong><br>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
<a href="insertEmp.html">Insert More Employees</a>
</body>
</html>
