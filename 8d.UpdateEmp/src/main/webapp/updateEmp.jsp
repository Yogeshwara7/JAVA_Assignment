<!--
8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively
-->



<%@ page import="java.sql.*" %>
<html>
<head><title>Update Employee Result</title></head>
<body>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    double basicsalary = Double.parseDouble(request.getParameter("basicsalary"));

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee", "root", "");

        PreparedStatement ps = con.prepareStatement(
            "UPDATE Emp SET empname = ?, basicsalary = ? WHERE empno = ?");

        ps.setString(1, empname);
        ps.setDouble(2, basicsalary);
        ps.setInt(3, empno);

        int i = ps.executeUpdate();

        if (i > 0) {
            out.println("<h3 style='color:green;'>Employee record updated successfully!</h3>");
        } else {
            out.println("<h3 style='color:red;'>Employee not found or update failed.</h3>");
        }

        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
<a href="updateEmp.html">Update Another Employee</a><br>
<a href="empReport.jsp">View Salary Report</a>
</body>
</html>
