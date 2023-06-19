package rahana;
import java.util.Scanner;

import jdk.jshell.spi.ExecutionControl.UserException;
class UserNameException extends Exception {
	public UserNameException(String msg) { super(msg); }}
class PasswordException extends Exception {
	public PasswordException(String msg) { super(msg); }
}

public class CheckLoginCredential {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username , password;
		System.out.print("Enter username : ");
		username=s.nextLine();
		System.out.print("Enter password :");
		password = s.nextLine();
		int lenght = username.length();
		try {
			if(lenght < 6)
				throw new UserNameException("Username must be greater than 6 characters..!");
			else if (!username.equals("application"))
				throw new UserNameException("Username incorrect..");
			else if(!password.equals("mca"))
				throw new PasswordException("incorrect password.. type correct password");
			else
				System.out.println("Login successfull");}
		catch (UserNameException u) { u.printStackTrace();}
		catch (PasswordException p) { p.printStackTrace();}
		finally { System.out.println("the finally is always executed");}}}
						
			



