<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Coffee Records</title>
</head>
<body>
<h2>Coffee Names Starting with 'D'</h2>
<%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        PreparedStatement pst = con.prepareStatement("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");
        ResultSet rs = pst.executeQuery();

        boolean found = false;
        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {
            found = true;
            out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("coffee_name") + "</td><td>" + rs.getDouble("price") + "</td></tr>");
        }

        out.println("</table>");
        if (!found) {
            out.println("<p style='color:red;'>No coffee names found starting with 'D'.</p>");
        }

        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
