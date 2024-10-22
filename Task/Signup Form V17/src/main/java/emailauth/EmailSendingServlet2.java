package emailauth;
import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/EmailSendingServlet2")
public class EmailSendingServlet2 extends HttpServlet
{
	String resultMessage = "";
	private String host;
	private String port;
	private String user;
	private String pass;

	
	@Override
	public void init() throws ServletException
	{
		// TODO Auto-generated method stub
		//super.init();
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
	
		Object recipient = req.getAttribute("e1");
		String data = (String) recipient;
		
		String subject = "Welcome to my Project";
		
		HttpSession sess = req.getSession();
		
		String content = "Thank you for signup";
	
		try 
		{
			EmailUtility.sendEmail(host, port, user, pass, data, subject,content);
		
		} 
		catch (AddressException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MessagingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultMessage = "The e-mail was sent successfully";
		
		
		
	}
}