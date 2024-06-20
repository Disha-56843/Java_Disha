package Date14_06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Firstname: ");
		String fname = sc.next();
		
		System.out.print("Enter Your Lastname: ");
		String lname = sc.next();
		
		System.out.print("Enter Your Email: ");
		String email = sc.next();
		
		System.out.print("Enter Your Password: ");
		String pass = sc.next();
		
		
		
		FileOutputStream fout = new FileOutputStream("D://Dishajavaexp.txt");
		
		String f = "\n Your Firstname is: ";
		
		fout.write(f.getBytes());
		fout.write(fname.getBytes());
		
		String l = "\n Your Lastname is: ";
		
		fout.write(l.getBytes());
		fout.write(lname.getBytes());
		
		String e = "\n Your Email is: ";
		
		fout.write(e.getBytes());
		fout.write(email.getBytes());
		
		String p = "\n Your Password is: ";
		
		fout.write(p.getBytes());
		fout.write(pass.getBytes());
		
		System.out.println("Success");
		
		
		
		sc.close();
		
	}
	
}
