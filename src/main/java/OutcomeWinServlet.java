import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "winServlet", urlPatterns = "/correct")
public class OutcomeWinServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userNum = request.getParameter("guess-number");
        String compNum = request.getParameter("computer-number");

        String winMsg = String.format("You won! I guessed the number %s AND you guessed the number %s!", compNum, userNum);

        request.setAttribute("message", winMsg);
        request.setAttribute("outcome", "win");

        request.getRequestDispatcher("/outcome.jsp").forward(request, response);
    }
}

