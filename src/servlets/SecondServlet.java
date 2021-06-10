package servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        System.out.println(request.getMethod());
        Enumeration<String> params = request.getAttributeNames();
        String name = request.getParameter("name");
        Cookie cookie = new Cookie("name", name);
        Cookie cookie1 = new Cookie("name", "Tom");
        response.addCookie(cookie);
        response.addCookie(cookie1);
        UserService userService = new UserService();
        userService.getName(request);
        HttpSession session = request.getSession();
        session.setAttribute("name", "Anna");
        ServletContext context = getServletContext();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body>Second Servlet out");
        out.println("Hello, " + name + "</body>");
        out.println("</html>");
        System.out.println("URL: " + request.getAttribute("url"));
        System.out.println("RETURN IN SECOND SERVLET");
    }
}
