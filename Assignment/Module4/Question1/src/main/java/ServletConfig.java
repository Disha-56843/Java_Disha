import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("ServletConfig")
public class ServletConfig extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = (ServletConfig) getServletConfig();
		//System.out.println(context.getContext(getServletInfo()));
		System.out.println(config.getInitParameter("mob"));
	}

}
