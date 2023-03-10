import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username != null && username.equals("admin") && password != null && password.equals("password")) {
//            posts to /login page but shows the profile.jsp. We would want to create a redirect that would send us to /profile and the profile servlet would take care of the request/response
//            response.sendRedirect("/profile");
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
            return;
        } else {
            response.sendRedirect("/login");
        }
    }
}
