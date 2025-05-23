<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Salary Report</title>
</head>
<body>
    <h2>Salary Report</h2>
    <hr>
<%
    double grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee", "root", "");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            int empno = rs.getInt("empno");
            String empname = rs.getString("empname");
            double salary = rs.getDouble("basicsalary");

            grandTotal += salary;

            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
            out.println("Emp_No : " + empno + "<br>");
            out.println("Emp_Name : " + empname + "<br>");
            out.println("Basic : " + salary + "<br>");
        }

        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
        out.println("<strong>Grand Salary : " + grandTotal + "</strong><br>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
