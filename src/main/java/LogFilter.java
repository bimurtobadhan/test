import javax.servlet.*;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter  {

    Logger log = LoggerFactory.getLogger(LogFilter.class);

    public void  init(FilterConfig config)
            throws ServletException{
    }
    public void  doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws java.io.IOException, ServletException {
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);

        log.debug("Entered doFilter");
        log.debug("Debug Request: " + request);
        log.debug("Debug Response :" + response);

        chain.doFilter(request,response);

        log.error("Entered doFilter");
        log.error("Error Request: " + request);
        log.error("Error Response :" + response);
    }
    public void destroy( ){
    }
}