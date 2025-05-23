<!--
9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively
-->



<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>
<h2>Salary Report</h2>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");
    double grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        // Insert new employee
        PreparedStatement pst = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        pst.setInt(1, Integer.parseInt(empno));
        pst.setString(2, empname);
        pst.setDouble(3, Double.parseDouble(basicsalary));
        pst.executeUpdate();

        // Retrieve all employees
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
