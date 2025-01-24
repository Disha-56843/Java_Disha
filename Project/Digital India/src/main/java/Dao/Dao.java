package Dao;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Adminmodel;
import model.Cartmodel;
import model.Contactmodel;
import model.Model;
import model.NewsModel;
import model.Wishlistmodel;
import model.productmodel;

public class Dao {

	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digitalindia","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
//	signup
	public static int savedata(Model m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into users(fname,email,password) values (?,?,?)");
		
			ps.setString(1,m.getFname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
	}
	
//	signin
	
	public static Model signin(Model m)
	{
		Connection con = Dao.getconnect();
		
		Model m2 = null;
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				
				int id = set.getInt(1);
				String email = set.getString(2);
				String password = set.getString(3);
				
				m2 = new Model();
				m2.setId(id);
				m2.setEmail(email);
				m2.setPassword(password);
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
	}
	
	//Contact
	public static int contactinsert(Contactmodel m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into contact(name,email,number,subject,message,Status) values (?,?,?,?,?,?)");
		
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getNumber());
			ps.setString(4,m.getSubject());
			ps.setString(5,m.getMessage());
			ps.setString(6, "Pending");
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
	}
	
	
	public static List<productmodel> viewproducts() {
		
		List<productmodel> productlist = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet set = ps.executeQuery();
			
			
			while(set.next()) {
				
				
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				
				 
				byte[] imgData = set.getBytes(4);
				String encode = Base64.getEncoder().encodeToString(imgData);
				
				
				productmodel pm = new productmodel();
				
				pm.setId(id);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_image(encode);
				
				productlist.add(pm);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return productlist;
		
	}
	
	public static List<Cartmodel> getcartbyemail(String email)
	{
		List<Cartmodel>list = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from cart where email=?");
			ps.setString(1, email);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				
				String email1 = set.getString(5);
				byte[] imgData = set.getBytes("p_image"); 
		        String encode = Base64.getEncoder().encodeToString(imgData);
				
		        Cartmodel m = new Cartmodel();
				m.setId(id);
				m.setP_name(pname);
				m.setP_price(pprice);
				m.setP_image(encode);
				m.setEmail(email1);
				
				list.add(m);
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public static productmodel wishlistindexwise(int id)
	{
		
		productmodel m = null;
		
		Connection con = Dao.getconnect();
		
		try {
		PreparedStatement ps = con.prepareStatement("select * from products where id=?");
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			m = new productmodel();
			m.setId(rs.getInt(1));
			m.setP_name(rs.getString(2));
			m.setP_price(rs.getString(3));
			byte[] imgData = rs.getBytes("p_image"); 
	        String encode = Base64.getEncoder().encodeToString(imgData);
			m.setP_image(encode);
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return m;
	}
	
	public static List<Wishlistmodel>getwishlistbyemail(String email)
	{
		List<Wishlistmodel>list = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from wishlist where email=?");
			ps.setString(1, email);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				
				String email1 = set.getString(5);
				byte[] imgData = set.getBytes("p_image"); // blob field 
		        String encode = Base64.getEncoder().encodeToString(imgData);
				
				Wishlistmodel m = new Wishlistmodel();
				m.setId(id);
				m.setP_name(pname);
				m.setP_price(pprice);
				m.setP_image(encode);
				m.setEmail(email1);
				
				list.add(m);
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public static int deletefromwishlist(int id)
	{
		
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from wishlist where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Adminmodel adminlogin(Adminmodel m)
	{
		Connection con = Dao.getconnect();
		
		Adminmodel m2 = null;
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from adminlogin where user_id=? and password=?");
			
			ps.setString(1, m.getUser_id());
			ps.setString(2, m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				
				int id = set.getInt(1);
				String username = set.getString(2);
				String password = set.getString(3);
				
				m2 = new Adminmodel();
				m2.setId(id);
				m2.setUser_id(password);;
				m2.setPassword(password);
				
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
	}
	
	public static List<Contactmodel> viewcontact()
	{
		
		List<Contactmodel> plist = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from contact");
			ResultSet set = ps.executeQuery();
		
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String number = set.getString(4);
				String subject = set.getString(5);
				String message = set.getString(6);
				 
				
				
				Contactmodel cm = new Contactmodel();
				cm.setId(id);
				cm.setName(name);;
				cm.setEmail(email);
				cm.setNumber(number);
				cm.setSubject(subject);
				cm.setMessage(message);
				
				plist.add(cm);
				
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return plist;
		
	}
	
	public static List<NewsModel> fetchNews() {
        List<NewsModel> newsList = new ArrayList<>();
        try {
            // Use your API URL
            String apiUrl = "https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=2c1b84a854b648a793352214ceec3673";

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse the JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONArray articles = jsonResponse.getJSONArray("articles");

                for (int i = 0; i < articles.length(); i++) {
                    JSONObject article = articles.getJSONObject(i);
                    NewsModel news = new NewsModel();
                    news.setTitle(article.optString("title"));
                    news.setAuthor(article.optString("author"));
                    news.setPublishedAt(article.optString("publishedAt"));
                    news.setDescription(article.optString("description"));
                    news.setUrl(article.optString("url"));
                    news.setImageUrl(article.optString("urlToImage"));

                    newsList.add(news);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newsList;
    }
}
