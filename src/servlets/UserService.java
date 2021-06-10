package servlets;

import javax.servlet.http.*;

public class UserService {

    public void getName(HttpServletRequest request) {
        System.out.println(request.getParameter("name"));
    }
}
