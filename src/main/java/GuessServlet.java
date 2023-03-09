import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "guessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userGuess = request.getParameter("guess-number");
        int userGuessNum = Integer.parseInt(userGuess);
        int max = 3;
        int min = 1;
//        int randomNum = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int randomNum = 2;
        //both userguess and randomnum are working

        if(userGuessNum < 1 || userGuessNum > 3) {
            response.sendRedirect("/guess.jsp");
        } else if(userGuessNum == randomNum) {
            response.sendRedirect("/correct.jsp");
        } else {
            response.sendRedirect("/incorrect.jsp");
        }
    }
}
