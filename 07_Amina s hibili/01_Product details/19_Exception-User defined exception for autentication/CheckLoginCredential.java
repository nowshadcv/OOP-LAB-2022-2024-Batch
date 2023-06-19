package packA;
import java.util.Scanner;

class UsernameException extends Exception{
	public UsernameException(String msg) {super(msg);}
}

class PasswordException extends Exception{
	public PasswordException(String msg) {super(msg);}
}

public class CheckLoginCredential {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username,password;
		System.out.println("Enter Username : ");
		username=sc.nextLine();
		System.out.println("Enter Password : ");
		password=sc.nextLine();
		int length= username.length();
		try {
			if (length < 6)
				throw new UsernameException ("Username Must be Greater Than 6 Characters...!");
			else if(!username.equals("application"))
				throw new UsernameException ("Username Incorrect...!");
			else if(!password.equals("mca"))
				throw new PasswordException ("Password Incorrect...!Type correct Password");
			else
				System.out.println("Login Successful !!!");
		}
		catch (UsernameException u) {u.printStackTrace();}
		catch (PasswordException p) {p.printStackTrace();}
		finally {System.out.println("The Finally is Always Executed...");}

	}

}