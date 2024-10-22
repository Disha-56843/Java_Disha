import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitStudent")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // TODO Auto-generated method stub
//    	super.doPost(req, resp);

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        
        System.out.println("Student Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Password: " + password);
        
       
        response.getWriter().println("Student information submitted successfully!");
    }
}