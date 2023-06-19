package gayathri;
import java.util.Scanner;
class usernameException extends Exception
{
	public usernameException(String msg) {super(msg);}
	
}
class passwordException extends Exception
{
	public passwordException(String msg) {super(msg);}
	
}



public class checkLoginCredinals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.println("Enter Username:");
		username=s.nextLine();
		System.out.println("Enter password:");
		password =s.nextLine();
		int length=username.length();
		try
		{
			if(length<6)
				throw new usernameException("username must be greater than 6 character.....!");
			else if (!username.equals("application"))
				throw new usernameException("username incorrect...!");
			else if(!password.equals("mca"))
				throw new passwordException("incorrect password...! type correct password");
			else
				System.out.println("login succesfully");
		
			
			
		}
		catch(usernameException u) {u.printStackTrace();}
		catch(passwordException p) {p.printStackTrace();}
		finally {System.out.println("The finally is always excecuted....");}

	}

}
