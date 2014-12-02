package Jersey.ClientServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lab on 14-12-2.
 */
public class JServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHold(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHold(req,resp);
    }

    protected void doHold(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        System.out.println("do holding");

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("hello ........ ");
        out.flush();
        out.close();
    }
}
