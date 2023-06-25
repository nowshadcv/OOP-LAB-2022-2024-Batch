import java.util.Scanner;
public class CheckLoginCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String username,password;
		System.out.print("Enter username: ");
		username=sc.nextLine();
		System.out.print("Enter password: ");
		password=sc.nextLine();
		int length=username.length();
		try {
			if(length < 6)
				throw new UsernameException("Username must be greater than 6 characters..");
			else if(!username.equals("application") )
				throw new UsernameException("Username Incorrect!..");
			else if(!password.equals("mca"))
				throw new PasswordException("Incorrect password!...Type correct password");
			else
				System.out.println("Login successfully");
			
		
		}catch(UsernameException u) {u.printStackTrace();}
		catch(PasswordException p) {p.printStackTrace();}
		finally {System.out.println("The finally is always executed..");
		
		}
		



	}
}
