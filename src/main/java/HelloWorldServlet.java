import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        PrintWriter helloWorld = response.getWriter();
//        helloWorld.println("<h1>Hello World!</h1>");
//        System.out.println("GAHHHHHH");
//    }
    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");

        if(name == null) {
            out.println("<h1>Hello World!</h1>");
            return;
        }
        out.println("<h1>Hello " + name +  "!</h1>");
    }
}
