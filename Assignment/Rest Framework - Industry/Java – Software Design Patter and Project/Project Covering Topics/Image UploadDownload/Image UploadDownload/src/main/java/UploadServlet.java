

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final String UPLOAD_DIR = "D:\\Tops";;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		Part filePart = (Part) request.getPart("image"); 
        String fileName = filePart.getSubmittedFileName();
        File uploads = new File(UPLOAD_DIR);
        if (!uploads.exists()) {
            uploads.mkdir(); 
        }
        filePart.write(UPLOAD_DIR + File.separator + fileName); // Save the file
        response.getWriter().print("File uploaded successfully: " + fileName);
	}

}
