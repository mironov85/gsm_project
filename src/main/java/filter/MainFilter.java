package filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Random;

public class MainFilter implements Filter {

    //private String prize = "PRIZE";
    private String [] prize = {"money","car","free beer"};
    Random rand = new Random();
    String result = prize[rand.nextInt(prize.length)];
    private FilterConfig config = null;
    // @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
    {
        request.setAttribute("prize",result); //"Hello filter!");
        //public String i = "prize";
        //System.out.println("The message is: ");
        chain.doFilter(request, response);
    }

 //   @Override
    public void destroy() {}

   // @Override
    public void init(FilterConfig config) {}
}