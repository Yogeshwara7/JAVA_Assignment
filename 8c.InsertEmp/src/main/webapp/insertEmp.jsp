<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Result</title></head>
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
            "INSERT INTO Emp (empno, empname, basicsalary) VALUES (?, ?, ?)");

        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setDouble(3, basicsalary);

        int i = ps.executeUpdate();

        if (i > 0) {
            out.println("<h3 style='color:green;'>Employee added successfully!</h3>");
        } else {
            out.println("<h3 style='color:red;'>Failed to add employee.</h3>");
        }

        con.close();
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
%>
<a href="empReport.jsp">View Employee Report</a><br>
<a href="insertEmp.html">Insert Another</a>
</body>
</html>
