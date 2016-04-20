import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Ch1Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        try {
            request.getRequestDispatcher("/form.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}