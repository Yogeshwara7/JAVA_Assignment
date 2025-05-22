<%@ page contentType="text/html; charset=UTF-8" %>
<%
    // Retrieve from session
    String name = (String) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Second Page</title>
</head>
<body>
  <h2>Second Page</h2>
  <%
    if (name == null) {
  %>
      <p style="color:red;">Sorry, your session has expired.</p>
      <p><a href="index.html">Start a new session</a></p>
  <%
    } else {
  %>
      <p>Hello again, <strong><%= name %></strong>!</p>
      <p>Your session is still active.</p>
      <p><a href="second.jsp">Refresh this page</a> to keep it alive.</p>
  <%
    }
  %>
</body>
</html>
