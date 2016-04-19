//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="post-servlet", urlPatterns = { "/output" })
public class PostServelet extends HttpServlet{

    private static final long serialVersionUID = 2L;
//    private static final Log log = LogFactory.getLog(PostServelet.class);
//    private static final Logger logger =
//            LoggerFactory.getLogger(PostServelet.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//        log.debug("request: " + request);
//        log.debug("response: " + resp);
        request.getRequestDispatcher("/output.jsp").forward(request, resp);
    }
}