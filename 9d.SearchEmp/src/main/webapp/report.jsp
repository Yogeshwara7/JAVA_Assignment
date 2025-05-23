<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Salary Report After Deletion</title>
</head>
<body>
<h2>Salary Report After Deleting Names Starting with 'S'</h2>
<%
    double grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        // Delete employees whose names start with 'S'
        PreparedStatement del = con.prepareStatement("DELETE FROM Emp WHERE empname LIKE 'S%'");
        int deleted = del.executeUpdate();
        out.println("<p style='color:blue;'>" + deleted + " record(s) deleted where name starts with 'S'</p>");

        // Retrieve remaining records
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            int eno = rs.getInt("empno");
            String name = rs.getString("empname");
            double salary = rs.getDouble("basicsalary");
            grandTotal += salary;

            out.println("<pre>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("Emp_No   : " + eno);
            out.println("Emp_Name : " + name);
            out.println("Basic    : " + salary);
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("</pre>");
        }

        out.println("<pre>Grand Salary : " + grandTotal + "</pre>");

        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
