package athulyamc;
import java.util.Scanner;

class UsernameException extends Exception {
	public UsernameException(String msg) { super(msg);}}
class PasswordException extends Exception {
	public PasswordException(String msg) { super(msg);}}



public class CheckLoginCredentials {

	public static void main(String[] args) {
		{
			Scanner s=new Scanner(System.in);
			String username,password;
			System.out.println("Enter Username:");
			username=s.nextLine();
			System.out.println("Enter password:");
			password=s.nextLine();
			int length=username.length();
			try
			{
				if(length<6)
					throw new UsernameException("username must be greater than 6 characters");
				else if(!username.equals("application"))
				    throw new UsernameException("username incorrect..!");
				else if(!password.equals("mca"))
				    throw new PasswordException("inccorrect password! try connect password");
				else
					System.out.println("Login successful!!!");
			}
			catch(UsernameException u){u.printStackTrace();}
			catch(PasswordException p){p.printStackTrace();}
			finally {System.out.println("the finally is always excetued:");
			
			}
		}
		
	}

}
