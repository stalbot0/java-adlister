import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");


        System.out.format("Crust: %s%n", crust);
        System.out.format("Sauce: %s%n", sauce);
        System.out.format("Size: %s%n", size);
        System.out.print("Toppings: ");
        for (String topping : toppings) {
            System.out.format("%s | ", topping);
        }
        System.out.println();
        System.out.format("Address: %s", address);
    }
}
