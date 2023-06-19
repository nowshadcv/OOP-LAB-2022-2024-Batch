package packB;
import java.util.*;
class Usernameexception extends Exception{
	public Usernameexception(String msg) 
	{
		super(msg);
	}
}
class PasswordException extends Exception{
	public PasswordException(String msg)
	{
		super(msg);
	}
}



public class Checklogincredential {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username,password;
		System.out.print("Enter username:");
		username=sc.nextLine();
		System.out.print("Enter the password:");
		password=sc.nextLine();
		int length=username.length();
		try {
			if(length<6)
				throw new Usernameexception("Username must be greater than 6");
			else if(!username.equals("application"))
				throw new Usernameexception("username incorrect");
			else if(!password.equals("mca"))
				throw new PasswordException("password incorrect...!Type correct password");
			else
				System.out.println("login successful!!");
		}
		catch(Usernameexception u)
		{
			u.printStackTrace();
		}
		catch(PasswordException p)
		{
			p.printStackTrace();
		}
		finally {
			System.out.println("The finally is always exceuted");
		}
	}
}




