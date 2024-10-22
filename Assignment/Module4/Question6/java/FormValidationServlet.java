
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FormValidationServlet
 */
@WebServlet("/validateForm")
public class FormValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private static final String nameregex = "^[a-zA-Z]+$";
    private static final String mobileregex = "^\\d{10}$";
    private static final String emailregex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String passwordregex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&_])[A-Za-z\\d@#$%&_]{8,}$";

    /**
     * Default constructor. 
     */
    public FormValidationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder("Validation Errors:");

        if (!Pattern.matches(nameregex, firstName)) {
            isValid = false;
            errorMessage.append("\n- First Name must contain only alphabets.");
        }

        if (!Pattern.matches(nameregex, lastName)) {
            isValid = false;
            errorMessage.append("\n- Last Name must contain only alphabets.");
        }

        if (!Pattern.matches(mobileregex, mobile)) {
            isValid = false;
            errorMessage.append("\n- Mobile number must be exactly 10 digits.");
        }

        if (!Pattern.matches(emailregex, email)) {
            isValid = false;
            errorMessage.append("\n- Email must be a valid email format.");
        }

        if (!Pattern.matches(passwordregex, password)) {
            isValid = false;
            errorMessage.append("\n- Password must contain at least 1 upper case letter, 1 lower case letter, 1 digit, and 1 special character (@, #, $, %, _, &). It must be at least 8 characters long.");
        }

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        if (isValid) {
            out.println("Validation successful! Form data is valid.");
        } else {
            out.println(errorMessage.toString());
        }
    }
		
}
	