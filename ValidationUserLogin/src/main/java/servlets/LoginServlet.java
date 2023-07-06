package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String validEmail = "mahesh1234@gmail.com";
    private final String validPassword = "password";

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if (email.equals(validEmail) && password.equals(validPassword)) {
            // Successful login
            response.sendRedirect("dashboard.html");
        } else {
            // Invalid login
            response.sendRedirect("error.html");
        }
	}

}
