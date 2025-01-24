import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@WebServlet("/imageSave")
@MultipartConfig(maxFileSize=16177216)
public class imageSave extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		HttpSession ss = req.getSession(false);
		
		if(ss != null)
		{
			
			String usl = "jdbc:mysql://localhost:3306/jspcrud";
			String user = "root";
			String pass = "";
			
			String name = req.getParameter("p_name");
			String price = req.getParameter("p_price");
			Part image = req.getPart("p_image");
			InputStream io = image.getInputStream();
			
			int r = 0;
			Connection con = null;
		
			
				try {
					
				Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(usl, user, pass);
					
					PreparedStatement ps = con.prepareStatement("insert into products(p_name,p_price,p_image) values(?,?,?)");
				
					
					ps.setString(1, name);
					ps.setString(2, price);		
					ps.setBlob(3, io);
					
					
					r = ps.executeUpdate();
				
					if(r>0)
					{
						
						resp.sendRedirect("admindashboard.jsp");
					}
					else {
					System.out.println("error");
					}
					
					
				
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}

			
			
		}
		
	}
	
}
