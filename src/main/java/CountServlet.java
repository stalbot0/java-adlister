import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "countServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        hitCount++;
        PrintWriter out = response.getWriter();
        String resetCounter = request.getParameter("reset");

        if(Objects.equals(resetCounter, "resetCount")){
            hitCount = 0;
//            String resettingCount = "Resetting Hit Count!";
//            out.println(resettingCount);
            response.sendRedirect("http://localhost:8080/count");
            return;
        }

        String hitCounter = "Total # hits: ";
        out.println(hitCounter + hitCount);
    }
}
