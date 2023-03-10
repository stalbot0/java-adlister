import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "adsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("ads", ListAdsDaoFactory.getAdsDao().all());
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
