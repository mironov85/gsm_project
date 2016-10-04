package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //int i = 10;
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("This time you won ");// + i + " !");
        out.print(req.getAttribute("prize"));
        // out.print(filter.MainFilter.i);
        out.print(" !");
        out.print("</body>");
        out.print("</html>");

    }

}