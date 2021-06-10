package servlets;

import com.sun.scenario.effect.impl.sw.sse.*;
import java.io.*;
import javax.servlet.*;

public class RequestFilter implements Filter {

    @Override
    public void init(FilterConfig var1) {
        System.out.println("INIT FILTER");
    }

    @Override
    public void destroy() {
        System.out.println("DESTROY FILTER");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter) throws IOException, ServletException {
        request.setAttribute("url", request.getLocalName());
        filter.doFilter(request, response);
    }
}
