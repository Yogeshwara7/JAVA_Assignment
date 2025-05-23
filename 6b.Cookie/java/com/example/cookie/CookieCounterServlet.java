/*
6b. Build a servlet program to create a cookie to get your name through text box and press submit
button( through HTML) to display the message by greeting Welcome back your name ! , you have
visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.
 */




package com.example.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieCounterServlet")
public class CookieCounterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String name = request.getParameter("userName");

        // Create user name cookie
        Cookie nameCookie = new Cookie("userName", name);
        nameCookie.setMaxAge(60); // 1-minute expiry
        nameCookie.setPath("/");

        // Reset visit count to 1
        Cookie visitCookie = new Cookie("visitCount", "1");
        visitCookie.setMaxAge(60);
        visitCookie.setPath("/");

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        response.sendRedirect("CookieCounterServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = null;
        int visits = 1;
        boolean foundName = false;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("userName".equals(cookie.getName())) {
                    name = cookie.getValue();
                    foundName = true;
                }
                if ("visitCount".equals(cookie.getName())) {
                    try {
                        visits = Integer.parseInt(cookie.getValue()) + 1;
                    } catch (NumberFormatException e) {
                        visits = 1;
                    }
                }
            }
        }

        if (foundName) {
            // Update visit count
            Cookie updatedVisit = new Cookie("visitCount", String.valueOf(visits));
            updatedVisit.setMaxAge(60);
            updatedVisit.setPath("/");
            response.addCookie(updatedVisit);

            out.println("<h2 style='color:blue'>Welcome back, " + name + "!</h2>");
            out.println("<h3 style='color:green'>You have visited this page " + visits + " times.</h3>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieCounterServlet' method='post'>");
            out.println("Enter your name: <input type='text' name='userName' required>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }
    }
}
