<%@ page import="java.sql.*" %>
<%
String id = request.getParameter("id");
String name = request.getParameter("coffee_name");
String price = request.getParameter("price");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    PreparedStatement ps = con.prepareStatement("INSERT INTO coffee VALUES (?, ?, ?)");
    ps.setInt(1, Integer.parseInt(id));
    ps.setString(2, name);
    ps.setDouble(3, Double.parseDouble(price));
    ps.executeUpdate();

    out.println("<h3>Record Inserted Successfully</h3>");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee");
%>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Price</th></tr>
        <%
        while(rs.next()) {
            out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getDouble(3) + "</td></tr>");
        }
        %>
    </table>
<%
    con.close();
} catch(Exception e) {
    out.println("Error: " + e);
}
%>
