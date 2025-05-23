<!--
9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively
-->


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Coffee Records</title>
</head>
<body>
<%
    String id = request.getParameter("id");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        if (id != null && !id.trim().isEmpty()) {
            PreparedStatement pst = con.prepareStatement("DELETE FROM coffee WHERE id = ?");
            pst.setInt(1, Integer.parseInt(id));
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                out.println("<h3 style='color:green;'>Coffee record deleted successfully.</h3>");
            } else {
                out.println("<h3 style='color:red;'>Coffee ID not found.</h3>");
            }
        }

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>Remaining Coffee Records:</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {
            out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("coffee_name") + "</td><td>" + rs.getDouble("price") + "</td></tr>");
        }

        out.println("</table>");
        con.close();
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
%>
</body>
</html>
