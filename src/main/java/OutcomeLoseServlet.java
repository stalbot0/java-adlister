import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loseServlet", urlPatterns = "/incorrect")
public class OutcomeLoseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userNum = request.getParameter("guess-number");
        String compNum = request.getParameter("computer-number");

        String loseMsg = String.format("You lost :/ You guessed the number %s while my number was %s", userNum, compNum);

        request.setAttribute("message", loseMsg);
        request.setAttribute("outcome", "lose");

        request.getRequestDispatcher("/outcome.jsp").forward(request, response);
    }
}
