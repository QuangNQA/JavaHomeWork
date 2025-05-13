package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TemperatureServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String tempStr = request.getParameter("temperature");
    String type = request.getParameter("type");

    double temp = Double.parseDouble(tempStr);
    double result = 0.0;
    String message = "";

    if ("CtoF".equals(type)) {
      result = temp * 9 / 5 + 32;
      message = temp + " °C = " + result + " °F";
    } else if ("FtoC".equals(type)) {
      result = (temp - 32) * 5 / 9;
      message = temp + " °F = " + result + " °C";
    }

    request.setAttribute("result", message);
    RequestDispatcher dispatcher = request.getRequestDispatcher("temp.jsp");
    dispatcher.forward(request, response);
  }
}
