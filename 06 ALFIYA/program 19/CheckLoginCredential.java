import java.util.Scanner;


public class CheckLoginCredential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.println("Enter username :");
		username = s.nextLine();
		System.out.println("Enter password :");
		password = s.nextLine();
		int length=username.length();
		try {
		 if(length < 6)
			 throw new UsernameExeption("Username must be greater than 6 characters..");
		 else if (!username.equals("application"))
		 	 throw new UsernameExeption("Username Incorrect");
		 else if(!password.equals("mca"))
			 throw new PasswordExeption("Incorrect password! Type correct password.");
		 else
			 System.out.println("Login successful");
		}
		catch (UsernameExeption u) {u.printStackTrace();}
		 catch (PasswordExeption p) {p.printStackTrace();}
		   finally {System.out.println("The finally is always executed");
		   }}}
		   

	


