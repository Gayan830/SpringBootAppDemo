package com.example.animal.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("Hello Servlet Do get Method fires.");
    }

    @WebFilter(filterName="helloFilter", urlPatterns="/helloServlet")
    public class HelloFilter implements Filter {

        @Override
        public void doFilter(ServletRequest servletRequest,
                             ServletResponse servletResponse, FilterChain filterChain)
                throws IOException, ServletException {
            System.out.println("Executing doFilter method");
            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println("Done executing doFilter method");
        }
    }
}
