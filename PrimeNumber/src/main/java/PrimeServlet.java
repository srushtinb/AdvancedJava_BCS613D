import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Step 1: Show the HTML form
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Prime Number Check</title></head><body>");
        out.println("<h2>Enter a Number to Check if it is Prime</h2>");
        out.println("<form action='PrimeServlet' method='post'>");
        out.println("Number: <input type='number' name='number' required>");
        out.println("<input type='submit' value='Check'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    // Step 2: Process the submitted number and check prime
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int number = Integer.parseInt(request.getParameter("number"));
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println("<html><head><title>Prime Number Result</title></head><body>");
        out.println("<h2>Result:</h2>");
        if (isPrime) {
            out.println("<p>" + number + " is a <b>prime number</b>.</p>");
        } else {
            out.println("<p>" + number + " is <b>not a prime number</b>.</p>");
        }
        out.println("<br><a href='PrimeServlet'>Check another number</a>");
        out.println("</body></html>");
    }
}
