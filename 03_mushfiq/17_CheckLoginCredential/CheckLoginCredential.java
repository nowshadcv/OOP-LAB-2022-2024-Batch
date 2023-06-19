import java.util.Scanner;

class UsernameException extends Exception{
	public UsernameException(String msg) {super(msg);}
}

class PasswordException extends Exception{
	public PasswordException(String msg) {super(msg);}
}

public class CheckLoginCredential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String username,password;
		System.out.println("Enter username: ");
		username = s.nextLine();
		System.out.println("Enter password: ");
		password = s.nextLine();
		int length = username.length();
		try {
			if(length<6)
				throw new UsernameException("Username must be greater than 6 characters..!");
			else if(!username.equals("application"))
				throw new UsernameException("Username Incorrect");
			else if(!password.equals("mca"))
				throw new PasswordException("Password Incorrect....type correct password");
			else 
				System.out.println("Login Successfull");;
		}
		catch(UsernameException u) {u.printStackTrace();}
		catch(PasswordException p) {p.printStackTrace();}
		finally {System.out.println("The finally is always executed");}
		
	}

}
