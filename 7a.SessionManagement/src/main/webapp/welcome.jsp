<%@ page contentType="text/html; charset=UTF-8" %>
<%
    // 1) Read the user name
    String name = request.getParameter("uname");
    if (name == null || name.trim().isEmpty()) {
        response.sendRedirect("index.html");
        return;
    }

    // 2) Store in session
    session.setAttribute("user", name);

    // 3) Set session timeout = 60 seconds
    session.setMaxInactiveInterval(60);  // in seconds
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Welcome</title>
</head>
<body>
  <h2>Welcome, <%= name %>!</h2>
  <p>Your session has started. It will expire after 1 minute of inactivity.</p>
  <p><a href="second.jsp">Go to second page</a></p>
</body>
</html>
