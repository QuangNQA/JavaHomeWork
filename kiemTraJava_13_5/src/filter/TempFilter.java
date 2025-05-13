package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class TempFilter implements Filter {
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    String temp = request.getParameter("temperature");

    try {
      Double.parseDouble(temp); // Check if it is a valid number
      chain.doFilter(request, response); // Continue to Servlet
    } catch (NumberFormatException e) {
      request.setAttribute("error", "Invalid temperature value!");
      RequestDispatcher dispatcher = request.getRequestDispatcher("temp.jsp");
      dispatcher.forward(request, response);
    }
  }
}
