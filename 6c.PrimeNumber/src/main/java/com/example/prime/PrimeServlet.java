package com.example.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Build HTML response
            out.println("<!DOCTYPE html><html><head><title>Prime Result</title>");
            out.println("<style>"
                      + "body{font-family:Arial;margin:30px;} "
                      + ".result{padding:15px;border:1px solid #ccc;border-radius:5px;width:300px;} "
                      + ".prime{color:green;} .notprime{color:red;}"
                      + "</style>");
            out.println("</head><body>");
            out.println("<div class='result'>");
            out.println("<h2>Prime Number Checker</h2>");
            out.printf("<p>Number entered: <strong>%d</strong></p>%n", number);
            if (isPrime) {
                out.printf("<p class='prime'><strong>%d is a Prime Number.</strong></p>%n", number);
            } else {
                out.printf("<p class='notprime'><strong>%d is NOT a Prime Number.</strong></p>%n", number);
            }
            out.println("<p><a href='index.html'>Check Another Number</a></p>");
            out.println("</div>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Invalid input. Please enter a valid integer.</p>");
            out.println("<p><a href='index.html'>Try Again</a></p>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect GET requests back to the form
        response.sendRedirect("index.html");
    }
}
