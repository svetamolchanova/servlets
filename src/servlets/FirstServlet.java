package servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    @Override
    public void init(){
        System.out.println("FIRST SERVLET CREATE");
    }

    @Override
    public void destroy() {
        System.out.println("FIRST SERVLET DESTROY");
    }

    @Override
    public void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException {
        super.service(var1, var2);
        System.out.println("FIRST SERVLET SERVICE");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        ServletContext context = getServletContext();

        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("Tom");
        users.add(user);
        User user2 = new User();
        user2.setId(2);
        user2.setName("Anna");
        users.add(user2);
        request.setAttribute("users", users);
        System.out.println("URL: " + request.getAttribute("url"));
        context.getRequestDispatcher("/first.jsp").include(request, response);
    }
}
