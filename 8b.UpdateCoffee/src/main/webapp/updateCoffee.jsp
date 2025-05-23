<!--
8b. Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively
-->


<%@ page import="java.sql.*" %>
<%
String id = request.getParameter("id");
String name = request.getParameter("coffee_name");
String price = request.getParameter("price");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

    PreparedStatement ps = con.prepareStatement("UPDATE coffee SET coffee_name=?, price=? WHERE id=?");
    ps.setString(1, name);
    ps.setDouble(2, Double.parseDouble(price));
    ps.setInt(3, Integer.parseInt(id));

    int rows = ps.executeUpdate();
    if (rows > 0) {
        out.println("<h3>Record Updated Successfully</h3>");
    } else {
        out.println("<h3 style='color:red;'>No record found with ID: " + id + "</h3>");
    }

    // Display all records
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee");
%>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Price</th></tr>
        <%
        while(rs.next()) {
            out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("coffee_name") + "</td><td>" + rs.getDouble("price") + "</td></tr>");
        }
        %>
    </table>
<%
    con.close();
} catch(Exception e) {
    out.println("Error: " + e);
}
%>
