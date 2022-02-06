import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
    Product p1 = new Product(1, "potato" , 25);
    Product p2 = new Product(2, "milk" , 50);
    Product p3 = new Product(3, "bread" , 20);

    Product p4 = new Product(4, "ball" , 600);
    Product p5 = new Product(5, "fish" , 90);
    Product p6 = new Product(6, "salad" , 50);
    Product p7 = new Product(7, "orange" , 230);
    Product p8 = new Product(8, "lemon" , 320);
    Product p9 = new Product(9, "yogurt" , 120);
    Product p10 = new Product(10, "tea" , 90);
    Date date = new Date();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
         pw.println("<h1> Some product card </h1>");
        pw.println("<p>");
        pw.println("The current date: ");
         pw.println(date.toString());
        pw.println("</p>");
         pw.println("<p>");
         pw.println(p1.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p2.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p3.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p4.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p5.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p6.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p7.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p8.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p9.toString());
        pw.println("</p>");
        pw.println("<p>");
         pw.println(p10.toString());
        pw.println("</p>");

         pw.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
